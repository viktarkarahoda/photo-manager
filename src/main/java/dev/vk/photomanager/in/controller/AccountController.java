package dev.vk.photomanager.in.controller;

import dev.vk.photomanager.api.AccountApi;
import dev.vk.photomanager.in.mapper.RestAccountMapper;
import dev.vk.photomanager.domain.entity.Account;
import dev.vk.photomanager.entity.RestAccountDto;
import dev.vk.photomanager.domain.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class AccountController implements AccountApi {

    private final AccountService accountService;
    private final RestAccountMapper restAccountMapper;

    @Autowired
    public AccountController(AccountService accountService, RestAccountMapper restAccountMapper) {
        this.accountService = accountService;
        this.restAccountMapper = restAccountMapper;
    }

    @Override
    public ResponseEntity<RestAccountDto> createAccount(RestAccountDto accountDto) {
        Account account = accountService.createNewAccount();
        RestAccountDto restAccountDto = restAccountMapper.toAccountDto(account);
        return ResponseEntity.ok(restAccountDto);
    }

    @Override
    public ResponseEntity<RestAccountDto> getAccount(String accountId) {
        Account account = accountService.getAccount(accountId);
        RestAccountDto restAccountDto = restAccountMapper.toAccountDto(account);
        return ResponseEntity.ok(restAccountDto);
    }

    @Override
    public ResponseEntity<RestAccountDto> modifyAccount(RestAccountDto accountDto) {
        Account account = accountService.modifyAccount(accountDto);
        RestAccountDto restAccountDto = restAccountMapper.toAccountDto(account);
        return ResponseEntity.ok(restAccountDto);
    }
}
