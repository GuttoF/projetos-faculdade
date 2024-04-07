import classes.LegalPerson;
import classes.PersonalAdapter;
import classes.PhysicalPerson;

import java.util.Objects;

public class Adapter {
    public static void main(String[] args) {
        var gutto = new PhysicalPerson("123.456.789-10");
        var user2 = new PhysicalPerson(null);
        var empresa = new LegalPerson("12.345.678/0001-90");
        var empresa2 = new LegalPerson(null);

        var personProcessor = new PersonProcessor();
        personProcessor.process(gutto);
        personProcessor.process(user2);
        personProcessor.process(empresa);
        personProcessor.process(empresa2);

    }

    public static class PersonProcessor {

        void process(PersonalAdapter adapter) {
            if (Objects.isNull(adapter.getRegister())) {
                System.out.println("Registro não encontrado");
            } else {
                System.out.println("Registro: " + adapter.getRegister());
            }
        }
    }
}
