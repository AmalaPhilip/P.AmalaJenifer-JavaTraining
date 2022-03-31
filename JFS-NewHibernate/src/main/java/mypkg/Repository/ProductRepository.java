package mypkg.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import mypkg.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	Product findByName(String name);
	
	Product findByPrice(double price);
	Product findByQuantity(int Quantity);


}
