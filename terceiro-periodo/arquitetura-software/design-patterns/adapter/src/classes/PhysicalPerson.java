package classes;

public class PhysicalPerson implements PersonalAdapter{
    
    private String cpf;

    public PhysicalPerson(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String getRegister() {
        return getCpf();
    }
}
