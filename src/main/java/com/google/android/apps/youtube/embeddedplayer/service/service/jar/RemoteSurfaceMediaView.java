package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import defpackage.afkj;
import defpackage.afkn;
import defpackage.amqw;
import defpackage.mzd;

public final class RemoteSurfaceMediaView extends AbstractRemoteMediaView implements Callback {
    private final SurfaceHolder c;
    private boolean d;

    public RemoteSurfaceMediaView(SurfaceHolder surfaceHolder, mzd mzd) {
        super(mzd);
        this.c = (SurfaceHolder) amqw.a((Object) surfaceHolder, (Object) "surfaceHolder cannot be null");
        surfaceHolder.addCallback(this);
    }

    public final Surface k() {
        return this.c.getSurface();
    }

    public final SurfaceHolder l() {
        return this.c;
    }

    public final void m() {
        Surface surface = this.c.getSurface();
        if (surface != null) {
            surface.release();
        }
    }

    public final boolean n() {
        return this.d;
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        afkj afkj = this.b;
        if (afkj != null) {
            afkj.b();
        }
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.d = true;
        afkj afkj = this.b;
        if (afkj != null) {
            afkj.a();
        }
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.d = false;
        afkj afkj = this.b;
        if (afkj != null) {
            afkj.c();
        }
    }

    public final afkn o() {
        return afkn.SURFACE;
    }
}
