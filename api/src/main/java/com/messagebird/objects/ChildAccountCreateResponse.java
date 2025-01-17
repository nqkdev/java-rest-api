package com.messagebird.objects;

import java.util.List;

public class ChildAccountCreateResponse extends ChildAccountResponse{
    private List<AccessKey> accessKeys;
    private String signingKey;
    private String invoiceAggregation;

    public List<AccessKey> getAccessKeys() {
        return accessKeys;
    }

    public void setAccessKeys(List<AccessKey> accessKeys) {
        this.accessKeys = accessKeys;
    }

    public String getSigningKey() {
        return signingKey;
    }

    public void setSigningKey(String signingKey) {
        this.signingKey = signingKey;
    }

    public String getInvoiceAggregation() {
        return invoiceAggregation;
    }

    public void setInvoiceAggregation(String invoiceAggregation) {
        this.invoiceAggregation = invoiceAggregation;
    }

    @Override
    public String toString() {
        return "ChildAccountCreateResponse{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", accessKeys=" + accessKeys + '\'' +
                ", signingKey='" + signingKey + '\'' +
                ", invoiceAggregation='" + invoiceAggregation + '\'' +
                '}';
    }
}
