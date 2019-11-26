package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;

/* renamed from: gbj */
public final class gbj {
    public static void a(Drawable drawable, int i) {
        ((TransitionDrawable) drawable).reverseTransition(i);
    }

    public static void a(Drawable drawable) {
        ((TransitionDrawable) drawable).startTransition(200);
    }
}
