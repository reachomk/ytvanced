package defpackage;

import android.content.Context;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: xso */
public final class xso {
    public static boolean a(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (defaultDisplay == null || Math.min(defaultDisplay.getWidth(), defaultDisplay.getHeight()) > 359) {
            return false;
        }
        return true;
    }
}
