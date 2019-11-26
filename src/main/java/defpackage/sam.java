package defpackage;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: sam */
public final class sam {
    private List a = new CopyOnWriteArrayList();
    private final pjy b;

    public sam(List list, pjy pjy) {
        this.a = list;
        this.b = pjy;
    }

    public final int a() {
        List list = this.a;
        return (list == null || list.isEmpty()) ? 0 : this.a.size();
    }

    public final int b() {
        List list = this.a;
        if (list != null) {
            return !list.isEmpty() ? this.a.indexOf(this.b) : 0;
        } else {
            return -1;
        }
    }
}
