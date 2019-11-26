package defpackage;

import android.os.Handler;
import java.util.HashSet;
import java.util.Set;

/* renamed from: xod */
final class xod implements Runnable {
    public final Handler a;
    public final Set b = new HashSet();
    public boolean c = true;
    public int d = -1;
    private final boolean e;

    public xod(Handler handler, boolean z) {
        this.a = handler;
        this.e = z;
    }

    public final void run() {
        int i = this.d;
        boolean z = true;
        if (this.e ? i == 0 || i == 2 : i == 1 || i == 3) {
            z = false;
        }
        for (xoc xoc : this.b) {
            if (this.c) {
                xoc.a(z, i);
            } else {
                xoc.b(z, i);
            }
        }
        this.c = false;
    }
}
