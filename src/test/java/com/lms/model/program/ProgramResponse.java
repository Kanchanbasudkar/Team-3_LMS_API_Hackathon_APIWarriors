package com.lms.model.program;

import lombok.Data;

@Data
public class ProgramResponse {
    private float programId;
    private String programName;
    private String programDescription;
    private String programStatus;
    private String creationTime;
    private String lastModTime;
}
