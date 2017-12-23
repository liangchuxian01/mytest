package cn.itheima.service.impl;

import java.util.List;

import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itheima.po.Product;
import cn.itheima.service.SearchService;

@Service
public class SearchServiceImpl implements SearchService{
	
	@Autowired
	private HttpSolrServer httpSolrServer;

	public List<Product> searchProduct(String queryString, String catalog_name, String price, String page,
			String sort) {
		return null;
	}

}
