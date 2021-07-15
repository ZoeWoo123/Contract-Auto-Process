package com.opendoors.contractAutoProcess.Interfaces;

/**
 * Manage contract by us
 */
interface Contract {
    /**
     * Get contract using related client email
     * @param id
     * @return
     */
    Contract retriveContractByClientEmail(String email);
    /**
     * Create new contract using client's email
     * @param email
     * @return
     */
    boolean createContract(String email);
    /**
     * Edit contract
     * @param contract
     * @return
     */
    boolean editContract(Contract contract);
    /**
     * Use client email to get client info and create signed contract
     * @param email
     * @return
     */
    Contract signContract(String url, String email);
    /**
     * Delete contract which has the url
     * @param email
     * @return
     */
    boolean deleteContract(String url);


}
