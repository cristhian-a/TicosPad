/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senai.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author cristhian_anacleto
 */
public class ArquivoUtil {

    private ArquivoUtil() {
    }

    public static void salvar(String arquivo, String txt, boolean append) throws IOException {
        //Abre o arquivo
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File(arquivo), append));

        //Salva o arquivo
        writer.write(txt);

        //Fecha o arquivo
        writer.close();
    }

    public static String carregar(String arquivo) throws FileNotFoundException, IOException {
        String dados = "";
        
        //Abre o arquivo
        BufferedReader reader = new BufferedReader(new FileReader(new File(arquivo)));
        
        //Carrega os dados do arquivo
        String linha = "";
        
        while ((linha = reader.readLine()) != null) {
            dados += linha + "\n";
        }
        
        //Fecha o arquivo
        reader.close();
        
        return dados;
    }
}
