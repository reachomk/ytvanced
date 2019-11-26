package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: npk */
public class npk {
    public final long a;
    public final List b;

    public npk(long j, List list) {
        this.a = j;
        this.b = Collections.unmodifiableList(list);
    }
}
