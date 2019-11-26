package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: ajic */
public final class ajic {
    static long a(afhr afhr) {
        Long c = afhr != null ? afhr.c("Stream-Duration-Us") : null;
        return c != null ? TimeUnit.MICROSECONDS.toMillis(c.longValue()) : 0;
    }
}
