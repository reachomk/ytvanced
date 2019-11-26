package defpackage;

/* renamed from: abzr */
public final class abzr extends abyd {
    private boolean b = false;

    public final synchronized boolean a(boolean z, abzm abzm, abyq abyq) {
        if (!this.b) {
            return false;
        }
        return super.a(z, abzm, abyq);
    }

    public final synchronized void a() {
        super.a();
        this.b = false;
    }

    public final synchronized void a(int i, int i2, abya abya) {
        this.a.a(i, i2);
        a(abya);
        this.b = true;
    }
}
