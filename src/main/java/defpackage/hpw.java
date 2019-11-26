package defpackage;

import java.util.HashMap;
import java.util.LinkedList;

/* renamed from: hpw */
final class hpw implements Runnable {
    private final /* synthetic */ hpx a;

    public final void run() {
        xak.a();
        HashMap hashMap = new HashMap(this.a.d);
        this.a.d.clear();
        if (!hashMap.isEmpty()) {
            this.a.b.a(new LinkedList(hashMap.keySet()), new hpz(hashMap));
        }
        this.a.e = null;
    }

    /* synthetic */ hpw(hpx hpx) {
        this.a = hpx;
    }
}
