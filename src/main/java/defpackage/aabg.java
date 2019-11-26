package defpackage;

import java.util.concurrent.Callable;

/* renamed from: aabg */
final /* synthetic */ class aabg implements Callable {
    private final aabe a;
    private final String b;

    aabg(aabe aabe, String str) {
        this.a = aabe;
        this.b = str;
    }

    public final Object call() {
        return this.a.a(this.b);
    }
}
