

public class RemoveSpace {
public static void main(String[] args) {
	String s1= "mohan is here";
	String Result = "";
	for(int i=0;i<s1.length();i++) {
		if(s1.charAt(i)!=' ') {
			   Result = Result + s1.charAt(i); 
		
			
			
			
			
			
		}else {
			Result = Result + ' ';
			
			
		}
		System.out.println(Result);
	}
}
}
