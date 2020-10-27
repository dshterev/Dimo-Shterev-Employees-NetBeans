/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author dimosht
 */
public class ResultEmployeeDGO {

    private String fileName;
    private Long firstEmpId;
    private Long secondEmpId;
    private Long projectId;
    private Integer daysTogether;

    public ResultEmployeeDGO() {
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Long getFirstEmpId() {
        return firstEmpId;
    }

    public void setFirstEmpId(Long firstEmpId) {
        this.firstEmpId = firstEmpId;
    }
    
    public Long getSecondEmpId() {
        return secondEmpId;
    }

    public void setSecondEmpId(Long secondEmpId) {
        this.secondEmpId = secondEmpId;
    }
    
    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }
    
    public Integer getDaysTogether() {
        return daysTogether;
    }

    public void setDaysTogether(Integer daysTogether) {
        this.daysTogether = daysTogether;
    }

}
