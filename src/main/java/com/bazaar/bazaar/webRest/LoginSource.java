package com.bazaar.bazaar.webRest;

import com.bazaar.bazaar.dtos.CustomerResponseDTO;
import com.bazaar.bazaar.dtos.LoginDTO;
import com.bazaar.bazaar.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class LoginSource {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    private CustomerResponseDTO getCustomerforLogin(@RequestBody LoginDTO loginDTO){
        CustomerResponseDTO result = loginService.login(loginDTO);
          return result;
    }
}
