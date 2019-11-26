package defpackage;

import java.util.Collections;
import java.util.Map;

/* renamed from: eei */
public final class eei implements acxz {
    public final /* synthetic */ Map a(Object obj) {
        edj edj = (edj) obj;
        if (edj.a.getComponent() != null) {
            obj = edj.a.getComponent().getClassName();
        } else {
            obj = edj.a.getAction();
        }
        return Collections.singletonMap("yt_intent", obj);
    }
}
