package defpackage;

import java.util.concurrent.Callable;

/* renamed from: roc */
final /* synthetic */ class roc implements Callable {
    private final rnz a;

    roc(rnz rnz) {
        this.a = rnz;
    }

    public final Object call() {
        return this.a.d.getString("flag_configuration", "{}");
    }
}
