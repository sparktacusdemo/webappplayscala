/** Defining a form ***/

package controllers

object UserForm {
  import play.api.data.Forms._
  import play.api.data.Form


  /**
   * A form processing DTO that maps to the form below.
   *
   * Using a class specifically for form binding reduces the chances
   * of a parameter tampering attack and makes code clearer.
   */
  case class UserData(name: String, age: Int, email: String, sex: Option[String])

  /**
   * The form definition for the "create a widget" form.
   * It specifies the form fields and their types,
   * as well as how to convert from a Data to form data and vice versa.
   */



  val form = Form(
    mapping(
      "name" -> nonEmptyText,
      "age" -> number(min = 0, max = 85632),
      "email" -> text,
      "sex" -> optional(text)
    )(UserData.apply)(UserData.unapply)
  )
}
