package org.tech.portfolio.components.widgets

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.CSSLengthNumericValue
import com.varabyte.kobweb.compose.css.CSSLengthOrPercentageNumericValue
import com.varabyte.kobweb.compose.css.MixBlendMode
import com.varabyte.kobweb.compose.css.functions.LinearGradient
import com.varabyte.kobweb.compose.css.functions.linearGradient
import com.varabyte.kobweb.compose.css.mixBlendMode
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.BoxScope
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundImage
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.styleModifier
import org.jetbrains.compose.web.css.CSSColorValue
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.rgba
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.silk.theme.colors.ColorMode

@Composable
fun GlassBox(
    modifier: Modifier = Modifier,
    roundedCorners: CSSLengthOrPercentageNumericValue = 10.px,
    borderWidth: CSSLengthNumericValue = 1.px,
    borderStyle: LineStyle = LineStyle.Solid,
    borderColor: CSSColorValue = when (ColorMode.current) {
        ColorMode.LIGHT -> Color.Companion.rgb(0xE9E9E9)
        ColorMode.DARK -> Color.Companion.rgb(0x4E4E4E)
    },
    gradientDirection: LinearGradient.Direction = LinearGradient.Direction.ToBottomRight,
    startColor: CSSColorValue = rgba(r = 255, g = 255, b = 255, a = 0),
    endColor: CSSColorValue = rgba(r = 255, g = 255, b = 255, a = 0.06),
    blendMode: MixBlendMode = MixBlendMode.Normal,
    content: @Composable BoxScope.() -> Unit
) {

    Box(
        modifier = Modifier.margin(leftRight = 1.cssRem).then(modifier),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .margin(leftRight = 1.cssRem)
                .borderRadius(roundedCorners)
                .border(width = borderWidth, style = borderStyle, color = borderColor)
                .styleModifier {
                    mixBlendMode(blendMode)
                }
                .backgroundImage(
                    linearGradient(
                        gradientDirection,
                        startColor,
                        endColor
                    )
                )
        )
        content()
    }
}