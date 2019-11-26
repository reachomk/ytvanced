package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecList;

/* renamed from: ole */
final class ole implements olc {
    private final int a;
    private MediaCodecInfo[] b;

    public ole(boolean z, boolean z2) {
        int i = 1;
        if (!(z || z2)) {
            i = 0;
        }
        this.a = i;
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

    public final boolean a(String str, String str2, CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    public final boolean a(String str, CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    private final void c() {
        if (this.b == null) {
            this.b = new MediaCodecList(this.a).getCodecInfos();
        }
    }
}
