package defpackage;

import android.text.TextPaint;
import com.google.android.youtube.R;

/* renamed from: isv */
final class isv extends acwj {
    private final /* synthetic */ iss b;

    public isv(iss iss, aaas aaas, apxu apxu, String str) {
        this.b = iss;
        super(aaas, apxu, str);
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(xwe.a(this.b.a, R.attr.ytCallToAction));
    }
}
