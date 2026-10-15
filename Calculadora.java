import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args) {
        try {
            double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero:"));
            double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero:"));

            String op = JOptionPane.showInputDialog(
                    "Escolha a operacao:\n1 - Soma (+)\n2 - Subtracao (-)\n3 - Mutiplicacao(*)\n4 - Divesao(/)");

            if (op == null)
                return;

            double res = 0;
            boolean ok = true;

            switch (op) {
                case "1":
                case "+":
                    res = n1 + n2;
                    break;
                case "2":
                case "-":
                    res = n1 - n2;
                    break;
                case "3":
                case "*":
                    res = n1 * n2;
                    break;
                case "4":
                case "/":
                    if (n2 != 0) {
                        res = n1 / n2;
                    } else {
                        JOptionPane.showMessageDialog(null, "Nao da pra dividir por zero!", "erro",
                                JOptionPane.ERROR_MESSAGE);
                        ok = false;
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcao invalida!", "Erro", JOptionPane.ERROR_MESSAGE);
                    ok = false;
            }
            if (ok) {
                JOptionPane.showMessageDialog(null, "Resultado: " + res, "Resultado", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas numeros!", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }
}