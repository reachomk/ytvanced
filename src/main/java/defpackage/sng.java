package defpackage;

import com.facebook.yoga.YogaFlexDirection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: sng */
final class sng {
    private static final String a = sng.class.getSimpleName();
    private static final AtomicInteger b = new AtomicInteger(1);

    private sng() {
    }

    static clz a(cmg cmg, bdgw bdgw, bdho bdho, List list) {
        bdhp bdhp = bdho != null ? (bdhp) szb.a(bdho, bdhp.a) : null;
        int i = bdhp != null ? bdhp.k : 0;
        snd a = sne.a(cmg);
        a.a(sng.a(i));
        a.a(list);
        if (bdgw.b) {
            a.f();
            String str = a;
            i = b.getAndIncrement();
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 11);
            stringBuilder.append(str);
            stringBuilder.append(i);
            a.a(stringBuilder.toString());
        }
        return a;
    }

    static YogaFlexDirection a(int i) {
        if (i == 1) {
            return YogaFlexDirection.ROW;
        }
        if (i == 2) {
            return YogaFlexDirection.ROW_REVERSE;
        }
        if (i != 4) {
            return YogaFlexDirection.COLUMN;
        }
        return YogaFlexDirection.COLUMN_REVERSE;
    }
}
