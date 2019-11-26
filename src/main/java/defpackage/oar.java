package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.TextureView.SurfaceTextureListener;
import java.util.Iterator;
import java.util.List;

/* renamed from: oar */
final class oar implements Callback, SurfaceTextureListener, oah, obo, obs, olo, orp, pah {
    private final /* synthetic */ oas a;

    public final void a() {
    }

    public final void a(int i) {
    }

    public final void a(nyy nyy) {
    }

    public final void a(oag oag) {
    }

    public final void a(oau oau) {
    }

    public final void a(odk odk) {
        oas oas = this.a;
        oas.q = odk;
        Iterator it = oas.h.iterator();
        while (it.hasNext()) {
            ((pah) it.next()).a(odk);
        }
    }

    public final void a(boolean z) {
    }

    public final void a(boolean z, int i) {
    }

    public final void b() {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final void a(String str, long j, long j2) {
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            ((pah) it.next()).a(str, j, j2);
        }
    }

    public final void a(nzw nzw) {
        oas oas = this.a;
        oas.m = nzw;
        Iterator it = oas.h.iterator();
        while (it.hasNext()) {
            ((pah) it.next()).a(nzw);
        }
    }

    public final void a(int i, long j) {
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            ((pah) it.next()).a(i, j);
        }
    }

    public final void a(int i, int i2, int i3, float f) {
        Iterator it = this.a.d.iterator();
        while (it.hasNext()) {
            pai pai = (pai) it.next();
            if (!this.a.h.contains(pai)) {
                pai.a(i, i2, i3, f);
            }
        }
        it = this.a.h.iterator();
        while (it.hasNext()) {
            ((pah) it.next()).a(i, i2, i3, f);
        }
    }

    public final void a(Surface surface) {
        Iterator it;
        oas oas = this.a;
        if (oas.o == surface) {
            it = oas.d.iterator();
            while (it.hasNext()) {
                ((pai) it.next()).e();
            }
        }
        it = this.a.h.iterator();
        while (it.hasNext()) {
            ((pah) it.next()).a(surface);
        }
    }

    public final void b(odk odk) {
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            ((pah) it.next()).b(odk);
        }
        oas oas = this.a;
        oas.m = null;
        oas.q = null;
    }

    public final void c(odk odk) {
        oas oas = this.a;
        oas.r = odk;
        Iterator it = oas.i.iterator();
        while (it.hasNext()) {
            ((obs) it.next()).c(odk);
        }
    }

    public final void b(int i) {
        oas oas = this.a;
        if (oas.s != i) {
            oas.s = i;
            Iterator it = oas.e.iterator();
            while (it.hasNext()) {
                obn obn = (obn) it.next();
                if (!this.a.i.contains(obn)) {
                    obn.b(i);
                }
            }
            it = this.a.i.iterator();
            while (it.hasNext()) {
                ((obs) it.next()).b(i);
            }
        }
    }

    public final void b(String str, long j, long j2) {
        Iterator it = this.a.i.iterator();
        while (it.hasNext()) {
            ((obs) it.next()).b(str, j, j2);
        }
    }

    public final void b(nzw nzw) {
        oas oas = this.a;
        oas.n = nzw;
        Iterator it = oas.i.iterator();
        while (it.hasNext()) {
            ((obs) it.next()).b(nzw);
        }
    }

    public final void a(int i, long j, long j2) {
        Iterator it = this.a.i.iterator();
        while (it.hasNext()) {
            ((obs) it.next()).a(i, j, j2);
        }
    }

    public final void d(odk odk) {
        Iterator it = this.a.i.iterator();
        while (it.hasNext()) {
            ((obs) it.next()).d(odk);
        }
        oas oas = this.a;
        oas.n = null;
        oas.r = null;
        oas.s = 0;
    }

    public final void a(List list) {
        oas oas = this.a;
        oas.v = list;
        Iterator it = oas.f.iterator();
        while (it.hasNext()) {
            ((orp) it.next()).a(list);
        }
    }

    public final void a(olj olj) {
        Iterator it = this.a.g.iterator();
        while (it.hasNext()) {
            ((olo) it.next()).a(olj);
        }
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.a.a(surfaceHolder.getSurface(), false);
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.a.a(i2, i3);
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.a.a(null, false);
        this.a.a(0, 0);
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.a.a(new Surface(surfaceTexture), true);
        this.a.a(i, i2);
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.a.a(i, i2);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.a.a(null, true);
        this.a.a(0, 0);
        return true;
    }

    public final void c() {
        oas oas = this.a;
        float f = oas.t * oas.l.c;
        for (oam oam : oas.b) {
            if (oam.a() == 1) {
                oak a = oas.c.a(oam);
                a.a(2);
                a.a(Float.valueOf(f));
                a.a();
            }
        }
    }

    public final void c(int i) {
        oas oas = this.a;
        oas.a(oas.f(), i);
    }

    /* synthetic */ oar(oas oas) {
        this.a = oas;
    }
}
