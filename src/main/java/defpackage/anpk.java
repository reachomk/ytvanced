package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: anpk */
public final class anpk {
    private static anpk e;
    public final aac a = new aac();
    public Boolean b = null;
    public final Queue c = new ArrayDeque();
    public final Queue d = new ArrayDeque();

    public static synchronized anpk a() {
        anpk anpk;
        synchronized (anpk.class) {
            if (e == null) {
                e = new anpk();
            }
            anpk = e;
        }
        return anpk;
    }

    private anpk() {
    }

    public static PendingIntent a(Context context, int i, Intent intent) {
        return PendingIntent.getBroadcast(context, i, anpk.a(context, "com.google.firebase.MESSAGING_EVENT", intent), 1073741824);
    }

    public static Intent a(Context context, String str, Intent intent) {
        Intent intent2 = new Intent(context, FirebaseInstanceIdReceiver.class);
        intent2.setAction(str);
        intent2.putExtra("wrapped_intent", intent);
        return intent2;
    }
}
