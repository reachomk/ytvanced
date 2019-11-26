package defpackage;

import android.util.Pair;
import java.util.concurrent.Callable;

/* renamed from: fot */
final class fot implements Callable {
    private final /* synthetic */ fou a;

    fot(fou fou) {
        this.a = fou;
    }

    public final /* synthetic */ Object call() {
        fow fow = (fow) this.a.a.get();
        return Pair.create(fow.a(), Long.valueOf(fow.b()));
    }
}
