package defpackage;

import android.os.Build.VERSION;
import android.text.Layout;
import android.text.StaticLayout;

/* renamed from: clk */
public final class clk {
    public static int a(Layout layout) {
        int i = 0;
        if (layout == null) {
            return 0;
        }
        if (VERSION.SDK_INT < 20 && (layout instanceof StaticLayout)) {
            float lineDescent = (float) (layout.getLineDescent(layout.getLineCount() - 1) - layout.getLineAscent(layout.getLineCount() - 1));
            lineDescent -= (lineDescent - layout.getSpacingAdd()) / layout.getSpacingMultiplier();
            double d;
            if (lineDescent < 0.0f) {
                d = (double) (-lineDescent);
                Double.isNaN(d);
                i = -((int) (d + 0.5d));
            } else {
                d = (double) lineDescent;
                Double.isNaN(d);
                i = (int) (d + 0.5d);
            }
        }
        return layout.getHeight() - i;
    }
}
