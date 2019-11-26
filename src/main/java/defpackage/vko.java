package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: vko */
public final class vko implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;

    private vko(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
        this.e = bcaa5;
    }

    public static vko a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5) {
        return new vko(bcaa, bcaa2, bcaa3, bcaa4, bcaa5);
    }

    public final /* synthetic */ Object get() {
        return new vkm(this.a, this.b, this.c, (bctz) this.d.get(), (CopyOnWriteArrayList) this.e.get());
    }
}
