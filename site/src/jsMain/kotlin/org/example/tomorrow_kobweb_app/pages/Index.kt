package org.example.tomorrow_kobweb_app.pages

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.foundation.layout.Column

import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.Page
import org.jetbrains.compose.web.attributes.AttrsScopeBuilder
import org.jetbrains.compose.web.css.height
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.width
import org.jetbrains.compose.web.dom.Iframe
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text
import org.w3c.dom.HTMLIFrameElement


@Page
@Composable
fun HomePage() {
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        P(attrs = Modifier.fontSize(40.px).toAttrs()) {
            Text(value = "Tomorrow Dashboard")
        }

        Iframe(
            attrs = {
                attr("src", "/customer_plot.html")
                style {
                    width(650.px)
                    height(450.px)
                }
            }
        )
    }
}


//fun AttrsScopeBuilder<HTMLIFrameElement>.src(value: String) {
//    attr("src", value)
//}
