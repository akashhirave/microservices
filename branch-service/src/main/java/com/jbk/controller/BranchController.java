package com.jbk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.entity.Branch;
import com.jbk.service.BranchService;

@RestController
@RequestMapping(value = "/branch")
public class BranchController {
	
	@Autowired
	private BranchService service;
	
	@PostMapping(value = "/saveBranch")
	public Branch saveBranch(@RequestBody Branch branch)
	{
		return service.saveBranch(branch);
	}
	
	@GetMapping(value = "/getBranch/{branchId}")
	public Branch getBranch(@PathVariable long branchId) {
		return service.getBranch(branchId);
	}
	

	

}
