package defpackage;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: aecl */
public final class aecl implements aeci, ajan {
    public final bdfu a = new bdfu();
    public final Set b = new CopyOnWriteArraySet();

    public final long e() {
        return 1;
    }

    public final void a(aech aech) {
        this.b.add(aech);
    }

    public final void b(aech aech) {
        this.b.remove(aech);
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.t().a(new aeco(this))};
    }

    static {
        xtl.b("MDX.SequencerStageQueueStatusMonitor");
    }
}
