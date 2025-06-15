package org.tech.portfolio.components.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Br
import org.jetbrains.compose.web.dom.Div
import org.tech.portfolio.SubheadlineTextStyle
import org.tech.portfolio.components.styles.UserNameStyle
import org.tech.portfolio.components.styles.UsersMessageStyle

@Composable
fun Home() {
    Column(
        Modifier.fillMaxSize().fillMaxWidth().textAlign(TextAlign.Center),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Div(
            SubheadlineTextStyle.toModifier().margin(top = 20.px).toAttrs()
        ) {
            SpanText(
                text = "Hello, I'm",
                modifier = UsersMessageStyle.toModifier()
                    .color(
                        when (ColorMode.current) {
                            ColorMode.LIGHT -> Colors.Gray
                            ColorMode.DARK -> Colors.DimGray
                        }
                    )
            )
            Br {

            }
            SpanText(
                text = "Sota.",
                modifier = UserNameStyle.toModifier()
                    .color(
                        when (ColorMode.current) {
                            ColorMode.LIGHT -> Color.rgb(0x7b5544)
                            ColorMode.DARK -> Color.rgb(0xe9e1dd)
                        }
                    )
                    .fontWeight(FontWeight.Bold).fontSize(70.px)
            )
            Br {

            }
            SpanText(
                text = "I’m currently working on Android and AWS",
                modifier = UsersMessageStyle.toModifier()
                    .color(
                        when (ColorMode.current) {
                            ColorMode.LIGHT -> Colors.Gray
                            ColorMode.DARK -> Colors.DimGray
                        }
                    )
            )
        }

    }
}