package defpackage;

/* renamed from: wxi */
public final class wxi implements wxg {
    private volatile wxg a;

    private wxi(wxg wxg) {
        this.a = wxg;
    }

    public static wxi a(wxg wxg) {
        return new wxi(wxg);
    }

    public final void a() {
        this.a = null;
    }

    public final boolean b() {
        return this.a == null;
    }

    public final void a(Object obj, Object obj2) {
        if (this.a != null) {
            try {
                this.a.a(obj, obj2);
            } catch (NullPointerException unused) {
            }
        }
    }

    public final void a(Object obj, Exception exception) {
        if (this.a != null) {
            try {
                this.a.a(obj, exception);
            } catch (NullPointerException unused) {
            }
        }
    }
}
