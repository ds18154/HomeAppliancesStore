public class HomeAppliancesStore {

    static String onoma;
    static String dieuthinsi;
    static int plithos;
    static int counter=0;

    public static void main(String[] args) {
        try {   /**Elegxo an o xristis exei dossei esto kai ena argument*/
            System.out.printf("Onoma Etairias = %s %n", args[0]);
        } catch (Exception e) {
            System.out.println("Den yparxei kanena orisma. Xreiazontai tria");
        }
        if (args.length > 0) {
            try {   /**Elegxo an o xristis den exei dosei mono ena argument anti gia tria kai emfanizo to katalilo minima*/
                System.out.printf("Dieuthinsi Etairias = %s %n", args[1]);
            } catch (Exception e) {
                System.out.println("Mono ena orisma. Xreiazontai alla duo");
            }
        }
        if (args.length == 2 || args.length == 3) {
            try {   /**Elegxo an o xristis exei dosei kai ta 3 arguments*/
                System.out.printf("Plithos Ipalilon = %d%n", Integer.parseInt(args[2]));
            } catch (Exception e) {
                System.out.println("Mono duo orismata. Xreiazeetai allo ena AND/OR to 3o orisma den einai" +
                        "akeraios arithmos");
            }
        }
        setOnoma(args);
        setPlithos(args);
        setDieuthinsi(args);
        System.out.println("To onoma tis etairia einai " + getOnoma() + " me dieuthinsi " + getDieuthinsi() +
                " kai " + getPlithos() + " ipalilous");   /**Ektipono ta arguments me ti xrisi ton getters*/

        /**Dimiourgo ena plithos siskeuon*/
         Fridge fridge1 = new Fridge(70, 190, 70, "Bosch", "KB90 AA",
                "Fridge", 150, 60, "AA+", "Asimi", 60, true);
        Fridge fridge2 = new Fridge(40, 180, 45, "Siemens", "Strada AV",
                "Fridge", 120, 35, "A-", "Leuko", 52, false);
        WashingMachine WM1 = new WashingMachine(50, 55, 45, "Pitsos", "Synchronica",
                "Washing Machine", 130, 8, 87, "Leuko", 40, 1400);
        Oven oven1 = new Oven(70, 65, 70, "Bosch", "Eureka Atom", "Oven",
                210, 25, 4, "Mauro", 28, true);
        AirCondition AC1 = new AirCondition(110, 25, 30, "Fujitsu", "Eagle One",
                "AirCondition", 160, 1200, "A++", "Leuko", 68,
                true);

        /**ΕEktipono ta stoixeia tou kathe antikeimenou me tis sinartiseis printObject pou exo ftiaxei gia kathe klasi*/
         fridge1.printFridge();
        fridge2.printFridge();
        WM1.printWashingMachine();
        oven1.printOven();
        AC1.printAirCondition();

        /**Arthrizo ola ta counter kai ta ektipono analitika*/
         counter = fridge1.getCounterFridge() + WM1.getCounterWashingMachine() + oven1.getCounterOven() + AC1.getCounterAirCondition();
        System.out.println("To plithos ton siskeuon sinolika einai : " + counter);
        System.out.print(fridge1.getCounterFridge() + " psigio/a, ");
        System.out.print(WM1.getCounterWashingMachine() + " plintirio/a, ");
        System.out.print(oven1.getCounterOven() + " fournos/oi kai ");
        System.out.print(AC1.getCounterAirCondition() + " air condition");
    }



    /**Setters-getters*/
    public static String getOnoma(){
        return onoma;}
    public static String getDieuthinsi(){
        return dieuthinsi;}
    public static int getPlithos(){
        return plithos;}
    public static void setOnoma(String[] args){
        onoma=args[0];}
    public static void setDieuthinsi(String[] args){
        dieuthinsi=args[1];}
    public static void setPlithos(String[] args){
        plithos=Integer.parseInt(args[2]);}




}
