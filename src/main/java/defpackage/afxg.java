package defpackage;

import android.os.Looper;

/* renamed from: afxg */
final class afxg implements afxc {
    private final /* synthetic */ afxe a;

    public final void a(atun atun) {
        a(atun, null);
    }

    public final void a(atun atun, atur atur) {
        synchronized (this.a.b) {
            afxe afxe;
            this.a.a.d(afxe.a(atun));
            if (atur == null) {
                afxe = this.a;
                afxd afxd = new afxd(afxe, afxe.a(atun));
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    afxe.d.post(afxd);
                } else {
                    afxd.run();
                }
            }
            afxe = this.a;
            afxe.c.a((ajtf) afxe.b.get(afxe.a(atun)), atur);
        }
    }

    /* synthetic */ afxg(afxe afxe) {
        this.a = afxe;
    }
}
