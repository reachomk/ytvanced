package defpackage;

import java.util.List;

/* renamed from: bln */
public final class bln extends blp {
    private final bnb e;

    public bln(List list) {
        super(list);
        int i = 0;
        bnb bnb = (bnb) ((bpf) list.get(0)).b;
        if (bnb != null) {
            i = bnb.a();
        }
        this.e = new bnb(new float[i], new int[i]);
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Object a(bpf bpf, float f) {
        bnb bnb = this.e;
        bnb bnb2 = (bnb) bpf.b;
        bnb bnb3 = (bnb) bpf.c;
        if (bnb2.b.length == bnb3.b.length) {
            for (int i = 0; i < bnb2.b.length; i++) {
                bnb.a[i] = bpd.a(bnb2.a[i], bnb3.a[i], f);
                bnb.b[i] = boz.a(f, bnb2.b[i], bnb3.b[i]);
            }
            return this.e;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot interpolate between gradients. Lengths vary (");
        stringBuilder.append(bnb2.b.length);
        stringBuilder.append(" vs ");
        stringBuilder.append(bnb3.b.length);
        stringBuilder.append(")");
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
