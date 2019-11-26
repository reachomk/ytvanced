package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bba */
public final class bba {
    private List a;

    public final bba a(bam bam) {
        if (bam != null) {
            List list = this.a;
            if (list == null) {
                this.a = new ArrayList();
            } else if (list.contains(bam)) {
                throw new IllegalArgumentException("route descriptor already added");
            }
            this.a.add(bam);
            return this;
        }
        throw new IllegalArgumentException("route must not be null");
    }

    public final bax a() {
        return new bax(this.a, false);
    }
}
