package defpackage;

/* renamed from: bant */
abstract class bant implements baoa {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            baoa baoa = (baoa) obj;
            return a() == baoa.a() && b() == baoa.b();
        }
    }

    public final String toString() {
        int a = a();
        long b = b();
        StringBuilder stringBuilder = new StringBuilder(35);
        stringBuilder.append("P(");
        stringBuilder.append(a);
        stringBuilder.append("|");
        stringBuilder.append(b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    /* synthetic */ bant() {
    }
}
