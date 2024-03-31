package com.pangding.bank.service.Impl;

import com.pangding.bank.mapper.AccountMapper;
import com.pangding.bank.pojo.Account;
import com.pangding.bank.service.AccountService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountMapper accountMapper;

    @Override
    public int save(Account account) {
        return accountMapper.insert(account);
    }

    @Override
    public int deleteByActno(String actno) {
        return accountMapper.deleteByActno(actno);
    }

    @Override
    public int modify(Account account) {
        return accountMapper.update(account);
    }

    @Override
    public Account getByActno(String actno) {
        return accountMapper.selectByActno(actno);
    }

    @Override
    public List<Account> getAll() {
        return accountMapper.selectAll();
    }

    @Override
    public void transfer(String fromActno, String toActno, double money) {
        Account fromAccount = accountMapper.selectByActno(fromActno);
        if (fromAccount.getBalance()<money) {
            throw new RuntimeException("余额不足");
        }
        Account toAccount = accountMapper.selectByActno(toActno);
        fromAccount.setBalance(fromAccount.getBalance() - money);
        toAccount.setBalance(toAccount.getBalance() + money);

        int count = accountMapper.update(fromAccount);
        count += accountMapper.update(toAccount);
        if(count!=2){
            throw new RuntimeException("转账失败");
        }

    }
}
