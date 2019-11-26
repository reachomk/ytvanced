package defpackage;

import android.os.RemoteException;

/* renamed from: qjt */
public final class qjt extends rmw {
    private final Object a = new Object();
    private volatile rmy b;

    public final void a() {
        throw new RemoteException();
    }

    public final void b() {
        throw new RemoteException();
    }

    public final void c() {
        throw new RemoteException();
    }

    public final boolean d() {
        throw new RemoteException();
    }

    public final int e() {
        throw new RemoteException();
    }

    public final float f() {
        throw new RemoteException();
    }

    public final float g() {
        throw new RemoteException();
    }

    public final void a(rmy rmy) {
        synchronized (this.a) {
            this.b = rmy;
        }
    }

    public final rmy h() {
        rmy rmy;
        synchronized (this.a) {
            rmy = this.b;
        }
        return rmy;
    }

    public final float i() {
        throw new RemoteException();
    }

    public final boolean j() {
        throw new RemoteException();
    }

    public final boolean k() {
        throw new RemoteException();
    }
}
