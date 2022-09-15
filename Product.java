package entities;

public class Product {

	// Atributos da Classe
	private String name;
	private double price;
	private int quantity;

	// Criando um construtor padrão
	public Product() {
	}

	// Construtor da Classe Product
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	// Criando uma sobrecarga
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	// Iniciando os conceitos de encapsulamento
	// Utilizando o método get e set

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}

	// Método para calcular o valor do produto no estoque
	public double totalValueInStock() {
		return price * quantity;
	}

	// Método para adicionar produto
	public void addProduct(int quantity) {
		this.quantity += quantity;
	}

	// Método para remover produto
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	// Método para converter em String
	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units , Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
