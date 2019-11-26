package defpackage;

import android.media.MediaFormat;

/* renamed from: acej */
public final class acej {
    public static boolean a(int i) {
        if (i != 0) {
            switch (i) {
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                    break;
                default:
                    switch (i) {
                        case 28:
                        case 29:
                        case 30:
                            break;
                        default:
                            return true;
                    }
            }
        }
        return false;
    }

    public static boolean a(MediaFormat mediaFormat) {
        if (mediaFormat != null) {
            String string = mediaFormat.getString("mime");
            if (string != null && string.startsWith("video/")) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(MediaFormat mediaFormat) {
        if (mediaFormat != null) {
            String string = mediaFormat.getString("mime");
            if (string != null && string.startsWith("audio/")) {
                return true;
            }
        }
        return false;
    }
}
