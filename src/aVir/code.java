package aVir;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class code {
    public static void listingFile() {
    	File fileDir = new File("C:\\Users\\Ujjwal Tiwari\\Desktop\\phase1\\");
        //Creating the directory
       	fileDir.mkdir();
       
       		if(fileDir.isDirectory()){
            List <String>listFile = Arrays.asList(fileDir.list());
            Collections.sort(listFile);
            System.out.println("================================================================"); 
            System.out.println("Filenames in ascending order:");
            System.out.println("================================================================"); 
            for(String s:listFile){
                System.out.println(s);
                
            }
            }

        else{
           System.out.println(fileDir.getAbsolutePath() + " is not a directory");
        }code.mainMenu();

  }
    public static void createFile() {
        File file = new File("C:\\Users\\Ujjwal Tiwari\\Desktop\\phase1\\");
        //Creating the directory
        file.mkdir();
        
     
    Scanner create = new Scanner(System. in ); 
    System.out.println("================================================================"); 
    System.out.println("Enter the file name : ");
    System.out.println("================================================================"); 
    String name = create.nextLine(); 
        File file1 = new File("C:\\Users\\Ujjwal Tiwari\\Desktop\\phase1\\"+name);

        try {
            if (file1.createNewFile()) {
                System.out.println("File Created successfully");
                code.fileMenuOperations();
            } else {
                System.out.println("File already exists");
                code.fileMenuOperations();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }



    
    public static void deleteFile() {
        String filename;
        Scanner delete = new Scanner(System.in);
        System.out.println("================================================================"); 
        System.out.println("Enter the Name of File to Delete: ");
        System.out.println("================================================================"); 
        filename = delete.nextLine();

        File file= new File("C:\\Users\\Ujjwal Tiwari\\Desktop\\phase1\\"+filename);

        if (file.delete()) {
            System.out.println("File deleted successfully");
            code.fileMenuOperations();
        }
        else {
            System.out.println(" File not found.Please try again ");
            code.fileMenuOperations();
        }

    }
    public static void searchFile() {
    	Scanner search = new Scanner(System.in);
    	System.out.println("================================================================"); 
        System.out.println("Enter the name of the file to Search ");
        System.out.println("================================================================");     
        String folderName = search.next();
        File file = new File("C:\\Users\\Ujjwal Tiwari\\Desktop\\phase1\\"+folderName);

        if (file.exists()) {
            System.out.println(" File found! and the file location :"+file.getAbsolutePath());
            code.fileMenuOperations();
        } else {
            System.out.println(" File Not Found ");
            code.fileMenuOperations();
        }

    }
    public static void mainMenu() {
    	System.out.println("Please select one of the following : ");
    	System.out.println();
        System.out.println("1.Show Files In Ascending");
        System.out.println("2.Show File Options Menu");
        System.out.println("3.Quit");
        System.out.println("================================================================"); 
    }
    
    public static void fileMenuOperations() {
    	System.out.println("================================================================"); 
    	System.out.println("Please choose one of the following options :");
        System.out.println("1. Create a file");
        System.out.println("2. Delete a File");
        System.out.println("3. Search for a File");
        System.out.println("4. Main Menu");
        System.out.println("================================================================"); 
        Scanner sc=new Scanner(System.in);
    	try {
    		
            int Case=sc.nextInt();
             switch(Case) {
             case 1:
                 createFile();
                 break;
             case 2:
                 deleteFile();
                 break;
             case 3:
                 searchFile();
                 break;
             case 4:
                 System.out.println("|----    MainMenu      -----|");
                 code.mainMenu();
                  break;
         }

        }catch(Exception e) {
           System.out.println("Enter valid number");
          code.fileMenuOperations();
        }
    }
}
 
