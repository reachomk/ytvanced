package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;

/* renamed from: qfa */
final class qfa extends Handler {
    private final /* synthetic */ qfb a;

    qfa(qfb qfb, Looper looper) {
        this.a = qfb;
        super(looper);
    }

    public final void handleMessage(Message message) {
        String str = "GcmTaskService";
        if (qbj.a(this.a, message.sendingUid, "com.google.android.gms")) {
            int i = message.what;
            if (i != 1) {
                if (!(i == 2 || i == 4)) {
                    String valueOf = String.valueOf(message);
                    StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 31);
                    stringBuilder.append("Unrecognized message received: ");
                    stringBuilder.append(valueOf);
                    Log.e(str, stringBuilder.toString());
                }
                return;
            }
            Bundle data = message.getData();
            if (!data.isEmpty()) {
                Messenger messenger = message.replyTo;
                if (messenger != null) {
                    str = data.getString("tag");
                    data.getParcelableArrayList("triggered_uris");
                    if (!this.a.a(str)) {
                        this.a.a(new qfd(this.a, str, messenger, data.getBundle("extras")));
                    }
                }
            }
            return;
        }
        Log.e(str, "unable to verify presence of Google Play Services");
    }
}
