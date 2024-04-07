package classes;

public class LegalPerson implements PersonalAdapter{
    
    private String cnpj;

    public LegalPerson(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    @Override
    public String getRegister() {
        return getCnpj();
    }
}
    

