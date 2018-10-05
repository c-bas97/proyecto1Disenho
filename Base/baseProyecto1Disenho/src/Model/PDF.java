/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.DTO;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Luis
 */
public class PDF implements IPersistencia {
    
    @Override
    public void escribir(DTO datos) {
        try{
            String nombreArch = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss").format(Calendar.getInstance().getTime()) + ".pdf";
            FileOutputStream archi = new FileOutputStream(nombreArch);
            String timeLog = new SimpleDateFormat("dd:MM:yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
            Document doc = new Document();
            PdfWriter.getInstance(doc, archi);
            doc.open();
            doc.add(new Paragraph("Esta es la Bitacora del documento creado el: " + timeLog));
            doc.add(new Paragraph("\n"));
            doc.add(new Paragraph("Frase Original: " + datos.getFrase()));
            doc.add(new Paragraph("\n"));
            for(int x = 0; x < datos.getTipoAlgoritmo().size(); x++){
                doc.add(new Paragraph("Metodo: " + datos.getTipoAlgoritmo().get(x).toString()));
                doc.add(new Paragraph("\n"));
                doc.add(new Paragraph("Resultado: " + datos.getTipoSalida().get(x)));
                doc.add(new Paragraph("\n"));
            }
            doc.close();
        }
        catch(Exception e){
            System.out.println("Se encontro un error");
        }
    }
    
    @Override
    public String toString(){
        return "PDF";
    }
    
}
