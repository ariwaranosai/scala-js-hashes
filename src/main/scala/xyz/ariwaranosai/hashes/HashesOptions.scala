package xyz.ariwaranosai.hashes

import scala.scalajs.js

/**
  * Created by sai on 2016/9/10.
  */
@js.native
class HashesOptions(
                     uppercase: Boolean,
                     pad: String,
                     utf8: Boolean
                   ) extends js.Object

object HashesOptions {
  def apply(
             uppercase: Boolean,
             pad: String,
             utf8: Boolean
           ): HashesOptions = new HashesOptions(uppercase, pad, utf8)
}
