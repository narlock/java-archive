package com.narlock.core;

import org.springframework.beans.factory.annotation.Autowired;

public class Samsung {
	
	/*
	 * The Autowired annotation serves the purpose of automatically
	 * 'setting' the attribute. For instance, we never specifically
	 * call "setCpu" method.
	 * 
	 * The CPU Bean annotation is added in AppConfig.java, so, when
	 * we add Autowired, we are searching for a bean of type 'MobileProcessor'
	 */
	@Autowired
	private MobileProcessor cpu;
	
	public void config() {
		System.out.println("Octa Core, 4 gb Ram, 12 MP Camera");
		cpu.process();
	}

	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}
}
