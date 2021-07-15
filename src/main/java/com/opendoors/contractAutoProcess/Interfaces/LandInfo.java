package com.opendoors.contractAutoProcess.Interfaces;

/**
 * Manage landInfo by both client and us
 */
interface LandInfo {
    /**
     * Get Land Info by client email and land name
     * @param email
     * @param name
     * @return
     */
    LandInfo retriveLandInfoUsingEmailAndLandName(String email, String name);
    /**
     * Create/update land
     * @param landInfo
     * @return
     */
    boolean editLandInfo(LandInfo landInfo);
    /**
     * Get all the land info owned by target client using client's email
     * @param email
     * @return
     */
    LandInfo[] retriveLandInfosOwnedByTheClient(String email);
    /**
     * Delete the client's land by client's email and land's name
     * @param email
     * @param name
     * @return
     */
    boolean deleteLandInfo(String email, String name);
}
