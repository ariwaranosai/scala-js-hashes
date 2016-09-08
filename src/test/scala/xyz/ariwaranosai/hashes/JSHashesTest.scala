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
    }
    'MD5Ops{
      import xyz.ariwaranosai.hashes.Implicit.MD5Ops
      assert("Jintsu".hex == "4e162883d24ad3c4f717ed5faf8ea214")
      assert("Sakura Ayane".b64 == "8NwlZCPDFj2NVrSvyFYv7Q==")
    }
  }

}
