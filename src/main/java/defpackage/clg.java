package defpackage;

import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;

/* renamed from: clg */
final class clg {
    public static StaticLayout a(CharSequence charSequence, int i, TextPaint textPaint, int i2, Alignment alignment, float f, float f2, boolean z, TruncateAt truncateAt, int i3, int i4, yy yyVar) {
        try {
            return clh.a(charSequence, i, textPaint, i2, alignment, f, f2, z, truncateAt, i3, i4, yyVar);
        } catch (LinkageError unused) {
            return new StaticLayout(charSequence, 0, i, textPaint, i2, alignment, f, f2, z, truncateAt, i3);
        }
    }
}
