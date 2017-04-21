package pjsf1.jsf.exos;


import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MBInjected implements Serializable{

	private static final long serialVersionUID = 1L;

	public MBInjected(){
		System.out.println("Constructeur MBInjected");
	}
	
	public void show(){
		System.out.println("method show from MBInjected");
	}

	public String getDataInjected() {
		return "data injected";
	}
	
}
