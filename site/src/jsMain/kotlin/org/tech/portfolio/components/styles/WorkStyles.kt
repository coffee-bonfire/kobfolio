package org.tech.portfolio.components.styles

import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint

val WorksImageStyle = CssStyle {
    base {
        Modifier.fillMaxSize()
    }
    Breakpoint.SM {
        Modifier.fillMaxSize()
    }
    Breakpoint.MD {
        Modifier.fillMaxSize()
    }
    Breakpoint.LG {
        Modifier.fillMaxSize()
    }
}

val WorksMessageStyle = CssStyle {
    base {
        Modifier.fontSize(FontSize.Medium)
    }
    Breakpoint.SM {
        Modifier.fontSize(FontSize.Large)
    }
    Breakpoint.MD {
        Modifier.fontSize(FontSize.Large)
    }
    Breakpoint.LG {
        Modifier.fontSize(FontSize.XLarge)
    }
}