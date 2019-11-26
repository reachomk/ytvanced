package defpackage;

import com.google.protos.youtube.api.innertube.InlineAuthCommandOuterClass$InlineAuthCommand;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: uwf */
final class uwf extends alda {
    private final List a;
    private final uum b;
    private final aaas c;

    public uwf(alcs alcs, aldg aldg, axha axha, List list, uum uum, aaas aaas) {
        super(alcs, axha, aldg, null);
        this.a = list;
        this.b = uum;
        this.c = aaas;
    }

    public final boolean a(Object obj, Object obj2) {
        if (obj != null && obj.equals(obj2)) {
            return false;
        }
        String obj3 = obj2.toString();
        int i = 0;
        while (i < this.a.size()) {
            if (((axgu) this.a.get(i)).d.equals(obj3)) {
                break;
            }
            i++;
        }
        i = -1;
        axgu axgu = (axgu) this.a.get(i);
        if ("FINGERPRINT".equalsIgnoreCase(axgu.b)) {
            anxp anxp = axgu.f;
            if (anxp == null) {
                anxp = apxu.d;
            }
            anxr access$000 = anxl.checkIsLite(InlineAuthCommandOuterClass$InlineAuthCommand.inlineAuthCommand);
            anxp.a(access$000);
            if (anxp.h.a(access$000.d)) {
                Map hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.b);
                aaas aaas = this.c;
                apxu apxu = axgu.f;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, hashMap);
                return false;
            }
        }
        return super.a(obj, obj2);
    }
}
