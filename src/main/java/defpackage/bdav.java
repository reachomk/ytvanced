package defpackage;

import java.util.concurrent.Executor;

/* renamed from: bdav */
public final class bdav extends bcuf {
    private final Executor a;

    public bdav(Executor executor) {
        this.a = executor;
    }

    public final bcue a() {
        return new bdau(this.a);
    }
}
