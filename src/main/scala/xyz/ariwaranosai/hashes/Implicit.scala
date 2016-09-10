package xyz.ariwaranosai.hashes
/**
  * Created by sai on 2016/9/6.
  */

object Implicit {
  implicit class HashOps(s: String) {
    def MD5() = new MD5Ops(s)
    def SHA1() = new SHA1Ops(s)
    def SHA256() = new SHA256Ops(s)
    def SHA512() = new SHA512Ops(s)
    def RMD160() = new RMD160Ops(s)
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

  implicit class SHA1Ops(s: String) extends JSHashOps(s) {
    val m = new SHA1()
  }

  implicit class SHA256Ops(s: String) extends JSHashOps(s) {
    val m = new SHA256()
  }

  implicit class SHA512Ops(s: String) extends JSHashOps(s) {
    val m = new SHA512()
  }

  implicit class RMD160Ops(s: String) extends JSHashOps(s) {
    val m = new RMD160()
  }

}