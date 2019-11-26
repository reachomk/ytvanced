package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;

/* renamed from: agk */
final class agk implements Callback {
    public Callback a;

    agk() {
    }

    public final void invalidateDrawable(Drawable drawable) {
    }

    public final Callback a() {
        Callback callback = this.a;
        this.a = null;
        return callback;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Callback callback = this.a;
        if (callback != null) {
            callback.scheduleDrawable(drawable, runnable, j);
        }
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Callback callback = this.a;
        if (callback != null) {
            callback.unscheduleDrawable(drawable, runnable);
        }
    }
}
