package atividade3.execucaofinally;

public class ExecucaoFinally {
    public void leituraArquivo(String dado){
        System.out.println("Abrindo arquivo...");
        try{
            double valor = Double.parseDouble(dado);
            System.out.println("SUCESSO! Dado lido: " + valor);
        } catch (NumberFormatException e){
            System.out.println("Erro: o conteúdo lido não pôde ser convertido em número. " + e.getMessage());
        } finally {
            System.out.println("Arquivo fechado.");
        }
    }
}
