package com.tenant.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tenant.entity.Tenant;
import com.tenant.service.TenantService;

@RestController
public class TenantController {
	
	@Autowired
	private TenantService tenantService;
	
		
	@GetMapping("/gettenant")
	public List<Tenant> getTenantInfo() {
		return this.tenantService.getTenantInfo();
	}
	
	
	@GetMapping("/gettenantId/{tenantId}")
	public Optional<Tenant>  getTenant(@PathVariable long tenantId) {
		return this.tenantService.getTenant(tenantId);
	}
	@PostMapping("/addtenant") 
	public Tenant addTenant(@RequestBody Tenant tenant) {
		return this.tenantService.addTenant(tenant);
	}
	
	@PutMapping("/updatetenant")
	public Tenant updateTenant(@RequestBody Tenant tenant) {
		return this.tenantService.updateTenant(tenant);
	}
	
	
	/* @DeleteMapping("/deletetenant/{tenantId}")
	public ResponseEntity<HttpStatus> deleteTenant(@PathVariable String tenantId) {
		
		try {
			this.tenantService.deleteTenant(Long.parseLong(tenantId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		} 
		 
	}
	*/
	
	@DeleteMapping("/deletetenant/{tenantId}")
	public void deleteTenant(@PathVariable long tenantId) {
		this.tenantService.deleteTenant(tenantId);
	}
	
	
	
	
	
}
