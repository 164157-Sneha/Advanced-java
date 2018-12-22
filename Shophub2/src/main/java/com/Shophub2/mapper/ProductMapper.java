package com.Shophub2.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.Shophub2.Bean.Product;

public class ProductMapper implements RowMapper<Product>{

	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		Product product = new Product();
		product.setProductId(rs.getLong("productId"));
		product.setProductName(rs.getString("productName"));
		   //email contact password
		product.setProductPrice(rs.getDouble("productPrice"));
		  
		  
	      return product;
	   }
}
