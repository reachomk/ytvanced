package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: xjx */
public final class xjx implements xhi {
    private final xkm a;

    public xjx(xsc xsc, bcaa bcaa, bcaa bcaa2, bcaa bcaa3, aosr aosr, xax xax, ScheduledExecutorService scheduledExecutorService, xgv xgv, Executor executor, boolean z) {
        xjx.a(aosr);
        xjn xjn = new xjn();
        if (xsc != null) {
            xjn.c = xsc;
            if (bcaa != null) {
                xjn.a = bcaa;
                if (bcaa2 != null) {
                    xjn.b = bcaa2;
                    this.a = ((xkm) ((xkm) ((xkm) xjn.a(bcaa3)).a(aosr).a(xax)).a(scheduledExecutorService).a(xgv).a(executor).a(z)).a().a(new xka(aosr)).b(new xjz(aosr));
                    return;
                }
                throw new NullPointerException("Null headerDecoratorProvider");
            }
            throw new NullPointerException("Null cronetEngineProvider");
        }
        throw new NullPointerException("Null clock");
    }

    public static void a(aosr aosr) {
        amqw.a((Object) aosr, (Object) "config is null");
        boolean z = true;
        amqw.a(aosr.g >= 0, (Object) "normalCoreSize < 0");
        amqw.a(aosr.h > 0, (Object) "normalMaxSize <= 0");
        amqw.a(aosr.h >= aosr.g, (Object) "normalMaxSize < normalCoreSize");
        amqw.a(aosr.e >= 0, (Object) "priorityCoreSize < 0");
        amqw.a(aosr.f > 0, (Object) "priorityMaxSize <= 0");
        amqw.a(aosr.f >= aosr.e, (Object) "priorityMaxSize < priorityCoreSize");
        if (aosr.d < 0) {
            z = false;
        }
        amqw.a(z, (Object) "keepAliveTime < 0");
    }

    public final xhf a(bqa bqa, xhl xhl) {
        return a(bqa, xhl, 4, new wzu(), null);
    }

    public final xhf a(bqa bqa, xhl xhl, int i, Executor executor, xhj xhj) {
        return new xju(this.a.a(bqa).a(xhl).a(xhj).a(i).b(executor).b());
    }
}
