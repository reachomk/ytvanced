package defpackage;

import android.media.MediaDrm;
import android.media.MediaDrm.OnEventListener;

/* renamed from: oei */
public final /* synthetic */ class oei implements OnEventListener {
    private final oeb a;

    public oei(oeb oeb) {
        this.a = oeb;
    }

    public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        this.a.a(bArr, i);
    }
}
