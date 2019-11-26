package defpackage;

import android.app.AlertDialog.Builder;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: joi */
public final class joi extends egj implements joj, xcp {
    public final nn a;
    public final fjo b;
    private final akkq c;
    private final acvx d;
    private final fpt e;

    public joi(nn nnVar, fjo fjo, exu exu, akkq akkq, acvx acvx, fpt fpt) {
        super(nnVar, exu, "vdpPurchaseConfirmationDialog");
        this.a = nnVar;
        this.b = fjo;
        this.c = akkq;
        this.d = acvx;
        this.e = fpt;
    }

    public final void h() {
        g();
    }

    public final void a(String str, String str2, byte[] bArr) {
        Builder builder = new Builder(this.a);
        builder.setTitle(str);
        TextView textView = (TextView) View.inflate(this.a, R.layout.vdp_purchase_failure_dialog_textview, null);
        textView.setText(str2);
        builder.setView(textView);
        builder.setPositiveButton(this.a.getString(R.string.ok), null);
        builder.create().show();
        this.d.a(bArr);
        this.d.a(bArr, null);
    }

    public final void a(String str, boolean z) {
        Intent a = this.e.a();
        qg qgVar = new qg(this.a);
        qgVar.a(this.a.getString(!z ? R.string.vdp_purchase_unsuccessful_title : R.string.vdp_purchase_successful_title));
        qgVar.b(this.a.getString(!z ? R.string.vdp_purchase_unsuccessful_description : R.string.vdp_purchase_successful_description));
        qgVar.a((int) R.drawable.ic_stat_yt_notification_logo);
        qgVar.b(true);
        qgVar.f = PendingIntent.getActivity(this.a, 0, a, 134217728);
        NotificationManager notificationManager = (NotificationManager) this.a.getSystemService("notification");
        if (str != null) {
            this.c.b(Uri.parse(str), new jol(this, qgVar, notificationManager));
        } else {
            a(qgVar, notificationManager);
        }
    }

    public final void a(qg qgVar, NotificationManager notificationManager) {
        qgVar.t = this.a.getResources().getColor(R.color.color_brand_primary);
        notificationManager.notify(1007, qgVar.e());
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{gzu.class};
        } else if (i == 0) {
            gzu gzu = (gzu) obj;
            joe joe = new joe();
            Bundle bundle = new Bundle();
            aobp.a(bundle, "vdpPurchaseDialogRenderer", gzu.a);
            joe.f(bundle);
            if (e() == null) {
                a(joe);
            }
            c();
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
