package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: agwu */
public final class agwu {
    public final ScheduledExecutorService a;
    public final agvs b;
    public final agvm c;
    public final bcaa d;
    public agvn e;
    public anjv f;
    public anjv g;
    private anjv h;

    public agwu(ScheduledExecutorService scheduledExecutorService, agvs agvs, agvm agvm, bcaa bcaa) {
        this.a = scheduledExecutorService;
        this.b = agvs;
        this.c = agvm;
        this.d = bcaa;
    }

    public final void a() {
        anjv anjv = this.h;
        if (anjv == null || anjv.isCancelled() || this.h.isDone()) {
            this.h = anja.c(anjf.a(((agwc) this.d.get()).b())).a(agwx.a, this.a);
            xan.a(this.h, aniv.a, agxa.a, new agwz(this));
        }
    }

    public static void a(Throwable th) {
        bqn bqn;
        if (th instanceof bqn) {
            bqn = (bqn) th;
        } else {
            bqn = new bqn(th);
        }
        String valueOf = String.valueOf(bqn.getMessage());
        String str = "OfflineVideoPlaybackPositionSyncService request failed: ";
        xtl.c(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
    }

    public final void a(avrn avrn) {
        agwc agwc = (agwc) this.d.get();
        String c = agwc.c();
        this.b.e(c, avrn.d);
        this.b.a(c, avrn.c);
        agwh k = agwc.b().k();
        if (avrn.hasFrameworkUpdates()) {
            arnm frameworkUpdates = avrn.getFrameworkUpdates();
            anxr access$000 = anxl.checkIsLite(arfm.c);
            frameworkUpdates.a(access$000);
            Object b = frameworkUpdates.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            for (arfo arfo : ((arfm) r6).a) {
                if ((arfo.a & 8) != 0) {
                    anxp anxp = arfo.d;
                    if (anxp == null) {
                        anxp = arfy.a;
                    }
                    anxr access$0002 = anxl.checkIsLite(azcy.f);
                    anxp.a(access$0002);
                    if (anxp.h.a(access$0002.d)) {
                        anxp = arfo.d;
                        if (anxp == null) {
                            anxp = arfy.a;
                        }
                        access$0002 = anxl.checkIsLite(azcy.f);
                        anxp.a(access$0002);
                        Object b2 = anxp.h.b(access$0002.d);
                        if (b2 == null) {
                            b2 = access$0002.b;
                        } else {
                            b2 = access$0002.a(b2);
                        }
                        String str = ((azcy) b2).c;
                        anxp anxp2 = arfo.d;
                        if (anxp2 == null) {
                            anxp2 = arfy.a;
                        }
                        access$0002 = anxl.checkIsLite(azcy.f);
                        anxp2.a(access$0002);
                        Object b3 = anxp2.h.b(access$0002.d);
                        if (b3 == null) {
                            b3 = access$0002.b;
                        } else {
                            b3 = access$0002.a(b3);
                        }
                        long j = ((azcy) b3).d;
                        if (k.a(str) != null) {
                            k.b(str, j);
                        }
                    }
                }
            }
        }
    }
}
