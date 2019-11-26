package defpackage;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* renamed from: ydb */
public final class ydb implements akoq {
    private static final int a = ((int) TimeUnit.MINUTES.toMillis(30));
    private static final int b = ((int) TimeUnit.DAYS.toMillis(1));
    private static final int c = ((int) TimeUnit.DAYS.toMillis(1));
    private final xsc d;

    public ydb(xsc xsc) {
        this.d = (xsc) amqw.a((Object) xsc);
    }

    public final void a(akor akor, aknh aknh, int i) {
        if (this.d.a() - TimeUnit.MICROSECONDS.toMillis(zcz.d(ydb.a(aknh, i))) < ((long) c)) {
            ydb.a(akor, aknh, i, a);
        } else {
            ydb.a(akor, aknh, i, b);
        }
    }

    private static void a(akor akor, aknh aknh, int i, int i2) {
        akor akor2 = akor;
        aknh aknh2 = aknh;
        int i3 = i;
        int i4 = i2;
        Object a = ydb.a(aknh, i);
        String k = zcz.k(a);
        long toMillis = TimeUnit.MICROSECONDS.toMillis(zcz.d(a));
        String str = "AGGREGATE_USER_TO_PREVIOUS_ITEM";
        String str2 = "AGGREGATE_TIME_TO_PREVIOUS_ITEM";
        Object valueOf = Boolean.valueOf(false);
        if (i3 > 0) {
            Object a2 = ydb.a(aknh2, i3 - 1);
            String k2 = zcz.k(a2);
            boolean z = toMillis - TimeUnit.MICROSECONDS.toMillis(zcz.d(a2)) < ((long) i4);
            akor2.a(str2, Boolean.valueOf(z));
            boolean z2 = TextUtils.equals(k2, k) && z;
            akor2.a(str, Boolean.valueOf(z2));
        } else {
            akor2.a(str2, valueOf);
            akor2.a(str, valueOf);
        }
        str2 = "AGGREGATE_TO_NEXT_ITEM";
        if (i3 < aknh.d() - 1) {
            Object a3 = ydb.a(aknh2, i3 + 1);
            boolean z3 = TextUtils.equals(zcz.k(a3), k) && TimeUnit.MICROSECONDS.toMillis(zcz.d(a3)) - toMillis < ((long) i4);
            akor2.a(str2, Boolean.valueOf(z3));
            return;
        }
        akor2.a(str2, valueOf);
    }

    private static Object a(aknh aknh, int i) {
        Object c = aknh.c(i);
        if (c instanceof ycp) {
            return ((ycp) c).a;
        }
        if (c instanceof ycs) {
            c = ((ycs) c).a;
        }
        return c;
    }
}
