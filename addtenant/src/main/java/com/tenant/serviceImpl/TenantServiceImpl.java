package com.tenant.serviceImpl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tenant.entity.Tenant;
import com.tenant.service.TenantService;
import com.tenant.tenantdao.TenantDao;

@Service
public class TenantServiceImpl implements TenantService {

	List<Tenant> list;
	@Autowired
	private TenantDao tenantDao;
	
	public  TenantServiceImpl() {
		/*DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
		Date d1 = null;
		Date d2 = null;
		try {
			d1 = df.parse("12-10-2011");
			d2  = df.parse("13-10-2029");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		list =new ArrayList<Tenant>();
		list.add(new Tenant(1, "Mohit", "IT Job", "Aadhar", "1234567", "Yes", "This is tenant information",
							"Photo of Tenant", d1, d2));
		list.add(new Tenant(2, "Nandan", "IT Job", "Aadhar", "87654321", "Yes", "This is tenant information",
				"Photo of Tenant", d1, d2)); */
	}
	
	@Override
	public List<Tenant> getTenantInfo() {
		//return list;
		return tenantDao.findAll();
	}

	@Override
	public Optional<Tenant> getTenant(long tenantId) {

		/*Tenant t = null;
		for(Tenant tenant : list) {
			if(tenant.getId() == tenantId) {
				t = tenant;
				break;
			}
		}*/
		
		return tenantDao.findById(tenantId);
	//	return t;
	}

	@Override
	public Tenant addTenant(Tenant tenant) {
		//list.add(tenant);
		tenantDao.save(tenant);
		return tenant;
	}

	@Override
	public Tenant updateTenant(Tenant tenant) {
		
		/*list.forEach(e->{
			if(e.getId()==tenant.getId()) {
				e.setDescription(tenant.getDescription());
				e.setTenantName(tenant.getTenantName());
			}
		});*/
		tenantDao.save(tenant);
	return tenant;
	}

	@Override
	public void deleteTenant(long parseLong) {
		//list = list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		Tenant tenant = tenantDao.getOne(parseLong);
		tenantDao.delete(tenant);
		
		
	}

	
	
}
