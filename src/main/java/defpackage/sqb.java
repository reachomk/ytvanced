package defpackage;

import android.text.TextPaint;
import android.view.View;

/* renamed from: sqb */
final class sqb extends czw {
    private final baop a;
    private final swf b;

    sqb(baop baop, swf swf) {
        this.a = baop;
        this.b = swf;
    }

    public final void onClick(View view) {
        if (this.a.c() != null) {
            this.b.a(syt.a(this.a.c()), skh.g().a(view).a()).c();
        }
    }

    public final boolean a(View view) {
        if (this.a.d() == null) {
            return false;
        }
        this.b.a(syt.a(this.a.d()), skh.g().a(view).a()).c();
        return true;
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
