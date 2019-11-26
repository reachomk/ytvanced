package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.ILiveOverlayService.Stub;
import defpackage.aict;
import defpackage.aicu;
import defpackage.amqw;
import defpackage.mzv;

public class RemoteLiveOverlay implements aicu {
    public mzv a;
    private final LiveOverlayService b;

    final class LiveOverlayService extends Stub implements aict {
        public aict a;

        public LiveOverlayService(Handler handler) {
            amqw.a((Object) handler, (Object) "uiHandler cannot be null");
        }

        public final void b() {
            this.a.b();
        }

        public final void a() {
            this.a.a();
        }
    }

    public RemoteLiveOverlay(Handler handler, mzv mzv) {
        this.a = (mzv) amqw.a((Object) mzv, (Object) "client cannot be null");
        this.b = new LiveOverlayService(handler);
        try {
            mzv.a(this.b);
        } catch (RemoteException unused) {
        }
    }

    public final void a(Bitmap bitmap) {
        mzv mzv = this.a;
        if (mzv != null) {
            try {
                mzv.a(bitmap);
            } catch (RemoteException unused) {
            }
        }
    }

    public final int getWidth() {
        mzv mzv = this.a;
        if (mzv != null) {
            try {
                return mzv.b();
            } catch (RemoteException unused) {
            }
        }
        return 0;
    }

    public final int getHeight() {
        mzv mzv = this.a;
        if (mzv != null) {
            try {
                return mzv.c();
            } catch (RemoteException unused) {
            }
        }
        return 0;
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, boolean z, CharSequence charSequence3, int i, CharSequence charSequence4, int i2) {
        mzv mzv = this.a;
        if (mzv != null) {
            try {
                mzv.a(charSequence, charSequence2, z, charSequence3, i, charSequence4, i2);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        mzv mzv = this.a;
        if (mzv != null) {
            try {
                mzv.a(charSequence, charSequence2, charSequence3);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void ag_() {
        mzv mzv = this.a;
        if (mzv != null) {
            try {
                mzv.a();
            } catch (RemoteException unused) {
            }
        }
    }

    public final void a(aict aict) {
        this.b.a = (aict) amqw.a((Object) aict, (Object) "listener cannot be null");
    }
}
