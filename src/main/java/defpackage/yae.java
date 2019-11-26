package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.EditConversationPostEndpointOuterClass$EditConversationPostEndpoint;
import java.util.Map;

/* renamed from: yae */
public final class yae implements aaap {
    public final xoi a;
    public final akmx b;
    public final aaas c;
    private final aarh d;

    public yae(aarh aarh, xoi xoi, akmx akmx, aaas aaas) {
        this.d = (aarh) amqw.a((Object) aarh);
        this.a = (xoi) amqw.a((Object) xoi);
        this.b = (akmx) amqw.a((Object) akmx);
        this.c = aaas;
    }

    public final void a(apxu apxu, Map map) {
        Object obj;
        String str = (String) xsb.a(map, (Object) "conversation_id", String.class);
        String str2 = (String) xsb.a(map, (Object) "item_id", String.class);
        Uri a = (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) ? null : ycq.a(str, str2);
        ycm a2 = a(a);
        if (a2 != null) {
            boolean booleanValue = ((Boolean) xsb.c(map, "set_hearted", Boolean.valueOf(true))).booleanValue();
            ycl a3 = a2.a();
            a3.a = booleanValue;
            a2 = a3.a();
            this.b.b(a, a2);
            if (a2.e) {
                return;
            }
        }
        anxr access$000 = anxl.checkIsLite(EditConversationPostEndpointOuterClass$EditConversationPostEndpoint.editConversationPostEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        str2 = ((EditConversationPostEndpointOuterClass$EditConversationPostEndpoint) obj).b;
        yad yad = new yad(this, apxu, map, str, a);
        yad.a(true);
        yad.a.d.a(str2, yad);
    }

    public final ycm a(Uri uri) {
        return uri != null ? (ycm) this.b.a(uri) : null;
    }
}
