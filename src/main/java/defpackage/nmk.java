package defpackage;

import android.media.MediaCodec.CryptoException;

/* renamed from: nmk */
final class nmk implements Runnable {
    private final /* synthetic */ CryptoException a;
    private final /* synthetic */ nmi b;

    nmk(nmi nmi, CryptoException cryptoException) {
        this.b = nmi;
        this.a = cryptoException;
    }

    public final void run() {
        this.b.c.a(this.a);
    }
}
