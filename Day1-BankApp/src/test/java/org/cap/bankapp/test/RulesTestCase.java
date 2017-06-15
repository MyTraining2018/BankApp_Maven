package org.cap.bankapp.test;

import org.cap.dto.Customer;
import org.cap.exception.InvalidInitialAmountException;
import org.cap.service.AcccountService;
import org.cap.service.AccountServiceImpl;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RulesTestCase {
	

	@Rule
	public ExpectedException thrown=ExpectedException.none();
	
	@Test
	public void test_addAccount_with_nullCustomer() throws InvalidInitialAmountException{
		AcccountService	acccountService=new AccountServiceImpl();
		Customer customer=null;
		
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Customer should not be null.");
		
		
		acccountService.addAccount(customer, 1000);
		
	}
}
