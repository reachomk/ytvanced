package defpackage;

import android.content.Intent;
import android.media.session.MediaSession.Callback;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;

/* renamed from: wv */
public class wv {
    public final Callback a;
    public WeakReference b;
    private wu c = null;
    private boolean d;

    public wv() {
        if (VERSION.SDK_INT >= 21) {
            this.a = new wx(this);
        } else {
            this.a = null;
        }
    }

    public void a(long j) {
    }

    public void a(Uri uri) {
    }

    public void a(vo voVar) {
    }

    public void b() {
    }

    public void c() {
    }

    public void d() {
    }

    public void e() {
    }

    public void f() {
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }

    public void j() {
    }

    public void k() {
    }

    public void l() {
    }

    public void m() {
    }

    public void n() {
    }

    /* Access modifiers changed, original: final */
    public final void a(ww wwVar, Handler handler) {
        this.b = new WeakReference(wwVar);
        wu wuVar = this.c;
        if (wuVar != null) {
            wuVar.removeCallbacksAndMessages(null);
        }
        this.c = new wu(this, handler.getLooper());
    }

    public boolean a(Intent intent) {
        if (VERSION.SDK_INT < 27) {
            ww wwVar = (ww) this.b.get();
            if (!(wwVar == null || this.c == null)) {
                KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
                if (keyEvent != null && keyEvent.getAction() == 0) {
                    vk i = wwVar.i();
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 79 || keyCode == 85) {
                        if (keyEvent.getRepeatCount() > 0) {
                            a();
                        } else if (this.d) {
                            this.c.removeMessages(1);
                            this.d = false;
                            xs e = wwVar.e();
                            if (((e != null ? e.e : 0) & 32) != 0) {
                                j();
                            }
                        } else {
                            this.d = true;
                            wu wuVar = this.c;
                            wuVar.sendMessageDelayed(wuVar.obtainMessage(1, i), (long) ViewConfiguration.getDoubleTapTimeout());
                        }
                        return true;
                    }
                    a();
                    return false;
                }
            }
        }
        return false;
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        if (this.d) {
            boolean z = false;
            this.d = false;
            this.c.removeMessages(1);
            ww wwVar = (ww) this.b.get();
            if (wwVar != null) {
                xs e = wwVar.e();
                long j = e != null ? e.e : 0;
                if (e != null && e.a == 3) {
                    z = true;
                }
                long j2 = 516 & j;
                j &= 514;
                if (z) {
                    if (j != 0) {
                        i();
                    }
                } else if (j2 != 0) {
                    f();
                }
            }
        }
    }
}
