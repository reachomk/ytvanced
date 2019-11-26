package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings.Global;
import java.util.Arrays;

/* renamed from: obk */
public final class obk {
    private static final obk c = new obk(new int[]{2}, 8);
    private static final obk d = new obk(new int[]{2, 5, 6}, 8);
    public final int[] a;
    public final int b;

    public static obk a(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        if (ozp.a >= 17) {
            if ("Amazon".equals(ozp.c) && Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
                return d;
            }
        }
        return (registerReceiver == null || registerReceiver.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) ? c : new obk(registerReceiver.getIntArrayExtra("android.media.extra.ENCODINGS"), registerReceiver.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
    }

    private obk(int[] iArr, int i) {
        if (iArr != null) {
            this.a = Arrays.copyOf(iArr, iArr.length);
            Arrays.sort(this.a);
        } else {
            this.a = new int[0];
        }
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof obk) {
            obk obk = (obk) obj;
            return Arrays.equals(this.a, obk.a) && this.b == obk.b;
        }
    }

    public final int hashCode() {
        return this.b + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        int i = this.b;
        String arrays = Arrays.toString(this.a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(arrays).length() + 67);
        stringBuilder.append("AudioCapabilities[maxChannelCount=");
        stringBuilder.append(i);
        stringBuilder.append(", supportedEncodings=");
        stringBuilder.append(arrays);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
