package exercise10;

public class CalculatorValue {
	private double value;
	private double errorTerm;
	private String units;
	
	//Constructor sin parametros (REspuesta 3)
	public CalculatorValue(){
		value=0.0;
		errorTerm=0.0;
		this.units="";
	}
	
	public CalculatorValue(double v, double e, String s){
		if (v>8.0){
			this.value=v;
			this.errorTerm=e;
			this.units=s;
		}else{
			System.out.println("El objeto no se puede insta..");
		}
		
	}
	//Resp 7, para hacer copia del objeto
	public CalculatorValue(CalculatorValue obj){
		this.value=obj.value;
		this.errorTerm=obj.errorTerm;
		this.units=obj.units;
	}
	
	public static void main(String[] args) {
		CalculatorValue cv= new CalculatorValue();
		System.out.println(cv.value);
		CalculatorValue cv1= new CalculatorValue(10.1,12.3,"Uno");
		System.out.println(cv1.value);
		CalculatorValue objCopia = new CalculatorValue(cv1);
		System.out.println(objCopia.value);
		
		
	}
	
	

}
