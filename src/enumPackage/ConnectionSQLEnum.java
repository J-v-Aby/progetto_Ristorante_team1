package enumPackage;

public enum ConnectionSQLEnum {
    ACCESS_STRING("jdbc:mysql://localhost:3306/ristorante_team_1?user=progettoAdmin&password=root");
    private String value;

    ConnectionSQLEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
