package com.myorg.scalatra

import org.scalatra._
import scalate.ScalateSupport
import org.json4s.{DefaultFormats, Formats}
import org.scalatra.json._

class MyScalatraServlet extends MyfirstscalatraStack with JacksonJsonSupport {

  protected implicit lazy val jsonFormats: Formats = DefaultFormats

  // Before every action runs, set the content type to be in JSON format.
  before() {
    contentType = formats("json")
  }

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }

  get("/:param") {
    <html>
      <body>
        <h1>Hello, {params("param")}</h1>
      </body>
    </html>
  }
  get("/flowers") {
    FlowerData.all
  }
}

// A Flower object to use as a faked-out data model
case class Flower(slug: String, name: String)

object FlowerData {

  /**
    * Some fake flowers data so we can simulate retrievals.
    */
  var all = List(
    Flower("yellow-tulip", "Yellow Tulip"),
    Flower("red-rose", "Red Rose"),
    Flower("black-rose", "Black Rose"))
}
