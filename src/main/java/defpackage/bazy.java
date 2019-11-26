package defpackage;

import java.util.ArrayList;

/* renamed from: bazy */
final class bazy {
    private ArrayList a = new ArrayList();
    private volatile basp b = basp.IDLE;

    bazy() {
    }

    /* Access modifiers changed, original: final */
    public final void a(basp basp) {
        amqw.a((Object) basp, (Object) "newState");
        if (this.b != basp && this.b != basp.SHUTDOWN) {
            this.b = basp;
            if (!this.a.isEmpty()) {
                ArrayList arrayList = this.a;
                this.a = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    bazx bazx = (bazx) arrayList.get(i);
                    bazx.b.execute(bazx.a);
                }
            }
        }
    }
}
