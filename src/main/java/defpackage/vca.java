package defpackage;

import java.util.ArrayList;

/* renamed from: vca */
public final class vca implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;

    private vca(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
    }

    public static vca a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        return new vca(bcaa, bcaa2, bcaa3, bcaa4);
    }

    public static ven a(bcaa bcaa, voe voe, aaox aaox, xci xci) {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new vts(bcaa));
        if (voe.a()) {
            arrayList.add(new vof(voe));
        }
        return (ven) baqd.a(new ven(aaox, arrayList, xci), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return vca.a(this.a, (voe) this.b.get(), (aaox) this.c.get(), (xci) this.d.get());
    }
}
