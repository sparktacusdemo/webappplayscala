package controllers

import javax.inject.Inject

import models.User
import play.api.data._
import play.api.i18n._
import play.api.mvc._

import scala.collection._

/**********************************************************************************************/

class UserController @Inject()(cc: MessagesControllerComponents) extends MessagesAbstractController(cc) {
  import UserForm._

  private val users = mutable.ArrayBuffer(
    User("foo646", 18,"foo@gmail.com", Some("F")),
    User("foo111", 15,"foo2@gmail.com", Some("M"))
  )
/* url to the User */
private val postUrl = routes.UserController.createUser()

  def indexuser = Action {
    Ok(views.html.indexuser())
  }

  def listUsers = Action { implicit request: MessagesRequest[AnyContent] =>
    // Pass an unpopulated form to the template
    Ok(views.html.listUsers(users.toSeq, form, postUrl))
  }
  def createUser = Action { implicit request: MessagesRequest[AnyContent] =>
    val errorFunction = { formWithErrors: Form[UserData] =>
      BadRequest(views.html.listUsers(users.toSeq, formWithErrors, postUrl))
    }

    val successFunction = { data: UserData =>
      // This is the good case, where the form was successfully parsed as a Data object.
      val user = User(name = data.name, age = data.age, email = data.email, sex = data.sex)
      users += user
      Redirect(routes.UserController.listUsers()).flashing("info" -> "user added!")
    }

    val formValidationResult = form.bindFromRequest
    formValidationResult.fold(errorFunction, successFunction)
  }

}
