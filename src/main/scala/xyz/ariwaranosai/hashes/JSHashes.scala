package xyz.ariwaranosai.hashes

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
/**
  * Created by sai on 2016/9/6.
  */

@js.native
abstract class JSHashes(options: HashesOptions) extends js.Object {
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

@JSName("Hashes.MD5")
@js.native
class MD5(options: HashesOptions = HashesOptions(uppercase = false, "=", utf8 = true)) extends JSHashes(options)


object MD5 {
  def apply(options: HashesOptions = HashesOptions(uppercase = false, "=", utf8 = true)): MD5 = new MD5(options)
}

