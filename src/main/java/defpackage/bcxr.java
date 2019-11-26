package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: bcxr */
final class bcxr extends AtomicBoolean implements bcuc {
    public static final long serialVersionUID = 3428177408082367154L;
    private final /* synthetic */ bcxo a;

    bcxr(bcxo bcxo) {
        this.a = bcxo;
    }

    public final void a(long j) {
        if (j < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("n >= 0 required but it was ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (j != 0) {
            bcxo bcxo = this.a;
            if (get() || !compareAndSet(false, true)) {
                bcxo.a(bcvu.a(j, (long) bcxo.b));
            } else {
                bcxo.a(bcvu.b(bcvu.a(j, (long) bcxo.a), bcvu.a((long) (bcxo.b - bcxo.a), j - 1)));
            }
        }
    }
}
