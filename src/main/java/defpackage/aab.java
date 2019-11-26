package defpackage;

/* renamed from: aab */
public class aab implements zy {
    private final Object[] a;
    private int b;

    public aab(int i) {
        if (i > 0) {
            this.a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public Object a() {
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

    public boolean a(Object obj) {
        int i = 0;
        while (true) {
            int i2 = this.b;
            if (i >= i2) {
                Object[] objArr = this.a;
                if (i2 >= objArr.length) {
                    return false;
                }
                objArr[i2] = obj;
                this.b = i2 + 1;
                return true;
            } else if (this.a[i] != obj) {
                i++;
            } else {
                throw new IllegalStateException("Already in the pool!");
            }
        }
    }
}
