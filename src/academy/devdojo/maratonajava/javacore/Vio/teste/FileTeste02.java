package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.Vio.teste;

import java.io.File;
import java.io.IOException;

public class FileTeste02 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("pasta");
        boolean isDiretorioCreated = fileDiretorio.mkdir();
        System.out.println("Pasta Criada? "+ isDiretorioCreated);
        File fileArquivoDiretorio = new File(fileDiretorio,"arquivo.txt");
        boolean isFileCreated = fileArquivoDiretorio.createNewFile();
        System.out.println("arquivo.txt criado? "+ isFileCreated);

        File fileRenamed = new File(fileDiretorio,"arquivo_renomeado.txt");
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println("arquivo.txt renomeado? "+isRenamed);

        File diretorioRenamed = new File("pasta");
        boolean isDiretorioRenomeado = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println("Diretorio pasta renomeado? "+isDiretorioRenomeado);
    }

}
