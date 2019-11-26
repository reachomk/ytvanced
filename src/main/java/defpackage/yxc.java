package defpackage;

/* renamed from: yxc */
public final class yxc {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public yxc(int i, int i2, int i3, int i4, int i5, int i6) {
        this.b = i2;
        this.c = i;
        this.d = (int) (((float) i2) / 1.777f);
        this.e = (int) (((float) i) / 1.777f);
        this.f = i3;
        this.g = i4;
        this.h = i5;
        this.a = i6;
    }

    public final String toString() {
        amqo a = amql.a(this);
        a.a("collapsedThumbnailWidth", this.b);
        a.a("expandedThumbnailWidth", this.c);
        a.a("collapsedThumbnailHeight", this.d);
        a.a("expandedThumbnailHeight", this.e);
        a.a("collapsedLeftMargin", this.f);
        a.a("expandedLeftMargin: ", 0);
        a.a("collapsedRightMargin", this.g);
        a.a("expandedRightMargin", 0);
        a.a("collapsedTopMargin", 0);
        a.a("expandedTopMargin", this.h);
        a.a("gravity", this.a);
        return a.toString();
    }
}
