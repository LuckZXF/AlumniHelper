package com.alumniHelper.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

/**
 *  
 *  ClassName: ${type_name} <br/> 
 *  Function: ${todo} ADD FUNCTION. <br/> 
 *  Reason: ${todo} ADD REASON(可选). <br/> 
 *  date: 16/3/9 下午9:13 <br/> 
 *  
 *  @author eno
 *  @version ${enclosing_type}${tags} 
 *  @since JDK 1.6 
 */
public class UserService {

    @Autowired
    private RestTemplate restTemplate;

    public String getMobileCode(String mobile) {
        return null;
    }

}
