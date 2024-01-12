package com.example.demo.Service;


import com.example.demo.model.AccountDetails;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.security.web.header.Header;
import org.springframework.stereotype.Service;

@Service
public class AccountInformation {

    @Value("${movieDB.accountDetails.url}")
    private String url;

    @Value("${movieDB.auth.token}")
    private String token;

    public AccountDetails getAccountInformation(String accountId){
        if(null!=accountId){
            HttpHeaders headers=new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.setBearerAuth(token);
          //  HttpEntity<> entity=new HttpEntity<>(headers);

        }
        return null;
    }

}
