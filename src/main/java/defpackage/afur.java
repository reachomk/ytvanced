package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.StatusUpdateNotificationRendererOuterClass;
import com.google.protos.youtube.api.innertube.UpdateNotificationActionOuterClass$UpdateNotificationAction;
import java.util.Map;

/* renamed from: afur */
public final class afur implements aaap {
    private final Context a;
    private final int b = R.drawable.ic_stat_yt_notification_logo;

    public afur(Context context, afyb afyb) {
        this.a = (Context) amqw.a((Object) context);
        amqw.a((Object) afyb);
    }

    public final void a(apxu apxu, Map map) {
        Object obj = "com.google.android.libraries.youtube.innertube.endpoint.tag";
        afxm afxm = (afxm) xsb.a(map, obj, afxm.class);
        String str = "UpdateNotificationActionCommand";
        Object c;
        if (afxm == null) {
            c = xsb.c(map, obj);
            String valueOf = String.valueOf(c);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 21);
            stringBuilder.append("incorrect parameter: ");
            stringBuilder.append(valueOf);
            Log.e(str, stringBuilder.toString() != null ? c.toString() : "null");
            return;
        }
        Object obj2;
        anxr access$000 = anxl.checkIsLite(UpdateNotificationActionOuterClass$UpdateNotificationAction.updateNotificationAction);
        apxu.a(access$000);
        obj = apxu.h.b(access$000.d);
        if (obj == null) {
            obj2 = access$000.b;
        } else {
            obj2 = access$000.a(obj);
        }
        anxp anxp = ((UpdateNotificationActionOuterClass$UpdateNotificationAction) obj2).b;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$0002 = anxl.checkIsLite(StatusUpdateNotificationRendererOuterClass.statusUpdateNotificationRenderer);
        anxp.a(access$0002);
        obj2 = anxp.h.b(access$0002.d);
        if (obj2 == null) {
            obj2 = access$0002.b;
        } else {
            obj2 = access$0002.a(obj2);
        }
        afxv a = afxv.a(this.a, afxm.b(), afxm.a(), (axub) obj2, this.b);
        if (a != null) {
            a.a(this.a, null, null, null, null);
            return;
        }
        access$000 = anxl.checkIsLite(UpdateNotificationActionOuterClass$UpdateNotificationAction.updateNotificationAction);
        apxu.a(access$000);
        c = apxu.h.b(access$000.d);
        if (c == null) {
            c = access$000.b;
        } else {
            c = access$000.a(c);
        }
        String valueOf2 = String.valueOf(c);
        StringBuilder stringBuilder2 = new StringBuilder(valueOf2.length() + 33);
        stringBuilder2.append("build systemNotification failed :");
        stringBuilder2.append(valueOf2);
        Log.e(str, stringBuilder2.toString());
    }
}
