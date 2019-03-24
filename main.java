//by Muhammad Alwan Andika
//1177050066

import static java.lang.System.*;

public class Main
{

	public static void main(String[] args)
	{
		String name;
		String destination;
		String status;
		String organisation;
		String type;
		String launch;
		int duration;

		//(name, destination, status, organisation, type, launch, duration)
		Probe mio = new Probe ("Mio", "Mercury", "En Route", "JAXA (Japan)", "Orbiter", "June 8, 2018", 0);
		Probe venera = new Probe ("Venera 4", "Venus", "Success", "USSR (Soviet Union)", "Atmospheric", "June 12, 1967", 127);
		Probe ME = new Probe ("Mars Expres", "Mars", "Success", "ESA (European Union)", "Orbiter", "December 25, 2003", 5560);
		Probe aditya = new Probe ("Aditya-L1", "Sun", "planned", "ISRO (India)", "Orbiter", "2021", 1825);
	
		out.println();
		out.println ("Name		: " + mio.getName());
		out.println ("Destination	: " + mio.getDestination());
		out.println ("Organisation	: " + mio.getOrganisation());
		out.println ("Type		: " + mio.getType());
		out.println ("Launch date	: " + mio.getLaunch());
		out.println ("Mission Duration: " + mio.getDuration() + " days");
		out.println ("Status		: " + mio.getStatus());
		out.println();
		
		out.println();
		out.println ("Name		: " + venera.getName());
		out.println ("Destination	: " + venera.getDestination());
		out.println ("Organisation	: " + venera.getOrganisation());
		out.println ("Type		: " + venera.getType());
		out.println ("Launch date	: " + venera.getLaunch());
		out.println ("Mission Duration: " + venera.getDuration() + " days");
		out.println ("Status		: " + venera.getStatus());
		out.println();
		
		out.println();
		out.println ("Name		: " + ME.getName());
		out.println ("Destination	: " + ME.getDestination());
		out.println ("Organisation	: " + ME.getOrganisation());
		out.println ("Type		: " + ME.getType());
		out.println ("Launch date	: " + ME.getLaunch());
		out.println ("Mission Duration: " + ME.getDuration() + " days");
		out.println ("Status		: " + ME.getStatus());
		out.println();
		
		out.println();
		out.println ("Name		: " + aditya.getName());
		out.println ("Destination	: " + aditya.getDestination());
		out.println ("Organisation	: " + aditya.getOrganisation());
		out.println ("Type		: " + aditya.getType());
		out.println ("Launch date	: " + aditya.getLaunch());
		out.println ("Mission Duration: " + aditya.getDuration() + " days (planned)");
		out.println ("Status		: " + aditya.getStatus());
		out.println();
  }
}

//by Muhammad Alwan Andika
//1177050066