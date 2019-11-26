package defpackage;

import android.content.Intent;
import android.view.KeyEvent;

/* renamed from: qoi */
final class qoi extends wv {
    private final /* synthetic */ qod c;

    qoi(qod qod) {
        this.c = qod;
    }

    public final boolean a(Intent intent) {
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent != null && (keyEvent.getKeyCode() == 127 || keyEvent.getKeyCode() == 126)) {
            this.c.e.o();
        }
        return true;
    }

    public final void f() {
        this.c.e.o();
    }

    public final void i() {
        this.c.e.o();
    }

    public final void n() {
        if (this.c.e.j()) {
            this.c.e.o();
        }
    }
}
