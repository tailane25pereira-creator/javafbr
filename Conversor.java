import javax.swing.JOptionPane;

public class Conversor {
    public static void main(String[] args) {
        String[] opcoes = { "Celsius para Fahrenheit", "Fahrenheit para Celsius" };

        int escolha = JOptionPane.showOptionDialog(
                null,
                "Qual conversão você quer fazer?",
                "Conversor de Temperatura",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0]);

        try {
            if (escolha == 0) {
                double c = Double.parseDouble(JOptionPane.showInputDialog("Temperatura em °C:"));
                double f = (c * 9 / 5) + 32;
                JOptionPane.showMessageDialog(null, c + " °C = " + f + " °F", "Resultado",
                        JOptionPane.INFORMATION_MESSAGE);
            } else if (escolha == 1) {
                double f = Double.parseDouble(JOptionPane.showInputDialog("Temperatura em °F:"));
                double c = (f - 32) * 5 / 9;
                JOptionPane.showMessageDialog(null, f + " °F = " + c + " °C", "Resultado",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor de temperatura inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}