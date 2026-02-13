package com.ty;

import org.springframework.stereotype.Component;

@Component(value = "demoId")
public class DEMO {
	public void SayHi() {
		System.out.println("hello everyone");
	}
}
