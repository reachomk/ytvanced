package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import com.google.android.youtube.R;

/* renamed from: ajjp */
public enum ajjp {
    MONOSPACED_SERIF(R.string.pref_subtitles_font_monospaced_serif, 0, ajjp.a("fonts/MonoSerif-Regular.ttf")),
    PROPORTIONAL_SERIF(R.string.pref_subtitles_font_proportional_serif, 1, ajjp.a(Typeface.create("serif", 0))),
    MONOSPACED_SANS_SERIF(R.string.pref_subtitles_font_monospaced_sans_serif, 2, ajjp.a(Typeface.create("monospace", 0))),
    PROPORTIONAL_SANS_SERIF(R.string.pref_subtitles_font_proportional_sans_serif, 3, ajjp.a(Typeface.create("sans-serif", 0))),
    CASUAL(R.string.pref_subtitles_font_casual, 4, ajjp.a("fonts/ComingSoon-Regular.ttf")),
    CURSIVE(R.string.pref_subtitles_font_cursive, 5, ajjp.a("fonts/DancingScript-Regular.ttf")),
    SMALL_CAPITALS(R.string.pref_subtitles_font_small_capitals, 6, ajjp.a("fonts/CarroisGothicSC-Regular.ttf")),
    INLINE_MUTED(0, 8, new ajju(r2));
    
    public static String[] c;
    public static String[] d;
    public final int a;
    public final int b;
    private final ajjt m;
    private Typeface n;

    private static ajjt a(String str) {
        return new ajjs(str);
    }

    private static ajjt a(Typeface typeface) {
        return new ajjr(typeface);
    }

    private ajjp(int i, int i2, ajjt ajjt) {
        this.a = i;
        this.b = i2;
        this.m = ajjt;
    }

    public static int a() {
        return ajjp.values()[3].b;
    }

    public static Typeface a(int i, Context context) {
        ajjp[] values = ajjp.values();
        int i2 = 0;
        while (i2 < values.length) {
            ajjp ajjp = values[i2];
            if (ajjp.b != i) {
                i2++;
            } else {
                if (ajjp.n == null) {
                    ajjp.n = ajjp.m.a(context);
                }
                return values[i2].n;
            }
        }
        return null;
    }

    public static Typeface a(Context context, ajji ajji) {
        int i = ajji.f;
        if (i == 7) {
            return ((CaptioningManager) context.getSystemService("captioning")).getUserStyle().getTypeface();
        }
        return ajjp.a(i, context);
    }
}
