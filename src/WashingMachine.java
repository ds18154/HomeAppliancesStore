public class WashingMachine {

    private int mikos;
    private int ipsos;
    private int vathos;
    private String onomaKataskeuasti;
    private String onomaSiskeuis;
    private String tiposSiskeuis;
    private int katanalosi;

    private int xoritikotita;   /**Xoritikotita se litra*/
    private int epipedaThorivou;    /**Epipedo thorivou se dB*/
    private String xroma;
    private int varos;
    private int maxStrofes;

    static int counterWashingMachine=0; /**Counter gia ta amtikeimena tis sigkekrimenis klasis*/

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
    public void setEpipedaThorivou(int epipedaThorivou) {
        this.epipedaThorivou = epipedaThorivou;}
    public void setXroma(String xroma) {
        this.xroma = xroma;}
    public void setVaros(int varos) {
        this.varos = varos;}
    public void setMaxStrofes(int maxStrofes) {
        this.maxStrofes = maxStrofes;}

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
    public int getEpipedaThorivou() {
        return epipedaThorivou;}
    public String getXroma() {
        return xroma;}
    public int getVaros() {
        return varos;}
    public int getMaxStrofes() {
        return maxStrofes;}

    public int getCounterWashingMachine() {
        return counterWashingMachine;}

    public WashingMachine(){}   /**Constructor gia tin arxikopoiisi ton antikeimenon tis klasis*/
    public WashingMachine(int mikos,int ipsos, int vathos, String onomaKataskeuasti, String onomaSiskeuis,
                          String tiposSiskeuis, int katanalosi, int xoritikotita, int epipedaThorivou, String xroma,
                          int varos, int maxStrofes){
        this.mikos=mikos;
        this.ipsos=ipsos;
        this.vathos=vathos;
        this.onomaKataskeuasti=onomaKataskeuasti;
        this.onomaSiskeuis=onomaSiskeuis;
        this.tiposSiskeuis=tiposSiskeuis;
        this.katanalosi=katanalosi;
        this.xoritikotita=xoritikotita;
        this.epipedaThorivou=epipedaThorivou;
        this.xroma=xroma;
        this.varos=varos;
        this.maxStrofes=maxStrofes;
        counterWashingMachine++;
    }

    public void printWashingMachine() { /**Sinartisi gia tin ektiposi ton stoixeion tis sikeuis*/
        System.out.println("Stoixeia Siskeuis: ");
        System.out.println("Tipos Siskeuis : " + this.tiposSiskeuis);
        System.out.println("Kataskeuastis kai Montelo : " + this.onomaKataskeuasti + " , " + this.onomaSiskeuis);
        System.out.println("Diastaseis : " + this.mikos + " mikos, " + this.ipsos + " ipsos, " + this.vathos + " vathos");
        System.out.println("Katanalosi : " + this.katanalosi);
        System.out.println("Xoritikotita : " + this.xoritikotita);
        System.out.println("Epipeda Thorivou : " +this.epipedaThorivou);
        System.out.println("Xroma : " +this.xroma);
        System.out.println("Varos : " +this.varos);
        System.out.println("Megistos Arithmos Strofon : " +this.maxStrofes);
    }


    private void periodicMaintenance(){}
}