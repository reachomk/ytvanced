package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: tzs */
public abstract class tzs {
    public volatile boolean a;
    private final List b = new ArrayList();

    public abstract void a(Context context, tzu tzu);

    public final synchronized void a() {
        if (!this.a) {
            this.a = true;
            tyv.b("PrimesShutdown", "Shutdown ...", new Object[0]);
            synchronized (this.b) {
                for (tzr a : this.b) {
                    try {
                        a.a();
                    } catch (RuntimeException e) {
                        tyv.a("PrimesShutdown", "ShutdownListener crashed", e, new Object[0]);
                    }
                }
                this.b.clear();
                tyv.b("PrimesShutdown", "All ShutdownListeners notified.", new Object[0]);
            }
        }
    }

    public final void a(tzu tzu) {
        if (!this.a && ((Boolean) tzu.a()).booleanValue()) {
            a();
        }
    }

    public final boolean a(tzr tzr) {
        synchronized (this.b) {
            if (this.a) {
                return false;
            }
            this.b.add((tzr) uhy.a((Object) tzr));
            return true;
        }
    }
}
