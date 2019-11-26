package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.UUID;

/* renamed from: enl */
public final class enl implements aiku {
    public final xby a = new xby();
    public final HashMap b = new HashMap();
    private final Random c = new Random();
    private final List d = new ArrayList();
    private HashSet e;

    public enl() {
        this.d.add(new eno(this));
        this.d.add(new enn(this));
    }

    /* renamed from: a */
    public final synchronized enm b(aiqq aiqq) {
        amqw.a((Object) aiqq);
        apxu apxu = aiqq.b;
        if (apxu != null) {
            return new enh(b(apxu), aiqq);
        }
        return new enh(a(), aiqq);
    }

    public final enm a(apxu apxu) {
        amqw.a((Object) apxu);
        return new enh(b(apxu), apxu);
    }

    public final synchronized void a(apxu apxu, UUID uuid) {
        for (enq a : this.d) {
            a.a(apxu, uuid);
        }
    }

    public final synchronized void a(Collection collection) {
        if (this.e == null) {
            this.e = new HashSet(this.b.size());
        }
        this.e.addAll(this.b.keySet());
        this.e.removeAll(collection);
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            this.b.remove((String) it.next());
        }
        this.e.clear();
    }

    private final synchronized UUID b(apxu apxu) {
        UUID uuid = null;
        for (enq a : this.d) {
            uuid = a.a(apxu);
            if (uuid != null) {
                break;
            }
        }
        if (uuid != null) {
            return uuid;
        }
        UUID a2 = a();
        a(apxu, a2);
        return a2;
    }

    private final UUID a() {
        return new UUID(this.c.nextLong(), this.c.nextLong());
    }
}
