package com.brianway.learning.java8.effective.optional;

import com.brianway.learning.java8.effective.optional.OptionalInAction;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Optional;

public class OptionalInActionTest {

  @Rule public ExpectedException thrown = ExpectedException.none();

  /* testedClasses: com/brianway/learning/java8/effective/optional/OptionalInAction.java */
  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers:
   *  - conditional line 28 branch to line 28
   */

  @Test
  public void getValueInputNotNullOutputNotNull() {

    // Arrange
    String key = "";

    // Act
    Optional<Object> retval = OptionalInAction.getValue(key);

    // Assert result
    Assert.assertNotNull(retval);
    Assert.assertEquals(null, Reflector.getInstanceField(retval, "value"));
  }
}
