package addressbook;

import java.util.List;

public interface IFileOperations<E> {

    public boolean getFileStatus(String fileName) throws AddressBookException;
    public List<Person> loadDataFromFile(String fileName) throws AddressBookException;
    public <E> void writeInFile(List<E> data, String fileName) throws AddressBookException;

}
