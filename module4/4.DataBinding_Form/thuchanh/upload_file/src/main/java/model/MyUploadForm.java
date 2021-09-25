package model;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class MyUploadForm {
    private String description;
    //Upload File
    private CommonsMultipartFile[] fileDetail;

    public MyUploadForm() {
    }

    public MyUploadForm(String description, CommonsMultipartFile[] fileDetail) {
        this.description = description;
        this.fileDetail = fileDetail;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CommonsMultipartFile[] getFileDetail() {
        return fileDetail;
    }

    public void setFileDetail(CommonsMultipartFile[] fileDetail) {
        this.fileDetail = fileDetail;
    }
}
