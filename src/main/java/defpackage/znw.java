package defpackage;

import android.graphics.Color;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: znw */
public final class znw {
    public static final Map a = new EnumMap(babk.class);
    public static final Map b = new EnumMap(babk.class);
    public final acum c;

    public znw(acum acum) {
        this.c = acum;
    }

    public static int a(aocv aocv) {
        return aocv != null ? Color.argb((int) aocv.e, (int) aocv.b, (int) aocv.c, (int) aocv.d) : 0;
    }

    static {
        a.put(babk.CLASSIC, ayzg.TEXT_STICKER_FONT_NAME_CLASSIC);
        a.put(babk.LIGHT, ayzg.TEXT_STICKER_FONT_NAME_LIGHT);
        a.put(babk.HEAVY, ayzg.TEXT_STICKER_FONT_NAME_HEAVY);
        a.put(babk.MARKER, ayzg.TEXT_STICKER_FONT_NAME_MARKER);
        a.put(babk.BRUSH, ayzg.TEXT_STICKER_FONT_NAME_BRUSH);
        a.put(babk.TYPEWRITER, ayzg.TEXT_STICKER_FONT_NAME_TYPEWRITER);
        b.put(babk.CLASSIC, ayzi.TEXT_STICKER_FONT_STYLE_ROBOTO);
        b.put(babk.LIGHT, ayzi.TEXT_STICKER_FONT_STYLE_QUICK_SAND_REGULAR);
        b.put(babk.HEAVY, ayzi.TEXT_STICKER_FONT_STYLE_OSWALD_BOLD);
        b.put(babk.MARKER, ayzi.TEXT_STICKER_FONT_STYLE_PERMANENT_MARKER);
        b.put(babk.BRUSH, ayzi.TEXT_STICKER_FONT_STYLE_TEXT_PACIFICO);
        b.put(babk.TYPEWRITER, ayzi.TEXT_STICKER_FONT_STYLE_TEXT_CUTIVE);
    }
}
