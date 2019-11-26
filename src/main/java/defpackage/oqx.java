package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: oqx */
public final class oqx {
    public final long a = -9223372036854775807L;
    public final long b;
    public final long c;
    public final List d;

    @Deprecated
    public oqx(long j, List list) {
        this.b = j;
        this.c = -9223372036854775807L;
        if (list == null) {
            list = Collections.emptyList();
        }
        this.d = list;
    }

    public final ora a() {
        return (ora) this.d.get(0);
    }
}
