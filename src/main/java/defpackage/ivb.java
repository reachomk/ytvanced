package defpackage;

import android.text.Spanned;
import android.text.TextUtils;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.google.android.youtube.R;

/* renamed from: ivb */
final class ivb implements OnGlobalLayoutListener {
    private final /* synthetic */ ayye a;
    private final /* synthetic */ iuw b;

    ivb(iuw iuw, ayye ayye) {
        this.b = iuw;
        this.a = ayye;
    }

    public final void onGlobalLayout() {
        arml arml;
        ayye ayye = this.a;
        if ((ayye.a & 8) != 0) {
            arml = ayye.d;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        Spanned a = ajqy.a(arml);
        if (!TextUtils.isEmpty(a)) {
            int lineCount = this.b.i.getLineCount();
            iuw iuw = this.b;
            iuw.c.a(a, R.id.author).setLines(iuw.b - lineCount);
        }
        this.b.h.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
