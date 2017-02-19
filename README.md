scala-js-hashes 
===================
[![Build Status](https://travis-ci.org/ariwaranosai/scala-js-hashes.svg?branch=master)](https://travis-ci.org/ariwaranosai/scala-js-hashes) [![Scala.js](https://www.scala-js.org/assets/badges/scalajs-0.6.8.svg)](https://www.scala-js.org) [![Coverage Status](https://coveralls.io/repos/github/ariwaranosai/scala-js-hashes/badge.svg)](https://coveralls.io/github/ariwaranosai/scala-js-hashes)

js-hashes facade types for Scala.js


##scala-js-hashes

jshashes is lightweight library implementing the most extended cryptographic hash function algorithms in pure JavaScript (ES5 compliant).You can find more from [jshashes](https://github.com/h2non/jshashes).

scalajs-hashes provide jshashes facade type for scalajs programs since there are few hashlib in native scala adapted to scalajs.

##Usage

Add the following to your sbt build definition:

    libraryDependencies += "xyz.ariwaranosai" %%% "scalajs-hashes" % "0.1.0"
          
###include javascript

`hashes.js` file itself is also needed. You can include it in your html file. Another way is include it in the final `jsdeps.js` by add the desired version to `jdDependencies`,e.g.,

    jsDependencies += "org.webjars.bower" % "jshashes" % "1.0.5" / "1.0.5/hashes.min.js"
    
###Hashes

scalajs-hashes provides two way to get hashes, please follow those [testcase](https://github.com/ariwaranosai/scala-js-hashes/blob/master/src/test/scala/xyz/ariwaranosai/hashes/JSHashesTest.scala).

##License

scala-js-hashes is released under MIT license. See [LICENSE file](https://raw.githubusercontent.com/ariwaranosai/scala-js-hashes/master/LICENSE).
