package com.sagar.bindings;

import lombok.Data;

@Data
public class UnlockForm {

	private String email;

	private String temPwd;

	private String newPwd;

	private String confirmNewPwd;

}
