package defpackage;

import android.content.res.Resources;
import com.google.android.youtube.R;

/* renamed from: ajjw */
public final class ajjw {
    private static String[] a;
    private static String[] b;

    public static String[] a(Resources resources) {
        if (a == null) {
            int[] b = ajjw.b();
            a = new String[b.length];
            int i = 0;
            while (i < b.length) {
                String[] strArr = a;
                Object[] objArr = new Object[1];
                int i2 = b[i];
                if (i2 != 0) {
                    objArr[0] = Integer.valueOf(i2);
                    strArr[i] = resources.getString(R.string.pref_subtitles_opacity_percent, objArr);
                    i++;
                } else {
                    throw null;
                }
            }
        }
        return a;
    }

    public static int[] b() {
        return new int[]{25, 50, 75, 100};
    }

    public static String[] a() {
        if (b == null) {
            int[] b = ajjw.b();
            b = new String[b.length];
            int i = 0;
            while (i < b.length) {
                int i2 = b[i];
                if (i2 != 0) {
                    b[i] = Integer.toString((i2 * 255) / 100);
                    i++;
                } else {
                    throw null;
                }
            }
        }
        return b;
    }

    public static int a(int i) {
        return (i * 255) / 100;
    }
}
