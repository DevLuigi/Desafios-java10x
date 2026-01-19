package desafios;

public class Desafio01 {
    public static void main(String[] args) {
        // Name
        String ninja01Name = "Madara";
        String ninja02Name = "Sasuke";
        String ninja03Name = "Itachi";

        // Age
        short ninja01Age = 115;
        short ninja02Age = 14;
        short ninja03Age = 21;

        // mission name
        String ninja01MissionName = "Ativar o Tsukuyomi infinito";
        String ninja02MissionName = "Matar Itachi Uchiha";
        String ninja03MissionName = "Proteger Sasuke Uchiha a qualquer custo";

        // mission level
        char ninja01MissionLevel = 'A';
        char ninja02MissionLevel = 'B';
        char ninja03MissionLevel = 'B';

        // mission status
        String ninja01MissionStatus = "SUCCESS";
        String ninja02MissionStatus = "SUCCESS";
        String ninja03MissionStatus = "SUCCESS";

        if (ninja01Age < 15 && (ninja01MissionLevel != 'C' || ninja01MissionLevel != 'D') ) {
            ninja01MissionStatus = "FAILURE";
        }

        if (ninja02Age < 15 && (ninja02MissionLevel != 'C' || ninja02MissionLevel != 'D') ) {
            ninja02MissionStatus = "FAILURE";
        }

        if (ninja03Age < 15 && (ninja03MissionLevel != 'C' || ninja03MissionLevel != 'D') ) {
            ninja03MissionStatus = "FAILURE";
        }

        // Formatting output
        String defaultMessage = "O ninja %s de %d anos, cuja a missão era \"%s\", com diculdade \"%s\", %s.";
        String defaultMessageSuccess = "teve sua missão concluída";
        String defaultMessageFailure = "teve sua missão não concluída";

        String ninja01Output = String.format(
                defaultMessage,
                ninja01Name,
                ninja01Age,
                ninja01MissionName,
                ninja01MissionLevel,
                ninja01MissionStatus.equals("SUCCESS") ? defaultMessageSuccess : defaultMessageFailure
        );

        String ninja02Output = String.format(
                defaultMessage,
                ninja02Name,
                ninja02Age,
                ninja02MissionName,
                ninja02MissionLevel,
                ninja02MissionStatus.equals("SUCCESS") ? defaultMessageSuccess : defaultMessageFailure
        );

        String ninja03Output = String.format(
                defaultMessage,
                ninja03Name,
                ninja03Age,
                ninja03MissionName,
                ninja03MissionLevel,
                ninja03MissionStatus.equals("SUCCESS") ? defaultMessageSuccess : defaultMessageFailure
        );

        // Output
        System.out.println(ninja01Output);
        System.out.println(ninja02Output);
        System.out.println(ninja03Output);
    }
}
