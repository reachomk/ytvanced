package defpackage;

import java.util.List;

/* renamed from: blw */
public final class blw extends blp {
    private final bpk e = new bpk();

    public blw(List list) {
        super(list);
    }

    public final /* synthetic */ Object a(bpf bpf, float f) {
        Object obj = bpf.b;
        if (obj != null) {
            Object obj2 = bpf.c;
            if (obj2 != null) {
                bpk bpk;
                bpk bpk2 = (bpk) obj;
                bpk bpk3 = (bpk) obj2;
                bph bph = this.d;
                if (bph != null) {
                    bpf.f.floatValue();
                    c();
                    bpk = (bpk) bph.a;
                    if (bpk != null) {
                        return bpk;
                    }
                }
                bpk = this.e;
                float a = bpd.a(bpk2.a, bpk3.a, f);
                f = bpd.a(bpk2.b, bpk3.b, f);
                bpk.a = a;
                bpk.b = f;
                return this.e;
            }
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
