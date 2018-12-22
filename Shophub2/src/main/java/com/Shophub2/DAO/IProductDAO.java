package com.Shophub2.DAO;

import java.util.List;

import com.Shophub2.Bean.Product;
import com.Shophub2.Bean.User;

public interface IProductDAO {
	public Product get(long productId);

	public List<Product> getAll();

	public long add(Product product);

	public int remove(int productId);

	public int update(long productId, String productName,double price);

	public boolean contains(long productId, String productName);
}
