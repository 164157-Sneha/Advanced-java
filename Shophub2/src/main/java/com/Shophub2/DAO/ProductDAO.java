package com.Shophub2.DAO;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.Shophub2.Bean.Product;

public class ProductDAO implements IProductDAO {

private JdbcTemplate jdbcTemplate;
	

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public String get(long productId) {
	
	}

	public List<Product> getAll() {
			return jdbcTemplate.query("select * from products",new ResultSetExtractor<List<Product>>() {
				@Override
				public List<Product> extractData(ResultSet rs)throws SQLException, DataAccessException {

								List<Product> list = new ArrayList<Product>();
								while (rs.next()) {
									Product product = new Product();
									product.setProduct_id(rs.getInt(1));
									product.setProduct_name(rs.getString(2));
									product.setProduct_price(rs.getDouble(3));

									list.add(product);
								}
								return list;
							}
	}

	public long add(Product product) {
		 String query="insert into Product values('"+product.getProductId()+"','"+product.getProductName()+"','"+product.getProductPrice()+"')";  
		    return jdbcTemplate.update(query); 
	}

	public int remove(int productId) {
		String query="delete from Product where productid='"+productId+"' ";    
	    return jdbcTemplate.update(query);  
	}

	public int update(Product product) {
		String query="update Product set productName='"+product.getProductName()+"',productPrice='"+product.getProductPrice()+"' where ProductId='"+product.getProductId()+"' ";  
	    return jdbcTemplate.update(query);  
	}

	public boolean contains(long productId, String productName) {
		// TODO Auto-generated method stub
		return false;
	}

}
