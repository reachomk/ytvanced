package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.Looper;

/* renamed from: ajrc */
public enum ajrc {
    ROBOTO_REGULAR(14, "sans-serif", 0, null),
    ROBOTO_LIGHT(16, "sans-serif-light", 1, null),
    ROBOTO_CONDENSED(16, "sans-serif-condensed", 2, null),
    ROBOTO_THIN(17, "sans-serif-thin", 3, null),
    ROBOTO_CONDENSED_LIGHT(20, "sans-serif-condensed-light", 4, null),
    ROBOTO_BLACK(21, "sans-serif-black", 5, null),
    ROBOTO_MEDIUM(21, "sans-serif-medium", 6, "Roboto-Medium.ttf"),
    ROBOTO_MONOSPACE(21, "sans-serif-monospace", 7, null),
    ROBOTO_SMALLCAPS(21, "sans-serif-smallcaps", 8, null),
    YTSANS_MEDIUM("sans-serif-medium", 0, "YTSans-Medium.otf"),
    YTSANS_BOLD("sans-serif-bold", 1, "YTSans-Bold.otf");
    
    private static final aac m = null;
    public final int e;
    private final int n;
    private final String o;
    private final String p;
    private final int q;

    private ajrc(int i, String str, int i2, String str2) {
        this.n = i;
        this.o = str;
        this.q = i2;
        this.p = str2;
        this.e = -1;
    }

    private ajrc(String str, int i, String str2) {
        this.o = str;
        this.e = i;
        this.p = str2;
        this.q = -1;
        this.n = Integer.MAX_VALUE;
    }

    public final Typeface a(Context context, int i) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            int i2 = 0;
            if (i >= 0 && i <= 3) {
                i2 = i;
            }
            Typeface create = VERSION.SDK_INT >= this.n ? Typeface.create(this.o, i2) : null;
            if (create == null) {
                String str = this.p;
                if (str != null) {
                    if (!m.containsKey(str)) {
                        try {
                            m.put(this.p, Typeface.createFromAsset(context.getAssets(), this.p));
                        } catch (RuntimeException unused) {
                            m.put(this.p, null);
                        }
                    }
                    create = (Typeface) m.get(this.p);
                }
            }
            return create == null ? Typeface.create(Typeface.SANS_SERIF, i2) : create;
        } else {
            throw new IllegalStateException("Not in application's main thread");
        }
    }

    public final Typeface a(Context context) {
        return a(context, 0);
    }

    public static ajrc a(int i) {
        for (ajrc ajrc : ajrc.values()) {
            if (ajrc.q == i) {
                return ajrc;
            }
        }
        return null;
    }

    static {
        m = new aac();
    }
}
