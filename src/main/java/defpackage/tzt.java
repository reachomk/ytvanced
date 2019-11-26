package defpackage;

/* renamed from: tzt */
public final class tzt implements tzu {
    private volatile tzu a;
    private volatile Object b;

    public tzt(tzu tzu) {
        this.a = tzu;
    }

    public final Object a() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = this.a.a();
                    this.a = null;
                }
            }
        }
        return this.b;
    }
}
