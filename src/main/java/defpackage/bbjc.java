package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: bbjc */
final class bbjc extends bbiz {
    private static final Logger a = Logger.getLogger(bbjc.class.getName());
    private boolean b;

    private bbjc() {
    }

    public final bbiz a(double d) {
        if (d < 0.0d) {
            this.b = true;
        }
        return this;
    }

    public final bbiz a(long j) {
        if (j < 0) {
            this.b = true;
        }
        return this;
    }

    public final void a(bbju bbju) {
        bbit.a((Object) bbju, (Object) "tags");
        if (this.b) {
            a.logp(Level.WARNING, "io.opencensus.stats.NoopStats$NoopMeasureMap", "record", "Dropping values, value to record must be non-negative.");
        }
    }

    /* synthetic */ bbjc(byte b) {
    }
}
