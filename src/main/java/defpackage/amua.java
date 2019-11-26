package defpackage;

import java.util.Map.Entry;

/* renamed from: amua */
final class amua extends amub {
    amua(amtt amtt) {
        super(amtt);
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Entry) {
            Entry entry = (Entry) obj;
            Object key = entry.getKey();
            obj = entry.getValue();
            int b = this.a.b(key);
            if (b != -1 && amqq.a(this.a.a[b], obj)) {
                return true;
            }
        }
        return false;
    }

    public final boolean remove(Object obj) {
        if (obj instanceof Entry) {
            Entry entry = (Entry) obj;
            Object key = entry.getKey();
            obj = entry.getValue();
            int a = amud.a(key);
            int b = this.a.b(key, a);
            if (b != -1 && amqq.a(this.a.a[b], obj)) {
                this.a.b(b, a);
                return true;
            }
        }
        return false;
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Object a(int i) {
        return new amtv(this.a, i);
    }
}
