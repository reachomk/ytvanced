package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SendSmsEndpointOuterClass$SendSmsEndpoint;
import java.util.Map;

/* renamed from: fwx */
public final class fwx implements aaap {
    private final Context a;

    public fwx(Context context) {
        this.a = (Context) amqw.a((Object) context);
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(SendSmsEndpointOuterClass$SendSmsEndpoint.sendSmsEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        SendSmsEndpointOuterClass$SendSmsEndpoint sendSmsEndpointOuterClass$SendSmsEndpoint = (SendSmsEndpointOuterClass$SendSmsEndpoint) b;
        String str = "android.intent.action.SENDTO";
        Intent a = ajqy.a(this.a, new Intent(str, Uri.fromParts("sms", TextUtils.join(", ", sendSmsEndpointOuterClass$SendSmsEndpoint.b), null)));
        a.putExtra("android.intent.extra.SUBJECT", sendSmsEndpointOuterClass$SendSmsEndpoint.d);
        a.putExtra("android.intent.extra.TEXT", sendSmsEndpointOuterClass$SendSmsEndpoint.c);
        a.putExtra("sms_body", sendSmsEndpointOuterClass$SendSmsEndpoint.c);
        if (wxk.a(this.a, a)) {
            this.a.startActivity(a.setFlags(268435456));
        } else {
            xpr.a(this.a, (int) R.string.error_no_messaging_apps_installed, 1);
        }
    }
}
