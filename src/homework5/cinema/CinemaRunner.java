package homework5.cinema;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static homework5.Util.getRandomInt;

public class CinemaRunner {

	private static final Genre[] GENRES = Genre.values();

	public static void main(String[] args) {
		List<Film> filmList = new ArrayList<>();
		for (int i = 0; i < 100; ) {
			filmList.add(generateFilm(++i));
		}
		Cinema cinema = new Cinema();
		filmList.forEach(System.out::println);
		filmList.forEach(cinema::putFilm);
		System.out.println();
		int randomYearForYearList = getRandomInt(2020, 2023);
		System.out.printf("Фильмы %d года выпуска%n", randomYearForYearList);
		cinema.getFilmsByYear(randomYearForYearList).forEach(System.out::println);
		System.out.println();
		int randomYearForYearAndMonthList = getRandomInt(2020, 2023);
		int randomMonth = getRandomInt(1, 12);
		System.out.printf("Фильмы %d года и %d месяца выпуска%n", randomYearForYearAndMonthList, randomMonth);
		cinema.getFilmsByMonthAndYear(randomMonth, randomYearForYearAndMonthList).forEach(System.out::println);
		String genreName = getRandomGenre().name();
		System.out.println("\nФильмы по жанру " + genreName);
		cinema.getFilmsByGenre(genreName).forEach(System.out::println);
		System.out.println("\nТоп фильмы");
		cinema.getTopTenFilms().forEach(System.out::println);
	}

	private static Film generateFilm(int id){
		return new Film(id, getRandomInt(2020, 2023), getRandomInt(1, 12), getRandomGenre(), new Random().nextDouble() * 10);
	}

	private static Genre getRandomGenre(){
		return GENRES[getRandomInt(0, GENRES.length)];
	}
}
