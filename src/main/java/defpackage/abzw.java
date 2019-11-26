package defpackage;

/* renamed from: abzw */
final class abzw implements aceh {
    private final /* synthetic */ abzx a;

    abzw(abzx abzx) {
        this.a = abzx;
    }

    public final void a(Object obj) {
        abzx abzx = this.a;
        if (abzx.b && (obj instanceof auhs)) {
            auhs auhs = (auhs) obj;
            abzx.g();
            abzx = this.a;
            auhs.copyOnWrite();
            ((auht) auhs.instance).c = anxl.emptyProtobufList();
            for (abzz abzz : abzx.a) {
                auhu auhu = (auhu) auhv.f.createBuilder();
                String str = abzz.a;
                auhu.copyOnWrite();
                auhv auhv = (auhv) auhu.instance;
                if (str != null) {
                    auhv.a |= 1;
                    auhv.b = str;
                    float f = abzz.c;
                    auhu.copyOnWrite();
                    auhv = (auhv) auhu.instance;
                    auhv.a |= 4;
                    auhv.d = f;
                    f = abzz.d;
                    auhu.copyOnWrite();
                    auhv = (auhv) auhu.instance;
                    auhv.a |= 8;
                    auhv.e = f;
                    long j = abzz.b;
                    auhu.copyOnWrite();
                    auhv auhv2 = (auhv) auhu.instance;
                    auhv2.a |= 2;
                    auhv2.c = j;
                    auhv2 = (auhv) ((anxl) auhu.build());
                    auhs.copyOnWrite();
                    auht auht = (auht) auhs.instance;
                    if (auhv2 != null) {
                        if (!auht.c.a()) {
                            auht.c = anxl.mutableCopy(auht.c);
                        }
                        auht.c.add(auhv2);
                    } else {
                        throw new NullPointerException();
                    }
                }
                throw new NullPointerException();
            }
            this.a.a.clear();
            this.a.h();
        }
    }
}
