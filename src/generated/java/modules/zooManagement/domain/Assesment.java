package modules.zooManagement.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import modules.admin.User.UserExtension;
import org.skyve.CORE;
import org.skyve.domain.messages.DomainException;
import org.skyve.domain.types.DateTime;
import org.skyve.impl.domain.AbstractPersistentBean;
import org.skyve.impl.domain.types.jaxb.DateTimeMapper;

/**
 * Assesment
 * 
 * @navhas n assessmentCreatedBy 0..1 User
 * @stereotype "persistent"
 */
@XmlType
@XmlRootElement
public class Assesment extends AbstractPersistentBean {
	/**
	 * For Serialization
	 * @hidden
	 */
	private static final long serialVersionUID = 1L;

	/** @hidden */
	public static final String MODULE_NAME = "zooManagement";

	/** @hidden */
	public static final String DOCUMENT_NAME = "Assesment";

	/** @hidden */
	public static final String hygieneAssesmentPropertyName = "hygieneAssesment";

	/** @hidden */
	public static final String painAssesmentPropertyName = "painAssesment";

	/** @hidden */
	public static final String continenceAssesmentPropertyName = "continenceAssesment";

	/** @hidden */
	public static final String behaviourAssesmentPropertyName = "behaviourAssesment";

	/** @hidden */
	public static final String assessmentCreatedByPropertyName = "assessmentCreatedBy";

	/** @hidden */
	public static final String assessmentReviewTimePropertyName = "assessmentReviewTime";

	/**
	 * Hygiene Assesment
	 **/
	private String hygieneAssesment;

	/**
	 * Pain Assesment
	 **/
	private String painAssesment;

	/**
	 * Continence Assesment
	 **/
	private String continenceAssesment;

	/**
	 * Behaviour Assesment
	 **/
	private String behaviourAssesment;

	/**
	 * Assessment Created By
	 **/
	private UserExtension assessmentCreatedBy = null;

	/**
	 * Assessment Review Time
	 **/
	private DateTime assessmentReviewTime;

	@Override
	@XmlTransient
	public String getBizModule() {
		return Assesment.MODULE_NAME;
	}

	@Override
	@XmlTransient
	public String getBizDocument() {
		return Assesment.DOCUMENT_NAME;
	}

	public static Assesment newInstance() {
		try {
			return CORE.getUser().getCustomer().getModule(MODULE_NAME).getDocument(CORE.getUser().getCustomer(), DOCUMENT_NAME).newInstance(CORE.getUser());
		}
		catch (RuntimeException e) {
			throw e;
		}
		catch (Exception e) {
			throw new DomainException(e);
		}
	}

	@Override
	@XmlTransient
	public String getBizKey() {
		try {
			return org.skyve.util.Binder.formatMessage("Assesment - {hygieneAssesment}", this);
		}
		catch (@SuppressWarnings("unused") Exception e) {
			return "Unknown";
		}
	}

	@Override
	public boolean equals(Object o) {
		return ((o instanceof Assesment) && 
					this.getBizId().equals(((Assesment) o).getBizId()));
	}

	/**
	 * {@link #hygieneAssesment} accessor.
	 * @return	The value.
	 **/
	public String getHygieneAssesment() {
		return hygieneAssesment;
	}

	/**
	 * {@link #hygieneAssesment} mutator.
	 * @param hygieneAssesment	The new value.
	 **/
	@XmlElement
	public void setHygieneAssesment(String hygieneAssesment) {
		preset(hygieneAssesmentPropertyName, hygieneAssesment);
		this.hygieneAssesment = hygieneAssesment;
	}

	/**
	 * {@link #painAssesment} accessor.
	 * @return	The value.
	 **/
	public String getPainAssesment() {
		return painAssesment;
	}

	/**
	 * {@link #painAssesment} mutator.
	 * @param painAssesment	The new value.
	 **/
	@XmlElement
	public void setPainAssesment(String painAssesment) {
		preset(painAssesmentPropertyName, painAssesment);
		this.painAssesment = painAssesment;
	}

	/**
	 * {@link #continenceAssesment} accessor.
	 * @return	The value.
	 **/
	public String getContinenceAssesment() {
		return continenceAssesment;
	}

	/**
	 * {@link #continenceAssesment} mutator.
	 * @param continenceAssesment	The new value.
	 **/
	@XmlElement
	public void setContinenceAssesment(String continenceAssesment) {
		preset(continenceAssesmentPropertyName, continenceAssesment);
		this.continenceAssesment = continenceAssesment;
	}

	/**
	 * {@link #behaviourAssesment} accessor.
	 * @return	The value.
	 **/
	public String getBehaviourAssesment() {
		return behaviourAssesment;
	}

	/**
	 * {@link #behaviourAssesment} mutator.
	 * @param behaviourAssesment	The new value.
	 **/
	@XmlElement
	public void setBehaviourAssesment(String behaviourAssesment) {
		preset(behaviourAssesmentPropertyName, behaviourAssesment);
		this.behaviourAssesment = behaviourAssesment;
	}

	/**
	 * {@link #assessmentCreatedBy} accessor.
	 * @return	The value.
	 **/
	public UserExtension getAssessmentCreatedBy() {
		return assessmentCreatedBy;
	}

	/**
	 * {@link #assessmentCreatedBy} mutator.
	 * @param assessmentCreatedBy	The new value.
	 **/
	@XmlElement
	public void setAssessmentCreatedBy(UserExtension assessmentCreatedBy) {
		if (this.assessmentCreatedBy != assessmentCreatedBy) {
			preset(assessmentCreatedByPropertyName, assessmentCreatedBy);
			this.assessmentCreatedBy = assessmentCreatedBy;
		}
	}

	/**
	 * {@link #assessmentReviewTime} accessor.
	 * @return	The value.
	 **/
	public DateTime getAssessmentReviewTime() {
		return assessmentReviewTime;
	}

	/**
	 * {@link #assessmentReviewTime} mutator.
	 * @param assessmentReviewTime	The new value.
	 **/
	@XmlElement
	@XmlSchemaType(name = "dateTime")
	@XmlJavaTypeAdapter(DateTimeMapper.class)
	public void setAssessmentReviewTime(DateTime assessmentReviewTime) {
		preset(assessmentReviewTimePropertyName, assessmentReviewTime);
		this.assessmentReviewTime = assessmentReviewTime;
	}
}
