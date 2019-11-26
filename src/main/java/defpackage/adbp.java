package defpackage;

import java.io.IOException;

/* renamed from: adbp */
final class adbp implements tch {
    public final /* synthetic */ adbq a;
    private final tbt b = new adbs(this);

    public final /* synthetic */ void a() {
        adbq adbq = this.a;
        adbq.b.a(((tbn) amqw.a(adbq.f)).b());
        this.a.d();
    }

    public final /* bridge */ /* synthetic */ void b() {
    }

    public final /* bridge */ /* synthetic */ void c() {
    }

    public final /* bridge */ /* synthetic */ void d() {
    }

    public final /* bridge */ /* synthetic */ void e() {
    }

    public final /* bridge */ /* synthetic */ void f() {
    }

    public final /* synthetic */ void b(tcf tcf) {
        try {
            tcf.a(this.a.d, this.b);
        } catch (IOException e) {
            String str = "setMessageReceivedCallbacks failed";
            afpc.a(2, afpf.mdx, str, e);
            xtl.a(adbq.a, str, e);
        }
        ((adbl) amqw.a(this.a.e)).a((tcd) tcf);
    }

    /* synthetic */ adbp(adbq adbq) {
        this.a = adbq;
    }
}
