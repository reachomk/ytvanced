package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: baft */
public final class baft {
    public final HashMap a;
    public final HashMap b;

    public baft() {
        this.a = new HashMap();
        this.b = new HashMap();
    }

    public baft(baft baft) {
        this.a = new HashMap(baft.a);
        this.b = new HashMap(baft.b);
        Iterator it = this.b.entrySet().iterator();
        while (it.hasNext()) {
            if (((bafp) ((Entry) it.next()).getValue()).e.get()) {
                it.remove();
            }
        }
    }
}
