package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: muw */
final class muw extends apa {
    private static final List c = new ArrayList();
    private List d = c;
    private final myv e;
    private final WeakReference f;
    private final AtomicBoolean g;

    public muw(myv myv, WeakReference weakReference, AtomicBoolean atomicBoolean) {
        this.e = myv;
        this.f = weakReference;
        this.g = atomicBoolean;
    }

    public final void a(nhd[] nhdArr) {
        List list;
        if (nhdArr == null) {
            list = c;
        } else {
            list = Arrays.asList(nhdArr);
        }
        this.d = list;
        this.g.set(false);
        aa_();
    }

    public final long b(int i) {
        String str = ((nhd) this.d.get(i)).b;
        return str != null ? (long) str.hashCode() : 0;
    }

    public final int a() {
        List list = this.d;
        return list != null ? list.size() : 0;
    }
}
