package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.CancellationException;

/* renamed from: nwu */
public final class nwu implements nvx {
    public final nwe a;
    public final Looper b;
    public final nvy c = new nvy("manifestLoader:single");
    public long d;
    private final nwp e;
    private final /* synthetic */ nwn f;

    public nwu(nwn nwn, nwe nwe, Looper looper, nwp nwp) {
        this.f = nwn;
        this.a = nwe;
        this.b = looper;
        this.e = nwp;
    }

    public final void a(nvz nvz) {
        try {
            Object obj = this.a.a;
            nwn nwn = this.f;
            long j = this.d;
            nwn.l = obj;
            nwn.m = j;
            nwn.n = SystemClock.elapsedRealtime();
            this.e.a();
        } finally {
            a();
        }
    }

    public final void g() {
        try {
            this.e.a(new nws(new CancellationException()));
        } finally {
            a();
        }
    }

    public final void a(nvz nvz, IOException iOException) {
        try {
            this.e.a(iOException);
        } finally {
            a();
        }
    }

    private final void a() {
        this.c.b();
    }
}
