package defpackage;

/* renamed from: aexw */
final class aexw implements ovh {
    private int a = 0;
    private final /* synthetic */ afiq[] b;
    private final /* synthetic */ afis c;
    private final /* synthetic */ aajj d;
    private final /* synthetic */ aeoj e;
    private final /* synthetic */ afaj f;

    aexw(afiq[] afiqArr, afis afis, aajj aajj, aeoj aeoj, afaj afaj) {
        this.b = afiqArr;
        this.c = afis;
        this.d = aajj;
        this.e = aeoj;
        this.f = afaj;
    }

    public final synchronized ovi a() {
        int i = this.a;
        afiq[] afiqArr = this.b;
        if (i < afiqArr.length) {
            this.a = i + 1;
            return afiqArr[i].a();
        }
        return this.c.a(this.d, this.e, 5, this.f.c, afhi.l).a();
    }
}
