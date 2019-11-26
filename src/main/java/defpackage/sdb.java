package defpackage;

import android.app.Notification;
import java.util.List;

/* renamed from: sdb */
final class sdb extends sbr {
    private final /* synthetic */ scy a;

    sdb(scy scy) {
        this.a = scy;
    }

    public final void c(int i) {
        this.a.stopSelf();
    }

    public final void c() {
        this.a.stopSelf();
    }

    public final void m() {
        scy scy = this.a;
        scy.a(scy.f.E);
    }

    public final void a(boolean z) {
        scy scy = this.a;
        int i = z ^ 1;
        scy.e = i;
        if (i != 0) {
            Notification notification = scy.d;
            if (notification != null) {
                scy.startForeground(1, notification);
                return;
            }
        }
        scy.stopForeground(true);
    }

    public final void a(List list, pjy pjy) {
        int size;
        int indexOf;
        boolean z = false;
        if (list != null) {
            size = list.size();
            indexOf = list.indexOf(pjy);
        } else {
            indexOf = 0;
            size = 0;
        }
        scy scy = this.a;
        scy.i = indexOf < size + -1;
        if (indexOf > 0) {
            z = true;
        }
        scy.j = z;
    }
}
