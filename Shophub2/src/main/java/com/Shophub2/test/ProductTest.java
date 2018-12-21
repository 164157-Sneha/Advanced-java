package com.Shophub2.test;

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
		
		ProductDAO remo = ctx.getBean(ProductDAO.class);
		int status1 = remo.remove(6);
		System.out.println(status1);
		
		
}
}
