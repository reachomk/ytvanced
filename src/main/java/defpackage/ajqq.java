package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: ajqq */
public final class ajqq implements baqa {
    private final bcaa a;

    private ajqq(bcaa bcaa) {
        this.a = bcaa;
    }

    public static ajqq a(bcaa bcaa) {
        return new ajqq(bcaa);
    }

    public final /* synthetic */ Object get() {
        return new ajql((ScheduledExecutorService) this.a.get());
    }
}
