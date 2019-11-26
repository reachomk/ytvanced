package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: aky */
public final class aky {
    public static final Mode a = Mode.SRC_IN;
    private static aky b;
    private aqk c;

    public static synchronized void a() {
        synchronized (aky.class) {
            if (b == null) {
                aky aky = new aky();
                b = aky;
                aky.c = aqk.a();
                b.c.a(new alb());
            }
        }
    }

    public static synchronized aky b() {
        aky aky;
        synchronized (aky.class) {
            if (b == null) {
                aky.a();
            }
            aky = b;
        }
        return aky;
    }

    public final synchronized Drawable a(Context context, int i) {
        return this.c.a(context, i);
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized Drawable b(Context context, int i) {
        return this.c.a(context, i, true);
    }

    public final synchronized void a(Context context) {
        this.c.a(context);
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized ColorStateList c(Context context, int i) {
        return this.c.b(context, i);
    }

    static void a(Drawable drawable, ary ary, int[] iArr) {
        aqk.a(drawable, ary, iArr);
    }

    public static synchronized PorterDuffColorFilter a(int i, Mode mode) {
        PorterDuffColorFilter a;
        synchronized (aky.class) {
            a = aqk.a(i, mode);
        }
        return a;
    }
}
