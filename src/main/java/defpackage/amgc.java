package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: amgc */
final /* synthetic */ class amgc implements bbnw {
    private final String[] a;

    amgc(String[] strArr) {
        this.a = strArr;
    }

    public final void accept(Object obj) {
        String[] strArr = this.a;
        amdz amdz = (amdz) obj;
        amdz.copyOnWrite();
        ((amea) amdz.instance).y = anxl.emptyProtobufList();
        List asList = Arrays.asList(strArr);
        amdz.copyOnWrite();
        amea amea = (amea) amdz.instance;
        if (!amea.y.a()) {
            amea.y = anxl.mutableCopy(amea.y);
        }
        anvf.addAll(asList, amea.y);
    }
}
