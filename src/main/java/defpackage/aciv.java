package defpackage;

import java.util.concurrent.Callable;

/* renamed from: aciv */
final /* synthetic */ class aciv implements Callable {
    private final acjd a;

    aciv(acjd acjd) {
        this.a = acjd;
    }

    public final Object call() {
        acjd acjd = this.a;
        acjd.b.await();
        return acjd.a;
    }
}
