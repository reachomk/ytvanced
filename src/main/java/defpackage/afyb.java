package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/* renamed from: afyb */
public final class afyb {
    public final Deque a = new ArrayDeque();

    public final void a(afxo afxo) {
        this.a.addFirst(new WeakReference(afxo));
    }

    public final void b(afxo afxo) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            afxo afxo2 = (afxo) ((WeakReference) it.next()).get();
            if (afxo2 == null) {
                it.remove();
            } else if (afxo2 == afxo) {
                it.remove();
                return;
            }
        }
    }
}
