package defpackage;

import android.os.Build.VERSION;

/* renamed from: ncm */
public final /* synthetic */ class ncm implements bcvk {
    private final int a;

    public ncm(int i) {
        this.a = i;
    }

    public final void a(Object obj) {
        ndi ndi = (ndi) obj;
        ndi.m = this.a;
        int i;
        if (VERSION.SDK_INT < 24) {
            i = ndi.m;
            if (i == 8) {
                ndi.e.f(ndi);
                ndi.e.b();
                ndi.b();
                return;
            } else if (i == 9) {
                ndi.e.a(ndi, ndi.d.d());
                return;
            } else if (i == 13) {
                ndi.a();
                return;
            }
        }
        i = ndi.m;
        if (i == 8) {
            ndi.e.f(ndi);
            ndi.e.b();
            ndi.b();
        } else if (i == 11) {
            ndi.e.a(ndi, ndi.d.d());
        } else if (i == 13) {
            ndi.a();
        }
    }
}
