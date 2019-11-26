package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: aoh */
public final class aoh extends aoa implements aoi {
    public static Method a;
    public aoi b;

    public aoh(Context context, int i, int i2) {
        super(context, null, i, i2);
    }

    /* Access modifiers changed, original: final */
    public final amt a(Context context, boolean z) {
        aok aok = new aok(context, z);
        aok.c = this;
        return aok;
    }

    public final void b(aiw aiw, MenuItem menuItem) {
        aoi aoi = this.b;
        if (aoi != null) {
            aoi.b(aiw, menuItem);
        }
    }

    public final void a(aiw aiw, MenuItem menuItem) {
        aoi aoi = this.b;
        if (aoi != null) {
            aoi.a(aiw, menuItem);
        }
    }

    static {
        try {
            a = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException unused) {
        }
    }
}
