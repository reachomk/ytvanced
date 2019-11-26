package defpackage;

/* renamed from: ykf */
public final class ykf {
    public final aryi a;

    public ykf(String str, aygk aygk, acvx acvx) {
        aryh aryh = (aryh) aryi.o.createBuilder();
        apxu a = yjg.a(str, acvx);
        aryh.copyOnWrite();
        aryi aryi = (aryi) aryh.instance;
        if (a != null) {
            aryi.i = a;
            aryi.a |= 128;
            if (str != null) {
                aryh.copyOnWrite();
                aryi aryi2 = (aryi) aryh.instance;
                aryi2.a |= 256;
                aryi2.j = str;
            }
            if (aygk != null) {
                aryh.copyOnWrite();
                aryi aryi3 = (aryi) aryh.instance;
                aryi3.b = aygk;
                aryi3.a |= 1;
            }
            this.a = (aryi) amqw.a((aryi) ((anxl) aryh.build()));
            return;
        }
        throw new NullPointerException();
    }
}
