package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: ahcx */
public final class ahcx implements ahdj {
    private final bcaa a;

    public ahcx(bcaa bcaa) {
        this.a = bcaa;
    }

    public final aahr a(aajs aajs, aajj aajj, int i, int i2, int i3, boolean z) {
        afgq afgq = new afgq(i, i);
        i = i3 - 1;
        if (i3 != 0) {
            afgq afgq2;
            if (i == 1) {
                afgq2 = new afgq(1, 1);
            } else if (i == 2) {
                afgq2 = new afgq(2, 2);
            } else if (i != 3) {
                afgq2 = afgt.a;
            } else {
                afgq2 = new afgq(3, 3);
            }
            try {
                aahr[] aahrArr;
                afgv a = ((afgu) this.a.get()).a(aajs, aajj, z, new afgt(afgq, afgq2, true, null), i2);
                if (z) {
                    aahrArr = a.b;
                } else {
                    List a2 = a.f.a(Arrays.asList(a.a));
                    aahrArr = (aahr[]) a2.toArray(new aahr[a2.size()]);
                }
                if (aahrArr.length > 0) {
                    return aahrArr[0];
                }
            } catch (afgr unused) {
            }
            return null;
        }
        throw null;
    }
}
