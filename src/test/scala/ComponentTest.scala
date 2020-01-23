import Components.{Button, Dialog, Dimension, InputBox, Label}
import org.scalatest.FunSuite

class ComponentTest extends FunSuite{
    val usernameLabel = Label("Username:", x = 90, y = 120, fontSize = 20)
    val passwordLabel = Label("Password:", x = 90, y = 180, fontSize = 20)
    val usernameInput = InputBox(Dimension(270,120,270,30))
    val passwordInput = InputBox(Dimension(270,180,270,30))
    val loginBtn = Button("Login", Dimension(90,300,150,60))
    val closeBtn = Button("Close", Dimension(360,300,150,60))
    val dialog = Dialog(
        "Login Dialog",
        List(usernameLabel, passwordLabel, usernameInput, passwordInput, loginBtn, closeBtn),
        600,
        390
    )

    test("Test some stuff"){
        //TODO
    }
}
