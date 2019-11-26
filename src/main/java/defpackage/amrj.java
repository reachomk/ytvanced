package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: amrj */
public final class amrj {
    public final amrr a = amrr.a;
    public boolean b;
    public long c;
    public long d;

    public static amrj a() {
        return new amrj();
    }

    amrj() {
    }

    public final amrj b() {
        amqw.b(this.b ^ 1, (Object) "This stopwatch is already running.");
        this.b = true;
        this.d = this.a.a();
        return this;
    }

    public final amrj c() {
        this.c = 0;
        this.b = false;
        return this;
    }

    private final long d() {
        return this.b ? (this.a.a() - this.d) + this.c : this.c;
    }

    public final long a(TimeUnit timeUnit) {
        return timeUnit.convert(d(), TimeUnit.NANOSECONDS);
    }

    public final String toString() {
        TimeUnit timeUnit;
        String str;
        long d = d();
        if (TimeUnit.DAYS.convert(d, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.DAYS;
        } else if (TimeUnit.HOURS.convert(d, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.HOURS;
        } else if (TimeUnit.MINUTES.convert(d, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MINUTES;
        } else if (TimeUnit.SECONDS.convert(d, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.SECONDS;
        } else if (TimeUnit.MILLISECONDS.convert(d, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        } else if (TimeUnit.MICROSECONDS.convert(d, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MICROSECONDS;
        } else {
            timeUnit = TimeUnit.NANOSECONDS;
        }
        double d2 = (double) d;
        double convert = (double) TimeUnit.NANOSECONDS.convert(1, timeUnit);
        Double.isNaN(d2);
        Double.isNaN(convert);
        String a = amqu.a(d2 / convert);
        switch (amrm.a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(a).length() + 1) + str.length());
        stringBuilder.append(a);
        stringBuilder.append(" ");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }
}
