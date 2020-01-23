package Render

import Components.{Box, Dialog}

trait RenderService {
    def renderComponent(box: Box) : String
    def renderDialog(dialog: Dialog) : String
}
