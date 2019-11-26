package defpackage;

import android.app.Activity;
import android.view.ViewGroup;

/* renamed from: lbo */
final /* synthetic */ class lbo implements akox {
    private final Activity a;
    private final aaas b;
    private final kwy c;

    lbo(Activity activity, aaas aaas, kwy kwy) {
        this.a = activity;
        this.b = aaas;
        this.c = kwy;
    }

    public final akot a(ViewGroup viewGroup) {
        return new kww(this.a, this.b, this.c, viewGroup);
    }
}
