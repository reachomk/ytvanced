package defpackage;

/* renamed from: akda */
public final class akda implements swo {
    private static final byte[] b;
    public final arbu a;
    private final Object c = new Object();
    private volatile bdhc d = null;
    private volatile byte[] e = null;
    private volatile boolean f = true;
    private bbnv g;
    private arbs h;

    private akda(arbs arbs, bbnv bbnv) {
        this.h = (arbs) amqw.a((Object) arbs);
        this.g = (bbnv) amqw.a((Object) bbnv);
        arbu arbu = arbs.e;
        if (arbu == null) {
            arbu = arbu.g;
        }
        this.a = arbu;
    }

    public final bdhc b() {
        if (this.d == null) {
            synchronized (this.c) {
                if (this.d == null) {
                    if (this.e == null) {
                        c();
                    }
                    try {
                        this.d = bdhc.a(this.e);
                    } catch (Exception e) {
                        throw new IllegalStateException(e);
                    }
                }
            }
        }
        amqw.a(this.d, (Object) "Element transform function must never return null!");
        return this.d;
    }

    public final byte[] c() {
        if (this.e == null) {
            synchronized (this.c) {
                if (this.e == null) {
                    try {
                        this.e = (byte[]) this.g.a(this.h);
                        if (this.e == null) {
                            this.f = true;
                            this.e = b;
                        } else {
                            this.f = false;
                        }
                        this.g = null;
                        this.h = null;
                    } catch (Exception e) {
                        throw new IllegalStateException(e);
                    }
                }
            }
        }
        amqw.a(this.e, (Object) "Element transform function must never return null!");
        return this.e;
    }

    public final boolean a() {
        if (this.e == null) {
            c();
        }
        return this.f;
    }

    public static akda a(arbs arbs, bbnv bbnv) {
        return new akda(arbs, bbnv);
    }

    static {
        try {
            azui azui = (azui) azuj.c.createBuilder();
            azwm azwm = (azwm) azwn.a.createBuilder();
            azwm.a(azto.b, azto.a);
            azui.copyOnWrite();
            azuj azuj = (azuj) azui.instance;
            azuj.b = (azwn) ((anxl) azwm.build());
            azuj.a |= 1;
            b = aocf.toByteArray(bdhc.a(((azuj) ((anxl) azui.build())).toByteArray()));
        } catch (aocg e) {
            throw new IllegalStateException(e);
        }
    }
}
