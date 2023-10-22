package homework7;

import homework7.model.ItemName;
import homework7.model.PriceModel;
import homework7.model.Result;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileRunner {
	private static final String DIRECTORY_NAME = "resources";
	private static final String ITEMS_PRICE_CSV = "items-price.csv";
	private static final String ITEMS_NAME_CSV = "items-name.csv";
	private static final String RESULT_FILE_NAME = "result.csv";
	private static final String ERROR_FILE_NAME = "errors.csv";
	private static final Path PATH_TO_ITEMS_PRICE = Path.of(DIRECTORY_NAME, ITEMS_PRICE_CSV);
	private static final Path PATH_TO_ITEMS_NAME = Path.of(DIRECTORY_NAME, ITEMS_NAME_CSV);
	private static final String SEPARATOR = ",";
	private static final String HEADERS_OF_RESULT_REPORT = "ID,NAME,PRICE";
	private static final String HEADERS_OF_ERROR_REPORT = "ID";

	public static void main(String[] args) throws IOException {
		init();
		reducer();
	}

	private static void reducer() throws IOException {
		List<String> result = new ArrayList<>();
		TreeSet<String> error = new TreeSet<>();

		try (Stream<String> prices = Files.lines(PATH_TO_ITEMS_PRICE);
		Stream<String> itemsNames = Files.lines(PATH_TO_ITEMS_NAME)) {
			Map<Integer, PriceModel> pricesMap = prices
				.skip(1L)
				.map(s -> List.of(s.split(SEPARATOR)))
				.map(strings -> new PriceModel(Integer.parseInt(strings.get(0)), Double.parseDouble(strings.get(1))))
				.collect(Collectors.toMap(PriceModel::id, Function.identity()));
			Map<Integer, ItemName> itemsNamesMap = itemsNames
				.skip(1L)
				.map(s -> List.of(s.split(SEPARATOR)))
				.map(strings -> new ItemName(Integer.parseInt(strings.get(0)), strings.get(1), strings.get(2)))
				.collect(Collectors.toMap(ItemName::id, Function.identity()));
			itemsNamesMap.forEach((key, value) -> {
				Optional<PriceModel> priceModel = Optional.ofNullable(pricesMap.get(key));
				priceModel.ifPresentOrElse(price -> result.add(new Result(key, value.name(), price.price()).getStringToReport()),
										   () -> error.add(key.toString()));
			});
			pricesMap.keySet()
				.stream()
				.filter(integer -> !itemsNamesMap.containsKey(integer))
				.map(Object::toString)
				.forEach(error::add);
		}

		createFile(result, Path.of(DIRECTORY_NAME, RESULT_FILE_NAME), HEADERS_OF_RESULT_REPORT);
		createFile(error, Path.of(DIRECTORY_NAME, ERROR_FILE_NAME), HEADERS_OF_ERROR_REPORT);
	}

	private static void createFile(Collection<String> report, Path path, String headers) throws IOException{
		List<String> result = new ArrayList<>();
		result.add(headers);
		result.addAll(report);
		Files.write(path, result);
	}

	private static void init() throws IOException {
		File directory = Path.of(DIRECTORY_NAME).toFile();
		if (!directory.exists()) {
			directory.mkdir();
		}
		File resources = PATH_TO_ITEMS_PRICE.toFile();
		try (BufferedWriter bufferedOutputStream = new BufferedWriter(new FileWriter(resources))) {
			bufferedOutputStream.write("ID,PRICE");
			bufferedOutputStream.newLine();
			bufferedOutputStream.write("1,9.98");
			bufferedOutputStream.newLine();
			bufferedOutputStream.write("2,25.05");
			bufferedOutputStream.newLine();
			bufferedOutputStream.write("3,16.45");
			bufferedOutputStream.newLine();
			bufferedOutputStream.write("4,20.45");
		}

		Files.write(PATH_TO_ITEMS_NAME,
					List.of("ID,NAME,DESCRIPTION",
							"1,Шарф,Теплый зимний шарф красного цвета",
							"2,Шапка,Вязаная зеленая шапка",
							"3,Ботинки,Осенние ботинки на толстой подошве",
							"5,Перчатки, Кожаные перчатки"));
	}
}
