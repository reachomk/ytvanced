package defpackage;

/* renamed from: cqo */
public final class cqo {
    public final Object[] a;
    public short b;

    public cqo() {
        this.a = new Object[5];
        this.b = (short) 0;
    }

    private static String d(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : "BORDER" : "HOST" : "FOREGROUND" : "BACKGROUND" : "CONTENT";
    }

    public cqo(cqo cqo) {
        this.a = new Object[5];
        int i = 0;
        this.b = (short) 0;
        int length = this.a.length;
        while (i < length) {
            this.a[i] = cqo.a[i];
            i++;
        }
        this.b = cqo.b;
    }

    public final void a(int i, Object obj) {
        if (obj != null) {
            Object[] objArr = this.a;
            if (objArr[i] != null) {
                String valueOf = String.valueOf(cqo.d(i));
                String str = "Already contains unit for type ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str);
                } else {
                    valueOf = str.concat(valueOf);
                }
                throw new RuntimeException(valueOf);
            } else if (objArr[3] != null || (i == 3 && this.b > (short) 0)) {
                throw new RuntimeException("OutputUnitType.HOST unit should be the only member of an OutputUnitsAffinityGroup");
            } else {
                objArr[i] = obj;
                this.b = (short) (this.b + 1);
                return;
            }
        }
        throw new IllegalArgumentException("value should not be null");
    }

    public final void b(int i, Object obj) {
        if (obj != null) {
            Object[] objArr = this.a;
            if (objArr[i] != null) {
                objArr[i] = obj;
                return;
            }
        }
        if (obj == null || this.a[i] != null) {
            if (obj == null) {
                Object[] objArr2 = this.a;
                if (objArr2[i] != null) {
                    objArr2[i] = null;
                    this.b = (short) (this.b - 1);
                }
            }
            return;
        }
        a(i, obj);
    }

    public final Object a(int i) {
        return this.a[i];
    }

    public final int b(int i) {
        if (i < 0 || i >= this.b) {
            short s = this.b;
            StringBuilder stringBuilder = new StringBuilder(30);
            stringBuilder.append("index=");
            stringBuilder.append(i);
            stringBuilder.append(", size=");
            stringBuilder.append(s);
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 <= i) {
            if (this.a[i3] != null) {
                i2++;
            }
            i3++;
        }
        return i3 - 1;
    }

    public final Object c(int i) {
        return a(b(i));
    }

    public final Object a() {
        Object[] objArr = this.a;
        if (objArr[3] != null) {
            return a(3);
        }
        if (objArr[0] != null) {
            return a(0);
        }
        if (objArr[1] != null) {
            return a(1);
        }
        if (objArr[2] != null) {
            return a(2);
        }
        return a(4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cqo cqo = (cqo) obj;
            if (this.b == cqo.b) {
                int i = 0;
                while (true) {
                    Object[] objArr = this.a;
                    if (i >= objArr.length) {
                        return true;
                    }
                    if (objArr[i] != cqo.a[i]) {
                        return false;
                    }
                    i++;
                }
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(super.toString());
        for (short s = (short) 0; s < this.b; s++) {
            int b = b(s);
            Object c = c(s);
            stringBuilder.append("\n\t");
            stringBuilder.append(cqo.d(b));
            stringBuilder.append(": ");
            stringBuilder.append(c.toString());
        }
        return stringBuilder.toString();
    }
}
