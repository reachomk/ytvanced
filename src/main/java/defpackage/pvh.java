package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: pvh */
final class pvh extends qsv {
    private final WeakReference a;

    pvh(puy puy) {
        this.a = new WeakReference(puy);
    }

    public final void a(qtd qtd) {
        puy puy = (puy) this.a.get();
        if (puy != null) {
            puy.a.a(new pvg(puy, puy, qtd));
        }
    }
}
