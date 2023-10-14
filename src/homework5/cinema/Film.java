package homework5.cinema;

import java.util.Objects;

public class Film {

	private final int id;
	private final Integer year;
	private final int month;
	private final Genre genre;
	private final double rating;

	public Film(int id, int year, int month, Genre genre, double rating) {
		this.id = id;
		this.year = year;
		this.month = month;
		this.genre = genre;
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	public Integer getYear() {
		return year;
	}

	public Integer getMonth() {
		return month;
	}

	public Genre getGenre() {
		return genre;
	}

	public double getRating() {
		return rating;
	}

	@Override
	public String toString() {
		return "Film{" + "id=" + id + ", year=" + year + ", month=" + month + ", genre=" + genre + ", rating=" + rating
			+ '}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Film film = (Film) o;
		return id == film.id && month == film.month && Double.compare(rating, film.rating) == 0 && Objects.equals(year,
																												  film.year)
			&& genre == film.genre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, year, month, genre, rating);
	}
}
