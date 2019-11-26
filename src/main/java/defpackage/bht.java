package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Property;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: bht */
final class bht {
    public static final Property a = new bhs(Float.class, "translationAlpha");
    private static final bhz b;
    private static Field c;
    private static boolean d;

    static bif a(View view) {
        return new bic(view);
    }

    static void a(View view, float f) {
        b.a(view, f);
    }

    static float b(View view) {
        return b.a(view);
    }

    static void a(View view, int i) {
        bht.a();
        Field field = c;
        if (field != null) {
            try {
                c.setInt(view, i | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused) {
            }
        }
    }

    static void a(View view, Matrix matrix) {
        b.a(view, matrix);
    }

    static void b(View view, Matrix matrix) {
        b.b(view, matrix);
    }

    static void c(View view, Matrix matrix) {
        b.c(view, matrix);
    }

    static void a(View view, int i, int i2, int i3, int i4) {
        b.a(view, i, i2, i3, i4);
    }

    private static void a() {
        if (!d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            d = true;
        }
    }

    static {
        if (VERSION.SDK_INT >= 22) {
            b = new bhw();
        } else if (VERSION.SDK_INT >= 21) {
            b = new bhx();
        } else {
            b = new bhu();
        }
        bhv bhv = new bhv(Rect.class, "clipBounds");
    }
}
