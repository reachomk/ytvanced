package defpackage;

import java.util.Map.Entry;

/* renamed from: amty */
final class amty extends amub {
    private final /* synthetic */ amtt b;

    amty(amtt amtt) {
        this.b = amtt;
        super(amtt);
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Entry) {
            Entry entry = (Entry) obj;
            Object key = entry.getKey();
            obj = entry.getValue();
            int a = this.b.a(key);
            if (a != -1 && amqq.a(obj, this.b.b[a])) {
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
            int a2 = this.b.a(key, a);
            if (a2 != -1 && amqq.a(obj, this.b.b[a2])) {
                this.b.a(a2, a);
                return true;
            }
        }
        return false;
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Object a(int i) {
        return new amtw(this.b, i);
    }
}
