package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: aanw */
public final class aanw {
    private aofb a;
    private List b;
    private List c;

    public aanw(aofb aofb) {
        this.a = aofb;
    }

    public aanw(List list, List list2) {
        this.b = new ArrayList(list.size());
        this.b.addAll(list);
        this.c = new ArrayList(list2.size());
        this.c.addAll(list2);
    }

    public final List a() {
        List list = this.b;
        if (list == null) {
            aofb aofb = this.a;
            if (aofb != null) {
                this.b = new ArrayList(aofb.a.size());
                for (aofc aofc : this.a.a) {
                    if (aofc.a == 63434476) {
                        this.b.add(new aanx((aoex) aofc.b));
                    }
                }
                return this.b;
            }
        }
        if (list == null) {
            this.b = Collections.emptyList();
        }
        return this.b;
    }

    public final List b() {
        if (this.c == null) {
            aofb aofb = this.a;
            if (aofb == null || aofb.b.size() == 0) {
                this.c = Collections.emptyList();
            } else {
                this.c = new ArrayList();
                for (aofa aofa : this.a.b) {
                    if ((aofa.a & 1) != 0) {
                        List list = this.c;
                        Object obj = aofa.b;
                        if (obj == null) {
                            obj = aoep.e;
                        }
                        list.add(obj);
                    }
                }
            }
        }
        return this.c;
    }
}
