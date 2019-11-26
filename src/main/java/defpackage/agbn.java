package defpackage;

import java.util.concurrent.Callable;

/* renamed from: agbn */
final /* synthetic */ class agbn implements Callable {
    private final agbo a;
    private final String b;

    agbn(agbo agbo, String str) {
        this.a = agbo;
        this.b = str;
    }

    public final Object call() {
        return amqp.c(this.a.b(this.b, 0));
    }
}
