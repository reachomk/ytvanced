package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: bcus */
final class bcus extends bcuf {
    private final Handler a;

    bcus(Looper looper) {
        this.a = new Handler(looper);
    }

    public final bcue a() {
        return new bcuv(this.a);
    }
}
