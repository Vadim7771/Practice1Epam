package ua.nure.Skulinec.Part6;

/**
 * @author Вадян
 *
 */
 final class NEWDEMO {

	private NEWDEMO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	 static void methodchisl(final String stroke)
	{
		int [] mass=new int[Integer.parseInt(args[0])];
        for(int i=0,g=0;g < mass.length;i++)
  {
      if(i>5&i%2!=0&i%3!=0&i%5!=0|i==2|i==3|i==5)
      {mass[g]=i;
          System.out.println(mass[g]);g++;
      }

  }
	}
	public static void main(final  String[]  args) {
		methodchisl(args[0]);

	}

}