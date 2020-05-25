package playground
import org.mockito.ArgumentMatchers._
import org.mockito.MockitoSugar
import org.scalatest.BeforeAndAfter
import org.scalatest.flatspec.AnyFlatSpec

class TestingTestClass extends AnyFlatSpec with BeforeAndAfter with MockitoSugar{
  private var testClass:TestClass =_

  before{
    testClass = mock[TestClass]
  }
  after{
    testClass = null
  }

  "a" must "b" in {
    //Mockito.when(testClass.testMethod(anyString()))
    doNothing.when(testClass).testMethod(anyString())

  }
}
