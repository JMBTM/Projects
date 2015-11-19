package gettingAge;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.*;
import java.time.Instant;
import java.time.temporal.Temporal;

public class DeterminAge {

	public DeterminAge() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		System.out.println("Give me your birthdate");
		System.out.println("Year: ");
		int y = s.nextInt();
		System.out.println("Month: ");
		String m = s1.nextLine().toUpperCase();
		System.out.println("Day: ");
		int d = s.nextInt();
		LocalDate now = LocalDate.now();
		LocalDate birthday = LocalDate.of(y, Month.valueOf(m),d);
		Period p = Period.between(birthday, now);
		String print = "";
		if(p.getYears() == 0 || p.getYears() == 1)
		{
			print += "You are " + p.getYears() + " year";
		}
		else if(p.getYears() > 1)
		{
			print += "You are " + p.getYears() + " years";
		}
		if(p.getMonths() == 1)
		{
			if(p.getDays()>0)
			{
				print += ", " + p.getMonths() + " month";
			}
			else{
				print += " and " + p.getMonths() + " month";
			}
		}
		if(p.getMonths() > 1)
		{
			if(p.getDays()>0)
			{
				print+= ", " + p.getMonths() + " months";
			}
			else{
				print += " and " + p.getMonths() + " months";
			}
		}
		if(p.getDays() == 1)
		{
			print += " and " + p.getDays() + " day";
		}
		if(p.getDays() > 1 )
		{
			print += " and " + p.getDays() + " days";
		}
		print += " old";
		System.out.println(print);
	}
}