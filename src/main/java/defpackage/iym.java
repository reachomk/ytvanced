package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build.VERSION;

/* renamed from: iym */
public final class iym {
    public boolean a;
    public boolean b;
    public boolean c;
    public iyn d;

    public iym() {
        boolean z = VERSION.SDK_INT <= 20;
        this.a = false;
        this.c = false;
        this.a = z;
    }

    public static MediaCodecInfo a(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                String[] supportedTypes = codecInfoAt.getSupportedTypes();
                for (CharSequence a : supportedTypes) {
                    if (ampq.a(a, str)) {
                        return codecInfoAt;
                    }
                }
                continue;
            }
        }
        return null;
    }

    public static String a(int i) {
        int i2 = i - 1;
        if (i != 0) {
            String str = "";
            if (i2 != 0) {
                if (i2 == 1) {
                    str = "audio/amr-wb";
                } else if (i2 == 2) {
                    return "audio/flac";
                } else {
                    if (i2 != 3) {
                        return str;
                    }
                }
            }
            return str;
        }
        throw null;
    }

    public static int b(int i) {
        int i2 = i - 1;
        if (i != 0) {
            i = 1;
            if (i2 != 0) {
                if (i2 != 1) {
                    switch (i2) {
                        case 6600:
                        case 8850:
                        case 12650:
                        case 14250:
                        case 15850:
                        case 18250:
                        case 19850:
                        case 23050:
                        case 23850:
                            return 2;
                        case 12000:
                        case 16000:
                        case 24000:
                        case 32000:
                        case 64000:
                        case 96000:
                        case 128000:
                            return 4;
                        default:
                            return 1;
                    }
                }
                i = 3;
            }
            return i;
        }
        throw null;
    }
}
