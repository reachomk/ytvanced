package defpackage;

import com.facebook.yoga.YogaFlexDirection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: snf */
final class snf {
    private static final String a = snf.class.getSimpleName();
    private static final AtomicInteger b = new AtomicInteger(1);

    private snf() {
    }

    static clz a(cmg cmg, baor baor, bapc bapc, List list) {
        snd a = sne.a(cmg);
        a.a(snf.a(bapc));
        a.a(list);
        int a2 = baor.a(4);
        if (!(a2 == 0 || baor.b.get(a2 + baor.a) == (byte) 0)) {
            a.f();
            String str = a;
            a2 = b.getAndIncrement();
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 11);
            stringBuilder.append(str);
            stringBuilder.append(a2);
            a.a(stringBuilder.toString());
        }
        return a;
    }

    static YogaFlexDirection a(bapc bapc) {
        if (bapc == null) {
            return YogaFlexDirection.COLUMN;
        }
        bapg bapg = new bapg();
        if (!syt.a(bapc, bapg, 168772996, sni.a)) {
            return YogaFlexDirection.COLUMN;
        }
        YogaFlexDirection yogaFlexDirection;
        int a = bapg.a();
        if (a == 1) {
            yogaFlexDirection = YogaFlexDirection.ROW;
        } else if (a == 2) {
            yogaFlexDirection = YogaFlexDirection.ROW_REVERSE;
        } else if (a != 4) {
            yogaFlexDirection = YogaFlexDirection.COLUMN;
        } else {
            yogaFlexDirection = YogaFlexDirection.COLUMN_REVERSE;
        }
        return yogaFlexDirection;
    }
}
