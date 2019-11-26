package defpackage;

import android.graphics.Color;
import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* renamed from: ajqx */
final class ajqx extends CharacterStyle {
    private static final ajqt a = ajra.a;
    private static final int b = Color.argb(137, 0, 0, 0);
    private static final int c = Color.argb(179, 255, 255, 255);

    ajqx() {
    }

    public final void updateDrawState(TextPaint textPaint) {
        int color = textPaint.getColor() | -16777216;
        if (color == -16777216) {
            textPaint.setColor(b);
        } else if (color == -1) {
            textPaint.setColor(c);
        }
    }

    static synchronized ajqt a() {
        ajqt ajqt;
        synchronized (ajqx.class) {
            ajqt = a;
        }
        return ajqt;
    }
}
