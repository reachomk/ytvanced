package defpackage;

/* renamed from: abxe */
public abstract class abxe implements ugp {
    public final void a() {
    }

    public abstract void a(boolean z);

    public final void b() {
    }

    public final void c() {
    }

    public final void a(ugo ugo, ugo ugo2) {
        if (ugo2 != ugo.COLLAPSED && ugo2 != ugo.FULLY_EXPANDED) {
            return;
        }
        if (ugo == ugo.COLLAPSED || ugo == ugo.FULLY_EXPANDED) {
            a(ugo2 == ugo.FULLY_EXPANDED);
        }
    }
}
