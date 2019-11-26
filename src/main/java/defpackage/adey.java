package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: adey */
public final class adey implements adfq {
    private final adqc a;
    private final baz b;
    private final boolean c;
    private final tbq d;
    private final bcaa e;

    public adey(adqc adqc, baz baz, bbb bbb, boolean z, tbq tbq, bcaa bcaa) {
        this.a = (adqc) amqw.a((Object) adqc);
        this.b = (baz) amqw.a((Object) baz);
        amqw.a((Object) bbb);
        this.c = z;
        this.d = tbq;
        this.e = bcaa;
    }

    public final List a() {
        adfs adfs = new adfs(this.a, this.d, this.c, this.b, (String) this.e.get());
        List arrayList = new ArrayList(bbb.a());
        adfs.a(arrayList);
        return arrayList;
    }

    public final List b() {
        auqa auqa;
        adfs adfs = new adfs(this.a, this.d, this.c, this.b, null);
        List arrayList = new ArrayList(bbb.a());
        Object[] objArr = new aupx[adfs.c.length];
        int i = 0;
        int i2 = 0;
        while (i2 < adfs.c.length) {
            auqa = (auqa) aupx.d.createBuilder();
            int i3 = adfs.c[i2];
            auqa.copyOnWrite();
            aupx aupx = (aupx) auqa.instance;
            if (i3 != 0) {
                aupx.a = 1 | aupx.a;
                aupx.b = i3 - 1;
                auqa.a(0);
                objArr[i2] = (aupx) ((anxl) auqa.build());
                i2++;
            } else {
                throw new NullPointerException();
            }
        }
        adfs.a(arrayList);
        while (i < arrayList.size()) {
            bbs bbs = (bbs) arrayList.get(i);
            if (adhn.c(bbs)) {
                adqc adqc = adfs.a;
                if (adhn.c(bbs)) {
                    adis a = adqc.a(bbs.r);
                    if (a == null) {
                        xtl.b(adhn.a, "Route was not found in screen monitor");
                    } else if (((adiq) a).n()) {
                        i2 = 5;
                    }
                }
                i2 = 2;
            } else {
                i2 = (adfs.a(bbs) && adfs.b) ? 4 : !adfs.b(bbs) ? !adhn.a(bbs) ? 6 : 3 : 1;
            }
            auqa = (auqa) ((anxo) objArr[i2].toBuilder());
            auqa.a(objArr[i2].c + 1);
            objArr[i2] = (aupx) ((anxl) auqa.build());
            i++;
        }
        return amul.a(objArr);
    }
}
