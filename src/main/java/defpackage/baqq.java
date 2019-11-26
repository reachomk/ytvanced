package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: baqq */
public final class baqq implements baqj {
    private long a;
    private final List b = Collections.synchronizedList(new ArrayList());

    public final void a() {
        ArrayList arrayList = new ArrayList(this.b);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            baqm baqm = (baqm) arrayList.get(i);
            baqk.a(baqm.a);
            baqk.a(baqm.b);
        }
    }

    public final void a(baqm baqm) {
        this.b.remove(baqm);
    }

    public final void b(baqm baqm) {
        this.a++;
        Thread thread = new Thread(baqm);
        thread.setDaemon(true);
        long j = this.a;
        StringBuilder stringBuilder = new StringBuilder(51);
        stringBuilder.append("NanoHttpd Request Processor (#");
        stringBuilder.append(j);
        stringBuilder.append(")");
        thread.setName(stringBuilder.toString());
        this.b.add(baqm);
        thread.start();
    }
}
