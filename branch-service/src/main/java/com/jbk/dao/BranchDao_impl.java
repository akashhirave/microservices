package com.jbk.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.entity.Branch;

@Repository
public class BranchDao_impl implements BranchDao {
	
	@Autowired
	private SessionFactory sf;

	@Override
	public Branch saveBranch(Branch branch) {
		try {
			Session session=	sf.openSession();
		Transaction transaction=	session.beginTransaction();
			session.save(branch);
			transaction.commit();
			} catch (Exception e) {
				e.printStackTrace();
			}
		return branch;
	}

	@Override
	public Branch getBranch(long branchId) {
		Session session=	sf.openSession();
		Branch branch=	session.get(Branch.class, branchId);
		
		return branch;
	}

}
