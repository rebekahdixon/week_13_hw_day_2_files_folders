package com.codelan.filesfolders.homeworkFilesFolders.models;

public enum ExtensionType {
    TXT("txt"),
    RB("rb"),
    JAVA("java"),
    PPT("ppt");

    private final String type;

    ExtensionType(String type) {
        this.type = type;
    }
}
