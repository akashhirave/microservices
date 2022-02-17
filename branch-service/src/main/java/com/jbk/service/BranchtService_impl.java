package com.jbk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.BranchDao;
import com.jbk.entity.Branch;

@Service
public  class BranchtService_impl implements BranchService {

	@Autowired
	private BranchDao dao;

	@Override
	public Branch saveBranch(Branch branch) {
		return dao.saveBranch(branch);
	}

	@Override
	public Branch getBranch(long branchId) {
		
		return dao.getBranch(branchId);
	}

}
