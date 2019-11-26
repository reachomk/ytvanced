package defpackage;

import java.util.Collection;

/* renamed from: agwv */
public final /* synthetic */ class agwv implements amqd {
    private final agwu a;

    public agwv(agwu agwu) {
        this.a = agwu;
    }

    public final Object a(Object obj) {
        agwu agwu = this.a;
        Collection<agqy> collection = (Collection) obj;
        if (collection == null) {
            return null;
        }
        agvm agvm = agwu.c;
        agwu.e = new agvn(agvm.c, agvm.d.c());
        agwu.e.g();
        agwu.e.b = agwu.b.f(((agwc) agwu.d.get()).c());
        for (agqy agqy : collection) {
            if (!agqy.i()) {
                azcx azcx = (azcx) azcy.e.createBuilder();
                String a = aaer.a(azcy.f.a(), agqy.a());
                azcx.copyOnWrite();
                azcy azcy = (azcy) azcx.instance;
                if (a != null) {
                    azcy.a |= 1;
                    azcy.b = a;
                    a = agqy.a();
                    azcx.copyOnWrite();
                    azcy = (azcy) azcx.instance;
                    if (a != null) {
                        azcy.a |= 2;
                        azcy.c = a;
                        long j = agqy.h;
                        azcx.copyOnWrite();
                        azcy azcy2 = (azcy) azcx.instance;
                        azcy2.a |= 4;
                        azcy2.d = j;
                        agwu.e.a.add((azcy) ((anxl) azcx.build()));
                    } else {
                        throw new NullPointerException();
                    }
                }
                throw new NullPointerException();
            }
        }
        return agwu.e;
    }
}
