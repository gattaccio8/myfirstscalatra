package com.myorg.scalatra

class MyScalatraServlet extends MyfirstscalatraStack {

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say
        <a href="hello-scalate">hello to Scalate</a>
        .
      </body>
    </html>
  }

  get("/:param") {
    <html>
      <body>
        <h1>Hello {params("param")}
        </h1>
      </body>
    </html>
  }
}
