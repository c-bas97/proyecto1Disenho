/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.DTO;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author Luis
 */
public class XML implements IPersistencia{
    
    @Override
    public void escribir(DTO datos) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("Bitacora");
            
            doc.appendChild(rootElement);
            Element fecha = doc.createElement("Fecha_de_Creacion");
            rootElement.appendChild(fecha);
            Attr attr = doc.createAttribute("Datos");
            attr.setValue(new SimpleDateFormat("dd:MM:yyyy HH:mm:ss").format(Calendar.getInstance().getTime()));
            fecha.setAttributeNode(attr);
            Element frase = doc.createElement("Frase_Ingresada");
            frase.appendChild(doc.createTextNode(datos.getFrase()));
            fecha.appendChild(frase);
            
            for(int x = 0; x < datos.getTipoAlgoritmo().size(); x++){
                Element metodo = doc.createElement("Metodo");
                metodo.appendChild(doc.createTextNode(datos.getTipoAlgoritmo().get(x).toString()));
                Element forma  = doc.createElement("Resultado");
                forma.appendChild(doc.createTextNode(datos.getResultados().get(x)));
                fecha.appendChild(metodo);
                fecha.appendChild(forma);
            }
		// escribimos el contenido en un archivo .xml
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("archivo.xml"));
            transformer.transform(source, result);
            System.out.println("File saved!");
		} catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		} catch (TransformerException tfe) {
			tfe.printStackTrace();
		}
    }
    @Override
    public String toString(){
        return "XML";
    }
    
}
