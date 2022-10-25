package com.project.xml;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    // Main xml serializer/deserializer
    public static void mainXml(Class _class) {
        File file = App.serializeXml(_class);
        Class c = App.deserializeXml(file);

        System.out.println(" - printing copied class data: ");
        System.out.println(c.getNumber() + "\n" + c.getSection() + "\n" + c.getClassroom() + "\n");
        for (Student student : c.getStudents()) {
            System.out.println(student.getName() + " - " + student.getSurname() + " - " + student.getDate() + "\n");
        }
    }
    // xml methods
    public static File serializeXml(Class _class) {
        System.out.println(" - serializing on file: generated.xml");
        try {
            XmlMapper xmlMapper = new XmlMapper();
            xmlMapper.writeValue(new File("generated.xml"), _class);
            File file = new File("generated.xml");
            return file;
        } catch (JsonProcessingException e) { e.printStackTrace(); } 
        catch (IOException e) { e.printStackTrace(); }
        return null;
    }
    public static Class deserializeXml(File _file) {
        System.out.println(" - deserializing from file: generated.xml");
        try {
            XmlMapper xmlMapper = new XmlMapper();
            Class c = xmlMapper.readValue(_file, Class.class);
            return c;
        } catch (IOException e) { e.printStackTrace(); }
        return null;
    }

    // Main json serializer/deserializer
    public static void mainJson(Class _class) {
        File file = App.serializeJson(_class);
        Class c = App.deserializeJson(file);

        System.out.println(" - printing copied class data: ");
        System.out.println(c.getNumber() + "\n" + c.getSection() + "\n" + c.getClassroom() + "\n");
        for (Student student : c.getStudents()) {
            System.out.println(student.getName() + " - " + student.getSurname() + " - " + student.getDate() + "\n");
        }
    }
    // json methods
    public static File serializeJson(Class _class) {
        System.out.println(" - serializing on file: generated.json");
        try {
            JsonMapper jsonMapper = new JsonMapper();
            jsonMapper.writeValue(new File("generated.json"), _class);
            File file = new File("generated.json");
            return file;
        } catch (JsonProcessingException e) { e.printStackTrace(); } 
        catch (IOException e) { e.printStackTrace(); }
        return null;
    }
    public static Class deserializeJson(File _file) {
        System.out.println(" - deserializing from file: generated.json");
        try {
            JsonMapper jsonMapper = new JsonMapper();
            Class c = jsonMapper.readValue(_file, Class.class);
            return c;
        } catch (IOException e) { e.printStackTrace(); }
        return null;
    }

    public static void main( String[] args )
    {   
        Student s1 = new Student("nome1", "cognome1", new Date(1000));
        Student s2 = new Student("nome2", "cognome2", new Date(2000));
        Student s3 = new Student("nome3", "cognome3", new Date(3000));
        Student s4 = new Student("nome4", "cognome4", new Date(4000));

        Class c1 = new Class(5, "B IA", "4-TC", Arrays.asList(s1, s2, s3, s4));

        mainXml(c1);
        mainJson(c1);
    }
}
