package defpackage;

import java.util.concurrent.Callable;

/* renamed from: agbx */
final /* synthetic */ class agbx implements Callable {
    private final agbu a;
    private final String b;

    agbx(agbu agbu, String str) {
        this.a = agbu;
        this.b = str;
    }

    public final Object call() {
        return this.a.d(this.b);
    }
}
