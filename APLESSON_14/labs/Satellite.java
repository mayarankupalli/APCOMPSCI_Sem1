import java.util.ArrayList;
public class Satellite
{
   public static void main(String[]args)
<<<<<<< HEAD
   { 
       ArrayList<Car> locate = new ArrayList<>();
	   double[] position = new double[6];
       double[] honLoc = {5, 6};
	   
	   for(int i = 0; i < 6; i++)
	   {
		   position[i] = Math.round((double)(Math.random() * 100) + 1);
	   }
	   
=======
   {
       ArrayList<Location> locate = new ArrayList<>();
       double[] honLoc = {5, 6};
>>>>>>> origin/master
       locate.add(new Honda(honLoc));
       locate.add(new Toyota("8, 9"));
       locate.add(new GMC(3, 8));

        double[] home = {0, 0};
<<<<<<< HEAD
		int i = 0;
		
		for(Car 1 : locate)
		{
			l.move(position[i], position[i+1]);
			i += 2;
		}
=======
>>>>>>> origin/master

        String printout = "\n\n" +
               "==========================" + "\nStarting locations...";

<<<<<<< HEAD
        for(Car l : locate)
=======
        for (Location l : locate)
>>>>>>> origin/master
       {
           printout += "\nLocation for " + l.getID() + ": (" + getLocation(l.getLoc()) + ")";
       }

<<<<<<< HEAD
        printout += "\n\n" + "==========================";
		i = 0;
		
		for(Car l : locate)
		{
			double[] newPosition = l.getLoc();
			double x = newPosition[0];
			double y = newPosition[1];
			printout += "\n\nAfter" + l.getID() + "moved (" + position[i] + ", " + position[i+1] + ")" + "\nNew location: " + "(" + x + ", " + y + ")" + "\n";
			i += 2;
		}

		printout += "\n" + "==========================" + "\nDistance from home...";
		
        for(Car l : locate)
=======
        printout += "\n\n" + "==========================" +
                   "\nDistance from home...";

        for (Location l : locate)
>>>>>>> origin/master
       {
           printout += "\nDistance for " + l.getID() + ": (" + getDistance(l.getLoc(), home)+ ")";
       }

        System.out.println(printout);
   }

    public static double getDistance(double[] car, double[] home)
   {
       return Math.sqrt((Math.pow(car[0] - home[0], 2)+ Math.pow(car[1] - home[1], 2)));
   }

    public static String getLocation(double[] loc)
   {
       return loc[0] + ", " + loc[1];
   }
}