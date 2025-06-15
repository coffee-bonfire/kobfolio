package org.tech.portfolio.components.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.filter
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Br
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H2
import org.tech.portfolio.SubheadlineTextStyle
import org.tech.portfolio.components.styles.SectionDescriptionStyle
import org.tech.portfolio.components.utils.getAllProjects
import org.tech.portfolio.components.widgets.RoundedImage
import org.tech.portfolio.components.widgets.SectionTitle

@OptIn(ExperimentalComposeWebApi::class)
@Composable
fun Work(){
    Column(
        Modifier.fillMaxSize().fillMaxWidth().textAlign(TextAlign.Center).margin(top = 5.cssRem),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        SectionTitle("Works")
        Div(
            SubheadlineTextStyle.toModifier().margin(top = 20.px).toAttrs()
        ) {
            SpanText(
                text = "Here is an application I created.",
                modifier = SectionDescriptionStyle.toModifier()
                    .textAlign(TextAlign.Center)
                    .color(
                        when (ColorMode.current) {
                            ColorMode.LIGHT -> Colors.Gray
                            ColorMode.DARK -> Colors.DimGray
                        }
                    )
            )
        }

        SimpleGrid(
            numColumns = numColumns(base = 1, sm = 2, md = 3),
            modifier = Modifier.fillMaxWidth().margin(top = 3.cssRem, bottom = 6.cssRem)
        ) {
            val allProjects = getAllProjects()

            repeat(allProjects.size) {
                val project = allProjects[it]
                RoundedImage(
                    src = project.first,
                    navigateTo = project.second
                )
            }

            Box(
                modifier = Modifier.fillMaxSize().padding(topBottom = 50.px),
                contentAlignment = Alignment.Center
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Link(
                        path = "https://github.com/coffee-bonfire?tab=repositories",
                        text = "More on GitHub.",
                        modifier = Modifier
                            .color(
                                when (ColorMode.current) {
                                    ColorMode.LIGHT -> Color.rgb(0x7b5544)
                                    ColorMode.DARK -> Color.rgb(0xe9e1dd)
                                }
                            )
                            .margin(right = 4.px)
                    )
                    val isLight = when (ColorMode.current) {
                        ColorMode.LIGHT -> false
                        ColorMode.DARK -> true
                    }

                    Image(
                        src = "/north_east_24dp_1F1F1F.svg",
                        alt = "Profile Logo",
                        modifier = Modifier
                            .styleModifier { filter { if (isLight) invert(1) else invert(0) } }
                    )
                }
            }
        }
    }
}