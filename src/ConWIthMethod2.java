
public class ConWIthMethod2 {
	 String Name;
	    String Model;
	    int Price;
	    String Engine;
	    
	    public ConWIthMethod2 (String Name, String Model,int Price,String Engine) {
	    	this. Name=Name;
	    	this.Model=Model;
	    	this.Price=Price;
	    	this.Engine=Engine;
	    }
	    public void method1() {
	    	System.out.println(this.Name+" "+this.Model+" "+this.Price+" "+this.Engine);
	    	
	    }

	public static void main(String[] args) {
		ConWIthMethod2 RD=new ConWIthMethod2("switf", "dsier", 100000, "manual");
		ConWIthMethod2 RD1=new ConWIthMethod2("swi", "dsi", 5500000, "manual");
			RD.method1();
			RD1.method1();
		
     
   
    	
    	
    }
	}


