
package com.form3.payment.model.json;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class SponsorParty {

    @SerializedName("account_number")
    @Expose
    private String accountNumber;
    @SerializedName("bank_id")
    @Expose
    private String bankId;
    @SerializedName("bank_id_code")
    @Expose
    private String bankIdCode;

    /**
     * 
     * @return
     *     The accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * 
     * @param accountNumber
     *     The account_number
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * 
     * @return
     *     The bankId
     */
    public String getBankId() {
        return bankId;
    }

    /**
     * 
     * @param bankId
     *     The bank_id
     */
    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    /**
     * 
     * @return
     *     The bankIdCode
     */
    public String getBankIdCode() {
        return bankIdCode;
    }

    /**
     * 
     * @param bankIdCode
     *     The bank_id_code
     */
    public void setBankIdCode(String bankIdCode) {
        this.bankIdCode = bankIdCode;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(accountNumber).append(bankId).append(bankIdCode).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SponsorParty) == false) {
            return false;
        }
        SponsorParty rhs = ((SponsorParty) other);
        return new EqualsBuilder().append(accountNumber, rhs.accountNumber).append(bankId, rhs.bankId).append(bankIdCode, rhs.bankIdCode).isEquals();
    }

}
