package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: amqz */
public final class amqz {
    public final ampp a;
    public final boolean b;
    public final amrk c;
    public final int d;

    public amqz(amrk amrk) {
        this(amrk, false, ampt.a, Integer.MAX_VALUE);
    }

    public amqz(amrk amrk, boolean z, ampp ampp, int i) {
        this.c = amrk;
        this.b = z;
        this.a = ampp;
        this.d = i;
    }

    public static amqz a(char c) {
        Object ampr = new ampr(c);
        amqw.a(ampr);
        return new amqz(new amrc(ampr));
    }

    public static amqz a(String str) {
        amqw.a(str.length() != 0, (Object) "The separator may not be the empty string.");
        if (str.length() == 1) {
            return amqz.a(str.charAt(0));
        }
        return new amqz(new amre(str));
    }

    public final amqz a() {
        return new amqz(this.c, true, this.a, this.d);
    }

    public final amqz b() {
        Object obj = ampw.a;
        amqw.a(obj);
        return new amqz(this.c, this.b, obj, this.d);
    }

    public final Iterable a(CharSequence charSequence) {
        amqw.a((Object) charSequence);
        return new amri(this, charSequence);
    }

    public final Iterator b(CharSequence charSequence) {
        return this.c.a(this, charSequence);
    }

    public final List c(CharSequence charSequence) {
        amqw.a((Object) charSequence);
        Iterator b = b(charSequence);
        ArrayList arrayList = new ArrayList();
        while (b.hasNext()) {
            arrayList.add((String) b.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
