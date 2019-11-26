package defpackage;

import android.view.animation.LinearInterpolator;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: ssi */
final class ssi implements sxl {
    private static final Map a;

    ssi() {
    }

    public final int a() {
        return 225874218;
    }

    public final /* synthetic */ anrc a(ByteBuffer byteBuffer) {
        baps baps = new baps();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        int i = byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position();
        baps.a = i;
        baps.b = byteBuffer;
        i -= baps.b.getInt(i);
        baps.c = i;
        baps.d = baps.b.getShort(i);
        return baps;
    }

    public final /* synthetic */ void a(cmg cmg, Object obj, swn swn) {
        baps baps = (baps) obj;
        clz a = swn.a();
        int i = 6;
        int a2 = baps.a(6);
        String valueOf = String.valueOf(a2 != 0 ? baps.c(a2 + baps.a) : null);
        String str = "com.youtube.transition_key.";
        valueOf = valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
        a.c(valueOf);
        int i2 = 1;
        a.b(1);
        crr a3 = crr.a(valueOf);
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = 4;
            int a4 = baps.a(4);
            if (i4 < (a4 != 0 ? baps.d(a4) : 0)) {
                anrc bapr = new bapr();
                int a5 = baps.a(4);
                if (a5 != 0) {
                    a5 = baps.b(baps.e(a5) + (i4 << 2));
                    ByteBuffer byteBuffer = baps.b;
                    bapr.a = a5;
                    bapr.b = byteBuffer;
                    a5 -= bapr.b.getInt(a5);
                    bapr.c = a5;
                    bapr.d = bapr.b.getShort(a5);
                } else {
                    bapr = null;
                }
                Map map = a;
                int a6 = bapr.a(4);
                Set<cto> set = (Set) map.get(Integer.valueOf(a6 != 0 ? bapr.b.getInt(a6 + bapr.a) : 0));
                if (set != null) {
                    for (cto a7 : set) {
                        int i6;
                        csc a8;
                        a3.a(a7);
                        bapp bapp = new bapp();
                        int a9 = bapr.a(i);
                        if (a9 != 0) {
                            a9 = bapr.b(a9 + bapr.a);
                            ByteBuffer byteBuffer2 = bapr.b;
                            bapp.a = a9;
                            bapp.b = byteBuffer2;
                            a9 -= bapp.b.getInt(a9);
                            bapp.c = a9;
                            bapp.d = bapp.b.getShort(a9);
                        } else {
                            bapp = null;
                        }
                        a9 = 1000;
                        if (!(bapp == null || bapp.a() == 0.0f)) {
                            a9 = (int) (bapp.a() * 1000.0f);
                        }
                        if (bapp != null) {
                            int a10 = bapp.a(i);
                            i6 = a10 != 0 ? bapp.b.getInt(a10 + bapp.a) : 0;
                        } else {
                            i6 = 2;
                        }
                        float g = (bapp == null || bapp.b() <= 0) ? 0.0f : bapp.g(i3);
                        float g2 = (bapp == null || bapp.b() <= i2) ? 0.0f : bapp.g(i2);
                        float g3 = (bapp == null || bapp.b() <= 2) ? 0.0f : bapp.g(2);
                        float g4 = (bapp == null || bapp.b() <= 3) ? 0.0f : bapp.g(3);
                        if (i6 == i2) {
                            a8 = crr.a(a9, new LinearInterpolator());
                        } else if (i6 == 3) {
                            a8 = crr.a(a9, acr.a(0.4f, 0.0f, 1.0f, 1.0f));
                        } else if (i6 == i5) {
                            a8 = crr.a(a9, acr.a(0.0f, 0.0f, 0.2f, 1.0f));
                        } else if (i6 == 5) {
                            a8 = crr.a(a9, acr.a(g, g2));
                        } else if (i6 != 6) {
                            a8 = crr.a(a9, acr.a(0.4f, 0.0f, 0.2f, 1.0f));
                        } else {
                            a8 = crr.a(a9, acr.a(g, g2, g3, g4));
                        }
                        a3.e = a8;
                        i = bapr.a(8);
                        if (!(i == 0 || bapr.b.get(i + bapr.a) == (byte) 0)) {
                            i = bapr.a(10);
                            a3.a(i != 0 ? bapr.b.getFloat(i + bapr.a) : 0.0f);
                        }
                        i = bapr.a(12);
                        if (!(i == 0 || bapr.b.get(i + bapr.a) == (byte) 0)) {
                            i = bapr.a(14);
                            a3.b(i != 0 ? bapr.b.getFloat(i + bapr.a) : 0.0f);
                        }
                        i = 6;
                        i2 = 1;
                        i3 = 0;
                        i5 = 4;
                    }
                }
                i4++;
                i = 6;
                i2 = 1;
                i3 = 0;
            } else {
                a.a(a3);
                return;
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(Integer.valueOf(1), new HashSet(Arrays.asList(new cto[]{cte.a, cte.b})));
        hashMap.put(Integer.valueOf(2), new HashSet(Arrays.asList(new cto[]{cte.c, cte.d})));
        hashMap.put(Integer.valueOf(4), new HashSet(Arrays.asList(new cto[]{cte.e})));
        hashMap.put(Integer.valueOf(3), new HashSet(Arrays.asList(new cto[]{cte.f})));
        hashMap.put(Integer.valueOf(5), new HashSet(Arrays.asList(new cto[]{cte.g})));
        a = hashMap;
    }
}
