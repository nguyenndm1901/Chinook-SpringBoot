package com.java.chinook.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="InvoiceLine")
public class InvoiceLine {
    @Id
    int InvoiceLineId;
    int InvoiceId;
    int TrackId;
    double UnitPrice;
    int Quantity;

    public InvoiceLine() {
    }

    public InvoiceLine(int invoiceLineId, int invoiceId, int trackId, double unitPrice, int quantity) {
        InvoiceLineId = invoiceLineId;
        InvoiceId = invoiceId;
        TrackId = trackId;
        UnitPrice = unitPrice;
        Quantity = quantity;
    }

    public int getInvoiceLineId() {
        return InvoiceLineId;
    }

    public void setInvoiceLineId(int invoiceLineId) {
        InvoiceLineId = invoiceLineId;
    }

    public int getInvoiceId() {
        return InvoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        InvoiceId = invoiceId;
    }

    public int getTrackId() {
        return TrackId;
    }

    public void setTrackId(int trackId) {
        TrackId = trackId;
    }

    public double getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        UnitPrice = unitPrice;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }
}
