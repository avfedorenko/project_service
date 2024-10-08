package faang.school.projectservice.exception;

public enum MessageError {
    USER_NOT_FOUND("User is not found!"),
    VALIDATION_EXCEPTION("Validation is not passed"),
    UNACCEPTABLE_EMPTY_INTERNS_LIST("The list of interns' ids is empty"),
    UNACCEPTABLE_DATE_INTERVAL("The internship should be no longer than 3 months"),
    UNACCEPTABLE_INTERNSHIP_STATUS("The internship should be completed first"),
    INTERNSHIP_NOT_FOUND_EXCEPTION("The internship is not found"),
    FILE_EXCEPTION("File not found"),
    FILE_STORAGE_CAPACITY_EXCEEDED("Storage capacity is exceeded"),
    TEAM_MEMBER_BY_USER_AND_PROJECT_IDS_NOT_FOUND_EXCEPTION("TeamMember with user id %d and project id %d not found"),
    TEAM_MEMBER_NOT_FOUND("TeamMember not found");


    String message;

    MessageError(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

