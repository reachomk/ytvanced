package defpackage;

import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: ankn */
public final class ankn {
    public Boolean a = null;
    private String b = null;

    public final ankn a(String str) {
        ankn.a(str, Integer.valueOf(0));
        this.b = str;
        return this;
    }

    public static ThreadFactory a(ankn ankn) {
        String str = ankn.b;
        return new ankq(Executors.defaultThreadFactory(), str, str != null ? new AtomicLong(0) : null, ankn.a);
    }

    public static String a(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }
}
