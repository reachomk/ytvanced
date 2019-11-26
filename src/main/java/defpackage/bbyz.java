package defpackage;

/* renamed from: bbyz */
public final class bbyz {
    public final float a = 0.75f;
    public int b;
    public int c;
    public int d;
    public Object[] e;

    public bbyz() {
        int a = bbzc.a(16);
        this.b = a - 1;
        this.d = (int) (((float) a) * 0.75f);
        this.e = new Object[a];
    }

    public static int a(int i) {
        i *= -1640531527;
        return i ^ (i >>> 16);
    }

    public final boolean a(int i, Object[] objArr, int i2) {
        this.c--;
        while (true) {
            Object obj;
            int i3 = i + 1;
            while (true) {
                i3 &= i2;
                obj = objArr[i3];
                if (obj == null) {
                    objArr[i] = null;
                    return true;
                }
                int a = bbyz.a(obj.hashCode()) & i2;
                if (i <= i3) {
                    if (i >= a || a > i3) {
                        break;
                    }
                    i3++;
                } else {
                    if (i >= a && a > i3) {
                        break;
                    }
                    i3++;
                }
            }
            objArr[i] = obj;
            i = i3;
        }
    }
}
