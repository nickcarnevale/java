public class LehighPerson extends Person { //subclass
    private String lin;
    private String email;

    public LehighPerson(String lin, String email, String name, String address, String birthdate) {
        super(name, address, birthdate);
        this.lin = lin;
        this.email = email;
        
    }
    
    public LehighPerson(String lin, String email){
        super(null,null,null); // not necessary
        this.lin=lin;
        this.email=email;
    }

    public LehighPerson() {
        //default call to super()
    }

    public String getLin() {
        return lin;
    }

    public void setLin(String lin) {
        this.lin = lin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
