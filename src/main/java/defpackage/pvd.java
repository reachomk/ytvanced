package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* renamed from: pvd */
final class pvd extends pvi {
    public final /* synthetic */ puy a;
    private final Map b;

    public pvd(puy puy, Map map) {
        this.a = puy;
        super(puy);
        this.b = map;
    }

    public final void a() {
        qao qao = new qao(this.a.d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (psw psw : this.b.keySet()) {
            psw.l();
            if (((pva) this.b.get(psw)).a) {
                arrayList2.add(psw);
            } else {
                arrayList.add(psw);
            }
        }
        int i = 0;
        int i2 = -1;
        Object obj;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i < size) {
                obj = arrayList.get(i);
                i++;
                i2 = qao.a(this.a.c, (psw) obj);
                if (i2 != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i < size2) {
                obj = arrayList2.get(i);
                i++;
                i2 = qao.a(this.a.c, (psw) obj);
                if (i2 == 0) {
                    break;
                }
            }
        }
        puy puy;
        if (i2 != 0) {
            psa psa = new psa(i2, null);
            puy = this.a;
            puy.a.a(new pvc(this, puy, psa));
            return;
        }
        puy = this.a;
        if (puy.f) {
            puy.e.h();
        }
        for (psw psw2 : this.b.keySet()) {
            pye pye = (pye) this.b.get(psw2);
            psw2.l();
            if (qao.a(this.a.c, psw2) != 0) {
                puy puy2 = this.a;
                puy2.a.a(new pvf(puy2, pye));
            } else {
                psw2.a(pye);
            }
        }
    }
}
