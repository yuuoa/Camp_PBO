//by Muhammad Alwan Andika
//1177050066

import static java.lang.System.*;

public class Probe
{
	private String name;
	private String destination;
	private String status;
	private String organisation;
	private String type;
	private String launch;
	private int duration;
	
	public Probe (String name, String destination, String status, String organisation, String type, String launch, int duration)
	{
		this.name = name;
		this.destination = destination;
		this.status = status;
		this.organisation = organisation;
		this.type = type;
		this.launch = launch;
		this.duration = duration;
	}

	public String getName()
	{
		return name;
	}
	
	public String getDestination()
	{
		return destination;
	}
	
	public String getStatus()
	{
		return status;
	}
	
	public String getOrganisation()
	{
		return organisation;
	}
	
	public String getType()
	{
		return type;
	}
	
	public String getLaunch()
	{
		return launch;
	}
	
	public int getDuration()
	{
		return duration;
	}
}

//by Muhammad Alwan Andika
//1177050066