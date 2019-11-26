package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.view.KeyEvent;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IControlsOverlayService.Stub;
import defpackage.aajq;
import defpackage.acwc;
import defpackage.aibb;
import defpackage.aibe;
import defpackage.aicd;
import defpackage.aich;
import defpackage.aifc;
import defpackage.aiff;
import defpackage.aigc;
import defpackage.aigf;
import defpackage.aihv;
import defpackage.aihy;
import defpackage.ainz;
import defpackage.ajis;
import defpackage.amqw;
import defpackage.muy;
import defpackage.muz;
import defpackage.mzj;
import defpackage.xci;
import java.util.List;
import java.util.Map;

public final class RemoteControlsOverlay implements aibb, aifc, aigc, aihv, muz {
    public mzj a;
    private final ControlsOverlayService b;

    final class ControlsOverlayService extends Stub {
        public aibe a;
        public aigf b;
        public aihy c;
        public aiff d;
        public volatile boolean e;
        private final Handler f;
        private final xci g;
        private final EmbedInteractionLoggerCoordinator h;

        public ControlsOverlayService(Handler handler, xci xci, EmbedInteractionLoggerCoordinator embedInteractionLoggerCoordinator) {
            this.f = (Handler) amqw.a((Object) handler, (Object) "uiHandler cannot be null");
            this.g = (xci) amqw.a((Object) xci, (Object) "eventBus cannot be null");
            this.h = (EmbedInteractionLoggerCoordinator) amqw.a((Object) embedInteractionLoggerCoordinator, (Object) "embedInteractionLoggerCoordinator cannot be null");
        }

        public final void a() {
            this.f.post(new Runnable() {
                public final void run() {
                    ControlsOverlayService.this.a(ainz.PLAYER_CONTROL);
                    ControlsOverlayService.this.a.aJ_();
                    ControlsOverlayService.this.e = false;
                }
            });
        }

        public final void b() {
            this.f.post(new Runnable() {
                public final void run() {
                    ControlsOverlayService.this.a.d();
                    ControlsOverlayService.this.e = false;
                }
            });
        }

        public final void c() {
            this.f.post(new Runnable() {
                public final void run() {
                    ControlsOverlayService.this.a(ainz.PLAYER_CONTROL);
                    ControlsOverlayService.this.a.e();
                    ControlsOverlayService.this.e = false;
                }
            });
        }

        public final void a(final long j) {
            this.f.post(new Runnable() {
                public final void run() {
                    ControlsOverlayService.this.a(ainz.PLAYER_CONTROL);
                    ControlsOverlayService.this.a.b(j);
                    ControlsOverlayService.this.e = false;
                }
            });
        }

        public final void d() {
            this.f.post(new Runnable() {
                public final void run() {
                    ControlsOverlayService.this.a(ainz.NAVIGATION);
                    ControlsOverlayService.this.d.b();
                    ControlsOverlayService.this.e = false;
                }
            });
        }

        public final void e() {
            this.f.post(new Runnable() {
                public final void run() {
                    ControlsOverlayService.this.a(ainz.NAVIGATION);
                    ControlsOverlayService.this.d.a();
                    ControlsOverlayService.this.e = false;
                }
            });
        }

        public final void a(final int i) {
            this.f.post(new Runnable() {
                public final void run() {
                    ControlsOverlayService.this.a(ainz.PLAYER_CONTROL);
                    ControlsOverlayService.this.c.a(i);
                    ControlsOverlayService.this.e = false;
                }
            });
        }

        public final void f() {
            this.f.post(new Runnable() {
                public final void run() {
                    ControlsOverlayService.this.a.f();
                    ControlsOverlayService.this.e = false;
                }
            });
        }

        public final void g() {
            this.f.post(new Runnable() {
                public final void run() {
                    ControlsOverlayService.this.a.g();
                    ControlsOverlayService.this.e = false;
                }
            });
            this.h.a(acwc.PLAYER_YOU_TUBE_BUTTON);
        }

        public final void h() {
            this.f.post(new Runnable() {
                public final void run() {
                    ControlsOverlayService.this.a.h();
                    ControlsOverlayService.this.e = false;
                }
            });
        }

        public final void a(final boolean z) {
            this.f.post(new Runnable() {
                public final void run() {
                    ControlsOverlayService.this.a.b(z);
                    ControlsOverlayService.this.e = false;
                }
            });
        }

        public final void i() {
            this.f.post(new Runnable() {
                public final void run() {
                    ControlsOverlayService.this.a(ainz.PLAYER_CONTROL);
                    ControlsOverlayService.this.a.i();
                    ControlsOverlayService.this.e = false;
                }
            });
        }

        public final void j() {
            this.f.post(new Runnable() {
                public final void run() {
                    ControlsOverlayService.this.a(ainz.PLAYER_CONTROL);
                    ControlsOverlayService.this.a.j();
                    ControlsOverlayService.this.e = false;
                }
            });
        }

        public final void a(final ajis ajis) {
            this.f.post(new Runnable() {
                public final void run() {
                    ControlsOverlayService.this.b.a(ajis);
                    ControlsOverlayService.this.e = false;
                }
            });
        }

