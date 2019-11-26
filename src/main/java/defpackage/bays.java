package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: bays */
final class bays {
    public static final Logger a = Logger.getLogger(bays.class.getName());
    public static final AtomicIntegerFieldUpdater b;
    public final bbld c;
    public final baur d;
    public final bayy e = new bayy(this);

    bays(bbld bbld, bblq bblq) {
        bayv bayv = new bayv();
        this.c = (bbld) amqw.a((Object) bbld, (Object) "censusTracer");
        amqw.a((Object) bblq, (Object) "censusPropagationBinaryFormat");
        this.d = baur.a("grpc-trace-bin", new bayr(bblq));
    }

    public static void a(bbkr bbkr, bbks bbks, int i, long j, long j2) {
        long j3 = (long) i;
        bbkh bbkh = new bbkh();
        bbks = (bbks) bbit.a((Object) bbks, (Object) "type");
        if (bbks != null) {
            bbkh.a = bbks;
            bbkh.b = Long.valueOf(j3);
            bbkh.a(0);
            bbkh.b(0);
            if (j2 != -1) {
                bbkh.a(j2);
            }
            if (j != -1) {
                bbkh.b(j);
            }
            bbkr.a(bbkh.a());
            return;
        }
        throw new NullPointerException("Null type");
    }

    static String a(String str) {
        str = str.replace('/', '.');
        StringBuilder stringBuilder = new StringBuilder(("Sent".length() + 1) + String.valueOf(str).length());
        stringBuilder.append("Sent.");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    static {
        AtomicIntegerFieldUpdater newUpdater;
        String str = "a";
        try {
            newUpdater = AtomicIntegerFieldUpdater.newUpdater(bayu.class, str);
            AtomicIntegerFieldUpdater.newUpdater(bayw.class, str);
        } catch (Throwable th) {
            a.logp(Level.SEVERE, "io.grpc.internal.CensusTracingModule", "<clinit>", "Creating atomic field updaters failed", th);
            newUpdater = null;
        }
        b = newUpdater;
    }
}
