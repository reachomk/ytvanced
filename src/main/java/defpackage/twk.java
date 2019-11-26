package defpackage;

/* renamed from: twk */
final class twk implements Runnable {
    private final /* synthetic */ twh a;

    twk(twh twh) {
        this.a = twh;
    }

    public final void run() {
        twg twg = this.a.a;
        twg.e.b(twg.o);
        if (!this.a.a.k.getBoolean("primes.miniheapdump.isCalibrated", false)) {
            tyv.b("MiniHeapDumpMetric", "Logging calibration status", new Object[0]);
            bcep bcep = (bcep) bceq.d.createBuilder();
            int size = this.a.a.h.a.size();
            bcep.copyOnWrite();
            bceq bceq = (bceq) bcep.instance;
            bceq.a |= 1;
            bceq.b = size;
            this.a.a.a((bceq) ((anxl) bcep.build()));
        }
    }
}
