package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: aapi */
public final class aapi extends aaml {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public long c;
    public long d;
    public int e;
    public float p;
    public int q;
    private final List r = new ArrayList();
    private final List s = new ArrayList();

    public aapi(aamd aamd, afpt afpt) {
        super("offline/auto_offline", aamd, afpt);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        boolean z = true;
        amqw.a(this.c >= 0);
        amqw.a(this.d >= 0);
        amqw.a(this.e >= 0);
        float f = this.p;
        boolean z2 = f >= 0.0f && f <= 1.0f;
        amqw.a(z2);
        if (this.q < 0) {
            z = false;
        }
        amqw.a(z);
    }

    public final /* synthetic */ anzd c() {
        asat asat = (asat) asaq.l.createBuilder();
        long j = this.c;
        asat.copyOnWrite();
        asaq asaq = (asaq) asat.instance;
        asaq.a |= 2;
        asaq.c = j;
        j = this.d;
        asat.copyOnWrite();
        asaq = (asaq) asat.instance;
        asaq.a |= 4;
        asaq.d = j;
        int i = this.e;
        asat.copyOnWrite();
        asaq asaq2 = (asaq) asat.instance;
        asaq2.a |= 8;
        asaq2.e = i;
        float f = this.p;
        asat.copyOnWrite();
        asaq2 = (asaq) asat.instance;
        asaq2.a |= 16;
        asaq2.f = f;
        i = this.q;
        asat.copyOnWrite();
        asaq2 = (asaq) asat.instance;
        asaq2.a |= 32;
        asaq2.g = i;
        List list = this.r;
        asat.copyOnWrite();
        asaq2 = (asaq) asat.instance;
        if (!asaq2.h.a()) {
            asaq2.h = anxl.mutableCopy(asaq2.h);
        }
        anvf.addAll(list, asaq2.h);
        list = this.a;
        asat.copyOnWrite();
        asaq2 = (asaq) asat.instance;
        if (!asaq2.i.a()) {
            asaq2.i = anxl.mutableCopy(asaq2.i);
        }
        anvf.addAll(list, asaq2.i);
        list = this.b;
        asat.copyOnWrite();
        asaq2 = (asaq) asat.instance;
        if (!asaq2.j.a()) {
            asaq2.j = anxl.mutableCopy(asaq2.j);
        }
        anvf.addAll(list, asaq2.j);
        list = this.s;
        asat.copyOnWrite();
        asaq2 = (asaq) asat.instance;
        if (!asaq2.k.a()) {
            asaq2.k = anxl.mutableCopy(asaq2.k);
        }
        anvf.addAll(list, asaq2.k);
        return asat;
    }
}
