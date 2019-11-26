package defpackage;

import java.util.List;

/* renamed from: vez */
final /* synthetic */ class vez implements Runnable {
    private final vet a;
    private final aakj b;
    private final String c;
    private final vka d;
    private final String e;

    vez(vet vet, aakj aakj, String str, vka vka, String str2) {
        this.a = vet;
        this.b = aakj;
        this.c = str;
        this.d = vka;
        this.e = str2;
    }

    public final void run() {
        List list;
        String str;
        aakj aakj;
        vet vet = this.a;
        aakj aakj2 = this.b;
        String str2 = this.c;
        vka vka = this.d;
        String str3 = this.e;
        List b = vet.b(aakj2);
        vsd vsd = (b.isEmpty() || ((vsd) b.get(0)).e() != vsm.PRE_ROLL) ? null : (vsd) b.get(0);
        if (vsd != null) {
            vet.a(str2, vka, vsd, aakj2, str3);
            list = b;
            str = str3;
            aakj = aakj2;
        } else {
            list = b;
            str = str3;
            aakj = aakj2;
            ((vjt) vet.e.get()).a(str3, aakj2, str2, vka, null, vsm.PRE_ROLL, amul.g());
        }
        vjt vjt = (vjt) vet.e.get();
        if (vsd != null) {
            list = list.subList(1, list.size());
        }
        vjt.a(str, aakj, list);
    }
}
