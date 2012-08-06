// @SOURCE:/home/sas/dev/apps/backbone/winews/conf/routes
// @HASH:c8dd0efcf0d9fc75268afcae9305cd4baf2ef0a6
// @DATE:Mon Aug 06 13:01:19 ART 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:8
// @LINE:5
package controllers {

// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
class ReverseWines {
    


 
// @LINE:16
def delete(id:Long) = {
   Call("DELETE", "/wines/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:11
def count() = {
   Call("GET", "/wines/count")
}
                                                        
 
// @LINE:12
def update(id:Long) = {
   Call("PUT", "/wines/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:10
def list() = {
   Call("GET", "/wines")
}
                                                        
 
// @LINE:15
def show(id:Long) = {
   Call("GET", "/wines/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:14
// @LINE:13
def save() = {
   () match {
// @LINE:13
case () if true => Call("POST", "/wines/")
                                                                
// @LINE:14
case () if true => Call("POST", "/wines")
                                                                    
   }
}
                                                        

                      
    
}
                            

// @LINE:8
// @LINE:5
class ReverseApplication {
    


 
// @LINE:5
def options(url:String) = {
   Call("OPTIONS", "/" + implicitly[PathBindable[String]].unbind("url", url))
}
                                                        
 
// @LINE:8
def index() = {
   Call("GET", "/")
}
                                                        

                      
    
}
                            

// @LINE:19
class ReverseAssets {
    


 
// @LINE:19
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            
}
                    


// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:8
// @LINE:5
package controllers.javascript {

// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
class ReverseWines {
    


 
// @LINE:16
def delete = JavascriptReverseRoute(
   "controllers.Wines.delete",
   """
      function(id) {
      return _wA({method:"DELETE", url:"/wines/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:11
def count = JavascriptReverseRoute(
   "controllers.Wines.count",
   """
      function() {
      return _wA({method:"GET", url:"/wines/count"})
      }
   """
)
                                                        
 
// @LINE:12
def update = JavascriptReverseRoute(
   "controllers.Wines.update",
   """
      function(id) {
      return _wA({method:"PUT", url:"/wines/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:10
def list = JavascriptReverseRoute(
   "controllers.Wines.list",
   """
      function() {
      return _wA({method:"GET", url:"/wines"})
      }
   """
)
                                                        
 
// @LINE:15
def show = JavascriptReverseRoute(
   "controllers.Wines.show",
   """
      function(id) {
      return _wA({method:"GET", url:"/wines/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:14
// @LINE:13
def save = JavascriptReverseRoute(
   "controllers.Wines.save",
   """
      function() {
      if (true) {
      return _wA({method:"POST", url:"/wines/"})
      }
      if (true) {
      return _wA({method:"POST", url:"/wines"})
      }
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:8
// @LINE:5
class ReverseApplication {
    


 
// @LINE:5
def options = JavascriptReverseRoute(
   "controllers.Application.options",
   """
      function(url) {
      return _wA({method:"OPTIONS", url:"/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("url", url)})
      }
   """
)
                                                        
 
// @LINE:8
def index = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"/"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:19
class ReverseAssets {
    


 
// @LINE:19
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:8
// @LINE:5
package controllers.ref {

// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
class ReverseWines {
    


 
// @LINE:16
def delete(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Wines.delete(id), HandlerDef(this, "controllers.Wines", "delete", Seq(classOf[Long]))
)
                              
 
// @LINE:11
def count() = new play.api.mvc.HandlerRef(
   controllers.Wines.count(), HandlerDef(this, "controllers.Wines", "count", Seq())
)
                              
 
// @LINE:12
def update(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Wines.update(id), HandlerDef(this, "controllers.Wines", "update", Seq(classOf[Long]))
)
                              
 
// @LINE:10
def list() = new play.api.mvc.HandlerRef(
   controllers.Wines.list(), HandlerDef(this, "controllers.Wines", "list", Seq())
)
                              
 
// @LINE:15
def show(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Wines.show(id), HandlerDef(this, "controllers.Wines", "show", Seq(classOf[Long]))
)
                              
 
// @LINE:13
def save() = new play.api.mvc.HandlerRef(
   controllers.Wines.save(), HandlerDef(this, "controllers.Wines", "save", Seq())
)
                              

                      
    
}
                            

// @LINE:8
// @LINE:5
class ReverseApplication {
    


 
// @LINE:5
def options(url:String) = new play.api.mvc.HandlerRef(
   controllers.Application.options(url), HandlerDef(this, "controllers.Application", "options", Seq(classOf[String]))
)
                              
 
// @LINE:8
def index() = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq())
)
                              

                      
    
}
                            

// @LINE:19
class ReverseAssets {
    


 
// @LINE:19
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            
}
                    
                