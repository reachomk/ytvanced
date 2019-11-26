package defpackage;

import java.util.List;

/* renamed from: blo */
public final class blo extends blp {
    public blo(List list) {
        super(list);
    }

    private final float b(bpf bpf, float f) {
        if (bpf.b == null || bpf.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        bph bph = this.d;
        if (bph != null) {
            bpf.f.floatValue();
            c();
            Float f2 = (Float) bph.a;
            if (f2 != null) {
                return f2.floatValue();
            }
        }
        float f3 = bpf.g;
        if (f3 == -3987645.8f) {
            f3 = ((Float) bpf.b).floatValue();
            bpf.g = f3;
        }
        float f4 = bpf.h;
        if (f4 == -3987645.8f) {
            f4 = ((Float) bpf.c).floatValue();
            bpf.h = f4;
        }
        return bpd.a(f3, f4, f);
    }

    public final float g() {
        return b(b(), d());
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Object a(bpf bpf, float f) {
        return Float.valueOf(b(bpf, f));
    }
}
