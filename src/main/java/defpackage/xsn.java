package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Pair;

/* renamed from: xsn */
public final class xsn implements baqa {
    private final bcaa a;

    private xsn(bcaa bcaa) {
        this.a = bcaa;
    }

    public static xsn a(bcaa bcaa) {
        return new xsn(bcaa);
    }

    public static Integer a(Context context) {
        int i = 2160;
        if (!xss.h(context)) {
            i = 480;
        } else if (!xss.a(context, 1080) && !xss.a(1080)) {
            i = 720;
        } else if (!xss.a(context, 1440) && !xss.a(1440)) {
            i = 1080;
        } else if (!(xss.a(context, 2160) || xss.a(2160))) {
            if (xss.a == 0) {
                DisplayMetrics i2 = xss.i(context);
                xss.a = Math.max(i2.widthPixels, i2.heightPixels);
            }
            if (xss.a < 3840) {
                Pair a = xss.a();
                if (a == null || Math.max(((Integer) a.first).intValue(), ((Integer) a.second).intValue()) < 3840) {
                    i = 1440;
                }
            }
        }
        return (Integer) baqd.a(Integer.valueOf(i), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return xsn.a((Context) this.a.get());
    }
}
