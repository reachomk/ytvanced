package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.Executor;

/* renamed from: akun */
public abstract class akun implements akww, xsu {
    public final Executor D;
    public final Object E;
    public final Map F;
    public final List G;
    public ajtf H;
    public ajtf I;
    public ajtf J;
    public Map K;
    public akut L;
    public akus M;
    private final aana a;
    private final xoi b;
    private final xci c;
    private final aand d;
    public final acvx s;

    public akun(aana aana, xci xci, xoi xoi, acvx acvx) {
        this(aana, xci, null, xoi, acvx);
    }

    public abstract Object a(ajtk ajtk);

    /* Access modifiers changed, original: protected */
    public void a(aali aali) {
    }

    public akun(aana aana, xci xci, Object obj, xoi xoi, acvx acvx) {
        this(aana, xci, obj, xoi, acvx, new xaj());
    }

    public akun(akyd akyd, aana aana, xci xci, Object obj, xoi xoi, acvx acvx) {
        this(akyd, aana, xci, obj, xoi, acvx, new xaj());
    }

    public akun(aana aana, xci xci, Object obj, xoi xoi, acvx acvx, Executor executor) {
        this(null, aana, xci, obj, xoi, acvx, executor);
    }

    private akun(akyd akyd, aana aana, xci xci, Object obj, xoi xoi, acvx acvx, Executor executor) {
        this.a = (aana) amqw.a((Object) aana);
        this.c = (xci) amqw.a((Object) xci);
        this.b = (xoi) amqw.a((Object) xoi);
        this.s = (acvx) amqw.a((Object) acvx);
        this.E = obj;
        this.K = new HashMap();
        this.D = (Executor) amqw.a((Object) executor);
        this.d = new akum(this);
        if (akyd instanceof akuw) {
            akuw akuw = (akuw) akyd;
            this.F = akuw.a;
            this.J = akuw.b;
            this.G = akuw.c;
            this.I = akuw.d;
        } else {
            this.F = new HashMap();
            this.G = new ArrayList();
            this.I = null;
        }
        for (byte[] a : this.G) {
            acvx.a(a);
        }
    }

    private final void a(Object obj) {
        Object obj2 = this.E;
        if (obj2 != null) {
            this.c.a(obj2, obj, false);
        } else {
            this.c.d(obj);
        }
    }

    /* Access modifiers changed, original: protected */
    public Object q() {
        return this.E;
    }

    public boolean b(ajti ajti) {
        return (ajti == ajti.RELOAD && this.J != null) || this.F.containsKey(ajti);
    }

    public ajtf c(ajti ajti) {
        return (ajtf) this.F.get(ajti);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
    public final void a(java.lang.Object r6, defpackage.ajtf r7) {
        /*
        r5 = this;
        defpackage.xak.a();
        if (r7 == 0) goto L_0x0050;
    L_0x0005:
        r0 = defpackage.ayhc.class;
        r0 = defpackage.ajtj.a(r7, r0);
        r0 = (defpackage.ayhc) r0;
        r1 = 0;
        if (r0 != 0) goto L_0x0020;
    L_0x0011:
        r0 = defpackage.atuj.class;
        r0 = defpackage.ajtj.a(r7, r0);
        r0 = (defpackage.atuj) r0;
        if (r0 == 0) goto L_0x001e;
    L_0x001b:
        r0 = r0.c;
        goto L_0x0022;
    L_0x001e:
        r3 = r1;
        goto L_0x0023;
    L_0x0020:
        r0 = r0.b;
    L_0x0022:
        r3 = (long) r0;
    L_0x0023:
        r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1));
        if (r0 == 0) goto L_0x004d;
    L_0x0027:
        r0 = new java.util.Timer;
        r0.<init>();
        r1 = r5.K;
        r1 = r1.containsKey(r6);
        if (r1 == 0) goto L_0x003f;
    L_0x0034:
        r1 = r5.K;
        r1 = r1.get(r6);
        r1 = (java.util.Timer) r1;
        r1.cancel();
    L_0x003f:
        r1 = r5.K;
        r1.put(r6, r0);
        r1 = new akup;
        r1.<init>(r5, r6, r7);
        r0.schedule(r1, r3);
        return;
    L_0x004d:
        r5.a(r7);
    L_0x0050:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akun.a(java.lang.Object, ajtf):void");
    }

    public final void d(Object obj) {
        if (this.K.containsKey(obj)) {
            ((Timer) this.K.remove(obj)).cancel();
        }
    }

    /* Access modifiers changed, original: protected */
    public void a(Object obj, ajti ajti) {
        if (obj == null && ajti == ajti.NEXT) {
            n();
        }
        a(new akuq(ajti, obj != null));
    }

    /* Access modifiers changed, original: protected */
    public void a(bqn bqn, ajtf ajtf) {
        xst b = this.b.b(bqn);
        Throwable th = bqn;
        while (th != null && !(th instanceof bpx)) {
            th = th.getCause();
        }
        a(new akuv(b, ajtf));
        akut akut = this.L;
        if (akut != null) {
            akut.a(bqn, ajtf);
        }
    }

    /* Access modifiers changed, original: protected */
    public void b(List list) {
        n();
        for (ajtf ajtf : list) {
            this.F.put(ajtf.c(), ajtf);
            if (ajtf.c() == ajti.RELOAD) {
                this.J = ajtf;
            }
        }
    }

    public void n() {
        this.F.clear();
        this.H = null;
    }

    public final void r() {
        for (Timer cancel : this.K.values()) {
            cancel.cancel();
        }
        this.K.clear();
    }

    public void a(ajti ajti) {
        ajtf ajtf = (ajtf) this.F.get(ajti);
        if (ajtf != null) {
            a(ajtf);
        }
    }

    public void a(ajtf ajtf) {
        if (ajtf != null && ajtf != this.H) {
            a(ajtf, false);
        }
    }

    public final void s() {
        ajtf ajtf = this.J;
        if (ajtf != null && ajtf != this.H) {
            a(ajtf, true);
        }
    }

    private final void a(ajtf ajtf, boolean z) {
        a(new akuu(ajtf));
        if (ajtf.b() != null && ajtf.b().length > 0) {
            this.s.a(3, new acvs(ajtf.b()), null);
        }
        this.H = ajtf;
        aali a = this.a.a(ajtf);
        if ((ajti.INVALIDATION.a(ajtf) || z) && a.e()) {
            a.a(aall.WRITE_ONLY);
        }
        a(a);
        this.a.a(a, this.d, new akur(this, ajtf, z));
    }

    public void c() {
        r();
        n();
    }

    public akyd E_() {
        return new akuw(new HashMap(this.F), this.J, this.H, this.G);
    }
}
