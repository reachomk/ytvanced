package defpackage;

/* renamed from: bdea */
final class bdea {
    public Object[] a;
    private int b;

    bdea() {
    }

    public final void a(Object obj) {
        int i = this.b;
        Object[] objArr = this.a;
        if (objArr == null) {
            objArr = new Object[16];
            this.a = objArr;
        } else if (i == objArr.length) {
            Object[] objArr2 = new Object[((i >> 2) + i)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            this.a = objArr2;
            objArr = objArr2;
        }
        objArr[i] = obj;
        this.b = i + 1;
    }
}
