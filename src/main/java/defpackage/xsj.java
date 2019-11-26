package defpackage;

import android.content.Context;
import android.media.AudioManager;

/* renamed from: xsj */
public final class xsj implements xvz {
    private final Context a;

    public xsj(Context context) {
        this.a = context;
    }

    public final float a() {
        AudioManager audioManager = (AudioManager) this.a.getSystemService("audio");
        return ((float) audioManager.getStreamVolume(3)) / ((float) audioManager.getStreamMaxVolume(3));
    }
}
