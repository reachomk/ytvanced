package defpackage;

import android.os.RemoteException;

/* renamed from: ndy */
public final class ndy extends mzh {
    public final /* synthetic */ ndt a;

    public final void a() {
    }

    public final void a(String str) {
    }

    public final void a(String str, String str2, long j, long j2, boolean z, boolean z2, int i) {
        this.a.v.post(new ndx(this, str, str2, i));
    }

    public final void a(boolean z, long j) {
    }

    public final void b() {
    }

    public final void b(long j) {
    }

    public final void b(long j, long j2) {
    }

    public final void c() {
    }

    public final void d() {
    }

    public final void e() {
    }

    public final void f() {
    }

    public final void g() {
    }

    public final void i() {
    }

    public final void k() {
    }

    public final void a(long j, long j2) {
        this.a.v.post(new nea(this));
    }

    public final void a(long j) {
        this.a.v.post(new ndz(this));
    }

    public final void h() {
        this.a.v.post(new nec(this));
    }

    public final void l() {
        if (this.a.d()) {
            this.a.E.b();
        }
    }

    public final void a(boolean z) {
        this.a.v.post(new neb(this, z));
    }

    public final void j() {
        try {
            this.a.c.e(acwc.PLAYER_YOU_TUBE_BUTTON.dU);
        } catch (RemoteException e) {
            ammj.a("Service was disconnected: %s", e.getMessage());
        }
    }

    public final String b(String str) {
        return this.a.q.a(str);
    }

    public /* synthetic */ ndy(ndt ndt) {
        this.a = ndt;
    }
}
