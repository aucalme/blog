package edu.java.jdbc06;

import java.io.File;
import java.util.ArrayList;
import java.util.List;



public class YamukjaDaoImpl implements YamukjaDao {
	
	private List<Yamukja> yamukja;
	
	private static YamukjaDaoImpl instance = null;
	
	public static YamukjaDaoImpl getInstance() {
		if(instance == null) {
			instance = new YamukjaDaoImpl();
		}
		return instance;
	}
	
	@Override
	public List<Yamukja> select(ArrayList<Yamukja> yamukja) {
		return yamukja;
	}

	
	@Override
	public int insert(Yamukja y) {
			yamukja.add(y);
			return 1;
	}

	@Override
	public int update(int i, Yamukja y) {
		int result = 0;
		if(i >= 0 && i < yamukja.size()) {
			yamukja.get(i).setId(y.getId());
			yamukja.get(i).setPassword(y.getPassword());
			yamukja.get(i).setMenu(y.getMenu());
			yamukja.get(i).setCount(y.getCount());
			yamukja.get(i).setPrice(y.getPrice());
			result = 1;
		}
		return result;
	}

	@Override
	public int delete(int no) {
		int result = 0;
		if(no >= 0 && no < yamukja.size()) {
			yamukja.remove(no);
			result = 1;
		}
		return result;
	}

}
