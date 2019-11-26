package defpackage;

import android.os.Handler;

/* renamed from: nid */
public final class nid extends ammb {
    public final nil a;
    public final mmv b;
    private final Handler c;

    public nid(Handler handler, mlp mlp, amma amma) {
        amqw.a((Object) mlp);
        amqw.a((Object) amma);
        this.c = (Handler) amqw.a((Object) handler);
        this.a = new nil(amma);
        this.b = new mmv(this.a, mlp.h, mlp.b(), mlp.f.oD());
    }

    public final void a(String str) {
        this.c.post(new nig(this, str));
    }

    public final void a(String str, int i) {
        this.c.post(new nif(this, str, i));
    }

    public final void a() {
        this.c.post(new nii(this));
    }

    public final void b() {
        this.c.post(new nih(this));
    }

    public final void c() {
        this.c.post(new nik(this));
    }

    public final void d() {
        this.c.post(new nij(this));
    }
}
