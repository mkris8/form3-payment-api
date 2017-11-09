
package com.form3.payment.model.json;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class DebtorParty {

    @SerializedName("account_name")
    @Expose
    private String accountName;
    @SerializedName("account_number")
    @Expose
    private String accountNumber;
    @SerializedName("account_number_code")
    @Expose
    private String accountNumberCode;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("bank_id")
    @Expose
    private String bankId;
    @SerializedName("bank_id_code")
    @Expose
    private String bankIdCode;
    @SerializedName("name")
    @Expose
    private String name;

    /**
     * 
     * @return
     *     The accountName
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * 
     * @param accountName
     *     The account_name
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

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
     *     The accountNumberCode
     */
    public String getAccountNumberCode() {
        return accountNumberCode;
    }

    /**
     * 
     * @param accountNumberCode
     *     The account_number_code
     */
    public void setAccountNumberCode(String accountNumberCode) {
        this.accountNumberCode = accountNumberCode;
    }

    /**
     * 
     * @return
     *     The address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 
     * @param address
     *     The address
     */
    public void setAddress(String address) {
        this.address = address;
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

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(accountName).append(accountNumber).append(accountNumberCode).append(address).append(bankId).append(bankIdCode).append(name).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DebtorParty) == false) {
            return false;
        }
        DebtorParty rhs = ((DebtorParty) other);
        return new EqualsBuilder().append(accountName, rhs.accountName).append(accountNumber, rhs.accountNumber).append(accountNumberCode, rhs.accountNumberCode).append(address, rhs.address).append(bankId, rhs.bankId).append(bankIdCode, rhs.bankIdCode).append(name, rhs.name).isEquals();
    }

}
