package defpackage;

import java.util.Collection;
import java.util.Set;

/* renamed from: ske */
public final class ske {
    private final amuw a;
    private boolean b = false;

    public ske(Set set) {
        this.a = amuw.a((Collection) set);
    }

    public final synchronized void a() {
        if (!this.b) {
            amxo amxo = (amxo) this.a.iterator();
            while (amxo.hasNext()) {
                ((sxi) amxo.next()).a();
            }
            svh svh = new svh();
            this.b = true;
        }
    }

    public final synchronized void b() {
        if (this.b) {
            amxo amxo = (amxo) this.a.iterator();
            while (amxo.hasNext()) {
                ((sxi) amxo.next()).b();
            }
            this.b = false;
        }
    }
}
