package demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class demo {

	public static void main(String[] args) 
	{
	System.out.println("demo data");	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	   LocalDateTime now = LocalDateTime.now();
	   System.out.println(dtf.format(now));
	   String strDate = dtf.format(now);  
	   System.out.println("Converted String: " + strDate);
	}
	
	
	}  


