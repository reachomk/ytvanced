package defpackage;

import android.os.Looper;

/* renamed from: aeqk */
public final class aeqk {
    public boolean a = false;
    private int b;

    private aeqk() {
    }

    public final boolean a() {
        xak.a();
        return this.b > 0;
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        if (this.a && Looper.myLooper() != Looper.getMainLooper()) {
            afpc.a(2, afpf.media, "Medialib event happened off main thread");
        }
        this.b++;
    }

    /* Access modifiers changed, original: final */
    public final void c() {
        this.b--;
    }

    /* synthetic */ aeqk(byte b) {
    }
}
