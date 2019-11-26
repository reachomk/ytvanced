package defpackage;

import android.media.MediaFormat;

/* renamed from: amdk */
public final class amdk {
    public static atky a(int i) {
        amur amur = amdh.d;
        Integer valueOf = Integer.valueOf(i);
        if (amur.containsKey(valueOf)) {
            return (atky) amqw.a((atky) amdh.d.get(valueOf));
        }
        return atky.PIXEL_FORMAT_ID_UNKNOWN;
    }

    public static atku a(String str) {
        if (amdh.b.containsKey(str)) {
            return (atku) amdh.b.get(str);
        }
        return atku.CODEC_ID_UNKNOWN;
    }

    public static int a(MediaFormat mediaFormat, String str, int i) {
        if (mediaFormat.containsKey(str)) {
            try {
                return mediaFormat.getInteger(str);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return i;
    }

    public static String a(MediaFormat mediaFormat, String str, String str2) {
        if (mediaFormat.containsKey(str)) {
            try {
                return mediaFormat.getString(str);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return str2;
    }
}
