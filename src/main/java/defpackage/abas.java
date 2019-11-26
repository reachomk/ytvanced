package defpackage;

import java.util.ArrayList;

/* renamed from: abas */
public final class abas extends aaml {
    public boolean a;
    public boolean b;
    public boolean c;
    private boolean d;
    private boolean e;
    private final ArrayList p = new ArrayList();

    public abas(aamd aamd, afpt afpt) {
        super("live/get_broadcast_status", aamd, afpt);
        g();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
    }

    public final void n() {
        this.e = true;
    }

    public final void o() {
        this.d = true;
    }

    public final void c(String str) {
        xvd.a(str);
        this.p.add(str);
    }

    public final /* synthetic */ anzd c() {
        asqc asqc = (asqc) aspz.i.createBuilder();
        boolean z = this.a;
        asqc.copyOnWrite();
        aspz aspz = (aspz) asqc.instance;
        aspz.a |= 4;
        aspz.c = z;
        z = this.d;
        asqc.copyOnWrite();
        aspz = (aspz) asqc.instance;
        aspz.a |= 8;
        aspz.d = z;
        z = this.e;
        asqc.copyOnWrite();
        aspz = (aspz) asqc.instance;
        aspz.a |= 16;
        aspz.f = z;
        z = this.c;
        asqc.copyOnWrite();
        aspz = (aspz) asqc.instance;
        aspz.a |= 64;
        aspz.h = z;
        z = this.b;
        asqc.copyOnWrite();
        aspz = (aspz) asqc.instance;
        aspz.a |= 32;
        aspz.g = z;
        if (!this.p.isEmpty()) {
            ArrayList arrayList = this.p;
            asqc.copyOnWrite();
            aspz = (aspz) asqc.instance;
            if (!aspz.e.a()) {
                aspz.e = anxl.mutableCopy(aspz.e);
            }
            anvf.addAll(arrayList, aspz.e);
        }
        return asqc;
    }
}
