package defpackage;

/* renamed from: bcfa */
public enum bcfa implements anxv {
    UNKNOWN(0),
    PRIMES_INITIALIZED(1),
    PRIMES_CRASH_MONITORING_INITIALIZED(2),
    PRIMES_FIRST_ACTIVITY_LAUNCHED(3),
    PRIMES_CUSTOM_LAUNCHED(4);
    
    public final int c;

    public final int getNumber() {
        return this.c;
    }

    public static bcfa a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return PRIMES_INITIALIZED;
        }
        if (i == 2) {
            return PRIMES_CRASH_MONITORING_INITIALIZED;
        }
        if (i != 3) {
            return i != 4 ? null : PRIMES_CUSTOM_LAUNCHED;
        } else {
            return PRIMES_FIRST_ACTIVITY_LAUNCHED;
        }
    }

    public static anxx a() {
        return bcez.a;
    }

    private bcfa(int i) {
        this.c = i;
    }

    public final String toString() {
        return Integer.toString(this.c);
    }
}
