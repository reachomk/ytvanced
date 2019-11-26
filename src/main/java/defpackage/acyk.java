package defpackage;

import java.util.Map;
import java.util.Map.Entry;

/* renamed from: acyk */
final class acyk implements xcn {
    private final acxz a;
    private final /* synthetic */ acyi b;

    public acyk(acyi acyi, acxz acxz) {
        this.b = acyi;
        this.a = (acxz) amqw.a((Object) acxz);
    }

    public final void a(Object obj) {
        Map a = this.a.a(obj);
        if (a != null && !a.isEmpty()) {
            if (!this.b.d.isEmpty()) {
                for (acxv acxv : this.b.d) {
                    for (Entry entry : a.entrySet()) {
                        acxv.a((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            if (!this.b.e.isEmpty()) {
                for (acxv acxv2 : this.b.e) {
                    for (Entry entry2 : a.entrySet()) {
                        acxv2.a((String) entry2.getKey(), (String) entry2.getValue());
                    }
                }
            }
        }
    }
}
