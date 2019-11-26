package defpackage;

/* renamed from: ahox */
public final class ahox {
    private final ahow a;
    private final /* synthetic */ ahou b;

    public final boolean a() {
        ahou ahou = this.b;
        if (ahou.b == 0.0f || ahou.c == 0.0f || Math.abs(this.a.a[0]) > this.b.b / 2.0f || Math.abs(this.a.a[1]) > this.b.c / 2.0f) {
            return false;
        }
        return true;
    }

    public final float b() {
        float f = this.b.b;
        return f != 0.0f ? (this.a.a[0] + (f / 2.0f)) / f : -1.0f;
    }

    /* synthetic */ ahox(ahou ahou, ahow ahow) {
        this.b = ahou;
        this.a = ahow;
    }
}
