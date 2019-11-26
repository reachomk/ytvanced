package defpackage;

import java.util.Map;
import java.util.Map.Entry;

/* renamed from: anza */
final class anza implements anyx {
    anza() {
    }

    public final Map a(Object obj) {
        return (anyy) obj;
    }

    public final anyv e(Object obj) {
        return ((anyw) obj).a;
    }

    public final Map b(Object obj) {
        return (anyy) obj;
    }

    public final boolean c(Object obj) {
        return ((anyy) obj).a ^ 1;
    }

    public final Object d(Object obj) {
        ((anyy) obj).b();
        return obj;
    }

    public final Object a() {
        return anyy.b.a();
    }

    public final Object a(Object obj, Object obj2) {
        obj = (anyy) obj;
        anyy anyy = (anyy) obj2;
        if (!anyy.isEmpty()) {
            if (!obj.a) {
                obj = obj.a();
            }
            obj.c();
            if (!anyy.isEmpty()) {
                obj.putAll(anyy);
                return obj;
            }
        }
        return obj;
    }

    public final int a(int i, Object obj, Object obj2) {
        anyy anyy = (anyy) obj;
        anyw anyw = (anyw) obj2;
        int i2 = 0;
        if (!anyy.isEmpty()) {
            for (Entry entry : anyy.entrySet()) {
                i2 += anwm.o(i) + anwm.s(anyw.a(anyw.a, entry.getKey(), entry.getValue()));
            }
        }
        return i2;
    }
}
