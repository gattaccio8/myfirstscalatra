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

  get("/withparam/:param") {
    <html>
      <body>
        <h1>Hello {params("param")}
        </h1>
      </body>
    </html>
  }

  get("/form/") {
    <html>
      <body>
        <h1>Hello form with POST</h1>
        <form action="/home/post" method="post">
          First name: <input type="text" name="fname"/><br/>
          Last name: <input type="text" name="lname"/><br/>
            <input type="submit" value="Submit"/>
        </form>
      </body>
    </html>
  }

  post("/post") {
    <html>
      <body>
        <h1>Hello POST form!</h1>
      </body>
    </html>
  }
}
