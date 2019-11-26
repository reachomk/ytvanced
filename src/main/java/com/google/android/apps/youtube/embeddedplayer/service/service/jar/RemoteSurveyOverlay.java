package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.ISurveyOverlayService.Stub;
import defpackage.amqw;
import defpackage.nan;
import defpackage.vwq;
import defpackage.vws;
import defpackage.vwv;
import java.util.List;

public final class RemoteSurveyOverlay implements vws {
    public nan a;
    private final SurveyOverlayService b;

    final class SurveyOverlayService extends Stub {
        public vwv a;
        private final Handler b;

        public SurveyOverlayService(Handler handler) {
            this.b = (Handler) amqw.a((Object) handler, (Object) "uiHandler cannot be null");
        }

        public final void a(final int i, final int i2) {
            this.b.post(new Runnable() {
                public final void run() {
                    SurveyOverlayService.this.a.a(i, i2);
                }
            });
        }

        public final void a(final int[] iArr) {
            this.b.post(new Runnable() {
                public final void run() {
                    SurveyOverlayService.this.a.a(iArr);
                }
            });
        }

        public final void a(final Bundle bundle) {
            this.b.post(new Runnable() {
                public final void run() {
                    SurveyOverlayService.this.a.a(bundle);
                }
            });
        }
    }

    public RemoteSurveyOverlay(Handler handler, nan nan) {
        this.a = (nan) amqw.a((Object) nan, (Object) "client cannot be null");
        this.b = new SurveyOverlayService(handler);
        try {
            nan.a(this.b);
        } catch (RemoteException unused) {
        }
    }

    public final vwq g() {
        return null;
    }

    public final void a(vwv vwv) {
        this.b.a = (vwv) amqw.a((Object) vwv, (Object) "listener cannot be null");
    }

    public final void f() {
        nan nan = this.a;
        if (nan != null) {
            try {
                nan.a();
            } catch (RemoteException unused) {
            }
        }
    }

    public final void a(boolean z) {
        nan nan = this.a;
        if (nan != null) {
            try {
                nan.a(z);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void a(String str, List list, boolean z) {
        nan nan = this.a;
        if (nan != null) {
            try {
                nan.a(str, list, z);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void d() {
        nan nan = this.a;
        if (nan != null) {
            try {
                nan.b();
            } catch (RemoteException unused) {
            }
        }
    }

    public final void a(int i) {
        nan nan = this.a;
        if (nan != null) {
            try {
                nan.a(i);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void e() {
        nan nan = this.a;
        if (nan != null) {
            try {
                nan.c();
            } catch (RemoteException unused) {
            }
        }
    }
}
