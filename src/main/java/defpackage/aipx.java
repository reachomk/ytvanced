package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: aipx */
public final class aipx {
    private final aiqa a;
    private final afgu b;
    private final Executor c;

    public aipx(aiqa aiqa, afgu afgu, Executor executor) {
        this.a = (aiqa) amqw.a((Object) aiqa);
        this.b = (afgu) amqw.a((Object) afgu);
        this.c = (Executor) amqw.a((Object) executor);
    }

    public final aipw a(aakj aakj, long j, aipy aipy) {
        return a(aakj, 0, j, aipy, 0);
    }

    public final aipw a(aakj aakj, long j, long j2, aipy aipy, int i) {
        aakj aakj2 = aakj;
        aajs aajs = aakj2.c;
        if (!(aajs == null || aajs.a() || j2 <= 0)) {
            ArrayList arrayList = new ArrayList(2);
            boolean z = false;
            try {
                afgv a = this.b.a(aakj2.c, aakj.n(), aakj.n().o());
                aahr[] aahrArr = a.a;
                aahr[] aahrArr2 = a.b;
                if (aahrArr2.length > 0 && !aahrArr2[0].w()) {
                    arrayList.add(aahrArr2[0]);
                }
                if (i != 0) {
                    aahr aahr = a.c;
                    if (!(aahr == null || aahr.w())) {
                        arrayList.add(aahr);
                    }
                } else if (aahrArr.length > 0 && !aahrArr[0].w()) {
                    arrayList.add(aahrArr[0]);
                }
            } catch (afgr unused) {
            }
            if (arrayList.isEmpty()) {
                aipy.a(2);
            } else {
                String b = aakj.b();
                aahr[] aahrArr3 = (aahr[]) arrayList.toArray(new aahr[arrayList.size()]);
                if (aahrArr3 != null && aahrArr3.length > 0) {
                    z = true;
                }
                amqw.a(z);
                aipw aipw = new aipw(this.a, b, aahrArr3, j, j2, aipy);
                this.c.execute(aipw.i);
                return aipw;
            }
        }
        return null;
    }
}
