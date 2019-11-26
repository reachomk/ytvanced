package defpackage;

import android.graphics.Typeface;

/* renamed from: hm */
final class hm extends ry {
    private final /* synthetic */ hp a;
    private final /* synthetic */ hn b;

    hm(hn hnVar, hp hpVar) {
        this.b = hnVar;
        this.a = hpVar;
    }

    public final void a(Typeface typeface) {
        hn hnVar = this.b;
        hnVar.h = Typeface.create(typeface, hnVar.c);
        this.b.l = true;
        this.a.a(this.b.h);
    }

    public final void a() {
        this.b.l = true;
        this.a.a();
    }
}
