package defpackage;

/* renamed from: amya */
final class amya extends amyt {
    public Object[] a = new Object[8];
    public int b = 0;

    amya() {
    }

    public final int a() {
        return this.b;
    }

    public final amyj a(int i) {
        if (i < this.b) {
            return (amyj) this.a[i + i];
        }
        throw new IndexOutOfBoundsException();
    }

    public final Object b(int i) {
        if (i < this.b) {
            return this.a[(i + i) + 1];
        }
        throw new IndexOutOfBoundsException();
    }

    public final int a(amyj amyj) {
        for (int i = 0; i < this.b; i++) {
            if (this.a[i + i].equals(amyj)) {
                return i;
            }
        }
        return -1;
    }

    public final Object b(amyj amyj) {
        int a = a(amyj);
        return a != -1 ? amyj.a(this.a[(a + a) + 1]) : null;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Metadata{");
        for (int i = 0; i < this.b; i++) {
            stringBuilder.append(" '");
            stringBuilder.append(a(i));
            stringBuilder.append("': ");
            stringBuilder.append(b(i));
        }
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }
}
