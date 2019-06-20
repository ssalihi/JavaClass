package com.Class23;

public class ScrumTeam extends Employee {
public String artifacts;
public String ceremonies;

public void workOnArtifacts() {
	System.out.println("Scrum team works on "+artifacts);
}
public void scrumMeetings() {
System.out.println("Scrum team attends "+ceremonies);	
}
}
