package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: aguq */
public final class aguq implements agur {
    private final Executor a;

    public aguq(ScheduledExecutorService scheduledExecutorService) {
        this.a = (Executor) amqw.a((Object) scheduledExecutorService);
    }

    public final void a(agvz agvz, String str, wxg wxg) {
        amqw.a((Object) agvz);
        this.a.execute(new agup(wxg, agvz, str));
    }
}
