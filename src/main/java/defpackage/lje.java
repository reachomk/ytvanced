package defpackage;

import android.util.Pair;

/* renamed from: lje */
final /* synthetic */ class lje implements bcvk {
    private final lja a;

    lje(lja lja) {
        this.a = lja;
    }

    public final void a(Object obj) {
        lja lja = this.a;
        Pair pair = (Pair) obj;
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        airi airi = (airi) pair.second;
        if (airi.a()) {
            lja.a(1);
        } else if (airi.a(airi.READY) || booleanValue) {
            lja.a(0);
        }
    }
}
