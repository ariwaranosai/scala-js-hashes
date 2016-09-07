package xyz.ariwaranosai.hashes

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
/**
  * Created by sai on 2016/9/6.
  */

@js.native
class MD5Options(
                  uppercase: Boolean,
                  pad: String,
                  utf8: Boolean
                ) extends js.Object


@JSName("Hashes.MD5")
@js.native
class MD5(options: MD5Options = new MD5Options(false, "=", true)) extends js.Object {
  def hex(s: String): String = js.native
  def hex_hmac(key: String, string: String): String = js.native
  def b64(s: String): String = js.native
  def b64_hmac(key: String, string: String): String = js.native
  def any(s: String, encoding: String): String  = js.native
  def any_hmac(key: String, string: String, encoding: String): String  = js.native
  def raw(s: String): String = js.native
  def setUpperCase(a: Boolean): String  = js.native
  def setPad(a: String): String  = js.native
  def setUTF8(a: Boolean): String  = js.native


  def vm_test(): Unit = js.native
}

