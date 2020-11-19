public class AirCondition {

    private int mikos;
    private int ipsos;
    private int vathos;
    private String onomaKataskeuasti;
    private String onomaSiskeuis;
    private String tiposSiskeuis;
    private int katanalosi;

    private int apodosiBTU;
    private String energiakiKlasi;
    private String xroma;
    private int epipedaThorivou;    /**Epipedo thorivou se dB*/
    private boolean sindesimotitaWiFi;

    static int counterAirCondition=0;   /**Counter gia ta amtikeimena tis sigkekrimenis klasis*/

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

    public void setApodosiBTU(int apodosiBTU) {
        this.apodosiBTU = apodosiBTU;}
    public void setEnergiakiKlasi(String energiakiKlasi) {
        this.energiakiKlasi = energiakiKlasi;}
    public void setXroma(String xroma) {
        this.xroma = xroma;}
    public void setEpipedaThorivou(int epipedaThorivou) {
        this.epipedaThorivou = epipedaThorivou;}
    public void setSindesimotitaWiFi(boolean sindesimotitaWiFi) {
        this.sindesimotitaWiFi = sindesimotitaWiFi;}

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

    public int getApodosiBTU() {
        return apodosiBTU;}
    public String getEnergiakiKlasi() {
        return energiakiKlasi;}
    public String getXroma() {
        return xroma;}
    public int getEpipedaThorivou() {
        return epipedaThorivou;}
    public boolean getSindesimotitaWiFi() {
        return sindesimotitaWiFi;}

    public int getCounterAirCondition() {
        return counterAirCondition;}

    public AirCondition(){} /**Constructor gia tin arxikopoiisi ton antikeimenon tis klasis*/
    public AirCondition(int mikos,int ipsos, int vathos, String onomaKataskeuasti, String onomaSiskeuis,
                        String tiposSiskeuis, int katanalosi, int apodosiBTU, String energiakiKlasi, String xroma,
                        int epipedaThorivou, boolean sindesimotitaWiFi){
        this.mikos=mikos;
        this.ipsos=ipsos;
        this.vathos=vathos;
        this.onomaKataskeuasti=onomaKataskeuasti;
        this.onomaSiskeuis=onomaSiskeuis;
        this.tiposSiskeuis=tiposSiskeuis;
        this.katanalosi=katanalosi;
        this.apodosiBTU=apodosiBTU;
        this.energiakiKlasi=energiakiKlasi;
        this.xroma=xroma;
        this.epipedaThorivou=epipedaThorivou;
        this.sindesimotitaWiFi=sindesimotitaWiFi;
        counterAirCondition++;
    }    public int getCounteOven(){
        return counterAirCondition;}

    public void printAirCondition() {   /**Sinartisi gia tin ektiposi ton stoixeion tis sikeuis*/
        System.out.println("Stoixeia Siskeuis: ");
        System.out.println("Tipos Siskeuis : " + this.tiposSiskeuis);
        System.out.println("Kataskeuastis kai Montelo : " + this.onomaKataskeuasti + " , " + this.onomaSiskeuis);
        System.out.println("Diastaseis : " + this.mikos + " mikos, " + this.ipsos + " ipsos, " + this.vathos + " vathos");
        System.out.println("Katanalosi : " + this.katanalosi);
        System.out.println("Apodosi Btu : " +this.apodosiBTU);
        System.out.println("Energiaki Klasi : " +this.energiakiKlasi);
        System.out.println("Xroma : " +this.xroma);
        System.out.println("Epipeda Thorivou : " +this.epipedaThorivou);
        System.out.println("Dinatotita sindesis me Wifi : " +this.sindesimotitaWiFi);
    }

    public void periodicMaintenance(){}
}
