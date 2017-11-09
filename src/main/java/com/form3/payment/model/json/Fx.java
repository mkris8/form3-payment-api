
package com.form3.payment.model.json;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Fx {

    @SerializedName("contract_reference")
    @Expose
    private String contractReference;
    @SerializedName("exchange_rate")
    @Expose
    private String exchangeRate;
    @SerializedName("original_amount")
    @Expose
    private String originalAmount;
    @SerializedName("original_currency")
    @Expose
    private String originalCurrency;

    /**
     * 
     * @return
     *     The contractReference
     */
    public String getContractReference() {
        return contractReference;
    }

    /**
     * 
     * @param contractReference
     *     The contract_reference
     */
    public void setContractReference(String contractReference) {
        this.contractReference = contractReference;
    }

    /**
     * 
     * @return
     *     The exchangeRate
     */
    public String getExchangeRate() {
        return exchangeRate;
    }

    /**
     * 
     * @param exchangeRate
     *     The exchange_rate
     */
    public void setExchangeRate(String exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    /**
     * 
     * @return
     *     The originalAmount
     */
    public String getOriginalAmount() {
        return originalAmount;
    }

    /**
     * 
     * @param originalAmount
     *     The original_amount
     */
    public void setOriginalAmount(String originalAmount) {
        this.originalAmount = originalAmount;
    }

    /**
     * 
     * @return
     *     The originalCurrency
     */
    public String getOriginalCurrency() {
        return originalCurrency;
    }

    /**
     * 
     * @param originalCurrency
     *     The original_currency
     */
    public void setOriginalCurrency(String originalCurrency) {
        this.originalCurrency = originalCurrency;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(contractReference).append(exchangeRate).append(originalAmount).append(originalCurrency).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Fx) == false) {
            return false;
        }
        Fx rhs = ((Fx) other);
        return new EqualsBuilder().append(contractReference, rhs.contractReference).append(exchangeRate, rhs.exchangeRate).append(originalAmount, rhs.originalAmount).append(originalCurrency, rhs.originalCurrency).isEquals();
    }

}
