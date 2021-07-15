package com.opendoors.contractAutoProcess.Interfaces;
/**
 * Manage templates for contract
 */
interface Template {
    /**
     * Create template, if exist, return false, else create and return true
     * @param name
     * @return
     */
    boolean createTemplate(String name);
    /**
     * Edit template and replace the origin one
     * @param template
     * @return
     */
    boolean editTemplate(Template template);
    /**
     * Edit template and create a new one
     * @param template
     * @return
     */
    Template editTemplateAndSaveNew(Template template);
    /**
     * Delete a template by template name
     * @param name
     * @return
     */
    boolean deleteTemplate(String name);
}
