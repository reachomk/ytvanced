package defpackage;

import com.google.android.youtube.api.jar.client.RemoteEmbeddedPlayer;

/* renamed from: amkc */
public final class amkc extends mzh {
    public final /* synthetic */ RemoteEmbeddedPlayer a;

    public final void a() {
        this.a.U();
    }

    public final void b() {
        this.a.V();
    }

    public final void c() {
        this.a.W();
    }

    public final void d() {
        this.a.a.post(new amke(this));
        this.a.X();
    }

    public final void a(String str, String str2, long j, long j2, boolean z, boolean z2, int i) {
        this.a.a.post(new amkh(this, str, str2, z, z2, j, j2));
        String str3 = str;
        this.a.b(str);
    }

    public final void e() {
        this.a.Y();
    }

    public final void f() {
        this.a.a.post(new amkk(this));
        this.a.Z();
    }

    public final void g() {
        this.a.aa();
    }

    public final void a(String str) {
        amkz a;
        try {
            a = amkz.a(str);
        } catch (IllegalArgumentException unused) {
            a = amkz.UNKNOWN;
        } catch (NullPointerException unused2) {
            a = amkz.UNKNOWN;
        }
        this.a.a(a);
    }

    public final void a(long j, long j2) {
        this.a.a.post(new amkj(this, j, j2));
        this.a.ab();
    }

    public final void a(long j) {
        this.a.a.post(new amkm(this, j));
        this.a.ac();
    }

    public final void h() {
        this.a.a.post(new amkl(this));
        this.a.ad();
    }

    public final void b(long j, long j2) {
        this.a.a.post(new amko(this, j, j2));
    }

    public final void a(boolean z, long j) {
        this.a.a.post(new amkn(this, j));
        this.a.l(z);
    }

    public final void b(long j) {
        this.a.a.post(new amkp(this, j));
        this.a.a(j);
    }

    public final void a(boolean z) {
        this.a.a.post(new amkd(this, z));
        this.a.m(z);
    }

    public final void i() {
        this.a.a.post(new amkg(this));
    }

    public final void j() {
        this.a.a.post(new amkf(this));
    }

    public final void k() {
        this.a.a.post(new amki(this));
    }

    public final String b(String str) {
        ammj.b("Embed config is not supported in RemoteEmbeddedPlayer.", new Object[0]);
        return amky.b.a(str);
    }

    public /* synthetic */ amkc(RemoteEmbeddedPlayer remoteEmbeddedPlayer) {
        this.a = remoteEmbeddedPlayer;
    }
}
