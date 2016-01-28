package madhu.lospoc;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class CustomerDetails implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "CUSTOMERDETAILS_ID_GENERATOR")
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(name = "CUSTOMERDETAILS_ID_GENERATOR", sequenceName = "CUSTOMERDETAILS_ID_SEQ")
   private java.lang.Long id;

   private java.lang.String customerName;

   private java.lang.String customerNumber;

   private java.lang.Integer customerAge;

   private java.lang.String customerGender;

   private java.lang.String customerMobileNumber;

   private java.lang.Double customerMonthlySalary;

   private java.lang.String customerMotherMaidenName;

   private java.lang.String customerNationality;

   private java.lang.String customerPassportNumber;

   private java.lang.Double ageCreditScore;

   private java.lang.Double incomeCreditScore;

   private java.lang.Double totalCreditScore;

   private java.lang.Long processInstanceID;

   private java.lang.Boolean fraudType;

   private java.lang.String customerFatherName;

   private java.util.Date customerDOB;

   private java.lang.String customerEmail;

   private java.lang.String customerNationalID;

   private java.lang.String customerHomeAddress;

   private java.lang.String customerTelephoneNo;

   private java.lang.String customerHomeState;

   private java.lang.String customerHomeCountry;

   private java.lang.String customerHomeZipcode;

   private java.lang.String processFee;

   private java.lang.String feeJurnolNo;

   private java.lang.Double processFeeAmount;

   public CustomerDetails()
   {
   }

   public java.lang.Long getId()
   {
      return this.id;
   }

   public void setId(java.lang.Long id)
   {
      this.id = id;
   }

   public java.lang.String getCustomerName()
   {
      return this.customerName;
   }

   public void setCustomerName(java.lang.String customerName)
   {
      this.customerName = customerName;
   }

   public java.lang.String getCustomerNumber()
   {
      return this.customerNumber;
   }

   public void setCustomerNumber(java.lang.String customerNumber)
   {
      this.customerNumber = customerNumber;
   }

   public java.lang.Integer getCustomerAge()
   {
      return this.customerAge;
   }

   public void setCustomerAge(java.lang.Integer customerAge)
   {
      this.customerAge = customerAge;
   }

   public java.lang.String getCustomerGender()
   {
      return this.customerGender;
   }

   public void setCustomerGender(java.lang.String customerGender)
   {
      this.customerGender = customerGender;
   }

   public java.lang.String getCustomerMobileNumber()
   {
      return this.customerMobileNumber;
   }

   public void setCustomerMobileNumber(java.lang.String customerMobileNumber)
   {
      this.customerMobileNumber = customerMobileNumber;
   }

   public java.lang.Double getCustomerMonthlySalary()
   {
      return this.customerMonthlySalary;
   }

   public void setCustomerMonthlySalary(java.lang.Double customerMonthlySalary)
   {
      this.customerMonthlySalary = customerMonthlySalary;
   }

   public java.lang.String getCustomerMotherMaidenName()
   {
      return this.customerMotherMaidenName;
   }

   public void setCustomerMotherMaidenName(
         java.lang.String customerMotherMaidenName)
   {
      this.customerMotherMaidenName = customerMotherMaidenName;
   }

   public java.lang.String getCustomerNationality()
   {
      return this.customerNationality;
   }

   public void setCustomerNationality(java.lang.String customerNationality)
   {
      this.customerNationality = customerNationality;
   }

   public java.lang.String getCustomerPassportNumber()
   {
      return this.customerPassportNumber;
   }

   public void setCustomerPassportNumber(java.lang.String customerPassportNumber)
   {
      this.customerPassportNumber = customerPassportNumber;
   }

   public java.lang.Double getAgeCreditScore()
   {
      return this.ageCreditScore;
   }

   public void setAgeCreditScore(java.lang.Double ageCreditScore)
   {
      this.ageCreditScore = ageCreditScore;
   }

   public java.lang.Double getIncomeCreditScore()
   {
      return this.incomeCreditScore;
   }

   public void setIncomeCreditScore(java.lang.Double incomeCreditScore)
   {
      this.incomeCreditScore = incomeCreditScore;
   }

   public java.lang.Double getTotalCreditScore()
   {
      return this.totalCreditScore;
   }

   public void setTotalCreditScore(java.lang.Double totalCreditScore)
   {
      this.totalCreditScore = totalCreditScore;
   }

   public java.lang.Long getProcessInstanceID()
   {
      return this.processInstanceID;
   }

   public void setProcessInstanceID(java.lang.Long processInstanceID)
   {
      this.processInstanceID = processInstanceID;
   }

   public java.lang.Boolean getFraudType()
   {
      return this.fraudType;
   }

   public void setFraudType(java.lang.Boolean fraudType)
   {
      this.fraudType = fraudType;
   }

   public java.lang.String getCustomerFatherName()
   {
      return this.customerFatherName;
   }

   public void setCustomerFatherName(java.lang.String customerFatherName)
   {
      this.customerFatherName = customerFatherName;
   }

   public java.util.Date getCustomerDOB()
   {
      return this.customerDOB;
   }

   public void setCustomerDOB(java.util.Date customerDOB)
   {
      this.customerDOB = customerDOB;
   }

   public java.lang.String getCustomerEmail()
   {
      return this.customerEmail;
   }

   public void setCustomerEmail(java.lang.String customerEmail)
   {
      this.customerEmail = customerEmail;
   }

   public java.lang.String getCustomerNationalID()
   {
      return this.customerNationalID;
   }

   public void setCustomerNationalID(java.lang.String customerNationalID)
   {
      this.customerNationalID = customerNationalID;
   }

   public java.lang.String getCustomerHomeAddress()
   {
      return this.customerHomeAddress;
   }

   public void setCustomerHomeAddress(java.lang.String customerHomeAddress)
   {
      this.customerHomeAddress = customerHomeAddress;
   }

   public java.lang.String getCustomerTelephoneNo()
   {
      return this.customerTelephoneNo;
   }

   public void setCustomerTelephoneNo(java.lang.String customerTelephoneNo)
   {
      this.customerTelephoneNo = customerTelephoneNo;
   }

   public java.lang.String getCustomerHomeState()
   {
      return this.customerHomeState;
   }

   public void setCustomerHomeState(java.lang.String customerHomeState)
   {
      this.customerHomeState = customerHomeState;
   }

   public java.lang.String getCustomerHomeCountry()
   {
      return this.customerHomeCountry;
   }

   public void setCustomerHomeCountry(java.lang.String customerHomeCountry)
   {
      this.customerHomeCountry = customerHomeCountry;
   }

   public java.lang.String getCustomerHomeZipcode()
   {
      return this.customerHomeZipcode;
   }

   public void setCustomerHomeZipcode(java.lang.String customerHomeZipcode)
   {
      this.customerHomeZipcode = customerHomeZipcode;
   }

   public java.lang.String getProcessFee()
   {
      return this.processFee;
   }

   public void setProcessFee(java.lang.String processFee)
   {
      this.processFee = processFee;
   }

   public java.lang.String getFeeJurnolNo()
   {
      return this.feeJurnolNo;
   }

   public void setFeeJurnolNo(java.lang.String feeJurnolNo)
   {
      this.feeJurnolNo = feeJurnolNo;
   }

   public java.lang.Double getProcessFeeAmount()
   {
      return this.processFeeAmount;
   }

   public void setProcessFeeAmount(java.lang.Double processFeeAmount)
   {
      this.processFeeAmount = processFeeAmount;
   }

   public CustomerDetails(java.lang.Long id, java.lang.String customerName,
         java.lang.String customerNumber, java.lang.Integer customerAge,
         java.lang.String customerGender, java.lang.String customerMobileNumber,
         java.lang.Double customerMonthlySalary,
         java.lang.String customerMotherMaidenName,
         java.lang.String customerNationality,
         java.lang.String customerPassportNumber,
         java.lang.Double ageCreditScore, java.lang.Double incomeCreditScore,
         java.lang.Double totalCreditScore, java.lang.Long processInstanceID,
         java.lang.Boolean fraudType, java.lang.String customerFatherName,
         java.util.Date customerDOB, java.lang.String customerEmail,
         java.lang.String customerNationalID,
         java.lang.String customerHomeAddress,
         java.lang.String customerTelephoneNo,
         java.lang.String customerHomeState,
         java.lang.String customerHomeCountry,
         java.lang.String customerHomeZipcode, java.lang.String processFee,
         java.lang.String feeJurnolNo, java.lang.Double processFeeAmount)
   {
      this.id = id;
      this.customerName = customerName;
      this.customerNumber = customerNumber;
      this.customerAge = customerAge;
      this.customerGender = customerGender;
      this.customerMobileNumber = customerMobileNumber;
      this.customerMonthlySalary = customerMonthlySalary;
      this.customerMotherMaidenName = customerMotherMaidenName;
      this.customerNationality = customerNationality;
      this.customerPassportNumber = customerPassportNumber;
      this.ageCreditScore = ageCreditScore;
      this.incomeCreditScore = incomeCreditScore;
      this.totalCreditScore = totalCreditScore;
      this.processInstanceID = processInstanceID;
      this.fraudType = fraudType;
      this.customerFatherName = customerFatherName;
      this.customerDOB = customerDOB;
      this.customerEmail = customerEmail;
      this.customerNationalID = customerNationalID;
      this.customerHomeAddress = customerHomeAddress;
      this.customerTelephoneNo = customerTelephoneNo;
      this.customerHomeState = customerHomeState;
      this.customerHomeCountry = customerHomeCountry;
      this.customerHomeZipcode = customerHomeZipcode;
      this.processFee = processFee;
      this.feeJurnolNo = feeJurnolNo;
      this.processFeeAmount = processFeeAmount;
   }

}