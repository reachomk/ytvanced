package defpackage;

import java.util.ArrayDeque;

/* renamed from: bazb */
final class bazb extends ArrayDeque {
    private final /* synthetic */ int a;
    private final /* synthetic */ bazc b;

    bazb(bazc bazc, int i) {
        this.b = bazc;
        this.a = i;
    }

    public final /* synthetic */ boolean add(Object obj) {
        batl batl = (batl) obj;
        if (size() == this.a) {
            removeFirst();
        }
        bazc bazc = this.b;
        bazc.e++;
        return super.add(batl);
    }
}
