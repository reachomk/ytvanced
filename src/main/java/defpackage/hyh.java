package defpackage;

import android.view.View;

/* renamed from: hyh */
public final class hyh extends hyd implements ejc, hyc {
    private final eif b;
    private final hyc c;
    private final hyc d;
    private final hye e = new hyk(this);
    private hyc f;

    private hyh(eif eif, hyc hyc, hyc hyc2) {
        this.b = (eif) amqw.a((Object) eif);
        this.c = (hyc) amqw.a((Object) hyc);
        this.d = (hyc) amqw.a((Object) hyc2);
        a();
    }

    public final boolean c() {
        return this.f.c();
    }

    public final void onClick(View view) {
        this.f.onClick(view);
    }

    public final boolean onLongClick(View view) {
        return this.f.onLongClick(view);
    }

    public final void a(ejd ejd, ejd ejd2) {
        a();
    }

    private final void a() {
        hyc hyc;
        if (this.b.c().g()) {
            hyc = this.d;
        } else {
            hyc = this.c;
        }
        hyc hyc2 = this.f;
        if (hyc2 != hyc) {
            if (hyc2 != null) {
                hyc2.b(this.e);
            }
            this.f = hyc;
            hyc.a(this.e);
            a(hyc.c());
        }
    }

    public static hyh a(eif eif, hyc hyc, hyc hyc2) {
        hyh hyh = new hyh(eif, hyc, hyc2);
        eif.a(hyh);
        return hyh;
    }

    public final /* bridge */ /* synthetic */ void b(hye hye) {
        super.b(hye);
    }

    public final /* bridge */ /* synthetic */ void a(hye hye) {
        super.a(hye);
    }
}
