package defpackage;

import android.text.TextPaint;
import android.view.View;

/* renamed from: sqf */
final class sqf extends czw {
    private final bdge a;
    private final swf b;

    sqf(bdge bdge, swf swf) {
        this.a = bdge;
        this.b = swf;
    }

    public final void onClick(View view) {
        azsr azsr = this.a.d;
        if (azsr != null) {
            this.b.a(azsr.toByteArray(), skh.g().a(view).a()).c();
        }
    }

    public final boolean a(View view) {
        azsr azsr = this.a.e;
        if (azsr == null) {
            return false;
        }
        this.b.a(azsr.toByteArray(), skh.g().a(view).a()).c();
        return true;
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
