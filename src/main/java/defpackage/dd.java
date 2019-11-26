package defpackage;

/* renamed from: dd */
final class dd implements da {
    private final Object[] a = new Object[256];
    private int b;

    dd() {
    }

    public final Object a() {
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        i--;
        Object[] objArr = this.a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.b = i;
        return obj;
    }

    public final boolean a(Object obj) {
        int i = this.b;
        Object[] objArr = this.a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = obj;
        this.b = i + 1;
        return true;
    }

    public final void a(Object[] objArr, int i) {
        int length = objArr.length;
        if (i > length) {
            i = length;
        }
        for (length = 0; length < i; length++) {
            Object obj = objArr[length];
            int i2 = this.b;
            Object[] objArr2 = this.a;
            if (i2 < objArr2.length) {
                objArr2[i2] = obj;
                this.b = i2 + 1;
            }
        }
    }
}
