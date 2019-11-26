package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: abmo */
public final class abmo {
    public static List a(String str) {
        aofr aofr = (aofr) aofs.c.createBuilder();
        aofr.copyOnWrite();
        aofs aofs = (aofs) aofr.instance;
        if (str != null) {
            aofs.a |= 1;
            aofs.b = str;
            aofs aofs2 = (aofs) ((anxl) aofr.build());
            aofq[] aofqArr = new aofq[1];
            aofp aofp = (aofp) aofq.i.createBuilder();
            aofp.copyOnWrite();
            aofq aofq = (aofq) aofp.instance;
            if (aofs2 != null) {
                aofq.b = aofs2;
                aofq.a |= 1;
                aofqArr[0] = (aofq) ((anxl) aofp.build());
                return Arrays.asList(aofqArr);
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }
}
