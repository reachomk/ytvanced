package defpackage;

/* renamed from: ndx */
final /* synthetic */ class ndx implements Runnable {
    private final ndy a;
    private final String b;
    private final String c;
    private final int d;

    ndx(ndy ndy, String str, String str2, int i) {
        this.a = ndy;
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    public final void run() {
        ndy ndy = this.a;
        String str = this.b;
        String str2 = this.c;
        int i = this.d;
        nfy nfy = ndy.a.z;
        nfy.a.setVisibility(8);
        nfy.b.setVisibility(8);
        nga nga = nfy.c;
        if (nga.a.getAnimation() == null) {
            nga.a.startAnimation(nga.b);
        }
        ndt ndt = ndy.a;
        ndt.F = str;
        ndt.G = str2;
        ndt.x.a(ndt.G);
        ndy.a.x.a(i);
        ndy.a.y.e.a(i);
    }
}
