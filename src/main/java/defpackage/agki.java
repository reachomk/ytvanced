package defpackage;

import android.os.Handler.Callback;
import android.os.Message;
import com.google.android.libraries.youtube.offline.developer.DebugOfflineStartupLatencyActivity;

/* renamed from: agki */
public final class agki implements Callback {
    public final /* synthetic */ DebugOfflineStartupLatencyActivity a;

    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        this.a.runOnUiThread(new agkk(this, (String) message.obj));
        return true;
    }

    public /* synthetic */ agki(DebugOfflineStartupLatencyActivity debugOfflineStartupLatencyActivity) {
        this.a = debugOfflineStartupLatencyActivity;
    }
}
