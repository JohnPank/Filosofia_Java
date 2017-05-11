package com.john_pank.chapter18.DOCParserXML;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

/**
 * Filosofia_Java
 * Created by John Pank on 10.05.17  12:44.
 */
class DeadKnight {
    private int id;
    private int level;
    DeadKnight(int id){
        this.id = id;
        level = new Random().nextInt(10);
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public int getLevel() {
        return level;
    }

    public void showInfo(){
        System.out.println("DeadKnight #" + id + " has level " + level);
    }

}

public class DOCParserXML {
    private void writeDocument(DeadKnight[] array) throws TransformerFactoryConfigurationError {
        try {
            //создание документа
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation impl = builder.getDOMImplementation(); // более сложный, но и более гибкий способ создания документов
            Document doc = impl.createDocument(null, // namespaceURI
                    null, // qualifiedName
                    null); // doctype

            Element root = doc.createElement("warriors");
            doc.appendChild(root);
            Element deadKnightNode = doc.createElement("deadKnights");
            root.appendChild(deadKnightNode);
            for (DeadKnight anArray : array) {
                Element knight = doc.createElement("knight");
                Element id = doc.createElement("id");
                id.setTextContent(String.valueOf(anArray.getId()));
                Element level = doc.createElement("level");
                level.setTextContent(String.valueOf(anArray.getLevel()));
                knight.appendChild(id);
                knight.appendChild(level);
                deadKnightNode.appendChild(knight);
            }

            //запись в файл
            Transformer tr = TransformerFactory.newInstance().newTransformer();
            DOMSource source = new DOMSource(doc);
            FileOutputStream fos = new FileOutputStream("other.xml");
            StreamResult result = new StreamResult(fos);
            tr.transform(source, result);

        } catch (TransformerException | IOException e) {
            e.printStackTrace(System.out);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }

    private DeadKnight[] parseXML(String docName) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance(); //создали фабрику строителей, сложный и грамосткий процесс (по реже выполняйте это действие)
        DocumentBuilder db = dbf.newDocumentBuilder(); // создали конкретного строителя документа
        Document doc = db.parse(new File(docName)); // стооитель построил документ

        DeadKnight[] dk = new DeadKnight[10];

        Node root = doc.getDocumentElement();
        System.out.println(root.getNodeName());


        Node warriors = root.getChildNodes().item(1);
        System.out.println(warriors.getNodeName());

        NodeList knights = warriors.getChildNodes();
        System.out.println(knights.getLength());
        int j = 0;
        for (int i = 1; i < knights.getLength()-1; i+=2) {

            Node temp = knights.item(i);
            //System.out.println(temp.getChildNodes().item(1).getTextContent());
            dk[j] = new DeadKnight(Integer.parseInt(temp.getChildNodes().item(1).getTextContent()));
            //System.out.println(temp.getChildNodes().item(3).getTextContent());
            dk[j].setLevel(Integer.parseInt(temp.getChildNodes().item(3).getTextContent()));
            //System.out.println();
            j++;

        }

        return dk;
    }

    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        DOCParserXML docParserXML = new DOCParserXML();
        DeadKnight[] army = new DeadKnight[10];

        for (int i = 0; i < 10; i++) {
            army[i] = new DeadKnight(i);
        }

        //docParserXML.writeDocument(army);

        army = docParserXML.parseXML("other.xml");
        System.out.println(army.length);

        for (int i = 0; i < 10; i++) {
            army[i].showInfo();
        }

    }

}
