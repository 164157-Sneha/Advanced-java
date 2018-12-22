package com.Shophub2.test;

import java.sql.ResultSet;
import java.util.List;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.Shophub2.Bean.Product;

import com.Shophub2.DAO.ProductDAO;



public class ProductTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

     	ProductDAO dao = ctx.getBean(ProductDAO.class);
		long status = dao.add(new Product(6, "Oneplus",35000));
		System.out.println(status);
	
		/*
		int status1 = dao.remove(6);
		System.out.println(status1);
		
	
		int status3=dao.update(6,"Oppo",20000); 
	    System.out.println(status3);
		*/
     	
     	 List<Product> list=dao.getAll();  
         System.out.println(list);
        /* for(Product product:list) { 
             System.out.println(product); 
        }*/
	}
}



