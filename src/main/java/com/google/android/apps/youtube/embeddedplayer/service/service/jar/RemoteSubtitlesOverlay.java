package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.os.RemoteException;
import defpackage.aifi;
import defpackage.ajji;
import defpackage.amqw;
import defpackage.nac;
import java.util.List;

public class RemoteSubtitlesOverlay implements aifi {
    public nac a;

    public RemoteSubtitlesOverlay(nac nac) {
        this.a = (nac) amqw.a((Object) nac, (Object) "client cannot be null");
    }

    public final void a(List list) {
        nac nac = this.a;
        if (nac != null) {
            try {
                nac.a(list);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void c() {
        nac nac = this.a;
        if (nac != null) {
            try {
                nac.a();
            } catch (RemoteException unused) {
            }
        }
    }

    public final void d() {
        nac nac = this.a;
        if (nac != null) {
            try {
                nac.b();
            } catch (RemoteException unused) {
            }
        }
    }

    public final void a(float f) {
        nac nac = this.a;
        if (nac != null) {
            try {
                nac.a(f);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void a(ajji ajji) {
        nac nac = this.a;
        if (nac != null) {
            try {
                nac.a(ajji);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void a(int i, int i2) {
        nac nac = this.a;
        if (nac != null) {
            try {
                nac.a(i, i2);
            } catch (RemoteException unused) {
            }
        }
    }
}
