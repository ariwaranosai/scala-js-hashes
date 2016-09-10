package xyz.ariwaranosai.hashes
/**
  * Created by sai on 2016/9/6.
  */

object Implicit {
  implicit class HashOps(s: String) {
    def MD5() = MD5Ops(s)
  }

  sealed abstract class JSHashOps(s: String) {
    val m: JSHashes
    def hex = m.hex(s)
    def hex_hmac(key: String) = m.hex_hmac(key, s)
    def b64: String = m.b64(s)
    def b64_hmac(key: String) = m.b64_hmac(key, s)
    def any(encoding: String) = m.any(s, encoding)
    def any_hmac(key: String, encoding: String) = m.any_hmac(key, s, encoding)
    def raw(s: String): String = m.raw(s)
    def setUpperCase(a: Boolean) = m.setUpperCase(a)
    def setPad(a: String) = m.setPad(a)
    def setUTF8(a: Boolean) = m.setUTF8(a)
  }

  implicit class MD5Ops(s: String) extends JSHashOps(s) {
    val m = new MD5()
  }
}