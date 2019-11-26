package defpackage;

/* renamed from: bbpl */
public class bbpl extends bbpi {
    public static final long serialVersionUID = -5502432239815349361L;
    public final bbmo a;
    private Object b;

    public bbpl(bbmo bbmo) {
        this.a = bbmo;
    }

    public final int a(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    public final void b(Object obj) {
        int i = get();
        if ((i & 54) == 0) {
            bbmo bbmo = this.a;
            if (i == 8) {
                this.b = obj;
                lazySet(16);
                bbmo.b_(null);
            } else {
                lazySet(2);
                bbmo.b_(obj);
            }
            if (get() != 4) {
                bbmo.a();
            }
        }
    }

    public final Object bI_() {
        if (get() != 16) {
            return null;
        }
        Object obj = this.b;
        this.b = null;
        lazySet(32);
        return obj;
    }

    public final boolean b() {
        return get() != 16;
    }

    public final void e() {
        lazySet(32);
        this.b = null;
    }

    public void bK_() {
        set(4);
        this.b = null;
    }

    public final boolean c() {
        return get() == 4;
    }
}
