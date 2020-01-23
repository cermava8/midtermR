package Render

import Components.{Box, Button, Dialog, InputBox, Label}

class SVGRender extends RenderService {

    override def renderComponent(box: Box): String = box match {
        case Button(text, dimension) => {

            private val buttonBuilder: StringBuilder = new StringBuilder
            buttonBuilder.addAll("<rect ")
            buttonBuilder.addAll("height =").add(dimension.height)

            //todo

            buttonBuilder.toString

        }
        case InputBox(dimension) => {

        }
        case Label(text,x,y,fontSize) => {

        }
    }

    override def renderDialog(dialog: Dialog): String = {
        val stringBuilder: StringBuilder = new StringBuilder

        dialog.components.foreach({
            component => stringBuilder.addAll(renderComponent(component))
        })

        stringBuilder.toString()
    }
}
