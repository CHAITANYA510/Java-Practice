package com.test.microservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {
	
	//custom method for which spring provide implementation
	CurrencyExchange findByFromAndTo(String from, String to);
	
}
