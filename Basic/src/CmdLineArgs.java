
public class CmdLineArgs {

	public static void main(String[] args) {
		int sum=0;
		for (String str : args) {
			sum+=Integer.parseInt(str);			
		}System.out.println(sum);
		
		int x=10;
		//boxing
		Integer iobj=x;
		//unboxing
		int y=iobj;
		//autoboxing
		Integer z=iobj*x+y;
	}
}
