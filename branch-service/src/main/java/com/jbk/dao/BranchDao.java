package com.jbk.dao;

import com.jbk.entity.Branch;

public interface BranchDao {
	public Branch saveBranch(Branch branch);
	public Branch getBranch(long branchId);
}
