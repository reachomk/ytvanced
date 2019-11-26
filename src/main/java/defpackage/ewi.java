package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Deprecated
/* renamed from: ewi */
public final class ewi {
    private static final Comparator a = new ewh();
    private final Handler b;
    private final List c;
    private final ewf d;
    private final Runnable e = new ewk(this);
    private final Runnable f = new ewj(this);
    private ewm g;

    public ewi(Handler handler, ewf ewf) {
        ArrayList arrayList = new ArrayList();
        this.b = handler;
        this.d = ewf;
        this.c = arrayList;
    }

    private final synchronized boolean a(Class cls) {
        boolean z;
        for (ewm isInstance : this.c) {
            if (cls.isInstance(isInstance)) {
                z = true;
                break;
            }
        }
        z = false;
        return z;
    }

    public final synchronized void a(ewm ewm) {
        if (!a(ewm.getClass())) {
            this.c.add(ewm);
            Collections.sort(this.c, a);
            if (this.g == null || a.compare(this.g, ewm) > 0) {
                a(true);
            }
        }
    }

    public final synchronized void b(ewm ewm) {
        if (this.c.remove(ewm) && this.g == ewm) {
            this.d.b(ewm);
            this.g = null;
            a(true);
        }
    }

    public final void a() {
        a(false);
    }

    public final void b() {
        a(true);
    }

    private final void a(boolean z) {
        if (z) {
            this.b.post(this.e);
            return;
        }
        this.b.post(this.f);
        this.b.removeCallbacks(this.e);
        this.b.postDelayed(this.e, 500);
    }

    public final synchronized void c() {
        ewm ewm = this.g;
        if (!(ewm == null || ewm.b())) {
            this.d.b(this.g);
            this.g = null;
        }
    }

    public final synchronized void d() {
        c();
        for (ewm ewm : this.c) {
            if (ewm.b()) {
                ewm ewm2 = this.g;
                if (ewm2 != null) {
                    if (ewm2 != ewm) {
                        this.d.b(ewm2);
                    }
                }
                this.g = ewm;
                this.d.a(ewm);
                return;
            }
        }
    }
}
