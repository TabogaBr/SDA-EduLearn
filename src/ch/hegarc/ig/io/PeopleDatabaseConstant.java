package ch.hegarc.ig.io;

public enum PeopleDatabaseConstant {

    NOM("people/nom"),
    PRENOM("people/prenom"),
    MATRICULE("people/matricule");

    private int columnIndex;
    private final String columnName;

    PeopleDatabaseConstant(String columnName) {
        this.columnIndex = -1;
        this.columnName = columnName;
    }

    public int getColumnIndex() {
        return columnIndex;
    }

    public void setColumnIndex(int columnIndex) {
        this.columnIndex = columnIndex;
    }

    public String getColumnName() {
        return columnName;
    }

}
