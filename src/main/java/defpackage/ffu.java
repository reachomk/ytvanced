package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: ffu */
public final class ffu {
    public static final ffu a = new ffu(null, foq.a);
    public final fob b;
    private final WeakReference c;

    public ffu(fgz fgz, fob fob) {
        this.c = new WeakReference(fgz);
        this.b = (fob) amqw.a((Object) fob);
    }

    public final fgz a() {
        return (fgz) this.c.get();
    }

    public final View b() {
        fgz fgz = (fgz) this.c.get();
        return fgz != null ? fgz.a() : null;
    }

    public final void a(boolean z) {
        fgz fgz = (fgz) this.c.get();
        if (fgz != null) {
            fgz.a(z);
        }
    }
}
