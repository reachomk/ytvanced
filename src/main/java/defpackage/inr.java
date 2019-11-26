package defpackage;

/* renamed from: inr */
final /* synthetic */ class inr implements amqd {
    private final inq a;

    inr(inq inq) {
        this.a = inq;
    }

    public final Object a(Object obj) {
        Object obj2;
        inq inq = this.a;
        agqk agqk = (agqk) obj;
        agqi agqi = agqk.a;
        inj inj = new inj();
        inj.b = (String) amqw.a(agqi.a);
        inj.c = (String) amqw.a(agqi.b);
        avmo a = inq.a(agqi);
        if (a == null || (a.a & 1) == 0) {
            obj2 = apgw.BUNDLE_ITEM_STYLE_UNSPECIFIED;
        } else {
            obj2 = apgw.a(a.b);
            if (obj2 == null) {
                obj2 = apgw.BUNDLE_ITEM_STYLE_UNSPECIFIED;
            }
        }
        inj.d = (apgw) amqw.a(obj2);
        a = inq.a(agqi);
        aygk aygk = null;
        if (!(a == null || (a.a & 2) == 0)) {
            aygk = a.c;
            if (aygk == null) {
                aygk = aygk.f;
            }
        }
        inj.a = aygk;
        inj.e = agqi.e;
        inj.g = (bcqa) amqw.a(new bcqa(agqi.h.getTime()));
        int i = 0;
        for (String str : agqk.b) {
            if (inq.a.a(str) != null) {
                obj2 = inq.a.a(str).e();
                if (obj2 != null) {
                    inj.f.add((aygk) amqw.a(obj2));
                    i++;
                    if (i >= 4) {
                        break;
                    }
                }
            }
        }
        return new ink(inj.b, inj.c, inj.d, inj.a, inj.e, inj.f, (bcqa) amqw.a(inj.g));
    }
}
