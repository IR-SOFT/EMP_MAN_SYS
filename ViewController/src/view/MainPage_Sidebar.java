package view;

import java.io.Serializable;

import javax.faces.event.ActionEvent;

import oracle.adf.controller.TaskFlowId;

public class MainPage_Sidebar implements Serializable {
    private String taskFlowId = "/WEB-INF/TaskFlows/MainPage_Taskflow.xml#MainPage_Taskflow";

    public MainPage_Sidebar() {
    }

    public TaskFlowId getDynamicTaskFlowId() {
        return TaskFlowId.parse(taskFlowId);
    }

    public void setDynamicTaskFlowId(String taskFlowId) {
        this.taskFlowId = taskFlowId;
    }

    public void User_Click(ActionEvent actionEvent) {
        // Add event code here...
        setDynamicTaskFlowId("/WEB-INF/TaskFlows/Setup/User_Taskflow.xml#User_Taskflow");
    }

    public void Department_Click(ActionEvent actionEvent) {
        // Add event code here...
        setDynamicTaskFlowId("/WEB-INF/TaskFlows/Setup/Department_Taskflow.xml#Department_Taskflow");
    }

    public void ChartOfAccount_Click(ActionEvent actionEvent) {
        // Add event code here...
        setDynamicTaskFlowId("/WEB-INF/TaskFlows/Setup/ChartOfAccount_Taskflow.xml#ChartOfAccount_Taskflow");
    }

    public void WorkStatus_Click(ActionEvent actionEvent) {
        // Add event code here...
        setDynamicTaskFlowId("/WEB-INF/TaskFlows/Setup/WorkStatus_Taskflow.xml#WorkStatus_Taskflow");
    }

    public void DispatchDetail_Click(ActionEvent actionEvent) {
        // Add event code here...
        setDynamicTaskFlowId("/WEB-INF/TaskFlows/Setup/Dispatch_Detail_Taskflow.xml#Dispatch_Detail_Taskflow");
    }
}
