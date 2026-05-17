/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistentobjectdao;

/**
 *
 * @author HP
 */
public class MainDAO {
    public static void main(String args[]) {
//        Person person = new Person("Indra");
        Person person2 = new Person("Susi");

        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());

        try {
//            m.getPersonDAO().savePerson(person);
            m.getPersonDAO().savePerson(person2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
