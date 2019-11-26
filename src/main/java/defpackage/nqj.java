package defpackage;

import android.media.MediaDrm;
import android.media.MediaDrm.OnEventListener;

/* renamed from: nqj */
final class nqj implements OnEventListener {
    private final /* synthetic */ nqg a;

    nqj(nqg nqg) {
        this.a = nqg;
    }

    public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        this.a.a(bArr, i);
    }
}
