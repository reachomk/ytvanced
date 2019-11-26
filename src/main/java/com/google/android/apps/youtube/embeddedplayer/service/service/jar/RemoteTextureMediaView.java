package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.view.Surface;
import android.view.SurfaceHolder;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.RemoteSurfaceTexture.Listener;
import defpackage.afkj;
import defpackage.afkn;
import defpackage.amqw;
import defpackage.mzd;

public final class RemoteTextureMediaView extends AbstractRemoteMediaView implements Listener {
    private Surface c;

    public RemoteTextureMediaView(RemoteSurfaceTexture remoteSurfaceTexture, mzd mzd) {
        super(mzd);
        amqw.a((Object) remoteSurfaceTexture);
        remoteSurfaceTexture.a.a = (Listener) amqw.a((Object) this, (Object) "listener cannot be null");
    }

    public final SurfaceHolder l() {
        return null;
    }

    public final Surface k() {
        return this.c;
    }

    public final void m() {
        Surface surface = this.c;
        if (surface != null) {
            surface.release();
        }
    }

    public final boolean n() {
        return this.c != null;
    }

    public final void a_(Surface surface) {
        this.c = surface;
        afkj afkj = this.b;
        if (afkj != null) {
            afkj.a();
        }
    }

    public final void aM_() {
        afkj afkj = this.b;
        if (afkj != null) {
            afkj.b();
        }
    }

    public final void aN_() {
        afkj afkj = this.b;
        if (afkj != null) {
            afkj.b();
        }
    }

    public final void aO_() {
        this.c = null;
        afkj afkj = this.b;
        if (afkj != null) {
            afkj.c();
        }
    }

    public final afkn o() {
        return afkn.TEXTURE;
    }
}
