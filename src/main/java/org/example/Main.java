package org.example;

import com.sapher.youtubedl.YoutubeDL;
import com.sapher.youtubedl.YoutubeDLRequest;
import com.sapher.youtubedl.YoutubeDLResponse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //TROQUE O ... PELO CAMINHO ONDE ESTA O PROJETO
        String pathToExecutable = "C:/.../yt-dlp.exe";
        YoutubeDL.setExecutablePath(pathToExecutable);

        System.out.print("Digite a URL do vídeo: ");
        String videoUrl = scan.nextLine();
        //TROQUE O ... PELO CAMINHO DA PASTA ONDE VAI BAIXAR O VÍDEO
        String directory = "C:/...";

        YoutubeDLRequest request = new YoutubeDLRequest(videoUrl, directory);
        request.setOption("output", "%(title)s.%(ext)s");

        try {
            System.out.println("Iniciando download...");
            YoutubeDLResponse response = YoutubeDL.execute(request);
            System.out.println("Download concluído!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
