package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: aaub */
public final class aaub {
    public final ayle a;
    private List b;

    public aaub(ayle ayle) {
        this.a = (ayle) amqw.a((Object) ayle);
    }

    public final List a() {
        if (this.b == null) {
            this.b = new ArrayList();
            for (ayli ayli : this.a.c) {
                if ((ayli.a & 1) != 0) {
                    List list = this.b;
                    Object obj = ayli.b;
                    if (obj == null) {
                        obj = aylg.d;
                    }
                    list.add(obj);
                }
            }
        }
        return this.b;
    }

    public final aqjo b() {
        ayle ayle = this.a;
        if ((ayle.a & 8) == 0) {
            return null;
        }
        aqjq aqjq = ayle.f;
        if (aqjq == null) {
            aqjq = aqjq.d;
        }
        aqjo aqjo = aqjq.b;
        if (aqjo == null) {
            aqjo = aqjo.f;
        }
        return aqjo;
    }
}
