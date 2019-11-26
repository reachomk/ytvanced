package defpackage;

import java.util.ArrayList;

/* renamed from: wex */
public class wex implements wei {
    private final wek a;
    public final ajst b;
    private final akvy c;

    public wex(wek wek, akvy akvy, ajst ajst) {
        this.a = wek;
        this.c = akvy;
        this.b = (ajst) amqw.a((Object) ajst);
    }

    public final ajst b() {
        return this.b;
    }

    public final boolean a() {
        return this.c instanceof web;
    }

    public final void d(ajsn ajsn) {
        new ajsu().a = ajsn;
        ajss ajss = this.b.b;
        if (ajss == null || ajss.a == null) {
            ajss = new ajss();
            ajss.a = new ajsq();
            this.b.b = ajss;
        }
        ajsq ajsq = this.b.b.a;
        Object[] objArr = ajsq.b;
        int i = 0;
        if (objArr != null) {
            ajsq.b = (ajsu[]) xsb.a(objArr, r0);
        } else {
            ajsq.b = new ajsu[]{r0};
        }
        wek wek = this.a;
        ArrayList arrayList = new ArrayList(xsb.b(wek.a, this.b));
        int size = arrayList.size();
        while (i < size) {
            ((wem) arrayList.get(i)).a(ajsn);
            i++;
        }
    }

    public final void a(ajsn ajsn) {
        if (a()) {
            akvy akvy = this.c;
            if ((akvy instanceof akun) && ((akun) akvy).b(ajti.NEXT)) {
                return;
            }
        }
        d(ajsn);
    }

    public final void a(ajsn ajsn, ajsn ajsn2) {
        if (ajsn != null) {
            ajsu ajsu = new ajsu();
            ajsu.a = ajsn;
            ajsn2.q = ajsu;
        } else {
            ajsn2.q = null;
        }
        ArrayList arrayList = new ArrayList(xsb.b(this.a.b, ajsn2));
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((wej) arrayList.get(i)).a(ajsn2);
        }
    }

    public void b(ajsn ajsn) {
        if (ajsn != null) {
            ajss ajss = this.b.b;
            int i = 0;
            if (ajss != null) {
                ajsq ajsq = ajss.a;
                if (ajsq != null) {
                    int i2 = 0;
                    while (true) {
                        ajsu[] ajsuArr = ajsq.b;
                        if (i2 >= ajsuArr.length) {
                            break;
                        }
                        ajsn ajsn2 = ajsuArr[i2].a;
                        if (wex.c(ajsn, ajsn2)) {
                            ajsu[] ajsuArr2 = ajsq.b;
                            ajsu[] ajsuArr3 = new ajsu[(ajsuArr2.length - 1)];
                            System.arraycopy(ajsuArr2, 0, ajsuArr3, 0, i2);
                            ajsuArr2 = ajsq.b;
                            System.arraycopy(ajsuArr2, i2 + 1, ajsuArr3, i2, (ajsuArr2.length - i2) - 1);
                            ajsq.b = ajsuArr3;
                            ajsn = ajsn2;
                            break;
                        }
                        i2++;
                    }
                }
            }
            wek wek = this.a;
            ArrayList arrayList = new ArrayList(xsb.b(wek.a, this.b));
            int size = arrayList.size();
            while (i < size) {
                ((wem) arrayList.get(i)).b(ajsn);
                i++;
            }
        }
    }

    public void c() {
        wek wek = this.a;
        ArrayList arrayList = new ArrayList(xsb.b(wek.a, this.b));
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((wem) arrayList.get(i)).be_();
        }
    }

    public void c(ajsn ajsn) {
        if (ajsn != null) {
            ajsn ajsn2 = this.b.a.a;
            ajsu ajsu = new ajsu();
            ajsu.a = ajsn;
            ajst ajst = this.b;
            ajst.a = ajsu;
            ArrayList arrayList = new ArrayList(xsb.b(this.a.a, ajst));
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((wem) arrayList.get(i)).a(ajsn2, ajsn);
            }
        }
    }

    public void b(ajsn ajsn, ajsn ajsn2) {
        ajss ajss = this.b.b;
        if (ajss != null) {
            ajsq ajsq = ajss.a;
            if (ajsq != null) {
                ajsu[] ajsuArr = ajsq.b;
                if (ajsuArr != null) {
                    for (int i = 0; i < ajsuArr.length; i++) {
                        ajsn ajsn3 = ajsuArr[i].a;
                        if (wex.c(ajsn3, ajsn)) {
                            ajsn2.q = ajsn3.q;
                            ajsu ajsu = new ajsu();
                            ajsu.a = ajsn2;
                            ajsuArr[i] = ajsu;
                            ajsn = ajsn3;
                            break;
                        }
                    }
                }
            }
        }
        wek wek = this.a;
        ArrayList arrayList = new ArrayList(xsb.b(wek.a, this.b));
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((wem) arrayList.get(i2)).b(ajsn, ajsn2);
        }
    }

    private static boolean c(ajsn ajsn, ajsn ajsn2) {
        if (!(ajsn == null || ajsn2 == null)) {
            String str = ajsn.g;
            if (str != null && str.equals(ajsn2.g)) {
                return true;
            }
        }
        return false;
    }
}
