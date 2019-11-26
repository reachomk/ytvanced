package defpackage;

import com.google.protos.youtube.api.innertube.RemoveConversationActionOuterClass$RemoveConversationAction;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: yaw */
public final class yaw implements aaap {
    private final akmx a;
    private final xci b;

    public yaw(akmx akmx, xci xci) {
        this.a = (akmx) amqw.a((Object) akmx);
        this.b = (xci) amqw.a((Object) xci);
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(RemoveConversationActionOuterClass$RemoveConversationAction.removeConversationAction);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        String str = ((RemoveConversationActionOuterClass$RemoveConversationAction) b).b;
        ycw ycw = (ycw) this.a.a(ycq.a());
        if (ycw != null) {
            List list = ycw.b;
            if (list != null) {
                Iterator it = list.iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (((aqoz) it.next()).b.equals(str)) {
                        it.remove();
                        int i2 = ycw.i;
                        if (i < i2) {
                            ycw.i = Math.max(0, i2 - 1);
                        }
                    } else {
                        i++;
                    }
                }
            }
            this.a.b(ycq.a(), ycw);
            this.a.b(ycq.a(str));
        }
        xzv xzv = (xzv) xsb.a(map, (Object) "com.google.android.libraries.youtube.innertube.endpoint.tag", xzv.class);
        xci xci = this.b;
        if (xzv != null) {
            xzv.e();
        }
        xci.d(new ybh(str));
    }
}
