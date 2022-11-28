package com.java.chinook.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="Invoice")
public class Invoice {
    @Id
    int InvoiceId;
    int CustomerId;
    Date InvoiceDate;
    String BillingAddress;
    String BillingCity;
    String BillingState;
    String BillingCountry;
    String BillingPostalCode;
    double Total;

    public Invoice() {
    }

    public Invoice(int invoiceId, int customerId, Date invoiceDate, String billingAddress, String billingCity, String billingState, String billingCountry, String billingPostalCode, double total) {
        InvoiceId = invoiceId;
        CustomerId = customerId;
        InvoiceDate = invoiceDate;
        BillingAddress = billingAddress;
        BillingCity = billingCity;
        BillingState = billingState;
        BillingCountry = billingCountry;
        BillingPostalCode = billingPostalCode;
        Total = total;
    }

    public int getInvoiceId() {
        return InvoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        InvoiceId = invoiceId;
    }

    public int getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(int customerId) {
        CustomerId = customerId;
    }

    public Date getInvoiceDate() {
        return InvoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        InvoiceDate = invoiceDate;
    }

    public String getBillingAddress() {
        return BillingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        BillingAddress = billingAddress;
    }

    public String getBillingCity() {
        return BillingCity;
    }

    public void setBillingCity(String billingCity) {
        BillingCity = billingCity;
    }

    public String getBillingState() {
        return BillingState;
    }

    public void setBillingState(String billingState) {
        BillingState = billingState;
    }

    public String getBillingCountry() {
        return BillingCountry;
    }

    public void setBillingCountry(String billingCountry) {
        BillingCountry = billingCountry;
    }

    public String getBillingPostalCode() {
        return BillingPostalCode;
    }

    public void setBillingPostalCode(String billingPostalCode) {
        BillingPostalCode = billingPostalCode;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double total) {
        Total = total;
    }
}
