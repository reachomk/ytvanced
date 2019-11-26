package defpackage;

import android.os.Handler;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ppc */
final class ppc extends ppo {
    public final AtomicReference a;
    private final Handler b;

    public ppc(ppa ppa) {
        this.a = new AtomicReference(ppa);
        this.b = new Handler(ppa.y);
    }

    public final ppa a() {
        ppa ppa = (ppa) this.a.getAndSet(null);
        if (ppa == null) {
            return null;
        }
        ppa.d();
        return ppa;
    }

    public final void a(int i) {
        ppa a = a();
        if (a != null) {
            ppa.a.a("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i));
            if (i != 0) {
                a.c(2);
            }
        }
    }

    public final void a(pjb pjb, String str, String str2, boolean z) {
        ppa ppa = (ppa) this.a.get();
        if (ppa != null) {
            ppa.b = pjb;
            ppa.o = pjb.a;
            ppa.p = str2;
            ppa.f = str;
            synchronized (ppa.t) {
                ptu ptu = ppa.r;
                if (ptu != null) {
                    ptu.a(new ppd(new Status(0), pjb, str, str2, z));
                    ppa.r = null;
                }
            }
        }
    }

    public final void b(int i) {
        ppa ppa = (ppa) this.a.get();
        if (ppa != null) {
            ppa.a(i);
        }
    }

    public final void c(int i) {
        ppa ppa = (ppa) this.a.get();
        if (ppa != null) {
            ppa.b(i);
        }
    }

    public final void d(int i) {
        ppa ppa = (ppa) this.a.get();
        if (ppa != null) {
            ppa.b(i);
        }
    }

    public final void e(int i) {
        ppa ppa = (ppa) this.a.get();
        if (ppa != null) {
            ppa.o = null;
            ppa.p = null;
            ppa.b(i);
            if (ppa.d != null) {
                this.b.post(new ppf(ppa, i));
            }
        }
    }

    public final void b() {
        ppa.a.a("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    public final void a(ppi ppi) {
        ppa ppa = (ppa) this.a.get();
        if (ppa != null) {
            ppa.a.a("onDeviceStatusChanged", new Object[0]);
            this.b.post(new ppe(ppa, ppi));
        }
    }

    public final void a(poi poi) {
        ppa ppa = (ppa) this.a.get();
        if (ppa != null) {
            ppa.a.a("onApplicationStatusChanged", new Object[0]);
            this.b.post(new pph(ppa, poi));
        }
    }

    public final void a(String str, String str2) {
        ppa ppa = (ppa) this.a.get();
        if (ppa != null) {
            ppa.a.a("Receive (type=text, ns=%s) %s", str, str2);
            this.b.post(new ppg(ppa, str, str2));
        }
    }

    public final void a(String str, byte[] bArr) {
        if (((ppa) this.a.get()) != null) {
            ppa.a.a("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
        }
    }

    public final void a(long j, int i) {
        ppa ppa = (ppa) this.a.get();
        if (ppa != null) {
            ppa.a(j, i);
        }
    }

    public final void a(long j) {
        ppa ppa = (ppa) this.a.get();
        if (ppa != null) {
            ppa.a(j, 0);
        }
    }
}
