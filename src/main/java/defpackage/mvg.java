package defpackage;

/* renamed from: mvg */
public final class mvg {
    private final mug a;
    private final mui b;

    public mvg(mug mug, mui mui, bctz bctz) {
        this.a = mug;
        this.b = mui;
        bctz.c().a(new mvj(this));
    }

    public final void a(int i) {
        if (i == 1 || i == 2) {
            this.a.setVisibility(8);
            this.b.setVisibility(0);
        } else if (i == 3) {
            this.a.h();
            this.a.setVisibility(0);
            this.b.setVisibility(8);
        } else if (i != 5) {
            this.a.setVisibility(0);
            this.b.setVisibility(8);
        } else {
            this.a.setVisibility(8);
            this.b.setVisibility(8);
        }
    }
}
