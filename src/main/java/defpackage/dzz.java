package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.TextMessageEndpointOuterClass$TextMessageEndpoint;
import java.util.Map;

/* renamed from: dzz */
public final class dzz implements aaap {
    private final Context a;

    public dzz(Context context) {
        this.a = (Context) amqw.a((Object) context);
    }

    public final void a(apxu apxu, Map map) {
        Object obj;
        anxr access$000 = anxl.checkIsLite(TextMessageEndpointOuterClass$TextMessageEndpoint.textMessageEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        if (((TextMessageEndpointOuterClass$TextMessageEndpoint) obj).b.isEmpty()) {
            xtl.c("Cannot send SMS without body.");
            return;
        }
        access$000 = anxl.checkIsLite(TextMessageEndpointOuterClass$TextMessageEndpoint.textMessageEndpoint);
        apxu.a(access$000);
        Object b2 = apxu.h.b(access$000.d);
        if (b2 == null) {
            b2 = access$000.b;
        } else {
            b2 = access$000.a(b2);
        }
        TextMessageEndpointOuterClass$TextMessageEndpoint textMessageEndpointOuterClass$TextMessageEndpoint = (TextMessageEndpointOuterClass$TextMessageEndpoint) b2;
        String str = "smsto:";
        String valueOf = String.valueOf(TextUtils.join(";", textMessageEndpointOuterClass$TextMessageEndpoint.c));
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            valueOf = str.concat(valueOf);
        }
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse(valueOf));
        intent.putExtra("sms_body", textMessageEndpointOuterClass$TextMessageEndpoint.b);
        this.a.startActivity(intent);
    }
}
