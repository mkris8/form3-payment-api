
package com.form3.payment.model.json;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class ChargesInformation {

    @SerializedName("bearer_code")
    @Expose
    private String bearerCode;
    @SerializedName("sender_charges")
    @Expose
    private List<SenderCharge> senderCharges = new ArrayList<SenderCharge>();
    @SerializedName("receiver_charges_amount")
    @Expose
    private String receiverChargesAmount;
    @SerializedName("receiver_charges_currency")
    @Expose
    private String receiverChargesCurrency;

    /**
     * 
     * @return
     *     The bearerCode
     */
    public String getBearerCode() {
        return bearerCode;
    }

    /**
     * 
     * @param bearerCode
     *     The bearer_code
     */
    public void setBearerCode(String bearerCode) {
        this.bearerCode = bearerCode;
    }

    /**
     * 
     * @return
     *     The senderCharges
     */
    public List<SenderCharge> getSenderCharges() {
        return senderCharges;
    }

    /**
     * 
     * @param senderCharges
     *     The sender_charges
     */
    public void setSenderCharges(List<SenderCharge> senderCharges) {
        this.senderCharges = senderCharges;
    }

    /**
     * 
     * @return
     *     The receiverChargesAmount
     */
    public String getReceiverChargesAmount() {
        return receiverChargesAmount;
    }

    /**
     * 
     * @param receiverChargesAmount
     *     The receiver_charges_amount
     */
    public void setReceiverChargesAmount(String receiverChargesAmount) {
        this.receiverChargesAmount = receiverChargesAmount;
    }

    /**
     * 
     * @return
     *     The receiverChargesCurrency
     */
    public String getReceiverChargesCurrency() {
        return receiverChargesCurrency;
    }

    /**
     * 
     * @param receiverChargesCurrency
     *     The receiver_charges_currency
     */
    public void setReceiverChargesCurrency(String receiverChargesCurrency) {
        this.receiverChargesCurrency = receiverChargesCurrency;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(bearerCode).append(senderCharges).append(receiverChargesAmount).append(receiverChargesCurrency).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChargesInformation) == false) {
            return false;
        }
        ChargesInformation rhs = ((ChargesInformation) other);
        return new EqualsBuilder().append(bearerCode, rhs.bearerCode).append(senderCharges, rhs.senderCharges).append(receiverChargesAmount, rhs.receiverChargesAmount).append(receiverChargesCurrency, rhs.receiverChargesCurrency).isEquals();
    }

}
