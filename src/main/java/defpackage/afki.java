package defpackage;

import android.content.Context;
import android.os.Looper;
import android.view.ViewGroup;

/* renamed from: afki */
public abstract class afki extends ViewGroup {
    private final Runnable a = new afkl(this);
    private final Runnable b = new afkk(this);
    private int c;

    public afki(Context context) {
        super(context);
    }

    public final void a(int i) {
        i |= this.c;
        this.c = i;
        if (i != 0) {
            a(this.b, this.a, 0);
        }
    }

    public final void b(int i) {
        i = (i ^ -1) & this.c;
        this.c = i;
        if (i == 0) {
            a(this.a, this.b, 0);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(Runnable runnable, Runnable runnable2, int i) {
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        if (i > 0) {
            postDelayed(runnable2, (long) i);
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable2.run();
        } else {
            post(runnable2);
        }
    }
}
