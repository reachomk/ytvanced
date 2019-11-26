package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: basy */
public final class basy implements Comparable {
    public static final basx a = new basx();
    private static final long c;
    private static final long d;
    private static final long e = TimeUnit.SECONDS.toNanos(1);
    public final long b;
    private final bata f;
    private volatile boolean g;

    public basy(bata bata, long j) {
        long nanoTime = System.nanoTime();
        this.f = bata;
        long min = Math.min(c, Math.max(d, j));
        this.b = nanoTime + min;
        this.g = min <= 0;
    }

    public final boolean a() {
        if (!this.g) {
            if (this.b - this.f.a() > 0) {
                return false;
            }
            this.g = true;
        }
        return true;
    }

    public final long a(TimeUnit timeUnit) {
        long a = this.f.a();
        if (!this.g && this.b - a <= 0) {
            this.g = true;
        }
        return timeUnit.convert(this.b - a, TimeUnit.NANOSECONDS);
    }

    public final String toString() {
        long a = a(TimeUnit.NANOSECONDS);
        long abs = Math.abs(a) / e;
        long abs2 = Math.abs(a) % e;
        StringBuilder stringBuilder = new StringBuilder();
        if (a < 0) {
            stringBuilder.append('-');
        }
        stringBuilder.append(abs);
        if (abs2 > 0) {
            stringBuilder.append(String.format(".%09d", new Object[]{Long.valueOf(abs2)}));
        }
        stringBuilder.append("s from now");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final int compareTo(basy basy) {
        long j = this.b - basy.b;
        if (j >= 0) {
            return j <= 0 ? 0 : 1;
        } else {
            return -1;
        }
    }

    static {
        long toNanos = TimeUnit.DAYS.toNanos(36500);
        c = toNanos;
        d = -toNanos;
    }
}
