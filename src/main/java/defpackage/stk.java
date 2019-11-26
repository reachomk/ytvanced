package defpackage;

import java.util.concurrent.Callable;

/* renamed from: stk */
public final /* synthetic */ class stk implements Callable {
    private final bdgm a;
    private final swm b;
    private final svc c;

    public stk(bdgm bdgm, swm swm, svc svc) {
        this.a = bdgm;
        this.b = swm;
        this.c = svc;
    }

    public final Object call() {
        bdgm bdgm = this.a;
        swm swm = this.b;
        svc svc = this.c;
        bdgt bdgt = bdgm.d;
        sxq sxq = bdgt != null ? new sxq(aocf.toByteArray(bdgt)) : sxq.a;
        bdgp bdgp = bdgm.e;
        if (bdgp == null) {
            return bbzp.e(sxq);
        }
        int i;
        bdgr bdgr = (bdgr) szb.a(bdgp, bdgr.a);
        bdhf bdhf = (bdhf) szb.a(bdgm.e, bdhf.a);
        amuu e = amur.e();
        int i2 = 0;
        if (bdgr != null) {
            i = bdgr.c;
            amuu e2 = amur.e();
            bdgq[] bdgqArr = bdgr.b;
            int length = bdgqArr.length;
            while (i2 < length) {
                bdgq bdgq = bdgqArr[i2];
                e2.b(bdgq.b, Integer.valueOf(bdgq.c));
                i2++;
            }
            e.a(e2.b());
            i2 = i;
        }
        if (bdhf != null) {
            if (i2 != 0) {
                i = bdhf.b;
                if (i2 != i) {
                    int i3 = bdgr.c;
                    StringBuilder stringBuilder = new StringBuilder(108);
                    stringBuilder.append("ComponentType localEntitiesConfig.resultField=");
                    stringBuilder.append(i3);
                    stringBuilder.append(", environmentEntitiesConfig.resultField=");
                    stringBuilder.append(i);
                    throw new sxf(stringBuilder.toString());
                }
            }
            i2 = bdhf.b;
            e.a(amur.a("/environment", Integer.valueOf(bdhf.c)));
        }
        return stj.a(sts.a(sxq), i2, e.b(), swm, svc);
    }
}
