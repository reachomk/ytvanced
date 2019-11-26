package defpackage;

import java.util.Date;

/* renamed from: banc */
public final class banc {
    public static Date a(long j) {
        return new Date((j - 2082844800) * 1000);
    }

    public static long a(Date date) {
        return (date.getTime() / 1000) + 2082844800;
    }
}
