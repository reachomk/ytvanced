package defpackage;

/* renamed from: bbyp */
public final class bbyp {
    public final Object[] a = new Object[5];
    private Object[] b = this.a;
    private int c;

    public final void a(Object obj) {
        int i = this.c;
        if (i == 4) {
            Object[] objArr = new Object[5];
            this.b[4] = objArr;
            this.b = objArr;
            i = 0;
        }
        this.b[i] = obj;
        this.c = i + 1;
    }
}
