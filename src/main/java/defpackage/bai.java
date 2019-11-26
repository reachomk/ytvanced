package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import com.google.android.youtube.R;

/* renamed from: bai */
public final class bai {
    static Context a(Context context, int i, boolean z) {
        if (i == 0) {
            i = bai.a(context, !z ? R.attr.dialogTheme : R.attr.alertDialogTheme);
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        return bai.a(contextThemeWrapper, R.attr.mediaRouteTheme) != 0 ? new ContextThemeWrapper(contextThemeWrapper, bai.d(contextThemeWrapper)) : contextThemeWrapper;
    }

    static int a(Context context) {
        int a = bai.a(context, R.attr.mediaRouteTheme);
        return a == 0 ? bai.d(context) : a;
    }

    public static int a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(i, typedValue, true) ? typedValue.resourceId : 0;
    }

    public static float b(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842803, typedValue, true)) {
            return typedValue.getFloat();
        }
        return 0.5f;
    }

    public static int b(Context context, int i) {
        if (sc.b(-1, bai.a(context, i, (int) R.attr.colorPrimary)) < 3.0d) {
            return -570425344;
        }
        return -1;
    }

    static void a(Context context, MediaRouteVolumeSlider mediaRouteVolumeSlider, View view) {
        int b = bai.b(context, 0);
        if (Color.alpha(b) != 255) {
            b = sc.a(b, ((Integer) view.getTag()).intValue());
        }
        mediaRouteVolumeSlider.a(b, b);
    }

    public static boolean c(Context context) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(R.attr.isLightTheme, typedValue, true) && typedValue.data != 0;
    }

    public static int a(Context context, int i, int i2) {
        if (i != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{i2});
            int color = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            if (color != 0) {
                return color;
            }
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        if (typedValue.resourceId != 0) {
            return context.getResources().getColor(typedValue.resourceId);
        }
        return typedValue.data;
    }

    public static int d(Context context) {
        int i;
        if (bai.c(context)) {
            if (bai.b(context, 0) == -570425344) {
                return R.style.f509Theme.MediaRouter.Light;
            }
            i = R.style.f510Theme.MediaRouter.Light.DarkControlPanel;
        } else if (bai.b(context, 0) == -570425344) {
            return R.style.f511Theme.MediaRouter.LightControlPanel;
        } else {
            i = R.style.f508Theme.MediaRouter;
        }
        return i;
    }
}
