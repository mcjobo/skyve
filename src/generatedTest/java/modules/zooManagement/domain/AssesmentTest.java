package modules.zooManagement.domain;

import org.skyve.util.DataBuilder;
import org.skyve.util.test.SkyveFixture.FixtureType;
import util.AbstractDomainTest;

/**
 * Generated - local changes will be overwritten.
 * Extend {@link AbstractDomainTest} to create your own tests for this document.
 */
public class AssesmentTest extends AbstractDomainTest<Assesment> {

	@Override
	protected Assesment getBean() throws Exception {
		return new DataBuilder()
			.fixture(FixtureType.crud)
			.build(Assesment.MODULE_NAME, Assesment.DOCUMENT_NAME);
	}
}