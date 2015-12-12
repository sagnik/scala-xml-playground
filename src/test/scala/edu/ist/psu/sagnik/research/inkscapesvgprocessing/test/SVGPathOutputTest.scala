package edu.ist.psu.sagnik.research.inkscapesvgprocessing.test

/**
 * Created by szr163 on 11/8/15.
 */
import edu.ist.psu.sagnik.research.inkscapesvgprocessing.impl.SVGPathWithGroups
import org.scalatest.FunSpec

class SVGPathOutputTest extends FunSpec {


  describe("testing the SVG output by printing") {
    import edu.ist.psu.sagnik.research.inkscapesvgprocessing.test.DataLocation._
    it("should print the path info.") {
      val results=SVGPathWithGroups(svgFileLoc)

      results.foreach(x=>println(s"[path id]: ${x.id}, [groups]: ${x.groups.map(x=>x.transformOps)}"))

      /*assert(results.find(p=>p.id=="p1").head.gIds.isEmpty)
      assert(results.find(p=>p.id=="p2").head.gIds.isEmpty)
      assert(List("g1","g2").toSet.equals(results.find(p=>"p3".equals(p.id)).head.gIds.toSet))
      assert(List("g1").toSet.equals(results.find(p=>"p4".equals(p.id)).head.gIds.toSet))
      assert(List("g3").toSet.equals(results.find(p=>"p5".equals(p.id)).head.gIds.toSet))
      assert(List("g4").toSet.equals(results.find(p=>"p6".equals(p.id)).head.gIds.toSet))
*/
    }
  }

}
