/**
 * 
 */
package com.ftd.company.comptroller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ftd.company.model.Company;

/**
 * @author YunFeiBai
 *
 */
@RestController
public class CompanyController {

	@GetMapping("/api/company/one")
	public Company getAllCompanies() {
		Company company = new Company();
		company.companyName = "Alibaba";
		company.ceoName = "马云";
		company.turnover = 1.01f;
		company.briefDescription = "briefDescription";
		company.ipoDate = new Date();
		return company;
	}
}
