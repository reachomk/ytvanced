package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecList;

/* renamed from: nms */
final class nms implements nmp {
    private nms() {
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

    public final boolean a(String str, CodecCapabilities codecCapabilities) {
        return "video/avc".equals(str);
    }

    /* synthetic */ nms(byte b) {
    }
}
