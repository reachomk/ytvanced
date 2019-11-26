package defpackage;

import java.util.Collections;
import java.util.Set;

/* renamed from: yje */
final /* synthetic */ class yje implements bbnw {
    private final yir a;
    private final amqp b;
    private final boolean c;
    private final yjd d;
    private final String e;
    private final bbmo f;

    yje(yir yir, amqp amqp, boolean z, yjd yjd, String str, bbmo bbmo) {
        this.a = yir;
        this.b = amqp;
        this.c = z;
        this.d = yjd;
        this.e = str;
        this.f = bbmo;
    }

    public final void accept(Object obj) {
        yir yir = this.a;
        amqp amqp = this.b;
        boolean z = this.c;
        yjd yjd = this.d;
        String str = this.e;
        bbmo bbmo = this.f;
        if (!amqp.a() || z) {
            Set singleton = Collections.singleton(str);
            bbmo.getClass();
            yjd.a(singleton, new yiw(bbmo));
        }
        if (amqp.a()) {
            aadq aadq = (aadq) amqp.b();
            bbms a = yir.a.d(aadq.a()).a(bbmt.a());
            Object yjb = new yjb(bbmo, aadq);
            bbow.a(yjb, "onEvent is null");
            a = new bbwq(a, yjb).a(bbmt.a());
            Object obj2 = bbod.d;
            yjb = bbod.e;
            bbow.a(obj2, "onSuccess is null");
            bbow.a(yjb, "onError is null");
            a.a(new bbpm(obj2, yjb));
        }
    }
}
