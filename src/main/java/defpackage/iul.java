package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import android.view.ViewGroup;

/* renamed from: iul */
public final class iul implements akox {
    private final Activity a;
    private final aaas b;
    private final akkq c;
    private final SharedPreferences d;

    public iul(Activity activity, akkq akkq, aaas aaas, SharedPreferences sharedPreferences) {
        this.a = activity;
        this.c = akkq;
        this.b = aaas;
        this.d = sharedPreferences;
    }

    public final /* synthetic */ akot a(ViewGroup viewGroup) {
        return new iui(this.a, this.c, this.b, viewGroup, this.d);
    }
}
