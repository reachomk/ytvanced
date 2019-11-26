package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: npf */
public final class npf implements nwr {
    public final long a;
    public final long b;
    public final boolean c;
    public final long d;
    public final long e;
    private final String f;
    private final List g;

    public npf(long j, long j2, boolean z, long j3, long j4, String str, List list) {
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = j3;
        this.e = j4;
        this.f = str;
        if (list == null) {
            list = Collections.emptyList();
        }
        this.g = list;
    }

    public final String a() {
        return this.f;
    }

    public final int b() {
        return this.g.size();
    }

    public final npk a(int i) {
        return (npk) this.g.get(i);
    }

    public final long b(int i) {
        long j;
        if (i == this.g.size() - 1) {
            long j2 = this.b;
            if (j2 != -1) {
                return j2 - ((npk) this.g.get(i)).a;
            }
            j = -1;
        } else {
            j = ((npk) this.g.get(i + 1)).a - ((npk) this.g.get(i)).a;
        }
        return j;
    }
}
