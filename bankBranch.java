public class bankBranch extends bank{
    
       public String branchname="kharghar";
       public int branchid=12;
       public long branchphno=99658321;
        private int branchtotalfund=100000;
        protected float branchIntr=4f;
        public bankBranch(String bannkname, int bankid, long bankphno, int banktotalfund, float bankInt,
                String branchname, int branchid, long branchphno, int branchtotalfund, float branchIntr) {
            super(bannkname, bankid, bankphno, banktotalfund, bankInt);
            this.branchname = branchname;
            this.branchid = branchid;
            this.branchphno = branchphno;
            this.branchtotalfund = branchtotalfund;
            this.branchIntr = branchIntr;
        }
    
    
}
