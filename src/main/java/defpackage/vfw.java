package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: vfw */
public final class vfw {
    public final vge a;
    public String b;
    public vsm c;
    public vtk d;
    public final Handler e = new Handler(Looper.getMainLooper());
    public final Runnable f = new vfz(this);
    public boolean g;

    public vfw(vge vge) {
        this.a = vge;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(String str, vsm vsm, vso vso) {
        xak.a();
        a();
        if (vso instanceof vtk) {
            this.b = str;
            this.c = vsm;
            this.d = (vtk) vso;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        xak.a();
        if (this.g) {
            this.e.removeCallbacks(this.f);
        }
        this.g = false;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
