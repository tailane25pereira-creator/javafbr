import javax.swing.JOptionPane;

public class VerificadorIdade {
    public static void main(String[] args) {
        try {
            String input = JOptionPane.showInputDialog("Digite sua idade:");

            if (input != null) {
                int idade = Integer.parseInt(input);

                if (idade >= 18) {
                    JOptionPane.showMessageDialog(null, "Você é maior de idade.", "Resultado",
                            JOptionPane.INFORMATION_MESSAGE);
                } else if (idade >= 0) {
                    JOptionPane.showMessageDialog(null, "Você é menor de idade.", "Resultado",
                            JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Idade inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite um número válido!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
