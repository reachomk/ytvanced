package defpackage;

import android.media.MediaCrypto;

/* renamed from: nqh */
public final class nqh implements nqc {
    public final MediaCrypto a;

    public nqh(MediaCrypto mediaCrypto) {
        this.a = (MediaCrypto) nwf.a((Object) mediaCrypto);
    }

    public final boolean a(String str) {
        return this.a.requiresSecureDecoderComponent(str);
    }
}
