package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint;
import java.util.Map;

/* renamed from: fvn */
public final class fvn implements aaap {
    public final Activity a;
    public final xoi b;
    public final aaas c;
    private final abdx d;
    private AlertDialog e;

    public fvn(Activity activity, abdx abdx, xoi xoi, aaas aaas) {
        this.a = (Activity) amqw.a((Object) activity);
        this.d = (abdx) amqw.a((Object) abdx);
        this.b = (xoi) amqw.a((Object) xoi);
        this.c = (aaas) amqw.a((Object) aaas);
    }

    public final void a(apxu apxu, Map map) {
        arml arml = null;
        if (this.e == null) {
            this.e = new Builder(this.a).setNegativeButton(R.string.cancel, null).create();
        }
        this.e.setButton(-1, this.a.getString(R.string.ok), new fvq(this, apxu, map));
        anxr access$000 = anxl.checkIsLite(NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.notificationOptOutEndpoint);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.notificationOptOutEndpoint);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint notificationOptOutEndpointOuterClass$NotificationOptOutEndpoint = (NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint) b;
            AlertDialog alertDialog = this.e;
            if ((notificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.a & 16) != 0) {
                arml = notificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.d;
                if (arml == null) {
                    arml = arml.f;
                }
            }
            alertDialog.setMessage(ajqy.a(arml));
        } else {
            this.e.setMessage("");
        }
        this.e.show();
    }

    public final void b(apxu apxu, Map map) {
        Object obj;
        abdx abdx = this.d;
        aaml abdu = new abdu(abdx.c, abdx.d.c());
        anxr access$000 = anxl.checkIsLite(NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.notificationOptOutEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint notificationOptOutEndpointOuterClass$NotificationOptOutEndpoint = (NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint) obj;
        abdu.a = notificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.b;
        abdu.b = notificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.e;
        abdu.a(aabc.a(apxu));
        abdx = this.d;
        abdx.a.a(abdu, new fvp(this, apxu, map));
    }
}
