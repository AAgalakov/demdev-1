package homework7.model;

public record Result(int id, String name, Double price) {

	public String getStringToReport() {
		return id + "," + name + "," + price.toString();
	}

	@Override
	public String toString() {
		return "Result{" + "id=" + id + ", name='" + name + '\'' + ", price=" + price + '}';
	}

}
