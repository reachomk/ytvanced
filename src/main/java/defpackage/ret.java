package defpackage;

/* renamed from: ret */
public class ret extends rcu {
    public reu a;
    private final reu b;
    private boolean c = false;

    protected ret(reu reu) {
        this.b = reu;
        this.a = (reu) reu.a(4);
    }

    public final boolean c() {
        throw null;
    }

    public final void b() {
        if (this.c) {
            reu reu = (reu) this.a.a(4);
            ret.a(reu, this.a);
            this.a = reu;
            this.c = false;
        }
    }

    private final reu h() {
        if (this.c) {
            return this.a;
        }
        Object obj = this.a;
        rgw.a.a(obj).c(obj);
        this.c = true;
        return this.a;
    }

    /* JADX WARNING: Missing block: B:6:0x0029, code skipped:
            if (r2 != false) goto L_0x0032;
     */
    /* renamed from: d */
    public final defpackage.reu f() {
        /*
        r4 = this;
        r0 = r4.h();
        r1 = java.lang.Boolean.TRUE;
        r1 = r1.booleanValue();
        r2 = 1;
        r3 = r0.a(r2);
        r3 = (java.lang.Byte) r3;
        r3 = r3.byteValue();
        if (r3 == r2) goto L_0x0032;
    L_0x0017:
        if (r3 == 0) goto L_0x002c;
    L_0x0019:
        r2 = defpackage.rgw.a;
        r2 = r2.a(r0);
        r2 = r2.d(r0);
        if (r1 == 0) goto L_0x0029;
    L_0x0025:
        r1 = 2;
        r0.a(r1);
    L_0x0029:
        if (r2 == 0) goto L_0x002c;
    L_0x002b:
        goto L_0x0032;
    L_0x002c:
        r0 = new rhq;
        r0.<init>();
        throw r0;
    L_0x0032:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ret.f():reu");
    }

    public final ret a(reu reu) {
        b();
        ret.a(this.a, reu);
        return this;
    }

    private static void a(reu reu, reu reu2) {
        rgw.a.a((Object) reu).b(reu, reu2);
    }

    public final /* synthetic */ rcu a() {
        return (ret) clone();
    }

    public final /* synthetic */ rgh e() {
        return h();
    }

    public final /* synthetic */ rgh g() {
        return this.b;
    }

    public final /* synthetic */ Object clone() {
        ret ret = (ret) this.b.a(5);
        ret.a(h());
        return ret;
    }
}
