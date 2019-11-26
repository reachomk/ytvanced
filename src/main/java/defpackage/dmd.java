package defpackage;

/* renamed from: dmd */
final class dmd implements bcaa {
    private final int a;
    private final /* synthetic */ dma b;

    dmd(dma dma, int i) {
        this.b = dma;
        this.a = i;
    }

    public final Object get() {
        int i = this.a;
        if (i == 0) {
            return new yil();
        }
        if (i == 1) {
            return new yio(this.b.d.dL.fi());
        }
        dma dma;
        Object obj;
        Object obj2;
        if (i == 2) {
            dma = this.b;
            obj = dma.b;
            if (obj instanceof baqe) {
                synchronized (obj) {
                    obj2 = dma.b;
                    if (obj2 instanceof baqe) {
                        obj2 = (ymx) baqd.a(new frt(dma.a.a.v), "Cannot return null from a non-@Nullable @Provides method");
                        dma.b = bapx.a(dma.b, obj2);
                    }
                }
                obj = obj2;
            }
            return (ymx) obj;
        } else if (i == 3) {
            dma = this.b;
            obj = dma.c;
            if (obj instanceof baqe) {
                synchronized (obj) {
                    obj2 = dma.c;
                    if (obj2 instanceof baqe) {
                        obj2 = (ysc) baqd.a(new frw(dma.a.a.v), "Cannot return null from a non-@Nullable @Provides method");
                        dma.c = bapx.a(dma.c, obj2);
                    }
                }
                obj = obj2;
            }
            return (ysc) obj;
        } else {
            throw new AssertionError(i);
        }
    }
}
