package defpackage;

import java.util.concurrent.Executor;

/* renamed from: drl */
public final class drl extends egj implements drp {
    public aaoh a;
    public Executor b;
    public aamd c;
    public afpu d;
    public eyo e;
    public acvx f;

    public drl(nn nnVar, exu exu) {
        super(nnVar, exu, "DefaultProfileCardController");
    }

    public final void a(String str, String str2, apxu apxu) {
        byte[] d = apxu.b.d();
        f();
        if (e() == null) {
            dro dro = new dro();
            dro.ak = new drk(this, dro, str, str2, d);
            a(dro);
        }
        dro dro2 = (dro) e();
        this.f.a(acwl.ai, apxu, null);
        dro2.al = this.f;
        a(str, str2, d);
    }

    public final void a(String str, String str2, byte[] bArr) {
        dro dro = (dro) e();
        aaml aaoi = new aaoi(this.c, this.d.c(), str, str2);
        if (bArr == null || bArr.length <= 0) {
            aaoi.g();
        } else {
            aaoi.a(bArr);
        }
        aaoh aaoh = this.a;
        anjv a = aaoh.a.a(aaoi, this.b);
        Executor executor = this.b;
        drn drn = new drn(this, dro);
        dro.getClass();
        xan.a(a, executor, drn, new drm(dro));
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void a(dro dro, Throwable th) {
        akuv akuv = new akuv(this.e.b(th), null);
        dro.X();
        dro.aj.add(dro.a(akuv, dro.ak));
    }
}
