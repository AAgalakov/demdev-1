package homework5.cinema;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class Cinema {

	private final LinkedHashMap<Integer, LinkedHashSet<Film>> films = new LinkedHashMap<>();

	public boolean putFilm(Film film) {
		LinkedHashSet<Film> filmsByYear = films.get(film.getYear());
		if (filmsByYear != null) {
			return filmsByYear.add(film);
		} else {
			LinkedHashSet<Film> newCollection = new LinkedHashSet<>();
			films.put(film.getYear(), newCollection);
			return newCollection.add(film);
		}
	}

	public List<Film> getFilmsByYear(Integer year) {
		return List.copyOf(films.get(year) != null ? films.get(year) : Collections.emptyList());
	}

	public List<Film> getFilmsByMonthAndYear(Integer month, Integer year) {
		List<Film> result = new ArrayList<>();
		List<Film> filmsByYear = getFilmsByYear(year);
		for (Film film : filmsByYear) {
			if (film.getMonth().equals(month)) {
				result.add(film);
			}
		}
		return result;
	}

	public List<Film> getFilmsByGenre(String genre) {
		List<Film> result = new ArrayList<>();
		for (LinkedHashSet<Film> filmsSet : films.values()) {
			for (Film film : filmsSet) {
				if (film.getGenre().name().equals(genre)) {
					result.add(film);
				}
			}
		}
		return result;
	}

	public List<Film> getTopTenFilms() {
		TreeSet<Film> filmTreeSet = new TreeSet<>((o1, o2) -> (int) (o2.getRating() * 10_000 - o1.getRating() * 10_000));
		for (LinkedHashSet<Film> films : films.values()) {
			filmTreeSet.addAll(films);
		}
		return List.copyOf(filmTreeSet).subList(0, 9);
	}
}
