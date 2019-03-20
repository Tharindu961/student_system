import java.util.*;

class Student{
	public static void main(String args[]){
			Scanner sc1=new Scanner(System.in);
			int input;
			System.out.println("1.add_Students\n2.empty_Chairs\n3.remove_Student\n4.show_Student_Names\n5.count_Students\n6.Exit\n");
			System.out.println("Enter a Number : ");

			Maths x=new Maths();
			input=sc1.nextInt();
			int i=1;
			while(i==1){
			switch(input){

			case 1:x.addStudents();break;
			case 2:x.emptyChairs();break;
			case 3:x.removeStudent();break;
			case 4:x.showStudentNames();break;
			case 5:x.countStudents();break;
			case 6:i=0 ;break;

			default: System.out.println("Invalid Number");break;
		}
			System.out.println("\n\n\nEnter a Number : ");
			input=sc1.nextInt();
		
	}
	}
	private String name;
	private int marks;
	private String subject;

	Student(String name1,int marks1,String subject1){
		this.name=name1;
		this.marks=marks1;
		this.subject=subject1;
	}
	public String getName(){
		return name;
	}

}
class Maths{
	
	//Student[] st=new Student[5];//Object array of student
	ArrayList<Student> st=new ArrayList<Student>();
	void addStudents(){
		//if(st.size()<=5){

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name=scan.next();

		System.out.println("Enter your marks : ");
		int marks=scan.nextInt();

		System.out.println("Enter your subject : ");
		String subject=scan.next();

		Student st1=new Student(name,marks,subject);
		

		st.add(st1);
		//st1.main(args);
		
	//}


	}
	void emptyChairs(){
		System.out.println("The number of empty chairs :"+(5-st.size()));

	}
	
	void showStudentNames(){
		for(int i=0;i<st.size();i++ )
		{
			System.out.println(st.get(i).getName());
		}
	}
	void countStudents(){
		System.out.println(st.size());
	}
	void removeStudent(){
		if(st.size()==0){
			System.out.println("Students are empty!!");
		}
		else{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the name of the student you wants to remove");
			String name1=sc.next();
			for(int i=0;i<st.size();i++){
				if(st.get(i).getName()==name1){
					st.remove(i);
				}
				else
					System.out.println("The name you entered is wrong!!");
			}
		}
	}


}