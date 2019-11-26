package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.net.Uri;
import android.os.Handler;
import defpackage.akkq;
import defpackage.aklb;
import defpackage.amqw;
import defpackage.vvd;
import defpackage.vxc;
import defpackage.vxd;
import defpackage.vxe;
import defpackage.vxi;
import defpackage.vyc;
import defpackage.vyg;
import defpackage.wae;
import defpackage.wxg;
import defpackage.wxi;
import defpackage.wxl;

public class PrimitiveAdOverlayAdapter implements vvd {
    public final PrimitiveAdOverlay a;
    private final akkq b;
    private final Handler c;
    private wxi d;
    private vxc e = vxc.a().i();

    final class ThumbnailCallback implements wxg {
        /* synthetic */ ThumbnailCallback() {
        }
    }

    public PrimitiveAdOverlayAdapter(PrimitiveAdOverlay primitiveAdOverlay, Handler handler, akkq akkq) {
        this.a = (PrimitiveAdOverlay) amqw.a((Object) primitiveAdOverlay);
        this.c = (Handler) amqw.a((Object) handler);
        this.b = (akkq) amqw.a((Object) akkq);
    }

    public final void a(wae wae) {
        this.a.a(wae);
    }

    public final void a(vxc vxc) {
        boolean b = vxc.b();
        if (b != this.e.b()) {
            this.a.d(b);
        }
        vxi k = vxc.k();
        if (!k.b().equals(this.e.k().b())) {
            vxd b2 = k.b();
            this.a.a(b2.b);
            if (b2 == vxd.a) {
                wxi wxi = this.d;
                if (wxi != null) {
                    wxi.a();
                    this.d = null;
                }
                this.a.a(null);
            } else {
                Uri e = aklb.e(b2.d);
                if (e != null) {
                    this.d = wxi.a(new ThumbnailCallback());
                    this.b.b(e, wxl.a(this.c, this.d));
                }
            }
        }
        vxe i = vxc.i();
        if (i.c() != this.e.i().c()) {
            this.a.a(i.c());
        }
        if (i.d() != this.e.i().d()) {
            this.a.e(i.d());
        }
        vyc j = vxc.j();
        if (!(j.c().equals(this.e.j().c()) || j.c().equals("<NONE>"))) {
            this.a.b(j.c());
        }
        vyg g = vxc.g();
        if (g.d() != this.e.g().d()) {
            int d = g.d();
            if (d == 0) {
                this.a.a(true);
                this.a.c(false);
            } else if (d == 1) {
                this.a.a(true);
                this.a.c(true);
            } else if (d == 2 || d == 3) {
                this.a.a(false);
                this.a.c(false);
            }
        }
        if (g.e() != this.e.g().e()) {
            this.a.b(g.e());
        }
        if (g.g() != this.e.g().g() && g.d() == 0) {
            this.a.b(g.g());
        }
        this.e = vxc;
    }
}
