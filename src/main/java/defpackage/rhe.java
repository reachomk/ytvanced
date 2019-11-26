package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: rhe */
final class rhe extends rhb {
    rhe(int i) {
        super(i);
    }

    public final void a() {
        if (!this.c) {
            Entry b;
            for (int i = 0; i < b(); i++) {
                b = b(i);
                if (((reo) b.getKey()).c()) {
                    b.setValue(Collections.unmodifiableList((List) b.getValue()));
                }
            }
            for (Entry b2 : c()) {
                if (((reo) b2.getKey()).c()) {
                    b2.setValue(Collections.unmodifiableList((List) b2.getValue()));
                }
            }
        }
        super.a();
    }
}
