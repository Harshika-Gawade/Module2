package Chapter3.q3.withUi;

public interface Operations {
    void insertData(String name,int id,String contact);
    void updateData(int id, String name);
    void deleteData(int id);
    void displayData();
    void searchData(int id);
}
