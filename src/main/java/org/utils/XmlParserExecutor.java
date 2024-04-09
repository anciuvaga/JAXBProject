package org.utils;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;

import static java.lang.Boolean.TRUE;

public class XmlParserExecutor {

    public static <T> T unmarshalling(Class<T> pojoClass, File fileToUnmarshall) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(pojoClass);
        return pojoClass.cast(context.createUnmarshaller()
                .unmarshal(fileToUnmarshall));
    }

    public static <T> void marshalling(T pojoClass, File fileToMarshall) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(pojoClass.getClass());
        Marshaller mar = context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, TRUE);
        mar.setProperty(Marshaller.JAXB_FRAGMENT, TRUE);
        mar.marshal(pojoClass, fileToMarshall);
    }
}
