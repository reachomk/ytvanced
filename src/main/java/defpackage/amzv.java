package defpackage;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: amzv */
public final class amzv extends amzt {
    private static final Map c;
    private final amyl d;

    public static amzv a(int i, amyl amyl, amyo amyo) {
        if (i < 10 && amyo.a()) {
            return ((amzv[]) c.get(amyl))[i];
        }
        return new amzv(i, amyl, amyo);
    }

    private amzv(int i, amyl amyl, amyo amyo) {
        super(amyo, i);
        this.d = (amyl) anad.a(amyl, "format char");
        if (amyo.a()) {
            String str = amyl.f;
            return;
        }
        i = amyl.c;
        if (amyo.b()) {
            i &= 65503;
        }
        StringBuilder a = amyo.a(new StringBuilder("%"));
        a.append((char) i);
        a.toString();
    }

    public final void a(amzw amzw, Object obj) {
        amzw.a(obj, this.d, this.b);
    }

    static {
        EnumMap enumMap = new EnumMap(amyl.class);
        for (amyl amyl : amyl.values()) {
            amzv[] amzvArr = new amzv[10];
            for (int i = 0; i < 10; i++) {
                amzvArr[i] = new amzv(i, amyl, amyo.a);
            }
            enumMap.put(amyl, amzvArr);
        }
        c = Collections.unmodifiableMap(enumMap);
    }
}
