import scala.Function2;
import scala.collection.immutable.List;

import java.util.Map;
import java.util.Set;


/*
*@ClassName:JavaUseScala
 @Description:TODO
 @Author:
 @Date:2018/11/14 9:53 
 @Version:v1.0
*/
public class JavaUseScala {
    public static void main(String[] args) {
        Dog.sing();
        new Dog().play();
        System.out.println(Dog.cal(Dog.add(),1,2));
        System.out.println(Dog.add());

        Map<String, Object> wordcount = Dog.wordcount();

        Set<String> keySet = wordcount.keySet();
        for (String key :
                keySet) {
            System.out.println("key:"+key+"value:"+wordcount.get(key));
        }

    }
}
