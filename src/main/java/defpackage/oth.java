package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: oth */
final class oth implements ork {
    private final List a;

    public oth(List list) {
        this.a = Collections.unmodifiableList(list);
    }

    public final int a() {
        return 1;
    }

    public final int a(long j) {
        return j < 0 ? 0 : -1;
    }

    public final long a(int i) {
        oxz.a(i == 0);
        return 0;
    }

    public final List b(long j) {
        return j < 0 ? Collections.emptyList() : this.a;
    }
}
