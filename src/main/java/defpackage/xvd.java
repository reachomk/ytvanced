package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.youtube.R;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: xvd */
public final class xvd {
    private static final amro a = amrn.a(xvg.a);
    private static final NumberFormat b = NumberFormat.getIntegerInstance();

    public static CharSequence a(CharSequence charSequence) {
        return charSequence == null ? "" : charSequence;
    }

    public static String a(String str) {
        amqw.a(amqu.a(str) ^ 1);
        return str;
    }

    public static String f(String str) {
        return str == null ? "" : str;
    }

    public static String a(String str, Object obj) {
        amqw.a(amqu.a(str) ^ 1, obj);
        return str;
    }

    public static String a(Resources resources, long j) {
        return ((yx) a.get()).a(resources.getString(R.string.num_bytes_with_unit, new Object[]{xvd.a(j), xvd.c(resources, j)}));
    }

    public static String b(Resources resources, long j) {
        Object[] objArr = new Object[2];
        double d = (double) j;
        if (d < 1.073741824E9d) {
            double d2 = 1048576.0d;
            if (d >= 1048576.0d) {
                Double.isNaN(d);
            } else {
                d2 = 1024.0d;
                Double.isNaN(d);
            }
            d /= d2;
        } else {
            Double.isNaN(d);
            d = Math.min(d / 1.073741824E9d, 999.0d);
        }
        objArr[0] = new BigDecimal(d, new MathContext(3, RoundingMode.UP)).toPlainString();
        objArr[1] = xvd.c(resources, j);
        return ((yx) a.get()).a(resources.getString(R.string.num_bytes_with_unit, objArr));
    }

    public static String c(Resources resources, long j) {
        if (j >= 1073741824) {
            return resources.getString(R.string.byte_unit_gb);
        }
        if (j < 1048576) {
            return resources.getString(R.string.byte_unit_kb);
        }
        return resources.getString(R.string.byte_unit_mb);
    }

    public static String a(long j) {
        NumberFormat numberFormat;
        double d;
        if (j >= 1073741824) {
            numberFormat = b;
            d = (double) j;
            Double.isNaN(d);
            return numberFormat.format(Math.min(Math.ceil(d / 1.073741824E9d), 999.0d));
        } else if (j >= 1048576) {
            numberFormat = b;
            d = (double) j;
            Double.isNaN(d);
            return numberFormat.format(Math.ceil(d / 1048576.0d));
        } else {
            numberFormat = b;
            d = (double) j;
            Double.isNaN(d);
            return numberFormat.format(Math.ceil(d / 1024.0d));
        }
    }

    public static List b(String str) {
        ArrayList arrayList = new ArrayList();
        int length = (str.length() / 2048) + 1;
        int i = 0;
        while (i < length) {
            int i2 = i << 11;
            i++;
            int i3 = i << 11;
            if (i3 >= str.length()) {
                i3 = str.length();
            }
            arrayList.add(str.substring(i2, i3));
        }
        return arrayList;
    }

    public static String b(long j) {
        return xvd.a(j, 3);
    }

    public static String a(long j, int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(j >= 0 ? "" : "-");
        j = Math.abs(j);
        long j2 = j / 60;
        long j3 = j2 / 60;
        if (j3 > 0) {
            j2 %= 60;
            i = Math.max(i, 5);
        }
        String l = Long.toString(j % 60);
        String str = "0";
        if (l.length() == 1) {
            l = l.length() == 0 ? new String(str) : str.concat(l);
        }
        String l2 = Long.toString(j2);
        if (l2.length() == 1 && i > 3) {
            l2 = l2.length() == 0 ? new String(str) : str.concat(l2);
        }
        String str2 = ":";
        yx yxVar;
        if (i > 4) {
            yxVar = (yx) a.get();
            stringBuilder.append(j3);
            stringBuilder.append(str2);
            stringBuilder.append(l2);
            stringBuilder.append(str2);
            stringBuilder.append(l);
            return yxVar.a(stringBuilder.toString());
        }
        yxVar = (yx) a.get();
        stringBuilder.append(l2);
        stringBuilder.append(str2);
        stringBuilder.append(l);
        return yxVar.a(stringBuilder.toString());
    }

    public static String d(Resources resources, long j) {
        if (j >= 1024) {
            return resources.getString(R.string.num_bytes_with_unit, new Object[]{((yx) a.get()).a(new String(String.valueOf(new DecimalFormat("#.##").format((double) (((float) j) / 1024.0f))))), resources.getString(R.string.byte_unit_gb)});
        }
        Object[] objArr = new Object[2];
        yx yxVar = (yx) a.get();
        StringBuilder stringBuilder = new StringBuilder(20);
        stringBuilder.append(j);
        objArr[0] = yxVar.a(stringBuilder.toString());
        objArr[1] = resources.getString(R.string.byte_unit_mb);
        return resources.getString(R.string.num_bytes_with_unit, objArr);
    }

    public static String c(String str) {
        return str.toLowerCase(Locale.US);
    }

    public static String d(String str) {
        return str.toUpperCase(Locale.US);
    }

    public static int a(String str, int i) {
        if (str == null) {
            return i;
        }
        try {
            i = Integer.parseInt(str);
            return i;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static long a(String str, long j) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static float a(String str, float f) {
        if (str == null) {
            return f;
        }
        try {
            f = Float.parseFloat(str);
            return f;
        } catch (NumberFormatException unused) {
            return f;
        }
    }

    public static String e(String str) {
        if (TextUtils.isEmpty(str) || str.length() <= 50) {
            return str;
        }
        str = String.valueOf(str.subSequence(0, 49));
        StringBuilder stringBuilder = new StringBuilder(str.length() + 1);
        stringBuilder.append(str);
        stringBuilder.append("…");
        return stringBuilder.toString();
    }

    public static String b(CharSequence charSequence) {
        return charSequence != null ? charSequence.toString() : null;
    }
}
