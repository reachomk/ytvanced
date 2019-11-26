package defpackage;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.iid.MessengerCompat;

/* renamed from: qhv */
final class qhv extends Handler {
    private final /* synthetic */ qhu a;

    qhv(qhu qhu, Looper looper) {
        this.a = qhu;
        super(looper);
    }

    public final void handleMessage(Message message) {
        qhu qhu = this.a;
        if (message == null) {
            return;
        }
        if (message.obj instanceof Intent) {
            Intent intent = (Intent) message.obj;
            intent.setExtrasClassLoader(MessengerCompat.class.getClassLoader());
            String str = "google.messenger";
            if (intent.hasExtra(str)) {
                Parcelable parcelableExtra = intent.getParcelableExtra(str);
                if (parcelableExtra instanceof MessengerCompat) {
                    qhu.d = (MessengerCompat) parcelableExtra;
                }
                if (parcelableExtra instanceof Messenger) {
                    qhu.c = (Messenger) parcelableExtra;
                }
            }
            qhu.a((Intent) message.obj);
            return;
        }
        Log.w("InstanceID", "Dropping invalid message");
    }
}
