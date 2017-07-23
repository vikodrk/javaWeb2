package mx.com.cetech.web;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hello extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response){
		
		System.out.println("Hola mundo ...");
		
		
	}
	

}
