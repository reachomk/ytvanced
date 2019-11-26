package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.PhoneDialerEndpointOuterClass$PhoneDialerEndpoint;
import java.util.Map;

/* renamed from: fwc */
public final class fwc implements aaap {
    private final Context a;

    public fwc(Context context) {
        this.a = (Context) amqw.a((Object) context);
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(PhoneDialerEndpointOuterClass$PhoneDialerEndpoint.phoneDialerEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        String str = "android.intent.action.DIAL";
        Intent a = ajqy.a(this.a, new Intent(str, Uri.fromParts("tel", ((PhoneDialerEndpointOuterClass$PhoneDialerEndpoint) b).b, null)));
        if (wxk.a(this.a, a)) {
            this.a.startActivity(a.setFlags(268435456));
        } else {
            xpr.a(this.a, (int) R.string.error_no_phone_apps_installed, 1);
        }
    }
}