        public final void k() {
            this.f.post(new Runnable() {
                public final void run() {
                    ControlsOverlayService.this.a.k();
                    ControlsOverlayService.this.e = false;
                }
            });
        }

        public final void l() {
            this.f.post(new Runnable() {
                public final void run() {
                    ControlsOverlayService.this.e = true;
                }
            });
        }

        public final void a(ainz ainz) {
            if (this.e) {
                this.g.c(ainz);
            }
        }
    }

    public RemoteControlsOverlay(Context context, Handler handler, xci xci, mzj mzj, EmbedInteractionLoggerCoordinator embedInteractionLoggerCoordinator) {
        amqw.a((Object) context, (Object) "context cannot be null");
        amqw.a((Object) handler, (Object) "uiHandler cannot be null");
        this.a = (mzj) amqw.a((Object) mzj, (Object) "client cannot be null");
        this.b = new ControlsOverlayService(handler, xci, embedInteractionLoggerCoordinator);
        try {
            mzj.a(this.b);
        } catch (RemoteException unused) {
        }
    }

    public final void a(muy muy) {
    }

    public final void g() {
    }

    public final void a(aibe aibe) {
        this.b.a = (aibe) amqw.a((Object) aibe);
    }

    public final void a(aigf aigf) {
        this.b.b = aigf;
    }

    public final void a(aihy aihy) {
        this.b.c = aihy;
    }

    public final void a(aiff aiff) {
        this.b.d = aiff;
    }

    public final void a(aicd aicd) {
        mzj mzj = this.a;
        if (mzj != null) {
            try {
                mzj.a(aicd);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void g(boolean z) {
        mzj mzj = this.a;
        if (mzj != null) {
            try {
                mzj.a(z);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void a(aajq[] aajqArr, int i, boolean z) {
        mzj mzj = this.a;
        if (mzj != null) {
            try {
                mzj.a(aajqArr, i);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void h_(boolean z) {
        mzj mzj = this.a;
        if (mzj != null) {
            try {
                mzj.b(z);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void c_(boolean z) {
        mzj mzj = this.a;
        if (mzj != null) {
            try {
                mzj.c(z);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void b(boolean z) {
        mzj mzj = this.a;
        if (mzj != null) {
            try {
                mzj.d(z);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void b_(boolean z) {
        mzj mzj = this.a;
        if (mzj != null) {
            try {
                mzj.e(z);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void e() {
        mzj mzj = this.a;
        if (mzj != null) {
            try {
                mzj.b();
            } catch (RemoteException unused) {
            }
        }
    }

    public final void f() {
        mzj mzj = this.a;
        if (mzj != null) {
            try {
                mzj.c();
            } catch (RemoteException unused) {
            }
        }
    }

    public final void a(aich aich) {
        mzj mzj = this.a;
        if (mzj != null) {
            try {
                mzj.a(aich);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void a(String str, boolean z) {
        mzj mzj = this.a;
        if (mzj != null) {
            try {
                mzj.a(str, z);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void c(boolean z) {
        mzj mzj = this.a;
        if (mzj != null) {
            try {
                mzj.f(z);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void a(Map map) {
        mzj mzj = this.a;
        if (mzj != null) {
            try {
                mzj.a(map);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void a(long j, long j2, long j3, long j4) {
        mzj mzj = this.a;
        if (mzj != null) {
            try {
                mzj.a(j, j2, j3, j4);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void au_() {
        mzj mzj = this.a;
        if (mzj != null) {
            try {
                mzj.d();
            } catch (RemoteException unused) {
            }
        }
    }

    public final void h() {
        mzj mzj = this.a;
        if (mzj != null) {
            try {
                mzj.e();
            } catch (RemoteException unused) {
            }
        }
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        mzj mzj = this.a;
        if (mzj != null) {
            try {
                mzj.a(i, keyEvent);
            } catch (RemoteException unused) {
            }
        }
        return true;
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        mzj mzj = this.a;
        if (mzj != null) {
            try {
                mzj.b(i, keyEvent);
            } catch (RemoteException unused) {
            }
        }
        return true;
    }

    public final void d(boolean z) {
        mzj mzj = this.a;
        if (mzj != null) {
            try {
                mzj.g(z);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void e(boolean z) {
        mzj mzj = this.a;
        if (mzj != null) {
            try {
                mzj.h(z);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void a(ajis ajis) {
        mzj mzj = this.a;
        if (mzj != null) {
            try {
                mzj.a(ajis);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void i() {
        mzj mzj = this.a;
        if (mzj != null) {
            try {
                mzj.f();
            } catch (RemoteException unused) {
            }
        }
    }

    public final void a(List list) {
        mzj mzj = this.a;
        if (mzj != null) {
            try {
                mzj.a(list);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void d_(boolean z) {
        mzj mzj = this.a;
        if (mzj != null) {
            try {
                mzj.i(z);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void a(CharSequence charSequence) {
        mzj mzj = this.a;
        if (mzj != null) {
            try {
                mzj.a(charSequence.toString());
            } catch (RemoteException unused) {
            }
        }
    }

    public final void f(boolean z) {
        mzj mzj = this.a;
        if (mzj != null) {
            try {
                mzj.j(z);
            } catch (RemoteException unused) {
            }
        }
    }
}
