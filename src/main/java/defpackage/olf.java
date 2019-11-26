package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecList;

/* renamed from: olf */
final class olf implements olc {
    private olf() {
    }

    public final boolean a(String str, CodecCapabilities codecCapabilities) {
        return false;
    }

    public final boolean b() {
        return false;
    }

    public final int a() {
        return MediaCodecList.getCodecCount();
    }

    public final MediaCodecInfo a(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    public final boolean a(String str, String str2, CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    /* synthetic */ olf(byte b) {
    }
}
