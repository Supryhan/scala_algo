import org.scalatest._

class BinarTest extends FlatSpec with Matchers {
  "A binary search" should "give correct result" in {
    val arr = Array[Int](0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13)

    Binari.find(Integer.MIN_VALUE, arr) should be(None)
    Binari.find(1, arr) should be(Some(1))
    Binari.find(-1, arr) should be(None)
    Binari.find(1024, arr) should be(None)
    Binari.find(13, arr) should be(Some(13))
    Binari.find(Integer.MAX_VALUE, arr) should be(None)
  }
}
