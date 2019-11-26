package defpackage;

import android.content.Context;
import android.media.AudioManager;

/* renamed from: xrt */
public final class xrt {
    private final AudioManager a;
    private final int b = this.a.getStreamMaxVolume(3);

    public xrt(Context context) {
        this.a = (AudioManager) ((Context) amqw.a((Object) context)).getSystemService("audio");
    }

    public final int a() {
        return this.b != 0 ? (this.a.getStreamVolume(3) * 100) / this.b : 0;
    }
}
