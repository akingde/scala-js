package org.scalajs.junit

import org.junit.Assume._
import org.junit.Test

import org.scalajs.junit.utils.JUnitTest

class MultiAssumeFail1Test {
  @Test def multiTest1(): Unit = {
    assumeTrue("This assume should not pass", false)
  }

  @Test def multiTest2(): Unit = ()
  @Test def multiTest3(): Unit = ()
  @Test def multiTest4(): Unit = ()
  @Test def multiTest5(): Unit = ()
}

class MultiAssumeFail1TestAssertions extends JUnitTest {
  protected def expectedOutput(builder: OutputBuilder): OutputBuilder = {
    builder
      .assumptionViolated("multiTest1")
      .success("multiTest2")
      .success("multiTest3")
      .success("multiTest4")
      .success("multiTest5")
  }
}
