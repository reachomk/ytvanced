package defpackage;

import android.view.ViewGroup;

/* renamed from: fsn */
final /* synthetic */ class fsn implements Runnable {
    private final fsk a;
    private final fsm b;

    fsn(fsk fsk, fsm fsm) {
        this.a = fsk;
        this.b = fsm;
    }

    public final void run() {
        fsk fsk = this.a;
        fsm fsm = this.b;
        ViewGroup viewGroup = fsk.i;
        if (viewGroup != null && viewGroup.getParent() != null) {
            fsm.a(fsk);
        }
    }
}
