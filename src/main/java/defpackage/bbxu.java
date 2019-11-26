package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: bbxu */
public final class bbxu extends bbmn {
    private static final bbxw b = new bbxw("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));
    private final ThreadFactory a = b;

    public final bbmp a() {
        return new bbxt(this.a);
    }
}
