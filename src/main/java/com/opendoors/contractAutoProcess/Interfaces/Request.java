package com.opendoors.contractAutoProcess.Interfaces;

/**
 * Manage client's request Info
 */
interface Request {
    /**
     * Create request record with client's email
     * @param email
     * @return
     */
    Request createRequest(String email);
    /**
     * Get request status by client's email and client's land name
     * @param email
     * @param landName
     * @return
     */
    String getRequestStatus(String email, String landName);
    /**
     * Update request status by client's email and client's land name
     * @param email
     * @param landName
     * @return
     */
    boolean editRequestStatus(String email, String landName);
    /**
     * Garbage collect requests bases on rules
     * @param request
     * @return
     */
    boolean gcRequest(String[] regexRules);
    

}
