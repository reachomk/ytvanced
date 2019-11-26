package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: atw */
public abstract class atw {
    public boolean a = false;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();

    public abstract void a();

    public final void a(atn atn) {
        this.b.add(atn);
    }

    /* Access modifiers changed, original: final */
    public final void b(atn atn) {
        this.b.remove(atn);
    }
}
