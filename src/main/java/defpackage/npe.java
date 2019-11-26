package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: npe */
public class npe {
    public final int a;
    public final List b;
    public final List c;

    public npe(int i, List list, List list2) {
        this.a = i;
        this.b = Collections.unmodifiableList(list);
        if (list2 == null) {
            this.c = Collections.emptyList();
        } else {
            this.c = Collections.unmodifiableList(list2);
        }
    }

    public npe(int i, List list) {
        this(i, list, null);
    }

    public final boolean a() {
        return this.c.isEmpty() ^ 1;
    }
}
