package defpackage;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

/* renamed from: ry */
public abstract class ry {
    public abstract void a();

    public abstract void a(Typeface typeface);

    public final void b(Typeface typeface) {
        new Handler(Looper.getMainLooper()).post(new sb(this, typeface));
    }

    public final void a(int i) {
        new Handler(Looper.getMainLooper()).post(new sa(this, i));
    }
}
