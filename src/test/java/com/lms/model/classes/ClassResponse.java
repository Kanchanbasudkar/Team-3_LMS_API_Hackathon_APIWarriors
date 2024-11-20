package com.lms.model.classes;

import lombok.Data;

@Data
    public class ClassResponse {
        private float csId;
        private float batchId;
        private float classNo;
        private String classDate;
        private String classTopic;
        private String classStatus = null;
        private String classStaffId;
        private String classDescription;
        private String classComments = null;
        private String classNotes = null;
        private String classRecordingPath = null;
        private String batchName;
        private String classScheduledDates = null;
    }





