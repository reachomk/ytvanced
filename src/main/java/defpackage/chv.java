package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* renamed from: chv */
public final class chv {
    public static final char[] a = "0123456789abcdef".toCharArray();
    public static final char[] b = new char[64];

    public static int a(Bitmap bitmap) {
        if (bitmap.isRecycled()) {
            String valueOf = String.valueOf(bitmap);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            String valueOf2 = String.valueOf(bitmap.getConfig());
            StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 66) + valueOf2.length());
            stringBuilder.append("Cannot obtain size for recycled Bitmap: ");
            stringBuilder.append(valueOf);
            stringBuilder.append("[");
            stringBuilder.append(width);
            stringBuilder.append("x");
            stringBuilder.append(height);
            stringBuilder.append("] ");
            stringBuilder.append(valueOf2);
            throw new IllegalStateException(stringBuilder.toString());
        }
        try {
            bitmap = bitmap.getAllocationByteCount();
            return bitmap;
        } catch (NullPointerException unused) {
            return bitmap.getHeight() * bitmap.getRowBytes();
        }
    }

    public static int b(int i, int i2) {
        return (i2 * 31) + i;
    }

    private static boolean b(int i) {
        return i > 0 || i == aocf.UNSET_ENUM_VALUE;
    }

    public static int a(int i, int i2, Config config) {
        i *= i2;
        if (config == null) {
            config = Config.ARGB_8888;
        }
        i2 = chy.a[config.ordinal()];
        int i3 = 4;
        if (i2 == 1) {
            i3 = 1;
        } else if (i2 == 2 || i2 == 3) {
            i3 = 2;
        } else if (i2 == 4) {
            i3 = 8;
        }
        return i * i3;
    }

    public static boolean a(int i, int i2) {
        return chv.b(i) && chv.b(i2);
    }

    public static void a() {
        if (!chv.b()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean c() {
        return chv.b() ^ 1;
    }

    public static Queue a(int i) {
        return new ArrayDeque(i);
    }

    public static List a(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object next : collection) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static boolean a(Object obj, Object obj2) {
        boolean equals;
        if (obj != null) {
            equals = obj.equals(obj2);
        } else if (obj2 == null) {
            return true;
        } else {
            equals = false;
        }
        return equals;
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        } else {
            if (obj instanceof bzm) {
                return ((bzm) obj).a();
            }
            return obj.equals(obj2);
        }
    }

    public static int a(float f) {
        return chv.b(Float.floatToIntBits(f), 17);
    }

    public static int a(Object obj, int i) {
        return chv.b(obj != null ? obj.hashCode() : 0, i);
    }
}
