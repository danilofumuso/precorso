import java.util.Random;

public class ContoBancario {
    public String numeroConto;
    public int saldo;

    public ContoBancario() {
        this.numeroConto = generaNumeroConto();
        this.saldo = 0;
    }

    private String generaNumeroConto() {
        String caratteri = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuilder numero = new StringBuilder();

        for (int i = 0; i < 27; i++) {
            int charIndex = random.nextInt(caratteri.length());
            numero.append(caratteri.charAt(charIndex));
        }
        return numero.toString();
    }

    public void saldoAttuale(){
        System.out.println("Il tuo Saldo corrente è: " + saldo + "€");
    }

    public void deposita(int importo) {
        if (importo > 0) saldo += importo;
        System.out.println("Depositati: " + importo + "€. Saldo corrente: " + saldo + "€");

    }

    public void preleva(int importo){
        if(importo > 0 && importo<= saldo){
            saldo-=importo;
            System.out.println("Prelevati " + importo + "€. Saldo corrente: " + saldo + "€");
        }else {
            System.out.println("Saldo insufficiente!");
        }
    }


}
