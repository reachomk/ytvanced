package defpackage;

import android.app.Activity;
import android.view.ViewGroup;

/* renamed from: iua */
public final class iua implements akox {
    private final Activity a;
    private final iug b;
    private final bcaa c;
    private final ivd d;

    public iua(Activity activity, iug iug, bcaa bcaa, ivd ivd) {
        this.a = activity;
        this.b = iug;
        this.c = bcaa;
        this.d = ivd;
    }

    public final /* synthetic */ akot a(ViewGroup viewGroup) {
        return new iub(this.a, this.b, this.c, this.d, viewGroup);
    }
}
