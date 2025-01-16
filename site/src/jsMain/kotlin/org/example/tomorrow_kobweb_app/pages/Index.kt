package org.example.tomorrow_kobweb_app.pages

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row

import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.navigation.BasePath.Companion.value
import com.varabyte.kobweb.silk.components.icons.fa.FaDog
import com.varabyte.kobweb.silk.components.icons.fa.FaFaceSmile
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.icons.fa.IconStyle
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.attributes.placeholder
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Input
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Page
@Composable
fun HomePage() {
//    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
//        Text("THIS PAGE INTENTIONALLY LEFT BLANK")
//    }
    var name by remember { mutableStateOf("") }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            P(attrs = Modifier
                .fontSize(40.px)
                .toAttrs()
            ) {
                Text(value = "Tomorrow Customer Number")
            }
        }
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            FaDog( // Fa = Font Awesome
                modifier = Modifier.margin(right = 40.px),
                size = IconSize.X7,
            )
//            FaFaceSmile(
//                modifier = Modifier.margin(right = 10.px),
//                style = IconStyle.OUTLINE,
//                size = IconSize.XXL,
//            )
            P(attrs = Modifier // P = HTML Paragraph
                .fontSize(40.px)
                .toAttrs()
            ) {
                    Text(value = "This is $name")
            }
        }
        Input(
            type = InputType.Text,
            attrs = Modifier
                .padding(topBottom = 10.px, leftRight = 20.px)
                .fontSize(20.px)
                .toAttrs {
                    placeholder(value = "Enter your name")
                    onInput { name = it.value }
                }
        )
    }
}