package com.ruizton.main.service.admin;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruizton.main.dao.FfeesDAO;
import com.ruizton.main.model.Fentrust;
import com.ruizton.main.model.Ffees;

@Service
public class FeeService {
	@Autowired
	private FfeesDAO feesDAO;
	@Autowired
	private HttpServletRequest request;

	public Ffees findById(int id) {
		return this.feesDAO.findById(id);
	}

	public void saveObj(Ffees obj) {
		this.feesDAO.save(obj);
	}

	public void deleteObj(int id) {
		Ffees obj = this.feesDAO.findById(id);
		this.feesDAO.delete(obj);
	}

	public void updateObj(Ffees obj) {
		this.feesDAO.attachDirty(obj);
	}

	public List<Ffees> findByProperty(String name, Object value) {
		return this.feesDAO.findByProperty(name, value);
	}

	public List<Ffees> findAll() {
		return this.feesDAO.findAll();
	}
	
	public List<Ffees> list(int firstResult, int maxResults,
			String filter,boolean isFY) {
		List<Ffees> all = this.feesDAO.list(firstResult, maxResults, filter,isFY);
		return all;
	}
	
	public Ffees findFfee(String virtualCoinType,int level) {
		return this.feesDAO.findFfee(virtualCoinType, level);
	}
}