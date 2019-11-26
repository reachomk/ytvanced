package defpackage;

import android.view.View;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: acvj */
public class acvj implements acvx, acwu {
    public final xuu a;
    public final xci b;
    public final acwe c;
    public final acwh d;
    public final acxa e;
    public final acwr f;
    private final List h;
    private final Map i;
    private acwp j;

    public acvj(xuu xuu, xci xci, acwe acwe, acwh acwh, acxa acxa) {
        this(xuu, xci, acwe, acwh, acxa, acxe.m);
    }

    public acvj(xuu xuu, xci xci, acwe acwe, acwh acwh, acxa acxa, acxe acxe) {
        this.c = (acwe) amqw.a((Object) acwe);
        this.a = (xuu) amqw.a((Object) xuu);
        this.b = (xci) amqw.a((Object) xci);
        this.f = new acwr(acwe, this, acxe);
        this.d = acwh;
        this.e = (acxa) amqw.a((Object) acxa);
        this.h = new ArrayList();
        this.i = new HashMap();
    }

    public void a(acwl acwl, apxu apxu, atst atst) {
        if (apxu != null && this.c.b.d) {
            apxu = this.e.a(apxu);
        }
        a(new acwp(this.a, apxu, acwl));
        this.c.a(c(), atst);
        this.b.d(new acwm(this));
    }

    public void a(acwl acwl, acww acww, apxu apxu) {
        if (apxu != null && this.c.b.d) {
            apxu = this.e.a(apxu);
        }
        acwp acwp = new acwp(this.a, apxu, acwl);
        a(acwp);
        this.c.a(c(), null);
        this.d.a(acww, acwp);
        this.b.d(new acwm(this));
    }

    public void a(acwl acwl, azfa azfa, String str) {
        avjh avjh = (avjh) avjf.h.createBuilder();
        avjh.a(azfa.c);
        avjh.b(azfa.e);
        avjh.a(str);
        apxx apxx = (apxx) apxu.d.createBuilder();
        apxx.a(avjd.b, (avjf) ((anxl) avjh.build()));
        a(acwl, null, (apxu) ((anxl) apxx.build()));
    }

    public final void a() {
        this.c.a(c(), 17);
        this.d.a(c());
    }

    public final void a(acxf acxf) {
        this.c.a(c(), acxf.a, null);
    }

    public final void a(acxf acxf, acxf acxf2) {
        this.c.a(c(), acxf.a, acxf2.a, null);
    }

    public final void a(byte[] bArr) {
        acwe acwe = this.c;
        acwp c = c();
        if (acwe.a(c, new acwc[0]) && acwe.a(bArr)) {
            azfd azfd = (azfd) azfa.h.createBuilder();
            if (bArr != null) {
                azfd.a(anvu.a(bArr));
            }
            acwe.a(c, (azfa) ((anxl) azfd.build()), acwe.a(c.e.aH), null);
        }
    }

    public final void a(acwc acwc, atst atst) {
        acwe acwe = this.c;
        acwp c = c();
        if (acwe.a(c, acwc)) {
            acwl acwl = c.e;
            acwe.a(c, acwe.a(acwc.dU), acwe.a(c.e.aH), atst);
        }
    }

    public final void a(azfa azfa, azfa azfa2) {
        this.c.a(c(), azfa, azfa2, null);
    }

    public final void a(azfa azfa, atst atst) {
        this.c.a(c(), azfa, atst);
    }

