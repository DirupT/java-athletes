package com.lambdaschool.solution;

public class MyApplication implements Processor
{
	private AthleteCreation athleteCreate;

	public MyApplication(AthleteCreation athleteCreate)
	{
		this.athleteCreate = athleteCreate;
	}

	@Override
	public void displayAthlete()
	{
		System.out.println("************");
		athleteCreate.displayAthlete();
		System.out.println("************\n");
	}
}
