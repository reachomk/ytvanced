package defpackage;

import android.os.Handler;
import android.text.TextUtils;
import android.view.View;

/* renamed from: wfe */
public final class wfe {
    public final int[] a = new int[2];
    private final Handler b;

    public wfe(Handler handler) {
        this.b = (Handler) amqw.a((Object) handler);
    }

    public final albo a(String str, int i, View view) {
        if (!TextUtils.isEmpty(str)) {
            albo b;
            if (str != null) {
                alcf alcf = new alcf(view);
                alcf.a = 1;
                alcf.a();
                alcf.c = str;
                alcf.j = i;
                alcf.k = true;
                b = alcf.b();
            } else {
                b = null;
            }
            if (b != null) {
                b.b();
                b.a(new wfd(b));
                this.b.postDelayed(new wfg(b), 5000);
                b.d();
                view.getLocationOnScreen(this.a);
                view.getViewTreeObserver().addOnPreDrawListener(new wff(this, b, view));
                return b;
            }
        }
        return null;
    }
}
