package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: ika */
final class ika extends xto {
    private final /* synthetic */ airv a;
    private final /* synthetic */ aisl b;
    private final /* synthetic */ ScheduledExecutorService c;

    ika(String str, airv airv, aisl aisl, ScheduledExecutorService scheduledExecutorService) {
        this.a = airv;
        this.b = aisl;
        this.c = scheduledExecutorService;
        super(str);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object a() {
        return new aixc(this.a, this.b, this.c);
    }
}
