package defpackage;

import android.os.ConditionVariable;

/* renamed from: xtk */
public final class xtk implements Runnable {
    private final /* synthetic */ ConditionVariable a;
    private final /* synthetic */ xti b;

    public xtk(xti xti, ConditionVariable conditionVariable) {
        this.b = xti;
        this.a = conditionVariable;
    }

    public final void run() {
        this.a.block();
        this.b.a();
    }
}
