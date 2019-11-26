package defpackage;

/* renamed from: opv */
public final class opv implements ops {
    public final int a;

    public opv(int i) {
        this.a = i;
    }

    public final int b(int i) {
        i--;
        return i >= 0 ? i : -1;
    }

    public final int a(int i) {
        i++;
        return i >= this.a ? -1 : i;
    }

    public final int a() {
        int i = this.a;
        return i > 0 ? i - 1 : -1;
    }

    public final int b() {
        return this.a <= 0 ? -1 : 0;
    }
}
