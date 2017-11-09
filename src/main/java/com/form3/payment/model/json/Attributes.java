
package com.form3.payment.model.json;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Attributes {

    @SerializedName("amount")
    @Expose
    private String amount;
    @SerializedName("beneficiary_party")
    @Expose
    private BeneficiaryParty beneficiaryParty;
    @SerializedName("charges_information")
    @Expose
    private ChargesInformation chargesInformation;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("debtor_party")
    @Expose
    private DebtorParty debtorParty;
    @SerializedName("end_to_end_reference")
    @Expose
    private String endToEndReference;
    @SerializedName("fx")
    @Expose
    private Fx fx;
    @SerializedName("numeric_reference")
    @Expose
    private String numericReference;
    @SerializedName("payment_id")
    @Expose
    private String paymentId;
    @SerializedName("payment_purpose")
    @Expose
    private String paymentPurpose;
    @SerializedName("payment_scheme")
    @Expose
    private String paymentScheme;
    @SerializedName("payment_type")
    @Expose
    private String paymentType;
    @SerializedName("processing_date")
    @Expose
    private String processingDate;
    @SerializedName("reference")
    @Expose
    private String reference;
    @SerializedName("scheme_payment_sub_type")
    @Expose
    private String schemePaymentSubType;
    @SerializedName("scheme_payment_type")
    @Expose
    private String schemePaymentType;
    @SerializedName("sponsor_party")
    @Expose
    private SponsorParty sponsorParty;

    /**
     * 
     * @return
     *     The amount
     */
    public String getAmount() {
        return amount;
    }

    /**
     * 
     * @param amount
     *     The amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * 
     * @return
     *     The beneficiaryParty
     */
    public BeneficiaryParty getBeneficiaryParty() {
        return beneficiaryParty;
    }

    /**
     * 
     * @param beneficiaryParty
     *     The beneficiary_party
     */
    public void setBeneficiaryParty(BeneficiaryParty beneficiaryParty) {
        this.beneficiaryParty = beneficiaryParty;
    }

    /**
     * 
     * @return
     *     The chargesInformation
     */
    public ChargesInformation getChargesInformation() {
        return chargesInformation;
    }

    /**
     * 
     * @param chargesInformation
     *     The charges_information
     */
    public void setChargesInformation(ChargesInformation chargesInformation) {
        this.chargesInformation = chargesInformation;
    }

    /**
     * 
     * @return
     *     The currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * 
     * @param currency
     *     The currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * 
     * @return
     *     The debtorParty
     */
    public DebtorParty getDebtorParty() {
        return debtorParty;
    }

    /**
     * 
     * @param debtorParty
     *     The debtor_party
     */
    public void setDebtorParty(DebtorParty debtorParty) {
        this.debtorParty = debtorParty;
    }

    /**
     * 
     * @return
     *     The endToEndReference
     */
    public String getEndToEndReference() {
        return endToEndReference;
    }

    /**
     * 
     * @param endToEndReference
     *     The end_to_end_reference
     */
    public void setEndToEndReference(String endToEndReference) {
        this.endToEndReference = endToEndReference;
    }

    /**
     * 
     * @return
     *     The fx
     */
    public Fx getFx() {
        return fx;
    }

    /**
     * 
     * @param fx
     *     The fx
     */
    public void setFx(Fx fx) {
        this.fx = fx;
    }

    /**
     * 
     * @return
     *     The numericReference
     */
    public String getNumericReference() {
        return numericReference;
    }

    /**
     * 
     * @param numericReference
     *     The numeric_reference
     */
    public void setNumericReference(String numericReference) {
        this.numericReference = numericReference;
    }

    /**
     * 
     * @return
     *     The paymentId
     */
    public String getPaymentId() {
        return paymentId;
    }

    /**
     * 
     * @param paymentId
     *     The payment_id
     */
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    /**
     * 
     * @return
     *     The paymentPurpose
     */
    public String getPaymentPurpose() {
        return paymentPurpose;
    }

    /**
     * 
     * @param paymentPurpose
     *     The payment_purpose
     */
    public void setPaymentPurpose(String paymentPurpose) {
        this.paymentPurpose = paymentPurpose;
    }

    /**
     * 
     * @return
     *     The paymentScheme
     */
    public String getPaymentScheme() {
        return paymentScheme;
    }

    /**
     * 
     * @param paymentScheme
     *     The payment_scheme
     */
    public void setPaymentScheme(String paymentScheme) {
        this.paymentScheme = paymentScheme;
    }

    /**
     * 
     * @return
     *     The paymentType
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * 
     * @param paymentType
     *     The payment_type
     */
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * 
     * @return
     *     The processingDate
     */
    public String getProcessingDate() {
        return processingDate;
    }

    /**
     * 
     * @param processingDate
     *     The processing_date
     */
    public void setProcessingDate(String processingDate) {
        this.processingDate = processingDate;
    }

    /**
     * 
     * @return
     *     The reference
     */
    public String getReference() {
        return reference;
    }

    /**
     * 
     * @param reference
     *     The reference
     */
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * 
     * @return
     *     The schemePaymentSubType
     */
    public String getSchemePaymentSubType() {
        return schemePaymentSubType;
    }

    /**
     * 
     * @param schemePaymentSubType
     *     The scheme_payment_sub_type
     */
    public void setSchemePaymentSubType(String schemePaymentSubType) {
        this.schemePaymentSubType = schemePaymentSubType;
    }

    /**
     * 
     * @return
     *     The schemePaymentType
     */
    public String getSchemePaymentType() {
        return schemePaymentType;
    }

    /**
     * 
     * @param schemePaymentType
     *     The scheme_payment_type
     */
    public void setSchemePaymentType(String schemePaymentType) {
        this.schemePaymentType = schemePaymentType;
    }

    /**
     * 
     * @return
     *     The sponsorParty
     */
    public SponsorParty getSponsorParty() {
        return sponsorParty;
    }

    /**
     * 
     * @param sponsorParty
     *     The sponsor_party
     */
    public void setSponsorParty(SponsorParty sponsorParty) {
        this.sponsorParty = sponsorParty;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(amount).append(beneficiaryParty).append(chargesInformation).append(currency).append(debtorParty).append(endToEndReference).append(fx).append(numericReference).append(paymentId).append(paymentPurpose).append(paymentScheme).append(paymentType).append(processingDate).append(reference).append(schemePaymentSubType).append(schemePaymentType).append(sponsorParty).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Attributes) == false) {
            return false;
        }
        Attributes rhs = ((Attributes) other);
        return new EqualsBuilder().append(amount, rhs.amount).append(beneficiaryParty, rhs.beneficiaryParty).append(chargesInformation, rhs.chargesInformation).append(currency, rhs.currency).append(debtorParty, rhs.debtorParty).append(endToEndReference, rhs.endToEndReference).append(fx, rhs.fx).append(numericReference, rhs.numericReference).append(paymentId, rhs.paymentId).append(paymentPurpose, rhs.paymentPurpose).append(paymentScheme, rhs.paymentScheme).append(paymentType, rhs.paymentType).append(processingDate, rhs.processingDate).append(reference, rhs.reference).append(schemePaymentSubType, rhs.schemePaymentSubType).append(schemePaymentType, rhs.schemePaymentType).append(sponsorParty, rhs.sponsorParty).isEquals();
    }

}
