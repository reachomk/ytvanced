package defpackage;

import com.google.protos.youtube.api.innertube.SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint;
import java.util.Map;

/* renamed from: abqs */
public final class abqs implements aaap {
    private final abbj a;
    private final aboq b;

    public abqs(abbj abbj, aboq aboq) {
        this.a = (abbj) amqw.a((Object) abbj);
        this.b = (aboq) amqw.a((Object) aboq);
    }

    public final void a(apxu apxu, Map map) {
        Object obj;
        abqn abqn = (abqn) xsb.a(map, (Object) "com.google.android.libraries.youtube.innertube.endpoint.tag", abqn.class);
        anxr access$000 = anxl.checkIsLite(SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.sendLiveChatMessageEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint sendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint = (SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint) obj;
        abbj abbj = this.a;
        aaml abcf = new abcf(abbj.c, abbj.d.c());
        abcf.b = abqn.b();
        abcf.c = abqn.c();
        abcf.d = abqn.a();
        anvu anvu = sendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.b;
        if (anvu != null) {
            abcf.a = anvu;
        }
        if (sendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.c.size() != 0) {
            this.b.a((apxu[]) sendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.c.toArray(new apxu[0]), abqn.d(), true);
        }
        if ((apxu.a & 1) != 0) {
            abcf.a(apxu.b);
        } else {
            abcf.g();
        }
        abbj abbj2 = this.a;
        abbj2.b.a(abcf, abqn.e());
    }
}
