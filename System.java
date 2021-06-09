/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shereen Hesham
 */
public class System {
     private String name;
    private int id;
    private int password ;
    private String email ;
    private int phone ;
    private String defaultLocation ;
    
    /**
     *
     */
    public System(){  }
    
    /**
     *
     * @param name
     * @param id
     * @param password
     * @param email
     * @param phone
     * @param defaultLocation
     */
    public System(String name, int id, int password, String email, int phone, String defaultLocation){  
        name = name;
        id = id ;
        password = password ;
        email = email ;
        phone = phone ; 
        defaultLocation = defaultLocation ;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        name = name;
    }

    /**
     *
     * @return
     */
    public int getID() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setID(int id) {
      id = id;
    }

    /**
     *
     * @return
     */
    public int getPassword() {
        return password;
    }

    /**
     *
     * @param password
     */
    public void setPassword(int password) {
       password = password;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        email = email;
    }

    /**
     *
     * @return
     */
    public int getPhone() {
        return phone;
    }

    /**
     *
     * @param phone
     */
    public void setPhone(int phone) {
        phone = phone;
    }

    /**
     *
     * @return
     */
    public String getDefaultLocation() {
        return defaultLocation;
    }

    /**
     *
     * @param defaultLocation
     */
    public void setDefaultLocation(String defaultLocation) {
       defaultLocation = defaultLocation;
    }
}
