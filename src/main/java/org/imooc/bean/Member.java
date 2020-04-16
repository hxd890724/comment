package org.imooc.bean;

import lombok.Data;

@Data
public class Member {
	
	private Long id;
	
    private Long phone;
    
    private String name;
    
    private String password;
}
