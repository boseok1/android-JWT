package com.mysh.shareHouse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mysh.shareHouse.model.Faq;
import com.mysh.shareHouse.repository.FaqRepository;

@Service
public class FaqService {
	
	@Autowired
	private FaqRepository faqRepository;
	
	@Transactional(readOnly = true)
	public List<Faq> moveInFindAll() {
		return faqRepository.moveInFindAll();
	}
	
	@Transactional(readOnly = true)
	public List<Faq> contractFindAll() {
		return faqRepository.contractFindAll();
	}
}
