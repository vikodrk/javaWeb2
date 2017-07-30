package mx.com.cetech.javaWeb2.jsfExample.beans;

import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "formBean")
@ViewScoped
public class ExampleBean {
	
	private static final Logger LOG = Logger.getLogger("Bean");

	private String name;

	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void actionMethod()
	{
		LOG.info("Your name is: "+name+" and your age is "+age);
	}

}
