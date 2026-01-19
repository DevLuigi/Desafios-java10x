package desafios.desafio03;

public class Ninja {
    String name;
    int age;
    String mission;
    String missionLevel;
    String missionStatus;

    public Ninja(String name, int age, String mission, String missionLevel, String missionStatus) {
        this.name = name;
        this.age = age;
        this.mission = mission;
        this.missionLevel = missionLevel;
        this.missionStatus = missionStatus;
    }

    public void showNinja() {
        System.out.println("Ninja { " +
                "name = '" + name + '\'' +
                ", age = " + age +
                ", mission = '" + mission + '\'' +
                ", missionLevel = '" + missionLevel + '\'' +
                ", missionStatus = '" + missionStatus + '\'' +
                '}'
        );
    }
}
