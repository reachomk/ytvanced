package defpackage;

import android.os.RemoteException;
import java.io.IOException;

/* renamed from: pjf */
public final class pjf implements pjg {
    public final void a(ptd ptd) {
        try {
            ppa ppa = (ppa) ptd.a(pok.a);
            ppn ppn = (ppn) ppa.v();
            if (ppa.h()) {
                ppn.b();
            }
        } catch (RemoteException unused) {
            throw new IOException("service error");
        }
    }

    public final ptg a(ptd ptd, String str, String str2) {
        return ptd.b(new pqx(ptd, str, str2));
    }

    public final ptg a(ptd ptd, String str, pjr pjr) {
        return ptd.b(new pqw(ptd, str, pjr));
    }

    public final ptg b(ptd ptd, String str, String str2) {
        return ptd.b(new pqz(ptd, str, str2));
    }

    public final ptg a(ptd ptd, String str) {
        return ptd.b(new pqy(ptd, str));
    }

    public final void a(ptd ptd, double d) {
        try {
            ppa ppa = (ppa) ptd.a(pok.a);
            if (Double.isInfinite(d) || Double.isNaN(d)) {
                StringBuilder stringBuilder = new StringBuilder(41);
                stringBuilder.append("Volume cannot be ");
                stringBuilder.append(d);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            ppn ppn = (ppn) ppa.v();
            if (ppa.h()) {
                ppn.a(d, ppa.j, ppa.g);
            }
        } catch (RemoteException unused) {
            throw new IOException("service error");
        }
    }

    public final double b(ptd ptd) {
        ppa ppa = (ppa) ptd.a(pok.a);
        ppa.u();
        return ppa.j;
    }

    public final boolean c(ptd ptd) {
        ppa ppa = (ppa) ptd.a(pok.a);
        ppa.u();
        return ppa.g;
    }

    public final String d(ptd ptd) {
        ppa ppa = (ppa) ptd.a(pok.a);
        ppa.u();
        return ppa.f;
    }

    public final void a(ptd ptd, String str, pjj pjj) {
        try {
            ppa ppa = (ppa) ptd.a(pok.a);
            ppj.a(str);
            ppa.a(str);
            if (pjj != null) {
                synchronized (ppa.e) {
                    ppa.e.put(str, pjj);
                }
                ppn ppn = (ppn) ppa.v();
                if (ppa.h()) {
                    ppn.b(str);
                }
            }
        } catch (RemoteException unused) {
            throw new IOException("service error");
        }
    }

    public final void b(ptd ptd, String str) {
        try {
            ((ppa) ptd.a(pok.a)).a(str);
        } catch (RemoteException unused) {
            throw new IOException("service error");
        }
    }
}
