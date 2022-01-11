package edu.java.jdbc06;

import java.util.ArrayList;
import java.util.List;

import edu.java.jdbc05.Blog;


public interface YamukjaDao {

	List<Yamukja> select(ArrayList<Yamukja> yamukja);
	int insert(Yamukja y);
	int update(int i, Yamukja y);
	int delete(int no);
	
	
		String URL = "jdbc:oracle:thin:@localhost:1521:xe";
		
		String USER = "scott";
		
		String PASSWORD = "tiger";
		
		String TABLE_BLOGS = "menuprice";
		
		String COL_MENU = "menu";
		String COL_PRICE = "price";
		
	

}
