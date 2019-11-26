package defpackage;

/* renamed from: ubw */
public final class ubw implements ubt {
    public int a;
    public Object b;
    private final Object[] c;
    private final int[] d;
    private int e;

    public final boolean a() {
        Object obj;
        int i;
        this.b = null;
        while (true) {
            obj = this.b;
            if (obj != null && obj != ubu.a) {
                break;
            }
            i = this.e;
            Object[] objArr = this.c;
            if (i >= objArr.length) {
                break;
            }
            this.e = i + 1;
            this.b = objArr[i];
        }
        i = this.e;
        if (i > 0) {
            this.a = this.d[i - 1];
        }
        obj = this.b;
        return (obj == null || obj == ubu.a) ? false : true;
    }

    public final Object b() {
        return this.b;
    }

    /* synthetic */ ubw(int[] iArr, Object[] objArr) {
        this.d = iArr;
        this.c = objArr;
    }
}
