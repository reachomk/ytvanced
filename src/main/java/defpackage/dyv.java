package defpackage;

import com.google.protos.youtube.api.innertube.LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand;
import java.util.Map;

/* renamed from: dyv */
public final class dyv implements aaap {
    private final zyw a;
    private final agvs b;
    private final bcaa c;
    private final agwu d;

    public dyv(zyw zyw, agvs agvs, bcaa bcaa, agwu agwu) {
        this.a = zyw;
        this.b = agvs;
        this.c = bcaa;
        this.d = agwu;
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.localWatchHistoryCommand);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d) && foh.M(this.a)) {
            access$000 = anxl.checkIsLite(LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.localWatchHistoryCommand);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand localWatchHistoryCommandOuterClass$LocalWatchHistoryCommand = (LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand) b;
            String c = ((agwc) this.c.get()).c();
            int a = aujw.a(localWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.b);
            if (a == 0) {
                a = 1;
            }
            a--;
            if (a != 1) {
                if (a == 2) {
                    this.d.a();
                } else if (a == 3) {
                    this.b.a(c, true);
                } else if (a == 4) {
                    this.b.a(c, false);
                }
            } else if (!localWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.c.isEmpty()) {
                agwu agwu = this.d;
                String str = localWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.c;
                anjv anjv = agwu.g;
                if (anjv == null || anjv.isCancelled() || agwu.g.isDone()) {
                    agwu.g = anja.c(anjf.a(((agwc) agwu.d.get()).b())).a(new agxc(str), agwu.a);
                    xan.a(agwu.g, aniv.a, agxb.a, new agxe(agwu));
                }
            }
        }
    }
}
