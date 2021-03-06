import org.scalatest.{Matchers, WordSpec}

import HackerRankWarmUp._

class HackerRankWarmUpSpec extends WordSpec with Matchers {

  "Warm up" should {

    "sum array" in {
      simpleArraySum(6, Array(1, 2, 3, 4, 10, 11)) shouldBe 31
    }

    "compare the triplets" in {
      compareTriplets(List(5, 6, 7), List(3, 6, 10)) shouldBe (1, 1)
    }

    "sum array of big numbers" in {
      aVeryBigSum(5, Array[Long](1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L)) shouldBe 5000000015L
    }

    "calculate the absolute difference between the sums of matrix diagonals" in {
      val matrix = Array(
        Array(11, 2, 4),
        Array(4, 5, 6),
        Array(10, 8, -12)
      )

      diagonalDifference(matrix) shouldBe 15
    }

    "calculate fraction of array for positive, negative, and zero" in {
      fractionOfArray(Array(-4, 3, -9, 0, 4, 1)) shouldBe Seq[Double](0.500000, 0.333333, 0.166667)
    }

    "build a staircase of size n" in {
      staircase(6) shouldBe List(
        "     #",
        "    ##",
        "   ###",
        "  ####",
        " #####",
        "######"
      )
    }

    "find min and max sum from combinations of n - 1 elements" in {
      minMaxSum(Array(1, 2, 3, 4, 5)) shouldBe (10, 14)
    }

    "blow out candles" in {
      birthdayCakeCandles(4, Array(3, 2, 1, 3)) shouldBe 2
      birthdayCakeCandles(1, Array(3)) shouldBe 1
      birthdayCakeCandles(0, Array()) shouldBe 0
      birthdayCakeCandles(4, Array(3, 3, 3, 3)) shouldBe 4
      birthdayCakeCandles(4, Array(3, 1, 1, 1)) shouldBe 1
      birthdayCakeCandles(4, Array(1, 1, 1, 3)) shouldBe 1
      birthdayCakeCandles(4, Array(1, 2, 3, 3)) shouldBe 2
    }

    "convert time to 24 hr format" in {
      timeConversion("07:05:45PM") shouldBe "19:05:45"
      timeConversion("07:05:45AM") shouldBe "07:05:45"
      timeConversion("12:05:45PM") shouldBe "12:05:45"
      timeConversion("12:05:45AM") shouldBe "00:05:45"
    }

    "process student grades" in {
      gradeStudent(4, Array(73, 67, 38, 33)) shouldBe Array(75, 67, 40, 33)
    }

    "calculate number of apples and oranges that fall in house" in {
      applesOranges(7, 11, 5, 15, 3, 2, Array(-2, 2, 1), Array(5, -6)) shouldBe List(1, 1)
    }

    "pick election winner 1 " in {
      val expected =  Array("Alex", "Michael", "Harry", "Dave", "Michael", "Victor", "Harry", "Alex", "Mary", "Mary")
      electionWinner(expected) shouldBe "Michael"
    }

    "pick election winner 2 " in {
      val expected =  Array("Victor", "Veronica", "Ryan", "Dave", "Maria", "Maria", "Farah", "Farah", "Ryan", "Veronica")
      electionWinner(expected) shouldBe "Veronica"
    }

    "count maxes 1" in {
      counts(Array(1, 4, 2, 4), Array(3, 5)) shouldBe Array(2, 4)
    }

    "count maxes 2" in {
      counts(Array(2, 10, 5, 4, 8), Array(3, 1, 7, 8)) shouldBe Array(1, 0, 3, 4)
    }

    "count maxes 3" in {
      counts(Array(), Array()) shouldBe Array()
    }

  }

}
