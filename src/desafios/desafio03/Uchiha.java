package desafios.desafio03;

public class Uchiha extends Ninja {
    String hability;

    public Uchiha(String name, int age, String mission, String missionLevel, String missionStatus, String hability) {
        super(name, age, mission, missionLevel, missionStatus);
        this.hability = hability;
    }

    @Override
    public void showNinja() {
        System.out.println("Ninja { " +
                "name = '" + name + '\'' +
                ", age = " + age +
                ", mission = '" + mission + '\'' +
                ", missionLevel = '" + missionLevel + '\'' +
                ", missionStatus = '" + missionStatus + '\'' +
                ", hability = '" + hability + '\'' +
                '}'
        );
    }

    public void showHability() {
        System.out.println(hability);
    }
}
