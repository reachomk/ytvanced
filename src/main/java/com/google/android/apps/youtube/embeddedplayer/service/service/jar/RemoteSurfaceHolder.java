package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Handler;
import android.os.RemoteException;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.ISurfaceHolderService.Stub;
import defpackage.amqw;
import defpackage.nah;
import defpackage.xtl;
import java.util.ArrayList;
import java.util.List;

public final class RemoteSurfaceHolder implements SurfaceHolder {
    public final Handler a;
    public final List b = new ArrayList();
    public nah c;
    public Surface d;
    private DefaultSurfaceHolderService e = new DefaultSurfaceHolderService();

    final class DefaultSurfaceHolderService extends Stub {
        public final void a(final int i, final int i2, final int i3) {
            RemoteSurfaceHolder.this.a.post(new Runnable() {
                public final void run() {
                    RemoteSurfaceHolder remoteSurfaceHolder = RemoteSurfaceHolder.this;
                    int i = i;
                    int i2 = i2;
                    int i3 = i3;
                    for (Callback surfaceChanged : remoteSurfaceHolder.b) {
                        surfaceChanged.surfaceChanged(remoteSurfaceHolder, i, i2, i3);
                    }
                }
            });
        }

        public final void a() {
            RemoteSurfaceHolder.this.a.post(new Runnable() {
                public final void run() {
                    Surface surface = RemoteSurfaceHolder.this.d;
                    if (surface != null) {
                        surface.release();
                        RemoteSurfaceHolder remoteSurfaceHolder = RemoteSurfaceHolder.this;
                        remoteSurfaceHolder.d = null;
                        remoteSurfaceHolder.a();
                    }
                }
            });
        }

        public final void a(final Surface surface) {
            RemoteSurfaceHolder.this.a.post(new Runnable() {
                public final void run() {
                    RemoteSurfaceHolder remoteSurfaceHolder = RemoteSurfaceHolder.this;
                    remoteSurfaceHolder.d = surface;
                    for (Callback surfaceCreated : remoteSurfaceHolder.b) {
                        surfaceCreated.surfaceCreated(remoteSurfaceHolder);
                    }
                }
            });
        }

        /* synthetic */ DefaultSurfaceHolderService() {
        }
    }

    public RemoteSurfaceHolder(Handler handler, nah nah) {
        this.a = (Handler) amqw.a((Object) handler, (Object) "uiHandler cannot be null");
        this.c = (nah) amqw.a((Object) nah, (Object) "client cannot be null");
        try {
            nah.a(this.e);
        } catch (RemoteException unused) {
        }
    }

    public final void a() {
        for (Callback surfaceDestroyed : this.b) {
            surfaceDestroyed.surfaceDestroyed(this);
        }
    }

    public final void addCallback(Callback callback) {
        if (!this.b.contains(callback)) {
            this.b.add(callback);
        }
    }

    public final void removeCallback(Callback callback) {
        this.b.remove(callback);
    }

    public final Surface getSurface() {
        return this.d;
    }

    public final boolean isCreating() {
        nah nah = this.c;
        if (nah != null) {
            try {
                return nah.a();
            } catch (RemoteException unused) {
            }
        }
        return false;
    }

    public final Rect getSurfaceFrame() {
        nah nah = this.c;
        if (nah != null) {
            try {
                return nah.b();
            } catch (RemoteException unused) {
            }
        }
        return new Rect();
    }

    public final void setKeepScreenOn(boolean z) {
        xtl.d("setKeepScreenOn should be through player Surface, not SurfaceHolder");
        nah nah = this.c;
        if (nah != null) {
            try {
                nah.a(z);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void setFixedSize(int i, int i2) {
        nah nah = this.c;
        if (nah != null) {
            try {
                nah.a(i, i2);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void setFormat(int i) {
        nah nah = this.c;
        if (nah != null) {
            try {
                nah.a(i);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void setSizeFromLayout() {
        nah nah = this.c;
        if (nah != null) {
            try {
                nah.c();
            } catch (RemoteException unused) {
            }
        }
    }

    @Deprecated
    public final void setType(int i) {
        nah nah = this.c;
        if (nah != null) {
            try {
                nah.b(i);
            } catch (RemoteException unused) {
            }
        }
    }

    public final Canvas lockCanvas() {
        throw new UnsupportedOperationException("Unsupported call to lockCanvas");
    }

    public final Canvas lockCanvas(Rect rect) {
        throw new UnsupportedOperationException("Unsupported call to lockCanvas");
    }

    public final void unlockCanvasAndPost(Canvas canvas) {
        throw new UnsupportedOperationException("Unsupported call to unlockCanvasAndPost");
    }
}
