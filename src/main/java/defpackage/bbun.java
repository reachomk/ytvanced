package defpackage;

/* renamed from: bbun */
final class bbun extends bbph {
    public final bbmo a;
    public final Object[] b;
    public boolean c;
    public volatile boolean d;
    private int e;

    bbun(bbmo bbmo, Object[] objArr) {
        this.a = bbmo;
        this.b = objArr;
    }

    public final int a(int i) {
        if ((i & 1) == 0) {
            return 0;
        }
        this.c = true;
        return 1;
    }

    public final Object bI_() {
        int i = this.e;
        Object[] objArr = this.b;
        if (i == objArr.length) {
            return null;
        }
        this.e = i + 1;
        return bbow.a(objArr[i], "The array element is null");
    }

    public final boolean b() {
        return this.e == this.b.length;
    }

    public final void e() {
        this.e = this.b.length;
    }

    public final void bK_() {
        this.d = true;
    }

    public final boolean c() {
        return this.d;
    }
}
