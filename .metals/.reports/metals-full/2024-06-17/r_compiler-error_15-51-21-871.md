file:///C:/Users/Acer/Desktop/SLS01/1.scala
### dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition fun is defined in
  C:/Users/Acer/Desktop/SLS01/5.scala
and also in
  C:/Users/Acer/Desktop/SLS01/3.scala
One of these files should be removed from the classpath.

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.3
Classpath:
<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala3-library_3\3.3.3\scala3-library_3-3.3.3.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.12\scala-library-2.13.12.jar [exists ]
Options:



action parameters:
offset: 22
uri: file:///C:/Users/Acer/Desktop/SLS01/1.scala
text:
```scala
object area{
    def @@area1(r:Int):Int={
        return r*r

    }
    def main(args:Array[String]):Unit={
        println(area1(5));

    }
}
```



#### Error stacktrace:

```

```
#### Short summary: 

dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition fun is defined in
  C:/Users/Acer/Desktop/SLS01/5.scala
and also in
  C:/Users/Acer/Desktop/SLS01/3.scala
One of these files should be removed from the classpath.