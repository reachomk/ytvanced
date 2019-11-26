package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: iwt */
final class iwt {
    private final Context a;
    private final aaas b;
    private final akkq c;
    private final akzb d;
    private final akvp e;
    private final est f;
    private final eur g;
    private final alax h;

    public iwt(Context context, aaas aaas, akkq akkq, alax alax, akzb akzb, akvp akvp, est est, eur eur) {
        this.a = context;
        this.b = aaas;
        this.c = akkq;
        this.h = alax;
        this.d = akzb;
        this.e = akvp;
        this.f = est;
        this.g = eur;
    }

    public final iwo a(ViewGroup viewGroup, int i) {
        if (i == 2) {
            return new iws(this.a, this.b, this.c, this.h, this.d, this.e, this.f, this.g, viewGroup);
        }
        return new iwq(this.a, this.b, this.c, this.h, this.d, this.e, this.f, this.g, viewGroup);
    }
}
