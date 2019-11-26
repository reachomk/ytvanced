package defpackage;

import android.text.Editable;
import android.text.Editable.Factory;

/* renamed from: axy */
final class axy extends Factory {
    private static final Object a = new Object();
    private static volatile Factory b;
    private static Class c;

    private axy() {
        try {
            c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, getClass().getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Factory a() {
        if (b == null) {
            synchronized (a) {
                if (b == null) {
                    b = new axy();
                }
            }
        }
        return b;
    }

    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        if (cls != null) {
            return new ayk(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
