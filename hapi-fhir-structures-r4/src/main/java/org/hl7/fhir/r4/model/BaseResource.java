package org.hl7.fhir.r4.model;

import org.hl7.fhir.instance.model.api.IAnyResource;
import org.hl7.fhir.instance.model.api.IIdType;

import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.model.api.IElement;
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.Description;

public abstract class BaseResource extends Base implements IAnyResource, IElement {

	private static final long serialVersionUID = 1L;

	/**
     * @param value The logical id of the resource, as used in the url for the resoure. Once assigned, this value never changes.
     */
    public BaseResource setId(IIdType value) {
        if (value == null) {
                setIdElement((IdType)null);
        } else if (value instanceof IdType) {
                setIdElement((IdType) value);
        } else {
                setIdElement(new IdType(value.getValue()));
        }
        return this;
    }

	public abstract BaseResource setIdElement(IdType theIdType);

	@Override
	public FhirVersionEnum getStructureFhirVersionEnum() {
		return FhirVersionEnum.R4;
	}

  @Override
  public boolean isResource() {
    return true;
  }

  /**
   * unit id
   */
  @Child(name = "unitId", type = {StringType.class},  min=0, max=1, modifier=false, summary=true)
  @Description(shortDefinition="unit id ", formalDefinition="unit id " )
  protected StringType unitId;


  /**
   * Unit Code
   */
  @Child(name = "unitCode", type = {StringType.class},  min=0, max=1, modifier=false, summary=true)
  @Description(shortDefinition="Unit Code ", formalDefinition="Unit Code " )
  protected StringType unitCode;

  /**
   * organisation id
   */
  @Child(name = "orgId", type = {StringType.class}, min=0, max=1, modifier=false, summary=true)
  @Description(shortDefinition="organisation id ",
    formalDefinition="organisation id " )
  protected StringType orgId;
  
  @Child(name = "orgCode", type = {StringType.class}, min=0, max=1, modifier=false, summary=true)
  @Description(shortDefinition="organisation code ",
    formalDefinition="organisation code " )
  protected StringType orgCode;


  /**
   * for audit purpose this relates to created date and time
   */
  @Child(name = "createdDate", type = {DecimalType.class}, min=0, max=1, modifier=false, summary=true)
  @Description(shortDefinition="for audit purpose this relates to created  date and time",
    formalDefinition="for audit purpose this relates to created date and time" )
  protected DecimalType createdDate;

  /**
   * for audit purpose this relates to updated  date and time.
   */
  @Child(name = "updatedDate", type = {DecimalType.class},  min=0, max=1, modifier=false, summary=true)
  @Description(shortDefinition="for audit purpose this relates to updated  date and time",
    formalDefinition="for audit purpose this relates to updated  date and time" )
  protected DecimalType updatedDate;

  /**
   * for audit purpose this relates to who created this record
   */
  @Child(name = "createdBy", type = {DateType.class},  min=0, max=1, modifier=false, summary=true)
  @Description(shortDefinition="for audit purpose this relates to who created this record",
    formalDefinition="for audit purpose this relates to who created this record" )
  protected StringType createdBy;

  /**
   * for audit purpose this relates to who updated this record.
   */
  @Child(name = "updatedBy", type = {StringType.class},  min=0, max=1, modifier=false, summary=true)
  @Description(shortDefinition="for audit purpose this relates to who updated this record",
    formalDefinition="for audit purpose this relates to who updated this record" )
  protected StringType updatedBy;

  public StringType getUnitId() {
    return unitId;
  }

  public void setUnitId(StringType unitId) {
    this.unitId = unitId;
  }

  public StringType getOrgId() {
    return orgId;
  }

  public void setOrgId(StringType orgId) {
    this.orgId = orgId;
  }

  public DecimalType getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(DecimalType createdDate) {
    this.createdDate = createdDate;
  }

  public DecimalType getUpdatedDate() {
    return updatedDate;
  }

  public void setUpdatedDate(DecimalType updatedDate) {
    this.updatedDate = updatedDate;
  }

  public StringType getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(StringType createdBy) {
    this.createdBy = createdBy;
  }

  public StringType getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(StringType updatedBy) {
    this.updatedBy = updatedBy;
  }

  public StringType getUnitCode() {
    return unitCode;
  }

  public void setUnitCode(StringType unitCode) {
    this.unitCode = unitCode;
  }

public StringType getOrgCode() {
	return orgCode;
}

public void setOrgCode(StringType orgCode) {
	this.orgCode = orgCode;
}
	
}
