package defpackage;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnSystemUiVisibilityChangeListener;
import android.view.Window;

/* renamed from: zjk */
public final class zjk extends Handler implements OnSystemUiVisibilityChangeListener {
    public final Window a;
    public final int b;
    public boolean c;
    public boolean d;
    private final View e;
    private int f;

    public zjk(Window window, View view) {
        this.e = (View) amqw.a((Object) view);
        this.a = (Window) amqw.a((Object) window);
        view.setOnSystemUiVisibilityChangeListener(this);
        this.f = view.getSystemUiVisibility();
        if (VERSION.SDK_INT >= 21) {
            this.b = window.getNavigationBarColor();
        } else {
            this.b = 0;
        }
    }

    public final void a(int i) {
        if (VERSION.SDK_INT >= 21) {
            this.a.setNavigationBarColor(i);
        }
    }

    public final void onSystemUiVisibilityChange(int i) {
        this.f = i;
        b();
    }

    public final void handleMessage(Message message) {
        if (message.what == 0) {
            a();
        }
    }

    private final void b() {
        removeMessages(0);
        int i = this.f;
        boolean z = true;
        boolean z2 = (i & 5380) == 5380;
        if ((i & 768) != 768) {
            z = false;
        }
        if (this.c != z2 || this.d != z) {
            sendEmptyMessageDelayed(0, 500);
        }
    }

    public final void a() {
        b();
        int i = !this.c ? 0 : 5380;
        if (this.d) {
            i |= 768;
        }
        this.e.setSystemUiVisibility(i);
    }
}
