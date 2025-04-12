package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class controller {

	@RequestMapping("/carloan")
	public void getcarloan(@RequestParam("employername") String empname, @RequestParam("position") String position,
			@RequestParam("contactinfo") String coninfo, @RequestParam("add") String address,
			@RequestParam("panno") String pancardno, @RequestParam("vehicledetails") String vdetails,
			@RequestParam("dealership") String Dealership, @RequestParam("loantype") String ltype,
			@RequestParam("dPayment") String dpayment) {

		System.out.println("--------Car Loan Details-------");
		System.out.println("Employer Name-" + empname);
		System.out.println("Position-" + position);
		System.out.println("Contact Information-" + coninfo);
		System.out.println("Address-" + address);
		System.out.println("PancardNo-" + pancardno);
		System.out.println("Vehicle Details-" + vdetails);
		System.out.println("Dealership-" + Dealership);
		System.out.println("LoanType-" + ltype);
		System.out.println("DownPayment" + dpayment);

	}

	@RequestMapping("/homeloan")
	public void getcarloan(@RequestParam("employername") String empname, @RequestParam("position") String position,
			@RequestParam("contactinfo") String coninfo, @RequestParam("Aadharno") String adharno,
			@RequestParam("propertydetails") String propertydetails, @RequestParam("loantype") String ltype,
			@RequestParam("dPayment") String downpayment) {

		System.out.println("--------Home Loan Details-------");
		System.out.println("Employer Name-" + empname);
		System.out.println("Position-" + position);
		System.out.println("Contact Information-" + coninfo);
		System.out.println("Adharno-" + adharno);
		System.out.println("Propertydetails-" + propertydetails);
		System.out.println("loan type-" + ltype);
		System.out.println("DownPayment" + downpayment);

	}

	@RequestMapping("/personalloan")
	public void getcarloan(@RequestParam("fullname") String fullname, @RequestParam("add") String address,
			@RequestParam("phono") String phoneno, @RequestParam("email") String emailid,
			@RequestParam("purpose") String purposeofloan, @RequestParam("loantype") String ltype) {

		System.out.println("--------Personal Loan Details-------");
		System.out.println("Full Name-" + fullname);
		System.out.println("Address-" + address);
		System.out.println("Contact Information-" + phoneno);
		System.out.println("EmailID-" + emailid);
		System.out.println("Purpose of loan-" + purposeofloan);
		System.out.println("loan type-" + ltype);
	}
}
