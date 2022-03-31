package CoreJava;
class EmployeeData
{
	int EId;
	String Ename;
	String Egrade;
	int Eage;
	long Enum;
	EmployeeData(int EId,String Ename,char Egrade,int Eage,int Enum)
	{
		System.out.println("EId:"+EId+"  "+"ENAME:"+Ename+"  "+"EGRADE:"+Egrade+"  "+"EAGE:"+Eage+"  "+"ENUM:"+Enum);
		System.out.println("\n");
		
		
	}
}

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("DETAILS");
		EmployeeData s1 =new EmployeeData(101,"Amala",'A',21,569856);
        EmployeeData s2 =new EmployeeData(102,"Nini",'A',21,569856);
        
	}

}
