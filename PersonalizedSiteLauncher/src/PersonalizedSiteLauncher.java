import java.awt.Desktop;
import java.net.URL;
import java.util.Scanner;
import java.lang.String;;
class p12{
private int sm;
private int t;
private String rt;
void sports() {
	try {
		System.out.println("Your site is opening!");
	    Runtime.getRuntime().exec(new String[]{"cmd", "/c","start chrome http://www.skysports.com/football"});
	} catch (Exception e) {
		e.printStackTrace();
	}
}
void International() {
	try {
		System.out.println("Your site is opening!");
		Runtime.getRuntime().exec(new String[]{"cmd", "/c","start chrome https://news.sky.com/world"});
	} catch (Exception e) {
		e.printStackTrace();
	}
}
void India() {
	try {
		System.out.println("Your site is opening!");
		Runtime.getRuntime().exec(new String[]{"cmd", "/c","start chrome https://timesofindia.indiatimes.com/india"});
	} catch (Exception e) {
		e.printStackTrace();
	}
}

void karnataka() {
	try {
		System.out.println("Your site is opening!");
		Runtime.getRuntime().exec(new String[]{"cmd", "/c","start chrome https://tv9.live/tv9-kannada-live-news-online-streaming/"});
	} catch (Exception e) {
		e.printStackTrace();
	}
}
void Entertainment() {
	try {
		System.out.println("Your site is opening!");
		Runtime.getRuntime().exec(new String[]{"cmd", "/c","start chrome https://www.ndtv.com/entertainment"});
	} catch (Exception e) {
		e.printStackTrace();
	}
}
void Netflix() {
	System.out.println("Please enter your age");
	Scanner p = new Scanner(System.in);
	t = p.nextInt();
	String str = "yes";
	if(t<18) {
		System.out.println("Sorry you cannot access this website!");
	}
	if(t>=18) {
		System.out.println("Are you Sure you want to continue?");
		Scanner st = new Scanner(System.in);
		rt=st.next();
		if(rt.equalsIgnoreCase("yes")) {
			System.out.println("Your site is opening!");
		try{Runtime.getRuntime().exec(new String[]{"cmd", "/c","start chrome https://www.netflix.com"});
	}
	catch(Exception e) {
		e.printStackTrace();
	}	
		}
	
	}
}
void Socialmedia() {
	System.out.println("what social media site you wish to access? \n 1 -> Facebook \n 2 -> Instagram \n 3 -> Twitter \n 4 -> Youtube  ");
Scanner s = new Scanner(System.in);
sm = s.nextInt();
switch(sm){
case 1:
try {
	System.out.println("Your site is opening!");
	Runtime.getRuntime().exec(new String[]{"cmd", "/c","start chrome https://www.facebook.com"});
} catch (Exception e) {
	e.printStackTrace();
}
	break;
case 2:	try {
	System.out.println("Your site is opening!");
		Runtime.getRuntime().exec(new String[]{"cmd", "/c","start chrome https://www.instagram.com"});
	} catch (Exception e) {
		e.printStackTrace();
	}
break;
case 3: try {
	System.out.println("Your site is opening!");
	Runtime.getRuntime().exec(new String[]{"cmd", "/c","start chrome https://www.twitter.com"});
} catch (Exception e) {
	e.printStackTrace();
}
break;
case 4: try {
	System.out.println("Your site is opening!");
	Runtime.getRuntime().exec(new String[]{"cmd", "/c","start chrome https://www.youtube.com"});
} catch (Exception e) {
	e.printStackTrace();
}
break;
}
}
}
public class PersonalizedSiteLauncher {
	public static void main(String args[]) {
		p12 p = new p12();
	System.out.println("Enter the category of news \n 1 -> Sports \n 2 -> International \n 3 -> India \n 4 -> Karnataka \n 5 -> Entertainment \n 6 -> Social Media \n 7 -> Netflix ");
	Scanner in = new Scanner(System.in);
int w = in.nextInt();
switch(w) {
case 1: p.sports();
break;
case 2: p.International();
break;
case 3: p.India();
break;
case 4: p.karnataka();
break;
case 5: p.Entertainment();
break;
case 6: p.Socialmedia(); 
break;
case 7: p.Netflix();
break;
}
	}}
