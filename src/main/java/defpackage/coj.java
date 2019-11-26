package defpackage;

/* renamed from: coj */
public class coj {
    public cor a;
    public final int b;
    public final Object[] c;

    protected coj() {
        this(null, -1, null);
    }

    public coj(cor cor, int i, Object[] objArr) {
        this.a = cor;
        this.b = i;
        this.c = objArr;
    }

    public void a(Object obj) {
        this.a.m().a(this, obj);
    }

    public boolean a(coj coj) {
        if (this == coj) {
            return true;
        }
        if (coj == null || coj.getClass() != getClass() || this.b != coj.b) {
            return false;
        }
        Object[] objArr = this.c;
        Object[] objArr2 = coj.c;
        if (objArr == objArr2) {
            return true;
        }
        if (objArr == null || objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        int i = 1;
        while (true) {
            objArr2 = this.c;
            if (i >= objArr2.length) {
                return true;
            }
            Object obj = objArr2[i];
            Object obj2 = coj.c[i];
            if (obj == null) {
                if (obj2 != null) {
                    break;
                }
            } else if (!obj.equals(obj2)) {
                break;
            }
            i++;
        }
        return false;
    }
}
