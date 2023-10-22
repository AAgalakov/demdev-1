package homework7.model;

public record PriceModel(int id, double price) {

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		PriceModel that = (PriceModel) o;
		return id == that.id && Double.compare(price, that.price) == 0;
	}

}
