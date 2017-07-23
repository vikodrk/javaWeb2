package mx.com.cetech.cursoWeb.franco_app;

public class Suma {
	
	public int Add(int... is){
		int result= 0;
		
		for(int iterator : is){
			
			result += iterator;
		}
		
		return result;
		
	}

}
