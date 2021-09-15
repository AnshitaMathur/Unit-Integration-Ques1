package EmailTest
import Checkemail.EmailCheck
import org.scalatest.funsuite.AnyFunSuite

  class EmailTest extends AnyFunSuite{

    val email = new EmailCheck
    test("Check Recipient's Name that it does not contain s"){

      val expectedValue = true
      val resultingValue = email.nameOfRecipient("anshitamathur608@gmail.com")
      intercept(resultingValue == expectedValue)
      //assert in place of intercept
    }

    test("Recipient's Name with Special Characters throw  Exception"){

      intercept[IllegalArgumentException]{
        email.nameOfRecipient("anshitamathur608@gmail.com")
      }
    }


    test("Check '@' Symbol is present in the Email address"){

      val expectedValue= true
      val resultingValue = email.checkTheSymbol("anshitamathur608@gmail.com")
      intercept(resultingValue == expectedValue)
    }


    test("Email address without '@' throws  Exception"){

      intercept[IllegalArgumentException]{
        email.checkTheSymbol("anshitamathur608@gmail.com")
      }
    }


    test("Check that Domain Name does not contain special characters"){

      val expectedValue= true
      val resultingValue = email.checkDomain("anshitamathur608@gmail.com")
      assert(resultingValue == expectedValue)
    }


    test("Domain Name with Special Characters throws  Exception"){

      intercept[IllegalArgumentException]{
        email.checkDomain("anshitamathur608@gmail.com")
      }
    }


    test("Check Top Level Domains "){

      val expectedValue= true
      val resultingValue = email.topLevelDomain("anshitamathur608@gmail.com")
      intercept(resultingValue == expectedValue)
    }

    test("If Top Level Domain is not .net/.org/.com it throws Exception"){

      intercept[IllegalArgumentException]{
        email.topLevelDomain("anshitamathur608@gmail.com")
      }
    }
  }
