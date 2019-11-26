package defpackage;

import java.util.HashMap;

/* renamed from: aibl */
public final class aibl implements xcp {
    private final /* synthetic */ aibd a;

    public aibl(aibd aibd) {
        this.a = aibd;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aiht.class};
        } else if (i == 0) {
            aiht aiht = (aiht) obj;
            aibd aibd = this.a;
            if (aibd.r == null) {
                aibd.r = new HashMap();
            }
            this.a.r.put(aiht.a, aiht.b);
            aibd = this.a;
            aibd.d.a(aibd.r);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
