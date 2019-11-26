package defpackage;

import android.os.Handler;
import com.google.protos.youtube.api.innertube.SharedConversationEndpointOuterClass$SharedConversationEndpoint;
import java.util.HashMap;
import java.util.Map;

/* renamed from: xxf */
public final class xxf {
    public final afxb a;
    public final xxm b;
    private final xsc c;
    private final Handler d;
    private final Map e = new HashMap();
    private final Map f = new HashMap();

    public xxf(afxb afxb, xxm xxm, xsc xsc, Handler handler) {
        this.a = (afxb) amqw.a((Object) afxb);
        this.b = (xxm) amqw.a((Object) xxm);
        this.c = (xsc) amqw.a((Object) xsc);
        this.d = (Handler) amqw.a((Object) handler);
    }

    public final void a(apxu apxu) {
        Object obj;
        atun c = c(apxu);
        anxr access$000 = anxl.checkIsLite(SharedConversationEndpointOuterClass$SharedConversationEndpoint.sharedConversationEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        String str = ((SharedConversationEndpointOuterClass$SharedConversationEndpoint) obj).c;
        if (!this.f.containsKey(str)) {
            this.f.put(str, str);
        }
        str = (String) this.f.get(str);
        anxr access$0002 = anxl.checkIsLite(SharedConversationEndpointOuterClass$SharedConversationEndpoint.sharedConversationEndpoint);
        apxu.a(access$0002);
        Object b2 = apxu.h.b(access$0002.d);
        if (b2 == null) {
            b = access$0002.b;
        } else {
            b = access$0002.a(b2);
        }
        long j = ((SharedConversationEndpointOuterClass$SharedConversationEndpoint) b).e;
        long c2 = this.c.c();
        this.d.removeCallbacksAndMessages(str);
        this.d.postAtTime(new xxk(this, str, apxu), str, c2 + j);
        if (c != null && !this.e.containsKey(str)) {
            xxj xxj = new xxj(this, apxu);
            this.d.post(new xxi(this, c, xxj));
            this.e.put(str, xxj);
        }
    }

    public final void b(apxu apxu) {
        atun c = c(apxu);
        if (c != null) {
            anxr access$000 = anxl.checkIsLite(SharedConversationEndpointOuterClass$SharedConversationEndpoint.sharedConversationEndpoint);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            String str = ((SharedConversationEndpointOuterClass$SharedConversationEndpoint) b).c;
            this.d.removeCallbacksAndMessages(str);
            xxj xxj = (xxj) this.e.remove(str);
            if (xxj != null) {
                this.d.post(new xxh(this, c, xxj));
            }
        }
    }

    private final atun c(apxu apxu) {
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(SharedConversationEndpointOuterClass$SharedConversationEndpoint.sharedConversationEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                Object obj;
                Map map = this.e;
                anxr access$0002 = anxl.checkIsLite(SharedConversationEndpointOuterClass$SharedConversationEndpoint.sharedConversationEndpoint);
                apxu.a(access$0002);
                Object b = apxu.h.b(access$0002.d);
                if (b == null) {
                    obj = access$0002.b;
                } else {
                    obj = access$0002.a(b);
                }
                xxj xxj = (xxj) map.get(((SharedConversationEndpointOuterClass$SharedConversationEndpoint) obj).c);
                if (xxj == null) {
                    return zdc.b(apxu);
                }
                return xxj.a;
            }
        }
        return null;
    }
}
