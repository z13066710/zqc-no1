package com.kgc.service;

import com.kgc.mapper.BankMapper;
import com.kgc.pojo.Bank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankService {
    @Autowired
    BankMapper bankMapper;
    public List<Bank> show(){
        return bankMapper.show();
    }
}
