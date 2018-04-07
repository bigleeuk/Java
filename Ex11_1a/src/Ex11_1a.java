import java.util.Scanner;
import java.util.Calendar;
public class Ex11_1a {

	public static void main(String[] args) throws InvalidTimeException{	
		String result = null;
	
		try{
		
			InvalidTimeException  ex = new InvalidTimeException();
			System.out.println("enter the hour,miniute and am?pm?");
			Scanner key =new Scanner(System.in);
			String intime= key.next();
			String h= key.next();
			ex.setHour(h);
			int h1=Integer.parseInt(h);
			String m= key.next();
			ex.setMin(m);
			int m1=Integer.parseInt(m);
			String x= key.next();
			ex.setXx(x);
			if(h1>12 || h1<0)
				throw new hourException("Exception: hour isnt correct");
			if(m1>59 || m1<0)
				throw new minException("Exception: min isnt correct");
			if(x.equalsIgnoreCase("am")==false && x.equalsIgnoreCase("pm")==false)
				throw new timeException("Exception: time isn correct");
			result = h+":"+m+":"+x;
			System.out.println(ex.checktime(result));
			//chectime 실행 오류
			System.out.println(result);
		}
		catch(hourException o){
			System.out.println(o.getMessage());
		}
		catch (minException e) {
			System.out.println(e.getMessage());
		} catch (timeException e) {
			System.out.println(e.getMessage());
		}
		finally{
		System.out.println("current time is: "+result+ " if result is null  that excepted");
	}
	}
	
}
