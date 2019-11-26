package defpackage;

import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;

/* renamed from: clh */
public final class clh {
    public static StaticLayout a(CharSequence charSequence, int i, TextPaint textPaint, int i2, Alignment alignment, float f, float f2, boolean z, TruncateAt truncateAt, int i3, int i4, yy yyVar) {
        try {
            return new StaticLayout(charSequence, 0, i, textPaint, i2, alignment, clh.a(yyVar), f, f2, z, truncateAt, i3, i4);
        } catch (IllegalArgumentException e) {
            if (e.getMessage().contains("utext_close")) {
                return new StaticLayout(charSequence, 0, i, textPaint, i2, alignment, clh.a(yyVar), f, f2, z, truncateAt, i3, i4);
            }
            throw e;
        }
    }

    public static TextDirectionHeuristic a(yy yyVar) {
        if (yyVar == zb.a) {
            return TextDirectionHeuristics.LTR;
        }
        if (yyVar == zb.b) {
            return TextDirectionHeuristics.RTL;
        }
        if (yyVar == zb.c) {
            return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
        if (yyVar == zb.d) {
            return TextDirectionHeuristics.FIRSTSTRONG_RTL;
        }
        if (yyVar == zb.e) {
            return TextDirectionHeuristics.ANYRTL_LTR;
        }
        if (yyVar == zb.f) {
            return TextDirectionHeuristics.LOCALE;
        }
        return TextDirectionHeuristics.FIRSTSTRONG_LTR;
    }
}
