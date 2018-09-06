package ai.elimu.launcher_custom.model;

import java.util.List;

import ai.elimu.model.gson.admin.ApplicationGson;

public class AppGroup {

    private List<ApplicationGson> applications;

    private String groupTitle;

    public List<ApplicationGson> getApplications() {
        return applications;
    }

    public String getGroupTitle() { return groupTitle; }

    public void setGroupTitle(String title) { groupTitle = title; }

    public void setApplications(List<ApplicationGson> applications) {
        this.applications = applications;
    }
}
