public class HomeAppliancesStore {

    static String onoma;
    static String dieuthinsi;
    static int plithos;

    public static void main(String[] args) {
        try {
            System.out.printf("Onoma Etairias = %s %n", args[0]);
        } catch (Exception e) {
            System.out.println("Den yparxei kanena orisma. Xreiazontai tria");
        }
        if (args.length > 0) {
            try {
                System.out.printf("Dieuthinsi Etairias = %s %n", args[1]);
            } catch (Exception e) {
                System.out.println("Mono ena orisma. Xreiazontai alla duo");
            }
        }
        if (args.length == 2 || args.length == 3) {
            try {
                System.out.printf("Plithos Pelaton = %d%n", Integer.parseInt(args[2]));
            } catch (Exception e) {
                System.out.println("Mono duo orismata. Xreiazeetai allo ena AND/OR to 3o orisma den einai" +
                        "akeraios arithmos");
            }
        }
        setOnoma(args);
        setPlithos(args);
        setDieuthinsi(args);
        System.out.println("To onoma tis etairia einai " +getOnoma() + " me dieuthinsi " + getDieuthinsi() +
                " kai " + getPlithos()+" pelates");
    }

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


