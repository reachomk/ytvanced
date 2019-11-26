package defpackage;

import android.media.MediaCodecInfo.CodecCapabilities;

/* renamed from: nlo */
public final class nlo {
    public final String a;
    public final CodecCapabilities b;
    public final boolean c;

    nlo(String str, CodecCapabilities codecCapabilities) {
        this.a = str;
        this.b = codecCapabilities;
        boolean z = false;
        if (codecCapabilities != null && nxf.a >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback")) {
            z = true;
        }
        this.c = z;
    }
}
