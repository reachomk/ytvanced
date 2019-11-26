package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.os.RemoteException;
import android.view.Surface;
import android.view.View;
import defpackage.aewz;
import defpackage.afkg;
import defpackage.afkh;
import defpackage.afkj;
import defpackage.afkm;
import defpackage.afkn;
import defpackage.amqw;
import defpackage.mzd;
import defpackage.ofb;

public abstract class AbstractRemoteMediaView implements afkh {
    public mzd a;
    public afkj b;

    public AbstractRemoteMediaView(mzd mzd) {
        this.a = (mzd) amqw.a((Object) mzd, (Object) "client cannot be null");
    }

    public final void a(afkm afkm) {
    }

    public final void a(afkn afkn) {
    }

    public final void a(afkn afkn, boolean z, boolean z2) {
        afkg.a(this, afkn);
    }

    public final void a(Surface surface) {
    }

    public final void a(boolean z, byte[] bArr, long j) {
    }

    public final void e() {
    }

    public final View f() {
        return null;
    }

    public final aewz g() {
        return null;
    }

    public final ofb h() {
        return null;
    }

    public final void i() {
    }

    public final boolean j() {
        return false;
    }

    public final void a(boolean z, float f, float f2) {
        mzd mzd = this.a;
        if (mzd != null) {
            try {
                mzd.a(z);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void a(afkj afkj) {
        this.b = afkj;
    }

    public final void a(int i, int i2) {
        mzd mzd = this.a;
        if (mzd != null) {
            try {
                mzd.b(i, i2);
            } catch (RemoteException unused) {
            }
        }
    }

    public final int a() {
        mzd mzd = this.a;
        if (mzd != null) {
            try {
                return mzd.a();
            } catch (RemoteException unused) {
            }
        }
        return 0;
    }

    public final int b() {
        mzd mzd = this.a;
        if (mzd != null) {
            try {
                return mzd.b();
            } catch (RemoteException unused) {
            }
        }
        return 0;
    }

    public final void a(int i) {
        mzd mzd = this.a;
        if (mzd != null) {
            try {
                mzd.a(i);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void b(int i) {
        mzd mzd = this.a;
        if (mzd != null) {
            try {
                mzd.b(i);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void c(int i) {
        mzd mzd = this.a;
        if (mzd != null) {
            try {
                mzd.c(i);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void c() {
        mzd mzd = this.a;
        if (mzd != null) {
            try {
                mzd.d();
            } catch (RemoteException unused) {
            }
        }
    }

    public final void d() {
        if (this.a != null) {
            afkj afkj = this.b;
            if (afkj != null) {
                afkj.c();
            }
            try {
                this.a.c();
            } catch (RemoteException unused) {
            }
        }
    }
}
