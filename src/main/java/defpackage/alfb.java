package defpackage;

import android.content.Context;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.List;

/* renamed from: alfb */
public final class alfb extends aktw implements algm, allj, almi, almu, almv {
    private final aata a;
    private final Context b;
    private final akkq c;
    private final aaas d;
    private final akvp e;
    private final alfc f;
    private final akpk g = new akpk();
    private final List h = new ArrayList();
    private final allh i;
    private final acvx j;
    private final akpe k;

    public alfb(aata aata, Context context, akkq akkq, aaas aaas, akvp akvp, alfc alfc, allh allh, acvx acvx, akpe akpe) {
        this.a = (aata) amqw.a((Object) aata);
        this.b = (Context) amqw.a((Object) context);
        this.c = (akkq) amqw.a((Object) akkq);
        this.d = (aaas) amqw.a((Object) aaas);
        this.e = (akvp) amqw.a((Object) akvp);
        this.f = (alfc) amqw.a((Object) alfc);
        this.i = (allh) amqw.a((Object) allh);
        this.j = (acvx) amqw.a((Object) acvx);
        this.k = (akpe) amqw.a((Object) akpe);
        d();
        allh.a((allj) this);
    }

    public final void b() {
    }

    public final void b(boolean z) {
    }

    public final void a(allh allh) {
        List list = allh.b;
        int i = 0;
        if (!(list == null || list.isEmpty() || amqq.a(this.a.a(), list))) {
            aata aata = this.a;
            aata.b.clear();
            aata.b.addAll(list);
            i = 1;
        }
        for (Object next : this.a.a()) {
            if (next instanceof aqjo) {
                ArrayList arrayList = new ArrayList();
                List a = aatc.a((aqjo) next);
                for (Object next2 : a) {
                    if (!allh.a(alpt.a(next2))) {
                        arrayList.add(next2);
                    }
                }
                i |= a.removeAll(arrayList);
            }
        }
        if (i != 0) {
            this.g.a();
        }
        f();
    }

    private final void d() {
        e();
        this.g.add(this.a);
    }

    private final void e() {
        this.i.a();
        this.g.clear();
        f();
    }

    public final void a(boolean z) {
        if (z) {
            d();
        } else {
            e();
        }
    }

    public final void a(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (obj instanceof alfd) {
                this.h.add((alfd) obj);
            }
        }
    }

    public final void a(String str) {
        this.i.c(str);
        f();
    }

    public final void a(aatd aatd) {
        alfc alfc = this.f;
        ajtd ajtd = aatd.a;
        aqhy aqhy = aatd.b;
        this.a.c();
        this.a.d();
        alfc.a(ajtd, aqhy);
    }

    public final void a(apk apk) {
        if ((apk instanceof alpc) && this.a.e() != null) {
            alfa alfa = new alfa(apk);
            for (alfd a : this.h) {
                a.a(this.a.e(), alfa);
            }
        }
    }

    public final void a(Object obj) {
        this.i.a(alpt.a(obj), false);
    }

    public final aknh a() {
        return this.g;
    }

    public final void a(akpb akpb) {
        akpb.a(aata.class, new almj(this.b, this.c, this.d, this.e, this, this.i, this.j, this.k));
    }

    private final void f() {
        Spanned g = this.i.g();
        arwf h = this.i.h();
        int f = this.i.f();
        Long l = null;
        apxu apxu = f > 0 ? this.i.j : null;
        ajte ajte = this.a.a;
        if (ajte.h) {
            l = Long.valueOf(ajte.g);
        }
        Long l2 = l;
        for (alfd a : this.h) {
            a.a(apxu, g, h, f, l2);
        }
    }

    public final void c() {
        this.i.b((allj) this);
    }
}
