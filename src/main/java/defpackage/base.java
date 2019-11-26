package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: base */
public final class base {
    public static final barz a = new basd();

    public static barx a(barx barx, basb... basbArr) {
        return base.a(barx, Arrays.asList(basbArr));
    }

    public static barx a(barx barx, List list) {
        amqw.a((Object) barx, (Object) "channel");
        for (basb basf : list) {
            barx = new basf(barx, basf);
        }
        return barx;
    }
}
