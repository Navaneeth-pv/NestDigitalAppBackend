package com.example.Nestdigitalapp_backend.controller;

import com.example.Nestdigitalapp_backend.dao.SecurityDao;
import com.example.Nestdigitalapp_backend.model.Employee;
import com.example.Nestdigitalapp_backend.model.Security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class SecurityController {

    @Autowired
    private SecurityDao secdao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addsecurity", consumes = "application/json", produces = "application/json")
    public String AddEmployee(@RequestBody Security sec) {
        System.out.println(sec.getSeccode().toString());
        System.out.println(sec.getSecname().toString());
        System.out.println(sec.getSecusername().toString());
        System.out.println(sec.getSecpassword().toString());

        secdao.save(sec);
        return "Security Added Successfully";

    }


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/securityLogin", consumes = "application/json", produces = "application/json")
    public HashMap<String, String> SecurityLogin(@RequestBody Security sc){
        HashMap<String, String> hashMap = new HashMap<>();
        List<Security> scDetails = secdao.SecurityLogin(sc.getSecusername(),sc.getSecpassword());
        if(scDetails.size() == 0){
            hashMap.put("status","failed");
        }else{
            hashMap.put("status","success");
            hashMap.put("userInfo",String.valueOf(scDetails.get(0).getId()));
        }
        return hashMap;
    }


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/securityProfile", consumes = "application/json", produces = "application/json")
    public List<Security> SecurityProfile(@RequestBody Security sc){
        System.out.println(sc.getId());
        return (List<Security>) secdao.SecurityProfile(sc.getId());
    }



}
