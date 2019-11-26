package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.vr.sdk.proto.Display$DisplayParams;

/* renamed from: bafh */
public final class bafh {
    public static float a(float f) {
        return 0.0254f / f;
    }

    public static Display a(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public static DisplayMetrics a(Display display) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getRealMetrics(displayMetrics);
        if (displayMetrics.widthPixels < displayMetrics.heightPixels) {
            int i = displayMetrics.widthPixels;
            displayMetrics.widthPixels = displayMetrics.heightPixels;
            displayMetrics.heightPixels = i;
        }
        float f = displayMetrics.xdpi;
        displayMetrics.xdpi = displayMetrics.ydpi;
        displayMetrics.ydpi = f;
        return displayMetrics;
    }

    public static DisplayMetrics a(Display display, Display$DisplayParams display$DisplayParams) {
        DisplayMetrics a = bafh.a(display);
        if (display$DisplayParams != null) {
            if (display$DisplayParams.hasXPpi()) {
                a.xdpi = display$DisplayParams.getXPpi();
            }
            if (display$DisplayParams.hasYPpi()) {
                a.ydpi = display$DisplayParams.getYPpi();
            }
        }
        return a;
    }

    public static float a(Display$DisplayParams display$DisplayParams) {
        return (display$DisplayParams == null || !display$DisplayParams.hasBottomBezelHeight()) ? 0.003f : display$DisplayParams.getBottomBezelHeight();
    }

    public static String b(Context context) {
        Resources resources = context.getResources();
        try {
            return resources.getString(resources.getIdentifier("display_manager_hdmi_display_name", "string", "android"));
        } catch (NotFoundException unused) {
            return null;
        }
    }
}
