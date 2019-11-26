package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: aata */
public final class aata {
    public final ajte a;
    public List b;
    private final aqhy c;
    private aatd d;

    public aata(ajte ajte, aqhy aqhy) {
        this.a = (ajte) amqw.a((Object) ajte);
        this.c = aqhy;
    }

    public final List a() {
        if (this.b == null) {
            this.b = new ArrayList();
            aqjq[] aqjqArr = this.a.c;
            if (aqjqArr != null) {
                for (aqjq aqjq : aqjqArr) {
                    int i = aqjq.a;
                    List list;
                    Object obj;
                    if ((i & 1) != 0) {
                        list = this.b;
                        obj = aqjq.b;
                        if (obj == null) {
                            obj = aqjo.f;
                        }
                        list.add(obj);
                    } else if ((i & 2) != 0) {
                        list = this.b;
                        obj = aqjq.c;
                        if (obj == null) {
                            obj = aqjy.d;
                        }
                        list.add(obj);
                    }
                }
            }
        }
        return this.b;
    }

    public final aatd b() {
        if (this.d == null) {
            ajtg ajtg = this.a.b;
            if (ajtg != null) {
                ajtd ajtd = ajtg.a;
                if (ajtd != null) {
                    this.d = new aatd(ajtd, this.c);
                }
            }
        }
        return this.d;
    }

    public final CharSequence c() {
        return ajqy.a(this.a.e);
    }

    public final CharSequence d() {
        return ajqy.a(this.a.f);
    }

    public final aqhy e() {
        aykw aykw = this.a.j;
        if (aykw == null) {
            return null;
        }
        aqhy aqhy = aykw.b;
        if (aqhy == null) {
            aqhy = aqhy.q;
        }
        return aqhy;
    }
}
