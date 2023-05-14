import java.io.File;  
public class FileDeleteExample  
{  
public static void main(String[] args)  
{     
try  
{         
File f= new File("D:ToDeleteFile.txt");           //file to be delete  
if(f.delete())                      //returns Boolean value  
{  
System.out.println(f.getName() + " deleted");   //getting and printing the file name  
}  
else  
{  
System.out.println("The file does not exist");  
}  
}  
catch(Exception e)  
{  
e.printStackTrace();  
}  
}  
}
 
