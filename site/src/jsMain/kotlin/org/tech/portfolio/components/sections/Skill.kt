package org.tech.portfolio.components.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.MixBlendMode
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.mixBlendMode
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px
import org.tech.portfolio.components.widgets.GlassBox
import org.tech.portfolio.components.widgets.SectionTitle

@Composable
fun Skill() {
    Column(
        Modifier.fillMaxSize().fillMaxWidth().textAlign(TextAlign.Center),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        SectionTitle("Skill & Tool")

        SimpleGrid(
            modifier = Modifier.fillMaxWidth().margin(top = 5.cssRem),
            numColumns = numColumns(base = 1, sm = 2)
        ) {
            GlassBox(
                modifier = Modifier.margin(all = 2.cssRem)
            ) {
                SimpleGrid(
                    modifier = Modifier.padding(all = 1.cssRem),
                    numColumns = numColumns(base = 2, sm = 2, md = 3, lg = 4)
                ) {
                    GlassBox(
                        modifier = Modifier.size(65.px)
                            .margin(all = 0.6.cssRem)
                    ) {
                        Image(
                            src = "https://skillicons.dev/icons?i=js",
                            modifier = Modifier.size(42.px)
                                .styleModifier {
                                    mixBlendMode(MixBlendMode.Normal)
                                }
                        )
                    }
                    GlassBox(
                        modifier = Modifier.size(65.px)
                            .margin(all = 0.6.cssRem)

                    ) {
                        Image(
                            src = "https://skillicons.dev/icons?i=html",
                            modifier = Modifier.size(42.px)
                        )
                    }
                    GlassBox(
                        modifier = Modifier.size(65.px)
                            .margin(all = 0.6.cssRem)

                    ) {
                        Image(
                            src = "https://skillicons.dev/icons?i=css",
                            modifier = Modifier.size(42.px)
                        )
                    }
                    GlassBox(
                        modifier = Modifier.size(65.px)
                            .margin(all = 0.6.cssRem)

                    ) {
                        Image(
                            src = "https://skillicons.dev/icons?i=java",
                            modifier = Modifier.size(42.px)
                        )
                    }

                    GlassBox(
                        modifier = Modifier.size(65.px)
                            .margin(all = 0.6.cssRem)

                    ) {
                        Image(
                            src = "https://skillicons.dev/icons?i=kotlin",
                            modifier = Modifier.size(42.px)
                        )
                    }
                    GlassBox(
                        modifier = Modifier.size(65.px)
                            .margin(all = 0.6.cssRem)

                    ) {
                        Image(
                            src = "https://skillicons.dev/icons?i=php",
                            modifier = Modifier.size(42.px)
                        )
                    }
                    GlassBox(
                        modifier = Modifier.size(65.px)
                            .margin(all = 0.6.cssRem)

                    ) {
                        Image(
                            src = "https://skillicons.dev/icons?i=python",
                            modifier = Modifier.size(42.px)
                        )
                    }
                    GlassBox(
                        modifier = Modifier.size(65.px)
                            .margin(all = 0.6.cssRem)

                    ) {
                        Image(
                            src = "https://skillicons.dev/icons?i=sqlite",
                            modifier = Modifier.size(42.px)
                        )
                    }
                    GlassBox(
                        modifier = Modifier.size(65.px)
                            .margin(all = 0.6.cssRem)

                    ) {
                        Image(
                            src = "https://skillicons.dev/icons?i=mysql",
                            modifier = Modifier.size(42.px)
                        )
                    }
                    GlassBox(
                        modifier = Modifier.size(65.px)
                            .margin(all = 0.6.cssRem)

                    ) {
                        Image(
                            src = "https://skillicons.dev/icons?i=gradle",
                            modifier = Modifier.size(42.px)
                        )
                    }
                    GlassBox(
                        modifier = Modifier.size(65.px)
                            .margin(all = 0.6.cssRem)

                    ) {
                        Image(
                            src = "https://skillicons.dev/icons?i=git",
                            modifier = Modifier.size(42.px)
                        )
                    }
                    GlassBox(
                        modifier = Modifier.size(65.px)
                            .margin(all = 0.6.cssRem)

                    ) {
                        Image(
                            src = "https://skillicons.dev/icons?i=linux",
                            modifier = Modifier.size(42.px)
                        )
                    }
                }
            }

            GlassBox(
                modifier = Modifier.margin(all = 2.cssRem)
            ) {
                SimpleGrid(
                    modifier = Modifier.padding(all = 1.cssRem),
                    numColumns = numColumns(base = 2, sm = 2, md = 3, lg = 4)
                ) {
                    GlassBox(
                        modifier = Modifier.size(65.px)
                            .margin(all = 0.6.cssRem)

                    ) {
                        Image(
                            src = "https://skillicons.dev/icons?i=firebase",
                            modifier = Modifier.size(42.px)
                        )
                    }
                    GlassBox(
                        modifier = Modifier.size(65.px)
                            .margin(all = 0.6.cssRem)

                    ) {
                        Image(
                            src = "https://skillicons.dev/icons?i=androidstudio",
                            modifier = Modifier.size(42.px)
                        )
                    }
                    GlassBox(
                        modifier = Modifier.size(65.px)
                            .margin(all = 0.6.cssRem)

                    ) {
                        Image(
                            src = "https://skillicons.dev/icons?i=aws",
                            modifier = Modifier.size(42.px)
                        )
                    }
                    GlassBox(
                        modifier = Modifier.size(65.px)
                            .margin(all = 0.6.cssRem)

                    ) {
                        Image(
                            src = "https://skillicons.dev/icons?i=idea",
                            modifier = Modifier.size(42.px)
                        )
                    }
                    GlassBox(
                        modifier = Modifier.size(65.px)
                            .margin(all = 0.6.cssRem)

                    ) {
                        Image(
                            src = "https://skillicons.dev/icons?i=vscode",
                            modifier = Modifier.size(42.px)
                        )
                    }
                    GlassBox(
                        modifier = Modifier.size(65.px)
                            .margin(all = 0.6.cssRem)

                    ) {
                        Image(
                            src = "https://skillicons.dev/icons?i=github",
                            modifier = Modifier.size(42.px)
                        )
                    }
                    GlassBox(
                        modifier = Modifier.size(65.px)
                            .margin(all = 0.6.cssRem)

                    ) {
                        Image(
                            src = "https://skillicons.dev/icons?i=githubactions",
                            modifier = Modifier.size(42.px)
                        )
                    }
                    GlassBox(
                        modifier = Modifier.size(65.px)
                            .margin(all = 0.6.cssRem)

                    ) {
                        Image(
                            src = "https://skillicons.dev/icons?i=postman",
                            modifier = Modifier.size(42.px)
                        )
                    }
                    GlassBox(
                        modifier = Modifier.size(65.px)
                            .margin(all = 0.6.cssRem)

                    ) {
                        Image(
                            src = "https://skillicons.dev/icons?i=pycharm",
                            modifier = Modifier.size(42.px)
                        )
                    }
                    GlassBox(
                        modifier = Modifier.size(65.px)
                            .margin(all = 0.6.cssRem)

                    ) {
                        Image(
                            src = "https://skillicons.dev/icons?i=figma",
                            modifier = Modifier.size(42.px)
                        )
                    }
                }
            }
        }
    }
}