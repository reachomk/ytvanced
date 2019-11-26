package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.EditConversationEndpointOuterClass$EditConversationEndpoint;
import java.util.Map;

/* renamed from: xzt */
public final class xzt implements aaap {
    public final xoi a;
    public final aaas b;
    private final aarh c;
    private final Context d;
    private final afve e;

    public xzt(aarh aarh, xoi xoi, aaas aaas, Context context, afve afve) {
        this.c = (aarh) amqw.a((Object) aarh);
        this.a = (xoi) amqw.a((Object) xoi);
        this.b = (aaas) amqw.a((Object) aaas);
        this.d = (Context) amqw.a((Object) context);
        this.e = (afve) amqw.a((Object) afve);
    }

    public final void a(apxu apxu, Map map) {
        Object obj;
        Object c = xsb.c(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        xzv xzv = c instanceof xzv ? (xzv) c : null;
        anxr access$000 = anxl.checkIsLite(EditConversationEndpointOuterClass$EditConversationEndpoint.editConversationEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        EditConversationEndpointOuterClass$EditConversationEndpoint editConversationEndpointOuterClass$EditConversationEndpoint = (EditConversationEndpointOuterClass$EditConversationEndpoint) obj;
        aarh aarh = this.c;
        String str = editConversationEndpointOuterClass$EditConversationEndpoint.b;
        boolean z = editConversationEndpointOuterClass$EditConversationEndpoint.c;
        long j = editConversationEndpointOuterClass$EditConversationEndpoint.d;
        Boolean valueOf = Boolean.valueOf(this.e.a(this.d));
        afsw xzw = new xzw(this, xzv, apxu, c);
        aaml aatj = new aatj(aarh.c, aarh.d.c());
        aatj.a = aali.b(str);
        aatj.b = z;
        aatj.c = j;
        aatj.e = valueOf;
        aarh.a(asds.e, aarh.g, aarm.a, aarp.a).a(aatj, xzw);
    }
}
