package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecList;

/* renamed from: nmr */
final class nmr implements nmp {
    private final int a;
    private MediaCodecInfo[] b;

    public nmr(boolean z) {
        this.a = z;
    }

    public final boolean b() {
        return true;
    }

    public final int a() {
        c();
        return this.b.length;
    }

    public final MediaCodecInfo a(int i) {
        c();
        return this.b[i];
    }

    public final boolean a(String str, CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private final void c() {
        if (this.b == null) {
            this.b = new MediaCodecList(this.a).getCodecInfos();
        }
    }
}
