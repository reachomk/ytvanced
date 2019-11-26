package defpackage;

import android.content.Context;
import android.graphics.Typeface;

/* renamed from: syu */
public final class syu implements syl {
    private final sxd a;

    public syu(sxd sxd) {
        this.a = sxd;
    }

    public final Typeface a(Context context, String str) {
        if (str.startsWith("fonts/")) {
            try {
                return Typeface.createFromAsset(context.getAssets(), str);
            } catch (RuntimeException e) {
                sxd sxd = this.a;
                String str2 = "Failed to load font ";
                if (str.length() == 0) {
                    str = new String(str2);
                } else {
                    str = str2.concat(str);
                }
                sxd.a(3, str, e);
            }
        }
        return null;
    }
}
