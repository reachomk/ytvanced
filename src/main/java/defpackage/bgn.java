package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Method;

/* renamed from: bgn */
final class bgn implements bgl {
    public static Class a;
    public static Method b;
    public static boolean c;
    public static Method d;
    public static boolean e;
    private static boolean f;
    private final View g;

    public bgn(View view) {
        this.g = view;
    }

    public final void a(ViewGroup viewGroup, View view) {
    }

    public final void setVisibility(int i) {
        this.g.setVisibility(i);
    }

    public static void a() {
        if (!f) {
            try {
                a = Class.forName("android.view.GhostView");
            } catch (ClassNotFoundException unused) {
            }
            f = true;
        }
    }
}
