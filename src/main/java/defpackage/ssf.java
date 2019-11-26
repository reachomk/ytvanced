package defpackage;

import android.view.animation.LinearInterpolator;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: ssf */
final class ssf implements sxm {
    private static final Map a;

    ssf() {
    }

    public final aobz a() {
        return bdhx.a;
    }

    public final /* synthetic */ void a(cmg cmg, Object obj, swn swn) {
        azwh azwh = (azwh) obj;
        clz a = swn.a();
        String valueOf = String.valueOf(azwh.c);
        String str = "com.youtube.transition_key.";
        valueOf = valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
        a.c(valueOf);
        int i = 1;
        a.b(1);
        crr a2 = crr.a(valueOf);
        for (azwj azwj : azwh.b) {
            Map map = a;
            Object a3 = azwl.a(azwj.b);
            if (a3 == null) {
                a3 = azwl.TRANSITION_VALUE_TYPE_NONE;
            }
            Set<cto> set = (Set) map.get(a3);
            if (set != null) {
                for (cto a4 : set) {
                    azwd azwd;
                    int a5;
                    float c;
                    float c2;
                    float c3;
                    a2.a(a4);
                    if ((azwj.a & 2) != 0) {
                        azwd = azwj.c;
                        if (azwd == null) {
                            azwd = azwd.e;
                        }
                    } else {
                        azwd = null;
                    }
                    int i2 = 1000;
                    if (azwd != null) {
                        float f = azwd.b;
                        if (f != 0.0f) {
                            i2 = (int) (f * 1000.0f);
                        }
                    }
                    if (azwd != null) {
                        a5 = azwf.a(azwd.c);
                        if (a5 == 0) {
                            a5 = 1;
                        }
                    } else {
                        a5 = 3;
                    }
                    float c4 = (azwd == null || azwd.d.size() <= 0) ? 0.0f : azwd.d.c(0);
                    if (azwd != null && azwd.d.size() > i) {
                        c = azwd.d.c(i);
                    } else {
                        c = 0.0f;
                    }
                    if (azwd != null && azwd.d.size() > 2) {
                        c2 = azwd.d.c(2);
                    } else {
                        c2 = 0.0f;
                    }
                    if (azwd != null && azwd.d.size() > 3) {
                        c3 = azwd.d.c(3);
                    } else {
                        c3 = 0.0f;
                    }
                    int i3 = a5 - 1;
                    if (a5 != 0) {
                        csc a6;
                        if (i3 == i) {
                            a6 = crr.a(i2, new LinearInterpolator());
                        } else if (i3 == 3) {
                            a6 = crr.a(i2, acr.a(0.4f, 0.0f, 1.0f, 1.0f));
                        } else if (i3 == 4) {
                            a6 = crr.a(i2, acr.a(0.0f, 0.0f, 0.2f, 1.0f));
                        } else if (i3 == 5) {
                            a6 = crr.a(i2, acr.a(c4, c));
                        } else if (i3 != 6) {
                            a6 = crr.a(i2, acr.a(0.4f, 0.0f, 0.2f, 1.0f));
                        } else {
                            a6 = crr.a(i2, acr.a(c4, c, c2, c3));
                        }
                        a2.e = a6;
                        if (azwj.d) {
                            a2.a(azwj.e);
                        }
                        if (azwj.f) {
                            a2.b(azwj.g);
                        }
                        i = 1;
                    } else {
                        throw null;
                    }
                }
                continue;
            }
        }
        a.a(a2);
    }

    static {
        EnumMap enumMap = new EnumMap(azwl.class);
        enumMap.put(azwl.TRANSITION_VALUE_TYPE_X_Y, new HashSet(Arrays.asList(new cto[]{cte.a, cte.b})));
        enumMap.put(azwl.TRANSITION_VALUE_TYPE_WIDTH_HEIGHT, new HashSet(Arrays.asList(new cto[]{cte.c, cte.d})));
        enumMap.put(azwl.TRANSITION_VALUE_TYPE_ALPHA, new HashSet(Arrays.asList(new cto[]{cte.e})));
        enumMap.put(azwl.TRANSITION_VALUE_TYPE_SCALE, new HashSet(Arrays.asList(new cto[]{cte.f})));
        enumMap.put(azwl.TRANSITION_VALUE_TYPE_ROTATION, new HashSet(Arrays.asList(new cto[]{cte.g})));
        a = enumMap;
    }
}
