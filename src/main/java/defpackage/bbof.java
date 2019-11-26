package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: bbof */
final class bbof implements Callable {
    private final int a = 16;

    bbof() {
    }

    public final /* synthetic */ Object call() {
        return new ArrayList(this.a);
    }
}
