package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: ora */
public final class ora {
    public final List a;

    public ora(List list) {
        List emptyList = Collections.emptyList();
        this.a = Collections.unmodifiableList(list);
        Collections.unmodifiableList(emptyList);
    }
}
