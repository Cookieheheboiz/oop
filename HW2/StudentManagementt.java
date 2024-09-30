import java.util.HashSet;
import java.util.Set;

public class StudentManagementt {
    StudentManagement[] students = new StudentManagement[100];
    int numOfStudents = 0;
    public static boolean sameGroup(StudentManagement s1, StudentManagement s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    public void addStudent(StudentManagement newStudent) {
        students[numOfStudents] = newStudent;
        numOfStudents++;

    }

    public String studentsByGroup() {
        String result = "";
        Set<String> listOfGroups = new HashSet<>();
        for (int i = 0; i < numOfStudents; i++) {
            listOfGroups.add(students[i].getGroup());
        }

        for (String group : listOfGroups) {
            result += group + "\n";
            for(int i = 0; i<numOfStudents; i++) {
                if(students[i].getGroup().equals(group)) {
                    result += students[i].getInfo() + "\n";
                }
            }
        }
        return result;
    }

    public void removeStudent(String id) {
        for (int i = 0; i < numOfStudents; i++) {
            if(students[i].getId().equals(id)) {
                for (int j = i+1; j < numOfStudents - 1; j++) {
                    students[j] =  students[j + 1];
                }
            }
            break;
        }
        numOfStudents--;
    }

    public static void main(String[] args) {
        StudentManagementt sm = new StudentManagementt();
        StudentManagement s1 = new StudentManagement(name: "Nguyen Van An", id :"17020001", email:"17020001@vnu.edu.vn");
        StudentManagement s2 = new StudentManagement(name: "Nguyen Van B", id :"17020002", email:"17020002@vnu.edu.vn");
        s2.setGroup("K62CB");
        StudentManagement s3 = new StudentManagement(name: "Nguyen Van C", id :"17020003", email:"17020003@vnu.edu.vn");




    }

}
