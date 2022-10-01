package demoJob;

import demoJob.Job;

public class CompanyB implements Job {

	@Override
	public String JobStatus() {
		// TODO Auto-generated method stub
		return "you are rejected for the position you applied for";
	}

	@Override
	public String getAvgSalary() {
		// TODO Auto-generated method stub
		return null;
	}

}
