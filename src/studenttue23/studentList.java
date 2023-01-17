
package studenttue23;

/**
 *
 * @author Ronak
 */
public class studentList {
    public static void main(String[] args){
        
        //StudentTue23 s1= new StudentTue23("s1","Ronak");
        StudentTue23[] studentList = new StudentTue23[3];
        studentList[0]=new StudentTue23("s1","Ronak");
        studentList[1]=new StudentTue23("s2","john");
        studentList[2]=new StudentTue23("s3","xyz");
        
        for(int i=0;i<studentList.length;i++){
            System.out.println(studentList[i].getStudentName());
        }
        
    }//end of main
}//end of class
