package defpackage;

import java.util.concurrent.Future;

/* renamed from: anji */
public final class anji implements Runnable {
    private final /* synthetic */ Future a;

    public anji(Future future) {
        this.a = future;
    }

    public final void run() {
        this.a.cancel(false);
    }
}
