package defpackage;

import java.util.concurrent.Callable;

/* renamed from: agbq */
final /* synthetic */ class agbq implements Callable {
    private final agbo a;
    private final String b;

    agbq(agbo agbo, String str) {
        this.a = agbo;
        this.b = str;
    }

    public final Object call() {
        agbo agbo = this.a;
        return agbo.a(this.b, agbo.a.b() + 18000000);
    }
}
