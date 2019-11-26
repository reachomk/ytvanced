package defpackage;

import android.app.Activity;
import android.view.ViewGroup;

/* renamed from: ews */
public final class ews implements akox {
    private final Activity a;
    private final aaas b;
    private final akkq c;
    private final akzb d;

    public ews(Activity activity, akkq akkq, akzb akzb, aaas aaas) {
        this.a = activity;
        this.c = akkq;
        this.b = aaas;
        this.d = akzb;
    }

    public final /* synthetic */ akot a(ViewGroup viewGroup) {
        return new ewp(this.a, this.c, this.b, this.d, viewGroup);
    }
}
