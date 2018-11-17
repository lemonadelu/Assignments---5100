/*
Design and develop a student information system interface
-Add a new student into the system with basic information e.g. ID, name, gender, etc.
-View all the student information in a table.
-Apply MVC model (MVC tutorial: http://www.javadude.com/articles/vaddmvc1/mvc1.htm)
-Upload the screenshot of the running interface.
 */

/*Concept of MVC
The basic idea is to split your application into three distinct parts, each of which can be replaced without affecting the others
-Model: the data of your application, along with the business logic that defines
how to change and access that data. The model can be shared among any number of view and controller objects
-View: The means of presenting the model's data to the outside world. This could take the form of a GUI, generated speech,
audible tones, printouts, or even non-user oriented output, such as turning on an air conditioner
-Controller: The means of gathering user or other environmental input and providing feedback
to the model, normally changing some of the data in that model.
 */

import javax.swing.*;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

//create model, view and controller
public class StudentInformationSystem extends JFrame{
    private JTable StudentsTable;
    private JTextField firstName, lastName, ID, Gender;
    private JButton Add;


    public StudentInformationSystem(Students students){
        StudentsTableModel model = new StudentsTableModel(students);
        StudentsTable = new JTable(model);
        JScrollPane jsp = new JScrollPane(StudentsTable);

        Container c = getContentPane();
        c.add(jsp);
        setSize(400, 400);
        setVisible(true);
        Scanner scanner = new Scanner(System.in);
        String First = scanner.nextLine();
        firstName = new JTextField(15);
        firstName.setText(First);

        String Last = scanner.nextLine();
        lastName = new JTextField(15);
        lastName.setText(Last);

        int id = scanner.nextInt();
        ID = new JTextField(20);
        ID.setText(Integer.toString(id));

        String gender = scanner.nextLine();
        Gender = new JTextField(10);
        Gender.setText(gender);


        JPanel p1 = new JPanel();
        p1.add(firstName);
        c.add(p1);

        JPanel p2 = new JPanel();
        p2.add(lastName);
        c.add(p2);

        JPanel p3 = new JPanel();
        p3.add(ID);
        c.add(p3);

        JPanel p4 = new JPanel();
        p4.add(Gender);
        c.add(p4);

        Add = new JButton("add");
        c.add(Add);
    }

    static class Student{
        int ID;
        String first, last;
        String gender;
        public Student(int ID, String last, String first, String gender){
            this.first = first;
            this.last = last;
            this.gender = gender;
            this.ID = ID;
        }
    }

    static class Students{
        private Collection<Student> students = new ArrayList<Student>();
        public Collection<Student> getStudents(){
            return students;
        }
        public void addStudents(Student s){
            students.add(s);
        }
        public int getNumberOfStudents(){
            return getStudents().size();
        }
    }


    //This model is completely independent of the user interface
    class StudentsTableModel implements TableModel{
        private Students students;

        public StudentsTableModel(Students students){
            this.students = students;
        }
        public int getRowCount(){
            return students.getNumberOfStudents();
        }
        public int getColumnCount(){
            return 4;
        }
        public String getColumnName(int columnIndex){
            if(columnIndex == 0)
                return "ID";
            if(columnIndex == 1)
                return "First";
            if(columnIndex == 2)
                return "Last";
            if(columnIndex == 3)
                return "Gender";
            return null;
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            if(columnIndex == 3){
                return Boolean.class;
            }
            return String.class;
        }

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return false;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            Collection<Student> s = students.getStudents();
            int row = -1;
            for(Student student: s){
                row++;
                if(row == rowIndex){
                    if(columnIndex == 0){
                        return student.ID + "";
                    }
                    if(columnIndex == 1){
                        return student.first;
                    }
                    if(columnIndex == 2){
                        return student.last;
                    }
                    if(columnIndex == 3){
                        return student.gender;
                    }
                }
            }
            return null;
        }

        @Override
        public void setValueAt(Object o, int i, int i1) {

        }

        @Override
        public void addTableModelListener(TableModelListener tableModelListener) {

        }

        @Override
        public void removeTableModelListener(TableModelListener tableModelListener) {

        }
    }

    /*Controller is to respond to user requests, interacting with both the View and Controller as necessary
    *View is to create the display, calling the Model as necessary to get information
    * Simplify the MVC model by combining View and Controller
    */

    public static void main(String[] args){
        Students s = new Students();
        s.addStudents(new Student(1, "Lu", "Daisy", "Female"));
        s.addStudents(new Student(2, "Lin", "Linda", "Female"));
        new StudentInformationSystem(s);
    }

}
