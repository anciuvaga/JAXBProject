import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import org.models.employee.Employee;
import org.utils.FilePaths;
import org.utils.XmlParserExecutor;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DriverEmployee {

    public static void main(String[] args) throws JAXBException, IOException {

        Employee newEmployee = new Employee(1, "Vimal", 6000);
        XmlParserExecutor.marshalling(newEmployee, FilePaths.FILE_TO_UNMARSHALL_EMPLOYEE);

        Employee employee = XmlParserExecutor.unmarshalling(Employee.class, FilePaths.FILE_TO_UNMARSHALL_EMPLOYEE);
        employee.setId(7);
        employee.setName("Andrei");
        employee.setSalary(50000);
        XmlParserExecutor.marshalling(employee, FilePaths.FILE_TO_UNMARSHALL_UPDATE_EMPLOYEE);

    }
}
