package com.jigmee.thejavabankingapplication.service.impl;

import com.jigmee.thejavabankingapplication.dto.TransactionDto;

import com.jigmee.thejavabankingapplication.entity.Transaction;
import com.jigmee.thejavabankingapplication.repo.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionImpl implements TransactionService{
    @Autowired
    private TransactionRepository transactionRepository;
    @Override
    public void saveTransaction(TransactionDto transactionDto){

        Transaction transaction=Transaction.builder()
                .transactionType(transactionDto.getTransactionType())
                .accountNumber(transactionDto.getAccountNumber())
                .amount(transactionDto.getAmount())
                .status("Success")
                .build();
        transactionRepository.save(transaction);
        System.out.println("Transaction saved Successfully");
    }
}
