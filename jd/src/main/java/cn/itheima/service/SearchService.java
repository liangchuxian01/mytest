package cn.itheima.service;

import java.util.List;

import cn.itheima.po.Product;

public interface SearchService {
	List<Product> searchProduct(String queryString,String catalog_name,String price,String page,String sort);
}
