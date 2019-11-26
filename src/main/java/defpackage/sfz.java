package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: sfz */
public abstract class sfz {
    public abstract List a();

    public abstract int b();

    public static sfz c() {
        return new sen(6, Collections.emptyList());
    }

    public static sfz a(int i) {
        return new sen(i, Collections.emptyList());
    }
}
