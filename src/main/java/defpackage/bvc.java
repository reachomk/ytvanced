package defpackage;

/* renamed from: bvc */
final class bvc implements bul {
    private final bwv a;
    private volatile bww b;

    bvc(bwv bwv) {
        this.a = bwv;
    }

    public final bww a() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = this.a.a();
                }
                if (this.b == null) {
                    this.b = new bwx();
                }
            }
        }
        return this.b;
    }
}
