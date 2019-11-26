package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* renamed from: aktl */
public final class aktl implements akte {
    public final HashMap a = new HashMap();
    public final Executor b;
    private final akkq c;

    public aktl(akkq akkq, Executor executor) {
        this.c = akkq;
        this.b = executor;
    }

    public final void a(aktc aktc, aygk aygk, int i, aktf aktf) {
        Uri b = aklb.b(aygk, i);
        WeakReference weakReference = (WeakReference) this.a.get(b);
        if (weakReference == null || weakReference.get() == null) {
            aktk aktk = new aktk(this, aktf, aktc);
            if (b == null) {
                xtl.c("Tried to load a null bitmap.");
                return;
            } else {
                this.c.b(b, aktk);
                return;
            }
        }
        aktf.a(aktc, (Bitmap) weakReference.get());
    }
}
