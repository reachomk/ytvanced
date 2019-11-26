package defpackage;

import java.util.HashMap;

/* renamed from: aaku */
final class aaku implements Runnable {
    private final /* synthetic */ aakt a;
    private final /* synthetic */ aakv b;

    aaku(aakv aakv, aakt aakt) {
        this.b = aakv;
        this.a = aakt;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        for (atwo atwo : this.a.a) {
            hashMap.put(atwo.d, atwo.b == 2 ? (String) atwo.c : "");
        }
        this.b.a.b = hashMap;
        this.b.a.e();
    }
}
