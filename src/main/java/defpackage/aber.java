package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: aber */
public final class aber extends aaml {
    public boolean a;
    public boolean b;
    public int c;
    public boolean d;
    public int e;
    public int p;
    public long q;
    public long r;
    public int s = 1;
    private List t;

    public aber(aamd aamd, afpt afpt) {
        super("notification/send_device_context", aamd, afpt);
        a(zzp.b);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
    }

    public final aber a(int i, int i2) {
        if (this.t == null) {
            this.t = new ArrayList();
        }
        asln asln = (asln) aslk.d.createBuilder();
        asln.copyOnWrite();
        aslk aslk = (aslk) asln.instance;
        aslk.a |= 1;
        aslk.b = i;
        asln.copyOnWrite();
        aslk aslk2 = (aslk) asln.instance;
        aslk2.a |= 2;
        aslk2.c = i2;
        this.t.add((aslk) ((anxl) asln.build()));
        return this;
    }

    public final /* synthetic */ anzd c() {
        aslp aslp = (aslp) aslm.d.createBuilder();
        asll asll = (asll) asli.l.createBuilder();
        boolean z = this.a;
        asll.copyOnWrite();
        asli asli = (asli) asll.instance;
        asli.a |= 1;
        asli.b = z;
        z = this.b;
        asll.copyOnWrite();
        asli = (asli) asll.instance;
        asli.a |= 4;
        asli.d = z;
        int i = this.c;
        asll.copyOnWrite();
        asli = (asli) asll.instance;
        asli.a |= 2;
        asli.c = i;
        z = this.d;
        asll.copyOnWrite();
        asli = (asli) asll.instance;
        asli.a |= 16;
        asli.e = z;
        i = this.e;
        asll.copyOnWrite();
        asli = (asli) asll.instance;
        asli.a |= 32;
        asli.f = i;
        i = this.p;
        asll.copyOnWrite();
        asli = (asli) asll.instance;
        asli.a |= 64;
        asli.g = i;
        long j = this.r;
        asll.copyOnWrite();
        asli asli2 = (asli) asll.instance;
        asli2.a |= 1024;
        asli2.h = j;
        j = this.q;
        asll.copyOnWrite();
        asli2 = (asli) asll.instance;
        asli2.a |= 2048;
        asli2.i = j;
        i = this.s;
        asll.copyOnWrite();
        asli = (asli) asll.instance;
        if (i != 0) {
            asli.a |= 4096;
            asli.j = i - 1;
            List list = this.t;
            if (list != null) {
                asll.copyOnWrite();
                asli = (asli) asll.instance;
                if (!asli.k.a()) {
                    asli.k = anxl.mutableCopy(asli.k);
                }
                anvf.addAll(list, asli.k);
            }
            asli asli3 = (asli) ((anxl) asll.build());
            aslp.copyOnWrite();
            aslm aslm = (aslm) aslp.instance;
            if (asli3 != null) {
                aslm.c = asli3;
                aslm.a |= 2;
                return aslp;
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }
}
