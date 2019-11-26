package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* renamed from: mxk */
final class mxk implements aas {
    private final ClassLoader a;

    public mxk(ClassLoader classLoader) {
        this.a = (ClassLoader) amml.a(classLoader, "remoteClassLoader cannot be null");
    }

    public final View a(String str, Context context, AttributeSet attributeSet) {
        try {
            return (View) this.a.loadClass(str).asSubclass(View.class).getConstructor(mxl.a).newInstance(new Object[]{context, attributeSet});
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoClassDefFoundError | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }
}
