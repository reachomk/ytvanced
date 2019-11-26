package defpackage;

import android.view.View;

/* renamed from: mvr */
public final class mvr {
    public boolean a;
    private final mub b;

    public mvr(mub mub) {
        this.b = mub;
    }

    public final mvq a() {
        if (this.a) {
            return mvq.OBSCURED;
        }
        if (!this.b.f()) {
            return mvq.OVERLAPPING;
        }
        ClassLoader classLoader = View.class.getClassLoader();
        ClassLoader classLoader2 = mta.class.getClassLoader();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (i < length) {
            try {
                Class cls = Class.forName(stackTrace[i].getClassName());
                if (!cls.getClassLoader().equals(classLoader) && !cls.getClassLoader().equals(classLoader2)) {
                    return mvq.STACK_UNCLEAN;
                }
                i++;
            } catch (ClassNotFoundException unused) {
            }
        }
        return mvq.VALID;
    }
}
