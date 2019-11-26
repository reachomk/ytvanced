package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: jta */
public final class jta implements akox {
    private final Context a;
    private final aaas b;
    private final akkq c;
    private final akvo d;

    public jta(Context context, aaas aaas, akkq akkq, akvo akvo) {
        this.a = context;
        this.b = aaas;
        this.c = akkq;
        this.d = akvo;
    }

    public final /* synthetic */ akot a(ViewGroup viewGroup) {
        return new jsy(this.a, this.b, this.c, this.d, viewGroup);
    }
}
