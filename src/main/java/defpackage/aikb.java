package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: aikb */
public final /* synthetic */ class aikb {
    public static aikr a(aikc aikc) {
        amqw.a((Object) aikc);
        int e = aikc.e();
        return e != -1 ? aikc.a(0, e) : null;
    }

    public static List a(aikc aikc, int i) {
        amqw.a((Object) aikc);
        int a = aikc.a(i);
        if (a == 0) {
            return Collections.emptyList();
        }
        amuo a2 = amul.a(a);
        for (int i2 = 0; i2 < a; i2++) {
            a2.c(aikc.a(i, i2));
        }
        return a2.a();
    }
}
