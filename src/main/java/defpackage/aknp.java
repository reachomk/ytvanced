package defpackage;

/* renamed from: aknp */
public final class aknp implements akoq {
    private final int a;
    private final int b;

    public aknp(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final void a(akor akor, aknh aknh, int i) {
        akor.a("grid_row_presenter_horizontal_row_padding", Integer.valueOf(this.a));
        if (i == 0) {
            akor.a("grid_row_presenter_top_padding", Integer.valueOf(this.b));
        }
        if (i == aknh.d() - 1) {
            akor.a("grid_row_presenter_bottom_padding", Integer.valueOf(this.b));
        }
    }
}
