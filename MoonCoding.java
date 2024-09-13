public class MoonCoding{
    public static void main (String[]args){
        double moonDistance = 380000.0;
        double topSpeed = 10.0;
        double eta = (moonDistance/topSpeed)/60;
        System.out.println("Eta is " + eta);

        double horizontalSpeed = 2;
        double verticalSpeed = 3;
        double totalSpeed = Math.sqrt((horizontalSpeed*horizontalSpeed)+(verticalSpeed*verticalSpeed));
        System.out.println("Total speed " + totalSpeed);

        //units in m
        double moonRadius = 1731000;
        double area = 4*3.14*(moonRadius*moonRadius);
        double volume = area*0.001;
        System.out.println("Surface volume " + volume);

        double density = (volume*3000)/1000;
        System.out.println("Regolith density " + density);

        double waterPercent = (0.25*density)*100;
        System.out.println("Liters of water " + waterPercent);





    }
}