package com.jpa.spring_boot_crud_operation.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class APIResponse<T> {
	
	int recordCount;
	
	T response;
	
	

}
