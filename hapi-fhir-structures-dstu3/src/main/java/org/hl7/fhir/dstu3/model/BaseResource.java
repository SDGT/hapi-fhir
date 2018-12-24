package org.hl7.fhir.dstu3.model;

import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.Description;
import org.hl7.fhir.instance.model.api.IAnyResource;
import org.hl7.fhir.instance.model.api.IIdType;

import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.model.api.IElement;

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
		return FhirVersionEnum.DSTU3;
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
   * organisation id
   */
  @Child(name = "orgId", type = {StringType.class}, min=0, max=1, modifier=false, summary=true)
  @Description(shortDefinition="organisation id ",
    formalDefinition="organisation id " )
  protected StringType orgId;

  /**
   * for audit purpose this relates to created date and time
   */
  @Child(name = "createdDate", type = {StringType.class}, min=0, max=1, modifier=false, summary=true)
  @Description(shortDefinition="for audit purpose this relates to created  date and time",
    formalDefinition="for audit purpose this relates to created date and time" )
  protected DateType createdDate;

  /**
   * for audit purpose this relates to updated  date and time.
   */
  @Child(name = "updatedDate", type = {DateType.class},  min=0, max=1, modifier=false, summary=true)
  @Description(shortDefinition="for audit purpose this relates to updated  date and time",
    formalDefinition="for audit purpose this relates to updated  date and time" )
  protected DateType updatedDate;

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

  public DateType getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(DateType createdDate) {
    this.createdDate = createdDate;
  }

  public DateType getUpdatedDate() {
    return updatedDate;
  }

  public void setUpdatedDate(DateType updatedDate) {
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
}
