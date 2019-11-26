package defpackage;

import android.app.Activity;
import android.view.ViewGroup;

/* renamed from: iug */
public final class iug implements akox {
    private final Activity a;
    private final aaas b;
    private final akvp c;

    public iug(Activity activity, aaas aaas, akvp akvp) {
        this.a = activity;
        this.b = aaas;
        this.c = akvp;
    }

    /* renamed from: b */
    public final iuh a(ViewGroup viewGroup) {
        return new iuh(this.a, this.b, viewGroup, this.c);
    }
}
