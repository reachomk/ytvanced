package defpackage;

import java.util.List;

/* renamed from: blq */
public final class blq extends blp {
    public blq(List list) {
        super(list);
    }

    public final int b(bpf bpf, float f) {
        if (bpf.b == null || bpf.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        bph bph = this.d;
        if (bph != null) {
            bpf.f.floatValue();
            c();
            Integer num = (Integer) bph.a;
            if (num != null) {
                return num.intValue();
            }
        }
        int i = bpf.i;
        if (i == 784923401) {
            i = ((Integer) bpf.b).intValue();
            bpf.i = i;
        }
        int i2 = bpf.j;
        if (i2 == 784923401) {
            i2 = ((Integer) bpf.c).intValue();
            bpf.j = i2;
        }
        return bpd.a(i, i2, f);
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Object a(bpf bpf, float f) {
        return Integer.valueOf(b(bpf, f));
    }
}
