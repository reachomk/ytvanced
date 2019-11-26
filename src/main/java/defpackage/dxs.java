package defpackage;

import android.content.Context;
import android.content.DialogInterface.OnDismissListener;
import com.google.protos.youtube.api.innertube.ConversationInviteConfirmationEndpointOuterClass$ConversationInviteConfirmationEndpoint;
import java.util.Map;

/* renamed from: dxs */
public final class dxs implements aaap {
    public final aaas a;
    private final yej b;

    public dxs(yej yej, aaas aaas) {
        this.b = yej;
        this.a = (aaas) amqw.a((Object) aaas);
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(ConversationInviteConfirmationEndpointOuterClass$ConversationInviteConfirmationEndpoint.conversationInviteConfirmationEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        aqlx aqlx = ((ConversationInviteConfirmationEndpointOuterClass$ConversationInviteConfirmationEndpoint) b).b;
        if (aqlx == null) {
            aqlx = aqlx.c;
        }
        b = aqlx.b;
        if (b == null) {
            b = aqlv.i;
        }
        yej yej = this.b;
        yei yei = new yei((Context) yej.a((Context) yej.a.get(), 1), (akkl) yej.a((akkl) yej.b.get(), 2), (aqlv) yej.a(b, 3));
        dxr dxr = new dxr(this, (OnDismissListener) xsb.a(map, (Object) "com.google.android.libraries.youtube.innertube.endpoint.tag", OnDismissListener.class), b);
        yei.setOnDismissListener(dxr);
        yei.setOnCancelListener(dxr);
        yei.show();
    }
}
