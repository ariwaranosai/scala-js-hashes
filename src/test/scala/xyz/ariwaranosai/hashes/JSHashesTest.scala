package xyz.ariwaranosai.hashes

import utest._

/**
  * Created by sai on 2016/9/8.
  */

object JSHashesTest extends TestSuite {

  val tests = this {
    'HashOps{
      import xyz.ariwaranosai.hashes.Implicit.HashOps
      assert("Haruna".MD5().hex == "0516c366a42ec9223efa9da326c7909f")
      assert("Touyama Nao".MD5().b64 == "8oW+8vzsYrLfcKaKWpCMzg==")
      assert("Haruna".SHA1().hex == "0bea7a0b22abdef6aeb5458ba2673f95567216b2")
      assert("Touyama Nao".SHA1().b64 == "59I+BTFkei23U/iBfTEUsmqAGVI=")
      assert("Haruna".SHA512().hex == "877760cd73c1b6d13fdff543318cee25608a7f51ebb0b59f3c3f3dc60b5ad5be77091d845e68b75383636274512f46ff9e94512b91f42564f81ad4c78d6f1b9d")
      assert("Haruna".SHA256().hex == "deeee9f2292fb052bf4cd126656c2027777269595387e41c89bee256f26f4fc3")
      assert("Haruna".RMD160().hex == "d1fe1fd6095aad1ff9806625373afe1dd821be4d")
    }
    'MD5Ops{
      import xyz.ariwaranosai.hashes.Implicit.MD5Ops
      assert("Jintsu".hex == "4e162883d24ad3c4f717ed5faf8ea214")
      assert("Sakura Ayane".b64 == "8NwlZCPDFj2NVrSvyFYv7Q==")
    }

    'SHA1{
      import xyz.ariwaranosai.hashes.Implicit.SHA1Ops
      assert("Hatsukaze".hex == "fffad4454ba958c52da3532c1371e557f9522358")
      assert("Bridcutt Sarah Emi".b64 == "fhdb/dSP/8heCzFatFSR/1HShMQ=")
    }

    'SHA256 {
      import xyz.ariwaranosai.hashes.Implicit.SHA256Ops
      assert("Hatsukaze".hex == "9e8c5ff31fbcfe0842f27fec8be054b67e05224f200ed0b542485c05562a5ab9")
      assert("Bridcutt Sarah Emi".b64 == "YMVSawzQLvdx1gewXbjq0ICCHCBlxjIaoc/MrWFO0jQ=")
    }

    'SHA512 {
      import xyz.ariwaranosai.hashes.Implicit.SHA512Ops
      assert("Hatsukaze".hex == "ab996bf5a891957022a2b351b5bc260918a41379663dcb89f44d186529f5c9298537ed7dd848ac1d23035d46ff9d5131eeafd9769ceb8fde03f248ca6c4eb0f8")
      assert("Bridcutt Sarah Emi".b64 == "ppgUqmL/4V/jie+PY51oRlev0XVzT6bRD+w6UILO+8D7rGR9TTDpFKNCd6wnAM4LIfym5ecFxLqi0bxowiFK4A==")
    }

    'RMD160 {
      import xyz.ariwaranosai.hashes.Implicit.RMD160Ops
      assert("Hatsukaze".hex == "79779a298a5ff16fb5d8f6b9021b4058f7c2d089")
      assert("Bridcutt Sarah Emi".b64 == "wreThPcymQRonWTS6nK2IT5v9nY=")
    }

  }

}
