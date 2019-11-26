package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.os.RemoteException;
import defpackage.aiif;
import defpackage.amqw;
import defpackage.mzw;

public class RemotePaidContentOverlay implements aiif {
    public mzw a;

    public RemotePaidContentOverlay(mzw mzw) {
        this.a = (mzw) amqw.a((Object) mzw, (Object) "client cannot be null");
    }

    public final void bC_() {
        mzw mzw = this.a;
        if (mzw != null) {
            try {
                mzw.a();
            } catch (RemoteException unused) {
            }
        }
    }

    public final void a(boolean z) {
        mzw mzw = this.a;
        if (mzw != null) {
            try {
                mzw.a(z);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void a(CharSequence charSequence) {
        mzw mzw = this.a;
        if (mzw != null) {
            try {
                mzw.a(charSequence);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void a(long j) {
        mzw mzw = this.a;
        if (mzw != null) {
            try {
                mzw.a(j);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void b(boolean z) {
        mzw mzw = this.a;
        if (mzw != null) {
            try {
                mzw.b(z);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void c(boolean z) {
        mzw mzw = this.a;
        if (mzw != null) {
            try {
                mzw.c(z);
            } catch (RemoteException unused) {
            }
        }
    }
}
