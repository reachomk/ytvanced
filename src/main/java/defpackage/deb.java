package defpackage;

import android.app.AppOpsManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import com.firebase.jobdispatcher.GooglePlayReceiver;

/* renamed from: deb */
public final class deb extends Handler {
    private final GooglePlayReceiver a;

    public deb(Looper looper, GooglePlayReceiver googlePlayReceiver) {
        super(looper);
        this.a = googlePlayReceiver;
    }

    public final void handleMessage(Message message) {
        String str = "FJD.GooglePlayReceiver";
        if (message != null) {
            try {
                ((AppOpsManager) this.a.getApplicationContext().getSystemService("appops")).checkPackage(message.sendingUid, "com.google.android.gms");
                int i = message.what;
                if (i == 1) {
                    Bundle data = message.getData();
                    Messenger messenger = message.replyTo;
                    String string = data.getString("tag");
                    if (!(messenger == null || string == null)) {
                        den ded = new ded(messenger, string);
                        if (this.a.b()) {
                            ded.a(1);
                        } else {
                            this.a.a().a(GooglePlayReceiver.a(ded, data));
                        }
                    }
                } else if (i == 2) {
                    deo a = GooglePlayReceiver.a.a(message.getData());
                    if (a != null) {
                        ddp.a(a.a(), true);
                    }
                } else if (i != 4) {
                    String valueOf = String.valueOf(message);
                    StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 31);
                    stringBuilder.append("Unrecognized message received: ");
                    stringBuilder.append(valueOf);
                    Log.e(str, stringBuilder.toString());
                }
            } catch (SecurityException unused) {
                Log.e(str, "Message was not sent from GCM.");
            }
        }
    }
}
