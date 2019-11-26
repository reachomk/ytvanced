package defpackage;

import java.util.HashMap;

/* renamed from: abhu */
public final /* synthetic */ class abhu implements Runnable {
    private final abhv a;
    private final ajzz b;
    private final String c;

    public abhu(abhv abhv, ajzz ajzz, String str) {
        this.a = abhv;
        this.b = ajzz;
        this.c = str;
    }

    public final void run() {
        abhv abhv = this.a;
        ajzz ajzz = this.b;
        String str = this.c;
        HashMap hashMap = new HashMap();
        bpz bpz = new bpz();
        bpz.a = aocf.toByteArray(ajzz);
        bpz.g = hashMap;
        abhv.a.a(str, bpz);
    }
}
