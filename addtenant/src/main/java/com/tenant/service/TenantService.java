package com.tenant.service;

import java.util.List;
import java.util.Optional;


import com.tenant.entity.Tenant;


public interface TenantService {

	public List<Tenant> getTenantInfo();
	public Optional<Tenant>  getTenant(long tenantId);
	public Tenant addTenant(Tenant tenant);
	public Tenant updateTenant(Tenant tenant);
	public void deleteTenant(long parseLong);
	
}
