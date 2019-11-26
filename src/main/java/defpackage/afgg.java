package defpackage;

/* renamed from: afgg */
public final class afgg implements afgf {
    private final int a;

    public afgg(int i) {
        if (i <= 0) {
            i = 1;
        }
        this.a = i;
    }

    public final int a(int i, ofj ofj) {
        if (i >= 0 && ofj != null) {
            return Math.max(Math.min(this.a, ofj.a - i), 1);
        }
        return this.a;
    }
}
