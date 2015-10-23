//Original submission: https://www.hackerrank.com/challenges/plus-minus/submissions/code/14736121

import java.util.Scanner
import java.io.InputStreamReader
import java.text.DecimalFormat

object Solution {

    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
        val scanner = new Scanner(new InputStreamReader(System.in));
        
        val n = Integer.parseInt(scanner.nextLine());
        
        val posNeg:(Int, Int, Int) = findPosNegAcc(scanner.nextLine.split(" ").toList.map(_.toInt), 0, 0, 0)
        
        val myFormat = new DecimalFormat("0.000000");
        println(myFormat.format(posNeg._1.toDouble/n.toDouble))
        println(myFormat.format(posNeg._2.toDouble/n.toDouble))
        println(myFormat.format(posNeg._3.toDouble/n.toDouble))    
        
    }
    
    def findPosNegAcc(list:List[Int], pos:Int, neg:Int, zero:Int):(Int, Int, Int) =
        {
            list match
            {
                case h::t => if (h > 0) findPosNegAcc(t, pos + 1, neg, zero) 
                             else if (h == 0) findPosNegAcc(t, pos, neg, zero + 1)
                             else findPosNegAcc(t, pos, neg + 1, zero)
                                
                case _ => (pos, neg, zero)    
            }
        }
}
