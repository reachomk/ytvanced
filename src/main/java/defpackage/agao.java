package defpackage;

import android.os.MessageQueue.IdleHandler;

/* renamed from: agao */
final /* synthetic */ class agao implements IdleHandler {
    private final agak a;

    agao(agak agak) {
        this.a = agak;
    }

    public final boolean queueIdle() {
        agak agak = this.a;
        agak.p.execute(new agan(agak));
        return false;
    }
}