    public final void a(List list) {
        acwe acwe = this.c;
        acwp c = c();
        if (acwe.c(c)) {
            azfa a = acwe.a(c.e.aH);
            List arrayList = new ArrayList();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (acwe.a(c, (azfa) list.get(i))) {
                    azfa b = acwe.b((azfa) list.get(i));
                    if (!acwe.a(b) || !c.a(b)) {
                        c.a(b, a);
                        arrayList.add(b);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                acwe.a(c, a, arrayList, null);
                String str = c.a;
            }
        }
    }

    public final void b(acxf acxf) {
        a(acxf);
        a(acxf, null);
    }

    public final void b(acxf acxf, acxf acxf2) {
        a(acxf, acxf2);
        a(acxf, null);
    }

    public final void b(acwc acwc, atst atst) {
        a(acwc, atst);
        if (acwc != null) {
            a(new acvs(acwc), atst);
        }
    }

    public final void a(azfa azfa) {
        a(azfa, null);
        b(azfa, null);
    }

    public final void a(byte[] bArr, atst atst) {
        acwr acwr = this.f;
        if (bArr != null) {
            acwr.a(new acwt(bArr, atst));
        }
    }

    public final void b(azfa azfa, atst atst) {
        this.f.a(azfa, atst);
    }

    public final void a(acxf acxf, atst atst) {
        this.f.a(acxf.a, atst);
    }

    public final void b(azfa azfa) {
        this.f.a(new acvw(5, azfa, null));
    }

    public final void a(aoca aoca, byte[] bArr) {
        if (aoca != null) {
            auko a = acwy.a(aoca);
            if (a == null) {
                a(bArr, null);
                return;
            }
            this.f.a(a);
        }
    }

    public final void a(anze anze, anvu anvu) {
        if (anze != null) {
            auko a = acwy.a(anze);
            if (a == null) {
                a(anvu.d(), null);
                return;
            }
            this.f.a(a);
        }
    }

    public final void c(acxf acxf) {
        this.f.a(acxf.a);
    }

    public final void c(azfa azfa) {
        this.f.a(azfa);
    }

    public final void a(aoca aoca) {
        if (aoca != null) {
            auko a = acwy.a(aoca);
            if (a != null) {
                this.f.b(a);
            }
        }
    }

    public final void a(anze anze) {
        if (anze != null) {
            auko a = acwy.a(anze);
            if (a != null) {
                this.f.b(a);
            }
        }
    }

    public final void a(acww acww) {
        if (this.c.b.c) {
            acwp a = this.d.a(acww);
            if (a != null) {
                this.c.b(a);
                this.d.a(a);
            }
            acwp a2 = this.d.a(acww);
            if (a2 != null) {
                this.c.a(a2);
            }
        }
    }

    public final void a(acww acww, acwp acwp) {
        if (this.c.b.c) {
            acwp a = this.d.a(acww);
            Object obj = null;
            if (a != null) {
                if (a.equals(acwp)) {
                    this.d.a(a);
                    a = this.d.a(acww);
                    obj = 1;
                }
                this.c.b(a);
            }
            if (acwp != null) {
                this.d.a(acww, acwp);
                if (obj == null) {
                    this.c.a(acwp);
                }
            }
        }
    }

    public final void a(aoca aoca, byte[] bArr, View view) {
        Object tag = view.getTag(R.id.logging_directable_supplier_tag);
        if (tag instanceof acwq) {
            ((acwq) tag).a(aoca, bArr);
        } else {
            view.setTag(R.id.logging_directable_supplier_tag, new acwq(aoca, bArr));
        }
    }

    public final void a(anze anze, anvu anvu, View view) {
        Object tag = view.getTag(R.id.logging_directable_supplier_tag);
        if (tag instanceof acwn) {
            ((acwn) tag).a(anze, anvu);
        } else {
            view.setTag(R.id.logging_directable_supplier_tag, new acwn(anze, anvu));
        }
    }

    public final void c(azfa azfa, atst atst) {
        this.c.a(c(), 3, azfa, atst);
    }

    public final void b(acxf acxf, atst atst) {
        acwe acwe = this.c;
        acwp c = c();
        if (acwe.a(c, acxf.a)) {
            azfa b = acwe.b(acxf.a);
            atsa atsa = (atsa) atsb.e.createBuilder();
            atsa.a(c.a);
            atsa.a(b);
            atsa.a(atst);
            asmz asmz = (asmz) asmw.f.createBuilder();
            asmz.a((atsb) ((anxl) atsa.build()));
            acwe.a.a((asmw) ((anxl) asmz.build()));
        }
    }

    public final void a(String str) {
        acwe acwe = this.c;
        acwp c = c();
        if (acwe.c(c)) {
            acwe.a(c, acwe.a(c.e.aH), str);
        }
    }

    public final void a(acxf acxf, String str) {
        this.c.a(c(), acxf.a, str);
    }

    public final apxu a(apxu apxu) {
        if (apxu == null) {
            return null;
        }
        if (c() == null) {
            xtl.d("Failed to set parent screen");
            return apxu;
        }
        avjh avjh;
        anxr access$000 = anxl.checkIsLite(avjd.b);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            Object obj;
            access$000 = anxl.checkIsLite(avjd.b);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                obj = access$000.b;
            } else {
                obj = access$000.a(b);
            }
            avjh = (avjh) ((anxo) ((avjf) obj).toBuilder());
        } else {
            avjh = (avjh) avjf.h.createBuilder();
        }
        if (avjh.a().isEmpty()) {
            avjh.a(d());
        }
        apxx apxx = (apxx) ((anxo) apxu.toBuilder());
        apxx.a(avjd.b, (avjf) ((anxl) avjh.build()));
        apxu = (apxu) ((anxl) apxx.build());
        acxa acxa = this.e;
        String a = avjh.a();
        String b2 = acxa.b(apxu);
        if (b2 != null) {
            acxa.a.put(b2, a);
        }
        return apxu;
    }

    public void b() {
        this.j = null;
        this.f.b();
        this.i.clear();
        for (acvx b : this.h) {
            b.b();
        }
    }

    public final azfa a(Object obj, acwc acwc) {
        return a(obj, acwc, -1);
    }

    public final azfa a(Object obj, acwc acwc, int i) {
        if (c() == null) {
            return null;
        }
        acvm acvm = new acvm(obj, acwc, i);
        azfa azfa = (azfa) this.i.get(acvm);
        if (azfa == null) {
            azfa = a(acwc, i);
            this.i.put(acvm, azfa);
        }
        return azfa;
    }

    /* Access modifiers changed, original: protected */
    public azfa a(acwc acwc, int i) {
        acwp c = c();
        if (c == null) {
            return null;
        }
        azfd azfd = (azfd) azfa.h.createBuilder();
        azfd.a(acwc.dU);
        int i2 = 0;
        if (i > 0) {
            azfd.b(i);
        } else {
            azfd.b(0);
        }
        if (c.i.contains(acwc)) {
            i2 = c.j;
            c.j = i2 + 1;
        } else {
            c.i.add(acwc);
        }
        azfd.c(i2);
        return (azfa) ((anxl) azfd.build());
    }

    @Deprecated
    public String d() {
        return c() != null ? c().a : "";
    }

    public acwp c() {
        return this.j;
    }

    public void a(acwp acwp) {
        this.j = acwp;
        for (acvx a : this.h) {
            a.a(acwp);
        }
    }

    public acvx a(acxe acxe) {
        acvj acvj = new acvj(this.a, this.b, this.c, this.d, this.e, acxe);
        acvj.a(c());
        this.h.add(acvj);
        return acvj;
    }

    public final void a(int i, acxf acxf, atst atst) {
        this.c.a(c(), i, acxf.a, atst);
    }
}
