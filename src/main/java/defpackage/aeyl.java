package defpackage;

import java.util.concurrent.Callable;

/* renamed from: aeyl */
final /* synthetic */ class aeyl implements Callable {
    private final aeyi a;

    aeyl(aeyi aeyi) {
        this.a = aeyi;
    }

    public final Object call() {
        aeyi aeyi = this.a;
        if (aeyi.c == null) {
            return Boolean.valueOf(false);
        }
        aeyi.b.b(-1);
        Object obj = aeyi.c;
        if (obj.c == null) {
            aeyi.a(obj);
        } else {
            obj.d = true;
        }
        aeyi.c = null;
        return Boolean.valueOf(true);
    }
}
