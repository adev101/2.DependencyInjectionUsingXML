package demoJob;

import demoJob.Job;

public class CompanyA implements Job {

	private static Salary avgSalary;
	
	public CompanyA( Salary aSalary) {
		avgSalary = aSalary;
	}
	
	
	@Override
	public String JobStatus() {
		// TODO Auto-generated method stub
		return "You are selected for the job";
	}

	@Override
	public String getAvgSalary() {
		// TODO Auto-generated method stub
		return avgSalary.getAvgSalary();
	}


}
