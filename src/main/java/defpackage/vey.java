package defpackage;

import java.util.List;

/* renamed from: vey */
final /* synthetic */ class vey implements Runnable {
    private final vet a;
    private final vsd b;
    private final String c;
    private final vka d;
    private final aakj e;
    private final String f;
    private final List g;

    vey(vet vet, vsd vsd, String str, vka vka, aakj aakj, String str2, List list) {
        this.a = vet;
        this.b = vsd;
        this.c = str;
        this.d = vka;
        this.e = aakj;
        this.f = str2;
        this.g = list;
    }

    public final void run() {
        vet vet = this.a;
        vsd vsd = this.b;
        String str = this.c;
        vka vka = this.d;
        aakj aakj = this.e;
        String str2 = this.f;
        List list = this.g;
        if (vsd != null) {
            vet.a(str, vka, vsd, aakj, str2);
        }
        vjt vjt = (vjt) vet.e.get();
        if (vsd != null) {
            list = list.subList(1, list.size());
        }
        vjt.a(str2, aakj, list);
    }
}
