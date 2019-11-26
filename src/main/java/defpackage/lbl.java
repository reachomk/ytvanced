package defpackage;

import android.app.Activity;
import android.view.ViewGroup;

/* renamed from: lbl */
final /* synthetic */ class lbl implements akox {
    private final Activity a;
    private final akzb b;
    private final lbs c;

    lbl(Activity activity, akzb akzb, lbs lbs) {
        this.a = activity;
        this.b = akzb;
        this.c = lbs;
    }

    public final akot a(ViewGroup viewGroup) {
        return new kfb(this.a, this.b, new lbq(this.c));
    }
}
