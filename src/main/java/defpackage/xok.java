package defpackage;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnSystemUiVisibilityChangeListener;
import android.view.Window;

/* renamed from: xok */
final class xok extends Handler implements OnSystemUiVisibilityChangeListener {
    public View a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f = true;
    public boolean g;
    public boolean h;
    private final Window i;
    private final xon j;
    private int k = 1;

    public xok(Window window, xon xon) {
        this.i = (Window) amqw.a((Object) window);
        this.j = (xon) amqw.a((Object) xon);
    }

    public final void a(int i) {
        this.k = i;
        removeMessages(0);
        a();
    }

    public final void onSystemUiVisibilityChange(int i) {
        boolean z = false;
        boolean z2 = (this.b & 2) == 0;
        if ((i & 2) == 0) {
            z = true;
        }
        if (z2 != z) {
            this.j.a(z);
        }
        this.b = i;
        b();
    }

    public final void handleMessage(Message message) {
        if (message.what == 0) {
            a();
        }
    }

    private final void b() {
        if (this.a != null) {
            removeMessages(0);
            int i = this.b;
            int i2 = this.c;
            int i3 = 1;
            Object obj = (i2 == 2 && this.k == 0 && !this.g) ? 1 : null;
            int i4 = i & 7;
            Object obj2 = i4 != 7 ? null : 1;
            Object obj3 = (i2 == 2 && this.k == 0 && this.g) ? 1 : null;
            Object obj4 = ((i & 1) == 1 && i4 != 7) ? 1 : null;
            if (obj == obj2 && obj3 == obj4) {
                i3 = 0;
            }
            if (!this.h && i3 != 0) {
                sendEmptyMessageDelayed(0, 2500);
            }
        }
    }

    public final void a() {
        if (this.a != null) {
            b();
            int i = this.c;
            boolean z = false;
            if (i == 2 || i == 1) {
                i = this.k;
                int i2 = 1536;
                if (i == 0) {
                    i2 = 1536 | (!this.g ? 7 : 1);
                } else if (i == 2) {
                    i2 = 1540;
                }
                i = this.e ? i2 | 4096 : i2;
                if (this.f) {
                    i |= 256;
                }
            } else {
                i = 0;
            }
            if (VERSION.SDK_INT >= 28) {
                if (!this.d || this.c == 0) {
                    this.i.getAttributes().layoutInDisplayCutoutMode = 0;
                } else {
                    this.i.getAttributes().layoutInDisplayCutoutMode = 1;
                }
            }
            Object[] objArr = new Object[5];
            objArr[0] = Integer.valueOf(i);
            objArr[1] = Boolean.valueOf(this.c == 2);
            if (this.k == 0) {
                z = true;
            }
            objArr[2] = Boolean.valueOf(z);
            objArr[3] = Boolean.valueOf(this.e);
            objArr[4] = Boolean.valueOf(this.g);
            String.format("FSUI setSystemUiVisibility 0x%08x [fullscreen=%s hideSysUi=%s immersive=%s lowprofile=%s]", objArr);
            this.a.setSystemUiVisibility(i);
            this.j.a();
        }
    }
}
