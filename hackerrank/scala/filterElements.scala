//Submission: https://www.hackerrank.com/challenges/filter-elements/submissions/code/14624625

import java.util.Scanner
import scala.collection.mutable.LinkedHashMap

object Solution {

    def main(args: Array[String]) {
        val sc = new Scanner(System.in)
        val numTest = sc.nextLine().toInt
        var lineCount = 1
        var k = 0
            
        while(sc.hasNext()){
            val intArr = sc.nextLine().toString().split(" ")
            if (lineCount%2 == 1)
            {
                k = intArr(1).toInt    
            }    
            else
            {   
             val intList = intArr.toList.map(_.toInt)
                 
                 filterAcc(intList, countMap = new LinkedHashMap()).filter{case (x,y) => y>=k}.keys.toList match
                {
                    case Nil=> print(-1)
                    case l:List[int] => l.foreach(i => print(i + " "))               
                }
                println
            } 
            lineCount+=1
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
    }
        
    def filterAcc(origList:List[Int], countMap:LinkedHashMap[Int, Int]):LinkedHashMap[Int, Int] =
        {
            origList match
                {
                case h::t => 
                             if (countMap.contains(h))
                                {
                                 countMap.put(h, countMap.getOrElse(h, 0) + 1)   
                                }    
                             else
                                 {
                                    countMap.put(h, 1)
                                 }
                             filterAcc(t, countMap)
                          
                    
                    case Nil => countMap                                          
                }
        
        }
    
}
