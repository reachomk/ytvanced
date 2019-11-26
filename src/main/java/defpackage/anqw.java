package defpackage;

import java.util.ArrayList;

/* renamed from: anqw */
final class anqw implements ptt {
    anqw() {
    }

    public final void a(boolean z) {
        synchronized (anlf.a) {
            ArrayList arrayList = new ArrayList(anlf.b.values());
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                anlf anlf = (anlf) obj;
                if (anlf.c.get()) {
                    for (anli a : anlf.d) {
                        a.a();
                    }
                }
            }
        }
    }
}
