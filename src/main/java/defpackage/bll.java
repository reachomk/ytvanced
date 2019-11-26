package defpackage;

import java.util.List;

/* renamed from: bll */
public final class bll extends blp {
    public bll(List list) {
        super(list);
    }

    private final int b(bpf bpf, float f) {
        Object obj = bpf.b;
        if (obj == null || bpf.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int intValue = ((Integer) obj).intValue();
        int intValue2 = ((Integer) bpf.c).intValue();
        bph bph = this.d;
        if (bph != null) {
            bpf.f.floatValue();
            c();
            Integer num = (Integer) bph.a;
            if (num != null) {
                return num.intValue();
            }
        }
        return boz.a(bpd.b(f, 0.0f, 1.0f), intValue, intValue2);
    }

    public final int g() {
        return b(b(), d());
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Object a(bpf bpf, float f) {
        return Integer.valueOf(b(bpf, f));
    }
}
