package com.Class23;

public class EmployeeTest {

	public static void main(String[] args) {
		System.out.println("-------------creating employee object---1");
		
		Employee emp=new Employee();
		 System.out.println(Employee.department);
		 Employee.work();// the preffered way to access the object is through the class name
		// emp.work(); not a prefferred way 
		emp.salary=90000;
		emp.getPaid();
		
		System.out.println("-------------creating scrum team object---2");
		
		ScrumTeam st=new ScrumTeam();
		ScrumTeam.work();// we can access in child class because of inheritance 
		st.salary=100000;
		st.getPaid();
		st.artifacts="Product Backlog, Spring Backlog, BurnDown Chart";
		st.ceremonies="Sprint grooming,Sprint planning, Daily StandUp, Sprint Demo,Sprint Retor ";
		st.scrumMeetings();
		st.workOnArtifacts();
		
		System.out.println("-----------Creating developer object-------------------3");
		
		Developer dev=new Developer();
		dev.salary=120000;
		Developer.work();// can access to out gran-child class because of inheritance 
		dev.getPaid();
		dev.artifacts="Sprint Backlog";
		dev.ceremonies="Sprint grooming,Sprint planning, Daily StandUp, Sprint Demo,Sprint Retor ";
		dev.workOnArtifacts();
		dev.scrumMeetings();
		dev.code();
	
		
System.out.println("-----------Creating Tester object---------------------4");
		
		Tester qa=new Tester();
		qa.salary=120000;
		qa.getPaid();
		qa.artifacts="Sprint Backlog";
		qa.ceremonies="Sprint grooming,Sprint planning, Daily StandUp, Sprint Demo,Sprint Retor ";
		qa.workOnArtifacts();
		qa.scrumMeetings();
		qa.test();
		
System.out.println("-----------Creating Bussiness Analyst object----------------------5");
		
BussinessAnalyst ba=new BussinessAnalyst();
		ba.salary=100000;
		ba.getPaid();
		ba.artifacts="Sprint Backlog";
		ba.ceremonies="Sprint grooming,Sprint planning, Daily StandUp, Sprint Demo,Sprint Retor ";
		ba.workOnArtifacts();
		ba.scrumMeetings();
		ba.writeUserStories();
		
		System.out.println("-----------Creating Scrum Master object----------------------6");
		
		ScrumMaster sm=new ScrumMaster();
				sm.salary=100000;
				sm.getPaid();
				sm.artifacts="BurnDown Chart";
				sm.ceremonies="Sprint grooming,Sprint planning, Daily StandUp, Sprint Demo,Sprint Retor ";
				sm.workOnArtifacts();
				sm.scrumMeetings();
				
		System.out.println("-----------Creating Product Owner object----------------------7");
				
		ProductOwner po=new ProductOwner();
						po.salary=150000;
						po.getPaid();
						po.artifacts="Sprint Backlog, product Backlog";
						po.ceremonies="Sprint grooming,Sprint planning, Daily StandUp, Sprint Demo,Sprint Retor ";
					    po.workOnArtifacts();
						po.scrumMeetings();
						po.prioritizeBacklog();
						po.talkTotheClient();
						
System.out.println("-----------Front End Developer ----------------------8");	

     FrontEnd html=new FrontEnd();
     html.salary=120000;
		html.getPaid();
		html.artifacts="Sprint Backlog";
		html.ceremonies="Sprint grooming,Sprint planning, Daily StandUp, Sprint Demo,Sprint Retor ";
		html.workOnArtifacts();
		html.scrumMeetings();
		html.code();
		html.devehtml();
		
		System.out.println("-----------Back End Developer ----------------------9");	

	     BackEnd sql=new BackEnd();
	     sql.salary=120000;
			sql.getPaid();
			sql.artifacts="Sprint Backlog";
			sql.ceremonies="Sprint grooming,Sprint planning, Daily StandUp, Sprint Demo,Sprint Retor ";
			sql.workOnArtifacts();
			sql.scrumMeetings();
			sql.code();
			sql.sql();
			
			System.out.println("-----------Automation Tester object---------------------10");
			
			AutomationTester au=new AutomationTester();
			au.salary=120000;
			au.getPaid();
			au.artifacts="Sprint Backlog";
			au.ceremonies="Sprint grooming,Sprint planning, Daily StandUp, Sprint Demo,Sprint Retor ";
			au.workOnArtifacts();
			au.scrumMeetings();
			au.test();
			au.automationTester();
System.out.println("-----------Manual Tester object---------------------11");
			
			ManualTesting mt=new ManualTesting();
			mt.salary=120000;
			mt.getPaid();
			mt.artifacts="Sprint Backlog";
			mt.ceremonies="Sprint grooming,Sprint planning, Daily StandUp, Sprint Demo,Sprint Retor ";
			mt.workOnArtifacts();
			mt.scrumMeetings();
			mt.test();
			mt.manualAutomation();

	}

}
