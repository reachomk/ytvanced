package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.util.Pair;
import com.google.android.youtube.R;
import java.util.HashSet;
import java.util.Set;

/* renamed from: agrs */
public final class agrs {
    public final NotificationManager a;
    public final Set b = new HashSet();
    private final Context c;

    public agrs(Context context) {
        this.c = context;
        this.a = (NotificationManager) context.getSystemService("notification");
        try {
            xlr.a(context, "OfflineNotifications", context.getString(R.string.offline_notification_channel));
        } catch (NotFoundException unused) {
        }
    }

    public final void a(String str, int i, Notification notification) {
        synchronized (this.b) {
            this.b.add(new Pair(str, Integer.valueOf(i)));
        }
        this.a.notify(str, i, notification);
    }

    public final qg a() {
        qg qgVar = new qg(this.c);
        xlr.a(qgVar, "OfflineNotifications");
        return qgVar;
    }
}
