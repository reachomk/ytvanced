package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IAdOverlayService.Stub;
import defpackage.amqw;
import defpackage.myy;
import defpackage.wae;

public class RemoteAdOverlay implements PrimitiveAdOverlay {
    public myy a;
    private final AdOverlayService b;

    final class AdOverlayService extends Stub implements wae {
        public wae a;
        private final Handler b;

        public AdOverlayService(Handler handler) {
            this.b = (Handler) amqw.a((Object) handler, (Object) "uiHandler cannot be null");
        }

        public final void a(float f) {
        }

        public final void a(boolean z) {
        }

        public final void d() {
        }

        public final void a() {
            this.b.post(new Runnable() {
                public final void run() {
                    AdOverlayService.this.a.a();
                }
            });
        }

        public final void a(final Bundle bundle) {
            this.b.post(new Runnable() {
                public final void run() {
                    AdOverlayService.this.a.a(bundle);
                }
            });
        }

        public final void b() {
            this.b.post(new Runnable() {
                public final void run() {
                    AdOverlayService.this.a.b();
                }
            });
        }

        public final void a(final int i, final int i2) {
            this.b.post(new Runnable() {
                public final void run() {
                    AdOverlayService.this.a.a(i, i2);
                }
            });
        }

        public final void c() {
            this.b.post(new Runnable() {
                public final void run() {
                    AdOverlayService.this.a.c();
                }
            });
        }
    }

    public RemoteAdOverlay(Handler handler, myy myy) {
        this.a = (myy) amqw.a((Object) myy, (Object) "client cannot be null");
        amqw.a((Object) handler, (Object) "ui handler cannot be null");
        this.b = new AdOverlayService(handler);
        try {
            myy.a(this.b);
        } catch (RemoteException unused) {
        }
    }

    public final void a(wae wae) {
        this.b.a = (wae) amqw.a((Object) wae, (Object) "listener cannot be null");
    }

    public final void d(boolean z) {
        myy myy = this.a;
        if (myy != null) {
            try {
                myy.a(z);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void e(boolean z) {
        myy myy = this.a;
        if (myy != null) {
            try {
                myy.b(z);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void a(boolean z) {
        myy myy = this.a;
        if (myy != null) {
            try {
                myy.c(z);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void b(int i) {
        myy myy = this.a;
        if (myy != null) {
            try {
                myy.b(i);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void c(boolean z) {
        myy myy = this.a;
        if (myy != null) {
            try {
                myy.d(z);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void a(CharSequence charSequence) {
        try {
            this.a.a(charSequence);
        } catch (RemoteException unused) {
        }
    }

    public final void a(Bitmap bitmap) {
        try {
            this.a.a(bitmap);
        } catch (RemoteException unused) {
        }
    }

    public final void a(int i) {
        myy myy = this.a;
        if (myy != null) {
            try {
                myy.a(i);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void b(boolean z) {
        myy myy = this.a;
        if (myy != null) {
            try {
                myy.e(z);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void b(CharSequence charSequence) {
        myy myy = this.a;
        if (myy != null) {
            try {
                myy.b(charSequence);
            } catch (RemoteException unused) {
            }
        }
    }
}
