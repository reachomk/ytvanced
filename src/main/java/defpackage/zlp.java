package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;

/* renamed from: zlp */
final class zlp implements Runnable {
    private final /* synthetic */ zld a;

    zlp(zld zld) {
        this.a = zld;
    }

    public final void run() {
        if (!this.a.k && this.a.l) {
            zld zld = this.a;
            if (zld.i.Q && zld.o()) {
                zld = this.a;
                zkk zkk = zld.i;
                Bitmap bitmap = zld.r;
                zkk.b.removeMessages(12);
                Handler handler = zkk.b;
                handler.sendMessage(handler.obtainMessage(12, bitmap));
                return;
            }
            this.a.q();
        }
    }
}
