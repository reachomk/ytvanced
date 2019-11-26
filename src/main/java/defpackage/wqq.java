package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: wqq */
public final class wqq {
    private final Set a = Collections.synchronizedSet(new HashSet());

    public final void a(wqt wqt) {
        this.a.add(wqt);
    }

    public final void b(wqt wqt) {
        this.a.remove(wqt);
    }

    public final void a(akcf akcf) {
        for (wqt a : this.a) {
            a.a(akcf);
        }
    }

    public final void a() {
        for (wqt ac_ : this.a) {
            ac_.ac_();
        }
    }
}
