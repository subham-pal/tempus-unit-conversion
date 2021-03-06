package com.hashmapinc.tempus.model;

public enum UnitSystemClassCell {
    QUANTITY_CLASS(2),
    ENGLISH(5),
    METRIC(6),
    CANADIAN(7);

    private int cellNo;

    UnitSystemClassCell(int cellNo) {
        this.cellNo = cellNo;
    }

    public int getCellNo() {
        return cellNo;
    }
}
