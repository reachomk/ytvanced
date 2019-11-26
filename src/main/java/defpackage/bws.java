package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: bws */
public final class bws implements bwq {
    private static final Config[] a;
    private static final Config[] b;
    private static final Config[] c = new Config[]{Config.RGB_565};
    private static final Config[] d = new Config[]{Config.ARGB_4444};
    private static final Config[] e = new Config[]{Config.ALPHA_8};
    private final bwt f = new bwt();
    private final bwi g = new bwi();
    private final Map h = new HashMap();

    public final void a(Bitmap bitmap) {
        bwu a = this.f.a(chv.a(bitmap), bitmap.getConfig());
        this.g.a(a, bitmap);
        NavigableMap a2 = a(bitmap.getConfig());
        Integer num = (Integer) a2.get(Integer.valueOf(a.a));
        Integer valueOf = Integer.valueOf(a.a);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        a2.put(valueOf, Integer.valueOf(i));
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e  */
    public final android.graphics.Bitmap a(int r10, int r11, android.graphics.Bitmap.Config r12) {
        /*
        r9 = this;
        r0 = defpackage.chv.a(r10, r11, r12);
        r1 = r9.f;
        r1 = r1.a(r0, r12);
        r2 = android.os.Build.VERSION.SDK_INT;
        r3 = 0;
        r4 = 26;
        if (r2 < r4) goto L_0x001c;
    L_0x0011:
        r2 = android.graphics.Bitmap.Config.RGBA_F16;
        r2 = r2.equals(r12);
        if (r2 == 0) goto L_0x001c;
    L_0x0019:
        r2 = b;
        goto L_0x0040;
    L_0x001c:
        r2 = defpackage.bwr.a;
        r4 = r12.ordinal();
        r2 = r2[r4];
        r4 = 1;
        if (r2 == r4) goto L_0x003e;
    L_0x0027:
        r5 = 2;
        if (r2 == r5) goto L_0x003b;
    L_0x002a:
        r5 = 3;
        if (r2 == r5) goto L_0x0038;
    L_0x002d:
        r5 = 4;
        if (r2 == r5) goto L_0x0035;
    L_0x0030:
        r2 = new android.graphics.Bitmap.Config[r4];
        r2[r3] = r12;
        goto L_0x0040;
    L_0x0035:
        r2 = e;
        goto L_0x0040;
    L_0x0038:
        r2 = d;
        goto L_0x0040;
    L_0x003b:
        r2 = c;
        goto L_0x0040;
    L_0x003e:
        r2 = a;
    L_0x0040:
        r4 = r2.length;
    L_0x0041:
        if (r3 >= r4) goto L_0x0084;
    L_0x0043:
        r5 = r2[r3];
        r6 = r9.a(r5);
        r7 = java.lang.Integer.valueOf(r0);
        r6 = r6.ceilingKey(r7);
        r6 = (java.lang.Integer) r6;
        if (r6 == 0) goto L_0x0081;
    L_0x0055:
        r7 = r6.intValue();
        r8 = r0 << 3;
        if (r7 <= r8) goto L_0x005e;
    L_0x005d:
        goto L_0x0081;
    L_0x005e:
        r2 = r6.intValue();
        if (r2 == r0) goto L_0x0065;
    L_0x0064:
        goto L_0x0071;
    L_0x0065:
        if (r5 == 0) goto L_0x006e;
    L_0x0067:
        r0 = r5.equals(r12);
        if (r0 == 0) goto L_0x0071;
    L_0x006d:
        goto L_0x0084;
    L_0x006e:
        if (r12 != 0) goto L_0x0071;
    L_0x0070:
        goto L_0x0084;
    L_0x0071:
        r0 = r9.f;
        r0.a(r1);
        r0 = r9.f;
        r1 = r6.intValue();
        r1 = r0.a(r1, r5);
        goto L_0x0084;
    L_0x0081:
        r3 = r3 + 1;
        goto L_0x0041;
    L_0x0084:
        r0 = r9.g;
        r0 = r0.a(r1);
        r0 = (android.graphics.Bitmap) r0;
        if (r0 == 0) goto L_0x009a;
    L_0x008e:
        r1 = r1.a;
        r1 = java.lang.Integer.valueOf(r1);
        r9.a(r1, r0);
        r0.reconfigure(r10, r11, r12);
    L_0x009a:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bws.a(int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap");
    }

    public final Bitmap a() {
        Bitmap bitmap = (Bitmap) this.g.a();
        if (bitmap != null) {
            a(Integer.valueOf(chv.a(bitmap)), bitmap);
        }
        return bitmap;
    }

    private final void a(Integer num, Bitmap bitmap) {
        NavigableMap a = a(bitmap.getConfig());
        Integer num2 = (Integer) a.get(num);
        if (num2 == null) {
            String valueOf = String.valueOf(num);
            String a2 = bws.a(chv.a(bitmap), bitmap.getConfig());
            String valueOf2 = String.valueOf(this);
            int length = valueOf.length();
            StringBuilder stringBuilder = new StringBuilder(((length + 56) + String.valueOf(a2).length()) + valueOf2.length());
            stringBuilder.append("Tried to decrement empty size, size: ");
            stringBuilder.append(valueOf);
            stringBuilder.append(", removed: ");
            stringBuilder.append(a2);
            stringBuilder.append(", this: ");
            stringBuilder.append(valueOf2);
            throw new NullPointerException(stringBuilder.toString());
        } else if (num2.intValue() == 1) {
            a.remove(num);
        } else {
            a.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    private final NavigableMap a(Config config) {
        NavigableMap navigableMap = (NavigableMap) this.h.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.h.put(config, treeMap);
        return treeMap;
    }

    public final int b(Bitmap bitmap) {
        return chv.a(bitmap);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SizeConfigStrategy{groupedMap=");
        stringBuilder.append(this.g);
        stringBuilder.append(", sortedSizes=(");
        for (Entry entry : this.h.entrySet()) {
            stringBuilder.append(entry.getKey());
            stringBuilder.append('[');
            stringBuilder.append(entry.getValue());
            stringBuilder.append("], ");
        }
        if (!this.h.isEmpty()) {
            stringBuilder.replace(stringBuilder.length() - 2, stringBuilder.length(), "");
        }
        stringBuilder.append(")}");
        return stringBuilder.toString();
    }

    static String a(int i, Config config) {
        String valueOf = String.valueOf(config);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 15);
        stringBuilder.append("[");
        stringBuilder.append(i);
        stringBuilder.append("](");
        stringBuilder.append(valueOf);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    static {
        Config[] configArr = new Config[]{Config.ARGB_8888, null};
        if (VERSION.SDK_INT >= 26) {
            configArr = (Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Config.RGBA_F16;
        }
        a = configArr;
        b = configArr;
    }
}
