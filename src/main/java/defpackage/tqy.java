package defpackage;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: tqy */
final class tqy {
    static tqz a(String str) {
        return new tra(str);
    }

    static tqz a(tpz tpz) {
        return new trd(tpz);
    }

    static tqz a(tpz tpz, DecimalFormat decimalFormat) {
        return new trc(tpz, decimalFormat);
    }

    static tqz b(tpz tpz) {
        return tqy.a(tpz, null);
    }

    static tqz a(tpz tpz, Set set) {
        return new trf(tpz, set);
    }

    static tqz b(tpz tpz, Set set) {
        return new tre(tpz, set);
    }

    public static Iterable a(Object obj) {
        if (obj instanceof Object[]) {
            return Arrays.asList((Number[]) obj);
        }
        if (obj instanceof Iterable) {
            return (Iterable) obj;
        }
        return null;
    }

    public static List a(Iterable iterable, Set set) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Number number : iterable) {
            if (set.contains(Integer.valueOf(i))) {
                arrayList.add(number);
            }
            i++;
        }
        return arrayList;
    }
}
