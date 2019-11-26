package defpackage;

/* renamed from: aitk */
public final class aitk {
    public aitn a;
    private int b = 1;

    public final synchronized void a() {
        this.b = 2;
    }

    public final synchronized void b() {
        if (this.b != 3) {
            this.b = 3;
            aitn aitn = this.a;
            if (aitn != null) {
                aitn.a();
            }
        }
    }

    public final synchronized void c() {
        if (this.b != 1) {
            this.b = 1;
            aitn aitn = this.a;
            if (aitn != null) {
                aitn.b();
            }
        }
    }

    public final boolean d() {
        return this.b == 2;
    }

    public final boolean e() {
        return this.b == 3;
    }
}
