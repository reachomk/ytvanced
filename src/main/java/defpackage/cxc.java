package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: cxc */
public final class cxc extends cwh {
    @cue(a = 10)
    public cma k;

    private cxc() {
        super("SingleComponentSection");
    }

    public final boolean b() {
        return true;
    }

    public final boolean b(cwh cwh) {
        if (this == cwh) {
            return true;
        }
        if (cwh == null || getClass() != cwh.getClass()) {
            return false;
        }
        cxc cxc = (cxc) cwh;
        cma cma = this.k;
        cma cma2 = cxc.k;
        return cma == null ? cma2 == null : cma.a(cma2);
    }

    public static cxb b(cwj cwj) {
        cxb cxb = new cxb();
        cxb.a(cwj, new cxc());
        return cxb;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(cwj cwj, cvx cvx, cwh cwh, cwh cwh2) {
        cwj cwj2 = cwj;
        cvx cvx2 = cvx;
        cxc cxc = (cxc) cwh;
        cxc cxc2 = (cxc) cwh2;
        coa coa = new coa(cxc != null ? cxc.k : null, cxc2 != null ? cxc2.k : null);
        coa coa2 = new coa(null, null);
        coa coa3 = new coa(null, null);
        coa coa4 = new coa(null, null);
        coa coa5 = new coa(null, null);
        coa coa6 = new coa(null, null);
        Object obj = coa6.a;
        Object obj2 = coa6.b;
        if (coa.b != null) {
            Object obj3 = coa2.b;
            boolean booleanValue = obj3 != null ? ((Boolean) obj3).booleanValue() : false;
            Object obj4 = coa3.b;
            int intValue = obj4 != null ? ((Integer) obj4).intValue() : 1;
            Object obj5 = coa4.b;
            boolean booleanValue2 = obj5 != null ? ((Boolean) obj5).booleanValue() : false;
            cyj a;
            if (coa.a != null) {
                Object obj6;
                Object obj7 = coa2.a;
                boolean booleanValue3 = obj7 != null ? ((Boolean) obj7).booleanValue() : false;
                Object obj8 = coa3.a;
                int intValue2 = obj8 != null ? ((Integer) obj8).intValue() : 1;
                Object obj9 = coa4.a;
                boolean booleanValue4 = obj9 != null ? ((Boolean) obj9).booleanValue() : false;
                Map map = (Map) coa5.a;
                Map map2 = (Map) coa5.b;
                if (map != map2) {
                    if (map != null && map2 != null && map.size() == map2.size()) {
                        for (Entry entry : map.entrySet()) {
                            if (!clx.a(entry.getValue(), map2.get(entry.getKey()))) {
                                obj6 = null;
                                break;
                            }
                        }
                    }
                    obj6 = null;
                    if (!(booleanValue3 == booleanValue && intValue2 == intValue && booleanValue4 == booleanValue2 && ((cma) coa.a).a((cma) coa.b) && obj6 != null)) {
                        a = cxe.a(cyk.l(), (Map) coa5.b, cwj2);
                        a.c = (cma) coa.b;
                        cvx2.a(cvy.a(2, new dcw(((cyj) ((cyj) ((cyj) a.a(booleanValue)).a(intValue)).b(booleanValue2)).b(), cwj.e()), obj, obj2));
                    }
                    return;
                }
                obj6 = 1;
                a = cxe.a(cyk.l(), (Map) coa5.b, cwj2);
                a.c = (cma) coa.b;
                cvx2.a(cvy.a(2, new dcw(((cyj) ((cyj) ((cyj) a.a(booleanValue)).a(intValue)).b(booleanValue2)).b(), cwj.e()), obj, obj2));
                return;
            }
            a = cxe.a(cyk.l(), (Map) coa5.b, cwj2);
            a.c = (cma) coa.b;
            cyk b = ((cyj) ((cyj) ((cyj) a.a(booleanValue)).a(intValue)).b(booleanValue2)).b();
            csq e = cwj.e();
            cwh cwh3 = cvx2.b;
            if (cwh3 != null) {
                String str = cwh3.i;
                if (b.a == null) {
                    b.a = Collections.synchronizedMap(new HashMap());
                }
                b.a.put("section_global_key", str);
            }
            cvx2.a(cvy.a(1, new dcw(b, e), null, obj2));
            return;
        }
        cvx2.a(cvy.a(obj));
    }
}
