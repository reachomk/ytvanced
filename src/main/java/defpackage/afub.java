package defpackage;

import com.google.protos.youtube.api.innertube.ModifyActivityCountActionOuterClass$ModifyActivityCountAction;
import java.util.Map;

/* renamed from: afub */
public final class afub implements aaap {
    private final bcaa a;

    public afub(bcaa bcaa) {
        this.a = (bcaa) amqw.a((Object) bcaa);
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(ModifyActivityCountActionOuterClass$ModifyActivityCountAction.modifyActivityCountAction);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        ModifyActivityCountActionOuterClass$ModifyActivityCountAction modifyActivityCountActionOuterClass$ModifyActivityCountAction = (ModifyActivityCountActionOuterClass$ModifyActivityCountAction) b;
        for (avcn avcn : modifyActivityCountActionOuterClass$ModifyActivityCountAction.b) {
            boolean z = true;
            if ((avcn.a & 1) != 0) {
                String str;
                avch avch = avcn.b;
                if (avch == null) {
                    avch = avch.c;
                }
                int a = avck.a(avch.b);
                if (a == 0) {
                    a = 1;
                }
                a--;
                if (a == 1) {
                    str = "FEnotifications_inbox";
                } else if (a == 2) {
                    str = "FEshared";
                }
                afwx afwx = (afwx) this.a.get();
                int b2 = avcn.d + (!avcn.c ? afwx.b(str) : 0);
                afwy b3 = afwv.e().a(str).a((int) modifyActivityCountActionOuterClass$ModifyActivityCountAction.c).b(Math.max(b2, 0));
                if (b2 <= 0) {
                    z = false;
                }
                afwx.a(b3.a(z).a());
            }
        }
    }
}
