package defpackage;

import java.io.Serializable;

/* renamed from: bcrs */
public final class bcrs extends bcpx implements Serializable {
    public static final bcpx a = new bcrs();
    public static final long serialVersionUID = 2656707858124633367L;

    private bcrs() {
    }

    public final boolean b() {
        return true;
    }

    public final boolean c() {
        return true;
    }

    public final long d() {
        return 1;
    }

    public final int hashCode() {
        return 1;
    }

    public final String toString() {
        return "DurationField[millis]";
    }

    public final bcpw a() {
        return bcpw.l;
    }

    public final long a(long j, int i) {
        return bcrr.a(j, (long) i);
    }

    public final long a(long j, long j2) {
        return bcrr.a(j, j2);
    }

    public final boolean equals(Object obj) {
        return obj instanceof bcrs;
    }

    private final Object readResolve() {
        return a;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        int i;
        long d = ((bcpx) obj).d();
        if (d == 1) {
            i = 0;
        } else if (d > 1) {
            return -1;
        } else {
            i = 1;
        }
        return i;
    }
}
