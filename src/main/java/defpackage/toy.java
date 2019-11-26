package defpackage;

import java.util.ArrayDeque;

/* renamed from: toy */
final class toy {
    public final ArrayDeque a = new ArrayDeque();
    private final /* synthetic */ tos b;

    public final synchronized tou a(bzc bzc) {
        tou tou;
        tou = (tou) this.a.poll();
        if (tou == null) {
            tou = new tou(this.b);
        }
        System.currentTimeMillis();
        tou.b = bzc;
        return tou;
    }

    /* synthetic */ toy(tos tos) {
        this.b = tos;
    }
}
