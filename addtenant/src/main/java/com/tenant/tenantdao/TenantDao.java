package com.tenant.tenantdao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tenant.entity.Tenant;

public interface TenantDao extends JpaRepository<Tenant, Long>{

	
}
