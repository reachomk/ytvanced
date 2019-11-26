package defpackage;

import android.util.Pair;

/* renamed from: ljf */
final /* synthetic */ class ljf implements bcvk {
    private final lja a;

    ljf(lja lja) {
        this.a = lja;
    }

    public final void a(Object obj) {
        lja lja = this.a;
        Pair pair = (Pair) obj;
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        ahkr ahkr = (ahkr) pair.second;
        if (!lja.j.b(ahkr)) {
            int i;
            switch (ahkr.a) {
                case 2:
                case 5:
                    i = 1;
                    break;
                case 3:
                case 4:
                case 6:
                    i = lja.a(false, booleanValue);
                    break;
                case 7:
                    i = 3;
                    break;
                case 8:
                    i = 2;
                    break;
                default:
                    i = -1;
                    break;
            }
            if (i != -1) {
                lja.f.a(i);
            }
        }
    }
}
