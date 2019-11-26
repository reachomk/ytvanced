package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.os.Handler;
import android.os.RemoteException;
import android.view.Surface;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.ISurfaceTextureService.Stub;
import defpackage.amqw;
import defpackage.nai;

public final class RemoteSurfaceTexture {
    public final RemoteSurfaceTextureService a;

    public interface Listener {
        void aM_();

        void aN_();

        void aO_();

        void a_(Surface surface);
    }

    final class RemoteSurfaceTextureService extends Stub {
        public Listener a;
        private final Handler b;

        public RemoteSurfaceTextureService(Handler handler) {
            this.b = (Handler) amqw.a((Object) handler);
        }

        public final void a(final Surface surface) {
            this.b.post(new Runnable() {
                public final void run() {
                    Listener listener = RemoteSurfaceTextureService.this.a;
                    if (listener != null) {
                        listener.a_(surface);
                    }
                }
            });
        }

        public final void a(int i, int i2) {
            this.b.post(new Runnable() {
                public final void run() {
                    Listener listener = RemoteSurfaceTextureService.this.a;
                    if (listener != null) {
                        listener.aM_();
                    }
                }
            });
        }

        public final void a() {
            this.b.post(new Runnable() {
                public final void run() {
                    Listener listener = RemoteSurfaceTextureService.this.a;
                    if (listener != null) {
                        listener.aN_();
                    }
                }
            });
        }

        public final void b() {
            this.b.post(new Runnable() {
                public final void run() {
                    Listener listener = RemoteSurfaceTextureService.this.a;
                    if (listener != null) {
                        listener.aO_();
                    }
                }
            });
        }
    }

    public RemoteSurfaceTexture(Handler handler, nai nai) {
        amqw.a((Object) nai);
        this.a = new RemoteSurfaceTextureService(handler);
        try {
            nai.a(this.a);
        } catch (RemoteException unused) {
        }
    }
}
