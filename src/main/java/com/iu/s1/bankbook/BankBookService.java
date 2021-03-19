package com.iu.s1.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankBookService {
	
	@Autowired
	private BankBookDAO bankBookDAO;
	
	
	public int setWrite(BankBookDTO bankBookDTO) throws Exception {
		return bankBookDAO.setWrite(bankBookDTO);
	}
	
	public BankBookDTO getSelect (BankBookDTO bankBookDTO) throws Exception{
		return bankBookDAO.getSelect(bankBookDTO);
	}
	
	public List<BankBookDTO> getList() throws Exception {
		
		return bankBookDAO.getList();
	}

}
