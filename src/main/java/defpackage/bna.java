package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: bna */
public abstract class bna implements bmx {
    public final List a;

    bna(Object obj) {
        this(Collections.singletonList(new bpf(obj)));
    }

    public List b() {
        throw null;
    }

    bna(List list) {
        this.a = list;
    }

    public boolean c() {
        boolean z = true;
        if (!this.a.isEmpty()) {
            if (this.a.size() == 1) {
                return ((bpf) this.a.get(0)).d() ? z : false;
            } else {
                z = false;
            }
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (!this.a.isEmpty()) {
            stringBuilder.append("values=");
            stringBuilder.append(Arrays.toString(this.a.toArray()));
        }
        return stringBuilder.toString();
    }
}
