// @SOURCE:/home/sas/Ubuntu One/apps/backbone/winews/conf/routes
// @HASH:c8dd0efcf0d9fc75268afcae9305cd4baf2ef0a6
// @DATE:Tue Aug 14 01:33:22 ART 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {


// @LINE:5
val controllers_Application_options0 = Route("OPTIONS", PathPattern(List(StaticPart("/"),DynamicPart("url", """.+"""))))
                    

// @LINE:8
val controllers_Application_index1 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:10
val controllers_Wines_list2 = Route("GET", PathPattern(List(StaticPart("/wines"))))
                    

// @LINE:11
val controllers_Wines_count3 = Route("GET", PathPattern(List(StaticPart("/wines/count"))))
                    

// @LINE:12
val controllers_Wines_update4 = Route("PUT", PathPattern(List(StaticPart("/wines/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:13
val controllers_Wines_save5 = Route("POST", PathPattern(List(StaticPart("/wines/"))))
                    

// @LINE:14
val controllers_Wines_save6 = Route("POST", PathPattern(List(StaticPart("/wines"))))
                    

// @LINE:15
val controllers_Wines_show7 = Route("GET", PathPattern(List(StaticPart("/wines/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:16
val controllers_Wines_delete8 = Route("DELETE", PathPattern(List(StaticPart("/wines/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:19
val controllers_Assets_at9 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""OPTIONS""","""/$url<.+>""","""controllers.Application.options(url:String)"""),("""GET""","""/""","""controllers.Application.index"""),("""GET""","""/wines""","""controllers.Wines.list"""),("""GET""","""/wines/count""","""controllers.Wines.count"""),("""PUT""","""/wines/$id<[^/]+>""","""controllers.Wines.update(id:Long)"""),("""POST""","""/wines/""","""controllers.Wines.save"""),("""POST""","""/wines""","""controllers.Wines.save"""),("""GET""","""/wines/$id<[^/]+>""","""controllers.Wines.show(id:Long)"""),("""DELETE""","""/wines/$id<[^/]+>""","""controllers.Wines.delete(id:Long)"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:5
case controllers_Application_options0(params) => {
   call(params.fromPath[String]("url", None)) { (url) =>
        invokeHandler(_root_.controllers.Application.options(url), HandlerDef(this, "controllers.Application", "options", Seq(classOf[String])))
   }
}
                    

// @LINE:8
case controllers_Application_index1(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.index, HandlerDef(this, "controllers.Application", "index", Nil))
   }
}
                    

// @LINE:10
case controllers_Wines_list2(params) => {
   call { 
        invokeHandler(_root_.controllers.Wines.list, HandlerDef(this, "controllers.Wines", "list", Nil))
   }
}
                    

// @LINE:11
case controllers_Wines_count3(params) => {
   call { 
        invokeHandler(_root_.controllers.Wines.count, HandlerDef(this, "controllers.Wines", "count", Nil))
   }
}
                    

// @LINE:12
case controllers_Wines_update4(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Wines.update(id), HandlerDef(this, "controllers.Wines", "update", Seq(classOf[Long])))
   }
}
                    

// @LINE:13
case controllers_Wines_save5(params) => {
   call { 
        invokeHandler(_root_.controllers.Wines.save, HandlerDef(this, "controllers.Wines", "save", Nil))
   }
}
                    

// @LINE:14
case controllers_Wines_save6(params) => {
   call { 
        invokeHandler(_root_.controllers.Wines.save, HandlerDef(this, "controllers.Wines", "save", Nil))
   }
}
                    

// @LINE:15
case controllers_Wines_show7(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Wines.show(id), HandlerDef(this, "controllers.Wines", "show", Seq(classOf[Long])))
   }
}
                    

// @LINE:16
case controllers_Wines_delete8(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Wines.delete(id), HandlerDef(this, "controllers.Wines", "delete", Seq(classOf[Long])))
   }
}
                    

// @LINE:19
case controllers_Assets_at9(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                