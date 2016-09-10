package xyz.ariwaranosai.hashes

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import JSHashes._
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

object JSHashes {
  val defaultOptions = HashesOptions(uppercase = false, "=", utf8 = true)
}

@JSName("Hashes.MD5")
@js.native
class MD5(options: HashesOptions = defaultOptions) extends JSHashes(options)

@JSName("Hashes.SHA1")
@js.native
class SHA1(options: HashesOptions = defaultOptions) extends JSHashes(options)

@JSName("Hashes.SHA256")
@js.native
class SHA256(options: HashesOptions = defaultOptions) extends JSHashes(options)

@JSName("Hashes.SHA512")
@js.native
class SHA512(options: HashesOptions = defaultOptions) extends JSHashes(options)

@JSName("Hashes.RMD160")
@js.native
class RMD160(options: HashesOptions = defaultOptions) extends JSHashes(options)
