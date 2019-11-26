package defpackage;

import android.graphics.drawable.ColorDrawable;
import com.google.android.youtube.R;

/* renamed from: kii */
final /* synthetic */ class kii implements Runnable {
    private final kig a;

    kii(kig kig) {
        this.a = kig;
    }

    public final void run() {
        kig kig = this.a;
        kih kih = kig.a;
        akko akko = kih.c;
        if (akko == null) {
            kih.b.setImageDrawable(new ColorDrawable(xwe.a(kih.a, R.attr.ytIcon1, 0)));
        } else {
            kih.b.setImageResource(akko.c());
        }
        kig.a.b.invalidate();
    }
}
