package defpackage;

import android.os.Handler.Callback;
import android.os.Message;
import com.google.android.libraries.youtube.offline.developer.DebugOfflineResyncActivity;

/* renamed from: agkf */
public final class agkf implements Callback {
    public final /* synthetic */ DebugOfflineResyncActivity a;

    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        this.a.runOnUiThread(new agkh(this, (String) message.obj));
        return true;
    }

    public /* synthetic */ agkf(DebugOfflineResyncActivity debugOfflineResyncActivity) {
        this.a = debugOfflineResyncActivity;
    }
}
