package com.myorg.scalatra

import org.scalatra.test.scalatest._
import org.scalatest.FunSuiteLike


class MyScalatraServletTests extends ScalatraSuite with FunSuiteLike {

  addServlet(classOf[MyScalatraServlet], "/*")

  test("simple get on") {
    get("/") {
      status should equal (200)
      body should include ("Hello, world!")
    }
  }

  test("get appended parameter") {
    get("/fabio") {

      body should include ("<h1>Hello, fabio</h1>")
    }
  }
}
