package defpackage;

import java.util.ArrayList;

/* renamed from: aidr */
final /* synthetic */ class aidr implements bcvk {
    private final aidp a;

    aidr(aidp aidp) {
        this.a = aidp;
    }

    public final void a(Object obj) {
        aidp aidp = this.a;
        Object[] objArr = (Object[]) obj;
        ajpu ajpu = (ajpu) objArr[0];
        afif afif = (afif) objArr[1];
        String Q = ajpu.Q();
        if (!aidp.a.s.containsKey(Q)) {
            aidp.a.s.put(Q, new ArrayList());
        }
        ((ArrayList) aidp.a.s.get(Q)).add(afif);
    }
}
