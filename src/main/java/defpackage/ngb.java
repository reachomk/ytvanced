package defpackage;

import android.view.SurfaceView;
import android.view.View;

/* renamed from: ngb */
public final class ngb implements nfz {
    public nfz b = nfz.a;
    public SurfaceView c;
    public int d;
    public ngf e = ngf.d;
    public boolean f;
    @Deprecated
    public boolean g;

    public final View aL_() {
        return this.b.aL_();
    }

    public final void b() {
        this.c = null;
        this.e = ngf.d;
        this.d = 0;
        this.f = false;
        this.g = false;
        this.b.b();
    }

    public final void a(int i) {
        this.d = i;
        this.b.a(i);
    }

    public final void a(ngf ngf) {
        this.e = ngf;
        this.b.a(ngf);
    }

    public final void a(SurfaceView surfaceView) {
        this.c = surfaceView;
        this.b.a(surfaceView);
    }

    public final void l_(boolean z) {
        this.f = z;
        this.b.l_(z);
    }

    @Deprecated
    public final void b(boolean z) {
        this.g = z;
        this.b.b(z);
    }
}
