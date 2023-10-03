package com.example.restdemo.modell;

public class Doctor
{
	  private String name;
	  private String specialtiy;
	  private Integer id;
	  private String availabity;
	  private String timings;
	  
	  public Doctor() 
	     {}

	    public Doctor(String name, String specialtiy,Integer id,String availabity,String timings )
	     {
	    this.name = name;
	    this.specialtiy = specialtiy;
	    this.id = id ;
	    this.availabity = availabity;
		this.timings = timings;
	     }

		public String getName()
		{
			return name;
		}

		public void setName(String name)
		{
			this.name = name;
		}

		public String getSpecialtiy() 
		{
			return specialtiy;
		}

		public void setSpecialtiy(String specialtiy) 
		{
			this.specialtiy = specialtiy;
		}

		public Integer getId()
		{
			return id ;
		}

		public void setId(Integer id )
		{
			this.id  = id ;
		}

		public String getAvailabity()
		{
			return availabity;
		}

		public void setAvailabity(String availabity)
		{
			this.availabity = availabity;
		}

		public String getTimings()
		{
			return timings;
		}

		public void setTimings(String timings) 
		{
			this.timings = timings;
		}
	    
	    
}
