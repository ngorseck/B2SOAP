package com.samanecorp.b2soaP.webservice.service;

import java.util.List;

import com.samanecorp.b2soaP.webservice.dto.TransactionDto;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public class PaiementWebServiceImpl implements PaiementWebService {

	@Override
	@WebMethod(operationName = "getTransaction")
	public TransactionDto get(@WebParam(name = "idTransaction") long id) {
		//TODO traitement pour lnregistrement dans la base
		return new TransactionDto(id, 5000000);
	}

	@Override
	@WebMethod(operationName = "saveTransaction")
	public TransactionDto save(@WebParam(name = "transaction") TransactionDto transactionDto) {
		//TODO traitement pour lnregistrement dans la base
		return transactionDto;
	}

	@Override
	@WebMethod(operationName = "allTransactions")
	public List<TransactionDto> getAll() {
		//TODO traitement pour lnregistrement dans la base
		return List.of(
				new TransactionDto(1L, 5000000), 
				new TransactionDto(2L, 1000000),
				new TransactionDto(3L, 2000000));
	}

}
