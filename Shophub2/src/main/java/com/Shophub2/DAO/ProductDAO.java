package com.Shophub2.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;



import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.jdbc.core.RowMapper;

import com.Shophub2.Bean.Product;
import com.Shophub2.mapper.ProductMapper;

public class ProductDAO implements IProductDAO {

private JdbcTemplate jdbcTemplate;
	

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<Product> get(long productId) {
		
			String sql="select * from Product where productId='" + productId + "' ";
			List <Product> product = jdbcTemplate.query(sql, new ProductMapper());
			return product;
		}
	


	public List<Product> getAll(){  
		String sql="select * from Product";
		List<Product> product=jdbcTemplate.query(sql, new ProductMapper());
		if(product==null)
		System.out.println("null");
		else
			System.out.println("not null");
		return product!=null?product:null;
		}
	
	
	public long add(Product product) {
		 String query="insert into Product values('"+product.getProductId()+"','"+product.getProductName()+"','"+product.getProductPrice()+"')";  
		    return jdbcTemplate.update(query); 
	}

	public int remove(int productId) {
		String query="delete from Product where productid='"+productId+"' ";    
	    return jdbcTemplate.update(query);  
	}

	public int update(long productId, String productName,double productPrice) {
		String query="update Product set ProductName='"+productName+"',ProductPrice='"+productPrice+"' where ProductId='"+productId+"' ";  
	    return jdbcTemplate.update(query);  
	}

	public boolean contains(long productId, String productName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		return "ProductDAO [jdbcTemplate=" + jdbcTemplate + "]";
	}


}
