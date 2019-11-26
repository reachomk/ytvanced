package defpackage;

import android.content.res.Resources;
import com.google.android.youtube.R;

/* renamed from: ajjn */
public enum ajjn {
    NONE(R.string.pref_subtitles_none, 0),
    WHITE(R.string.pref_subtitles_white, -1),
    BLACK(R.string.pref_subtitles_black, -16777216),
    RED(R.string.pref_subtitles_red, -65536),
    YELLOW(R.string.pref_subtitles_yellow, -256),
    GREEN(R.string.pref_subtitles_green, -16711936),
    CYAN(R.string.pref_subtitles_cyan, -16711681),
    BLUE(R.string.pref_subtitles_blue, -16776961),
    MAGENTA(R.string.pref_subtitles_magenta, -65281);
    
    private static String[] l;
    private static String[] m;
    private static int[] n;
    private static String[] o;
    private static String[] p;
    private static int[] q;
    public final int f;
    private final int k;

    private ajjn(int i, int i2) {
        this.k = i;
        this.f = i2;
    }

    public static String[] a(Resources resources) {
        if (l == null) {
            ajjn[] values = ajjn.values();
            l = new String[values.length];
            int i = 0;
            while (true) {
                String[] strArr = l;
                if (i >= strArr.length) {
                    break;
                }
                strArr[i] = resources.getString(values[i].k);
                i++;
            }
        }
        return l;
    }

    public static String[] a() {
        if (m == null) {
            ajjn[] values = ajjn.values();
            m = new String[values.length];
            int i = 0;
            while (true) {
                String[] strArr = m;
                if (i >= strArr.length) {
                    break;
                }
                strArr[i] = Integer.toString(values[i].f);
                i++;
            }
        }
        return m;
    }

    public static int[] b() {
        if (n == null) {
            ajjn[] values = ajjn.values();
            n = new int[values.length];
            int i = 0;
            while (true) {
                int[] iArr = n;
                if (i >= iArr.length) {
                    break;
                }
                iArr[i] = values[i].f;
                i++;
            }
        }
        return n;
    }

    public static int c() {
        return ajjn.values()[2].f;
    }

    public static int d() {
        return ajjn.values()[0].f;
    }

    public static String[] b(Resources resources) {
        if (o == null) {
            ajjn[] values = ajjn.values();
            o = new String[(values.length - 1)];
            int i = 0;
            while (true) {
                String[] strArr = o;
                if (i >= strArr.length) {
                    break;
                }
                int i2 = i + 1;
                strArr[i] = resources.getString(values[i2].k);
                i = i2;
            }
        }
        return o;
    }

    public static String[] e() {
        if (p == null) {
            ajjn[] values = ajjn.values();
            p = new String[(values.length - 1)];
            int i = 0;
            while (true) {
                String[] strArr = p;
                if (i >= strArr.length) {
                    break;
                }
                int i2 = i + 1;
                strArr[i] = Integer.toString(values[i2].f);
                i = i2;
            }
        }
        return p;
    }

    public static int[] f() {
        if (q == null) {
            ajjn[] values = ajjn.values();
            q = new int[(values.length - 1)];
            int i = 0;
            while (true) {
                int[] iArr = q;
                if (i >= iArr.length) {
                    break;
                }
                int i2 = i + 1;
                iArr[i] = values[i2].f;
                i = i2;
            }
        }
        return q;
    }

    public static int g() {
        return ajjn.values()[1].f;
    }

    public static int h() {
        return ajjn.values()[2].f;
    }
}
