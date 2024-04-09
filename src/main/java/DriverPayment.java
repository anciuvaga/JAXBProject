import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import org.models.payment.Document;
import org.utils.FilePaths;
import org.utils.XmlParserExecutor;

import java.io.File;

public class DriverPayment {

    public static void main(String[] args) {

        try {

            Document doc = XmlParserExecutor.unmarshalling(Document.class, FilePaths.FILE_TO_UNMARSHALL);
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }


    }
}
