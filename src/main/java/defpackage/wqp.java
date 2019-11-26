package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: wqp */
public final class wqp {
    public final Set a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap(4)));

    public final xsu a(wqr wqr) {
        this.a.add((wqr) amqw.a((Object) wqr));
        return new wqo(this, wqr);
    }
}
