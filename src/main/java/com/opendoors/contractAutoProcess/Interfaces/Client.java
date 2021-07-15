package com.opendoors.contractAutoProcess.Interfaces;

/**
 * Manage client info by both client & us
 */
interface Client {
    
   /**
    * Get client info using email as key
    * @param email
    * @return
    */
    Client retriveClientInfoUsingEmail(String email);
    /**
     * Update client info / Add new client
     * @param client
     * @return
     */
    boolean editClientInfo(Client client);
    /**
     * Delete client using email
     * @param email
     * @return
     */
    boolean deleteClient(String email);
    /**
     * Get client's email using name and birth
     * @param lastName
     * @param firstName
     * @param birth
     * @return
     */
    String getEmailUsingNameAndBirth(String lastName, String firstName, String birth);
    /**
     * Check whether client exists
     * @param lastName
     * @param firstName
     * @param birth
     * @return
     */
    boolean clientExist(String lastName, String firstName, String birth);
    /**
     * Get Client id by email
     * @param email
     * @return
     */
    int getIdByEmail(String email);
}
