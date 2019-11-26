package defpackage;

/* renamed from: jiv */
final class jiv implements akxt {
    private final amqv a = jiy.a;

    private jiv() {
    }

    public final boolean b() {
        return false;
    }

    public final amqv a() {
        return this.a;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, akxs akxs) {
        ajwc ajwc = ((ajww) obj).R;
        ajwe[] ajweArr = ajwc.a;
        int length = ajweArr.length;
        int i = 0;
        while (i < length) {
            ajwe ajwe = ajweArr[i];
            if (ajwe.c == null && ajwe.e == null && ajwe.o == null && ajwe.f == null && ajwe.g == null && ajwe.h == null && ajwe.d == null && ajwe.n == null && ajwe.j == null && ajwe.i == null && ajwe.l == null && ajwe.m == null && ajwe.k == null) {
                i++;
            } else {
                arux arux = ajwc.c;
                if (!(arux == null || (arux.a & 1) == 0)) {
                    Object obj2 = arux.b;
                    if (obj2 == null) {
                        obj2 = arvh.g;
                    }
                    akxs.a(obj2);
                }
                akxs.a(ajwc);
                return;
            }
        }
    }

    /* synthetic */ jiv(byte b) {
    }
}
