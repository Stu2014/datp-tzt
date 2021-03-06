package com.ruizton.main.service.admin;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruizton.main.dao.FaboutDAO;
import com.ruizton.main.dao.FentrustlogDAO;
import com.ruizton.main.model.Fabout;
import com.ruizton.main.model.Fentrustlog;

@Service
public class EntrustlogService {
	@Autowired
	private FentrustlogDAO entrustlogDAO;
	@Autowired
	private HttpServletRequest request;

	public List list(int firstResult, int maxResults,
			String filter,boolean isFY) {
		List all = this.entrustlogDAO.list(firstResult, maxResults, filter,isFY);
		return all;
	}
	
	public Double getTotalTradeAmt() {
		return this.entrustlogDAO.getTotalTradeAmt();
	}
	
}