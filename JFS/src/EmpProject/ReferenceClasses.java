package EmpProject;

public class ReferenceClasses {
	int EmpId;
	String Ename;
	String Egrade;
	int Eage;
	long Enum;
	
	ReferenceClasses()
	{  
		System.out.println("EmpId"+" "+"Ename"+" "+"Egrade"+" "+"Eage"+" "+"Enum");
	}
	
	ReferenceClasses(int EmpId,String Ename,String Egrade,int Eage,int Enum)
	{
		this.EmpId= EmpId;
		this.Ename=Ename;
		this.Egrade=Egrade;
		this.Eage=Eage;
		this.Enum=Enum;
		
		System.out.println(EmpId+"     "+Ename+"    "+Egrade+"     "+Eage+"    "+Enum);
	}

}
