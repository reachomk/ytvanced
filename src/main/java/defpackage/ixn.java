package defpackage;

import android.os.Handler;
import android.os.Message;
import com.google.android.apps.youtube.app.search.voice.BitmapSoundLevelsView;

/* renamed from: ixn */
public final class ixn extends Handler {
    public volatile boolean a;
    private final BitmapSoundLevelsView b;

    public ixn(BitmapSoundLevelsView bitmapSoundLevelsView) {
        this.b = bitmapSoundLevelsView;
    }

    public final void handleMessage(Message message) {
        if (this.a) {
            this.b.invalidate();
            sendMessageDelayed(obtainMessage(0), 10);
        }
    }
}
