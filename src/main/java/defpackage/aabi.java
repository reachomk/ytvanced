package defpackage;

import java.util.concurrent.Callable;

/* renamed from: aabi */
final /* synthetic */ class aabi implements Callable {
    private final aabe a;
    private final String b;

    aabi(aabe aabe, String str) {
        this.a = aabe;
        this.b = str;
    }

    public final Object call() {
        return this.a.c(this.b);
    }
}
