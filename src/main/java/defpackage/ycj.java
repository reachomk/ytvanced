package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: ycj */
public final class ycj implements akmw {
    public final Set a;

    public ycj() {
        this.a = new HashSet();
    }

    public final akmw a(akmw akmw) {
        return akmw;
    }

    public ycj(Set set) {
        this.a = new HashSet(set);
    }

    public final ycj a(String str) {
        ycj ycj = new ycj(this.a);
        ycj.a.remove(str);
        return ycj;
    }
}
