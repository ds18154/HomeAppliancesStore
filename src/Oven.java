public class Oven {

    private int mikos;
    private int ipsos;
    private int vathos;
    private String onomaKataskeuasti;
    private String onomaSiskeuis;
    private String tiposSiskeuis;
    private int katanalosi;

    private int xoritikotita;   /**Xoritikotita se litra*/
    private int arithmosEstion;
    private String xroma;
    private int varos;
    private boolean autokatharizomenos;

    static int counterOven=0;   /**Counter gia ta amtikeimena tis sigkekrimenis klasis*/

    /**Setters-getters*/
    public void setMikos(int mikos) {
        this.mikos = mikos;}
    public void setIpsos(int ipsos) {
        this.ipsos = ipsos;}
    public void setVathos(int vathos) {
        this.vathos = vathos;}
    public void setOnomaKataskeuasti(String onomaKataskeuasti) {
        this.onomaKataskeuasti = onomaKataskeuasti;}
    public void setOnomaSiskeuis(String onomaSiskeuis) {
        this.onomaSiskeuis = onomaSiskeuis;}
    public void setTiposSiskeuis(String tiposSiskeuis) {
        this.tiposSiskeuis = tiposSiskeuis;}
    public void setKatanalosi(int katanalosi) {
        this.katanalosi = katanalosi;}

    public void setXoritikotita(int xoritikotita) {
        this.xoritikotita = xoritikotita;}
    public void setArithmosEstion(int arithmosEstion) {
        this.arithmosEstion = arithmosEstion;}
    public void setXroma(String xroma) {
        this.xroma = xroma;}
    public void setVaros(int varos) {
        this.varos = varos;}
    public void setAutokatharizomenos(boolean autokatharizomenos) {
        this.autokatharizomenos = autokatharizomenos;}

    public int getMikos() {
        return mikos;}
    public int getIpsos(){
        return ipsos;}
    public int getVathos() {
        return vathos;}
    public String getOnomaKataskeuasti() {
        return onomaKataskeuasti;}
    public String getOnomaSiskeuis() {
        return onomaSiskeuis;}
    public String getTiposSiskeuis() {
        return tiposSiskeuis;}
    public int getKatanalosi() {
        return katanalosi;}


    public int getXoritikotita() {
        return xoritikotita;}
    public int getArithmosEstion() {
        return arithmosEstion;}
    public String getXroma() {
        return xroma;}
    public int getVaros() {
        return varos;}
    public boolean getAutokatharizomenos() {
        return autokatharizomenos; }

    public int getCounterOven() {
        return counterOven;}

    public Oven(){} /**Constructor gia tin arxikopoiisi ton antikeimenon tis klasis*/
    public Oven(int mikos,int ipsos, int vathos, String onomaKataskeuasti, String onomaSiskeuis,
                String tiposSiskeuis, int katanalosi, int xoritikotita, int arithmosEstion, String xroma,
                int varos, boolean autokatharizomenos) {
        this.mikos=mikos;
        this.ipsos=ipsos;
        this.vathos=vathos;
        this.onomaKataskeuasti=onomaKataskeuasti;
        this.onomaSiskeuis=onomaSiskeuis;
        this.tiposSiskeuis=tiposSiskeuis;
        this.katanalosi=katanalosi;
        this.xoritikotita=xoritikotita;
        this.arithmosEstion=arithmosEstion;
        this.xroma=xroma;
        this.varos=varos;
        this.autokatharizomenos=autokatharizomenos;
        counterOven++;
    }


    public void printOven(){    /**Sinartisi gia tin ektiposi ton stoixeion tis sikeuis*/
        System.out.println("Stoixeia Siskeuis: ");
        System.out.println("Tipos Siskeuis : " + this.tiposSiskeuis);
        System.out.println("Kataskeuastis kai Montelo : " + this.onomaKataskeuasti + " , " + this.onomaSiskeuis);
        System.out.println("Diastaseis : " + this.mikos + " mikos, " + this.ipsos + " ipsos, " + this.vathos + " vathos");
        System.out.println("Katanalosi : " + this.katanalosi);
        System.out.println("Xoritikotita : " + this.xoritikotita);
        System.out.println("Arithmos Estion : " +this.arithmosEstion);
        System.out.println("Xroma : " +this.xroma);
        System.out.println("Varos : " +this.varos);
        System.out.println("Programma Autokatharismou : " +this.autokatharizomenos);
    }

    public void periodicMaintenance(){}
}
