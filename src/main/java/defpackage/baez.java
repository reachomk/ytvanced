package defpackage;

import android.util.Log;

/* renamed from: baez */
public final class baez {
    private static final Class a;
    private final Object b;

    static baez a(Object obj) {
        if (obj == null || a == null) {
            return null;
        }
        return new baez(obj);
    }

    private baez(Object obj) {
        this.b = obj;
    }

    public final int a() {
        return a("getSafeInsetTop");
    }

    public final int b() {
        return a("getSafeInsetBottom");
    }

    public final int c() {
        return a("getSafeInsetLeft");
    }

    public final int d() {
        return a("getSafeInsetRight");
    }

    private final int a(String str) {
        try {
            return ((Integer) a.getDeclaredMethod(str, new Class[0]).invoke(this.b, new Object[0])).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    static {
        Class cls = null;
        if (bafa.a()) {
            try {
                cls = Class.forName("android.view.DisplayCutout");
            } catch (Exception unused) {
                Log.e("AndroidPCompat", "Failed to obtain DisplayCutout API.");
            }
        }
        a = cls;
    }
}
