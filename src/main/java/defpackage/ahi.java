package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: ahi */
final class ahi implements ahr {
    public final ahm a = new ahm();
    public final /* synthetic */ ahr b;
    private final Handler c = new Handler(Looper.getMainLooper());
    private final Runnable d = new ahl(this);

    ahi(ahr ahr) {
        this.b = ahr;
    }

    public final void a(int i, int i2) {
        a(ahp.a(1, i, i2));
    }

    public final void a(int i, aht aht) {
        a(ahp.a(2, i, (Object) aht));
    }

    public final void b(int i, int i2) {
        a(ahp.a(3, i, i2));
    }

    private final void a(ahp ahp) {
        this.a.b(ahp);
        this.c.post(this.d);
    }
}
