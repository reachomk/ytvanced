package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareToConversationEndpoint;

/* renamed from: yhv */
public final class yhv implements algc {
    private final /* synthetic */ yuh a;

    public yhv(yuh yuh) {
        this.a = yuh;
    }

    public final void a() {
    }

    public final boolean a(aseo aseo) {
        return false;
    }

    public final void b(apxu apxu) {
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(SendShareEndpoint$SendShareToConversationEndpoint.sendShareToConversationEndpoint);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            SendShareEndpoint$SendShareToConversationEndpoint sendShareEndpoint$SendShareToConversationEndpoint = (SendShareEndpoint$SendShareToConversationEndpoint) b;
            if (sendShareEndpoint$SendShareToConversationEndpoint != null) {
                asdi asdi;
                if ((sendShareEndpoint$SendShareToConversationEndpoint.a & 1) != 0) {
                    asfa asfa = sendShareEndpoint$SendShareToConversationEndpoint.b;
                    if (asfa == null) {
                        asfa = asfa.f;
                    }
                    asdi = asfa.e;
                    if (asdi == null) {
                        asdi = asdi.d;
                    }
                } else {
                    asdi = null;
                }
                if (asdi != null) {
                    String str = asdi.c;
                    if (!TextUtils.isEmpty(str)) {
                        yuh yuh = this.a;
                        yuh.a.b(str).a(yld.class).a(new yuv(yuh)).c();
                    }
                }
            }
        }
    }
}
