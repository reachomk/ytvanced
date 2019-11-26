package defpackage;

import android.os.Handler;
import android.os.Message;
import com.google.android.libraries.youtube.mdx.smartremote.BitmapSoundLevelsView;

/* renamed from: adwf */
public final class adwf extends Handler {
    public volatile boolean a;
    private final BitmapSoundLevelsView b;

    public adwf(BitmapSoundLevelsView bitmapSoundLevelsView) {
        this.b = bitmapSoundLevelsView;
    }

    public final void handleMessage(Message message) {
        if (this.a) {
            this.b.invalidate();
            sendMessageDelayed(obtainMessage(0), 10);
        }
    }
}
