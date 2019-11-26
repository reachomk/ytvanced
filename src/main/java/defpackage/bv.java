package defpackage;

/* renamed from: bv */
final class bv extends by {
    public static final long serialVersionUID = 7766999779862263523L;

    bv(bx bxVar, bx bxVar2) {
        super(bxVar, bxVar2);
    }

    public final boolean a(bz bzVar) {
        return this.a.a(bzVar) && this.b.a(bzVar);
    }

    public final String toString() {
        String obj = this.a.toString();
        String obj2 = this.b.toString();
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(obj).length() + 5) + String.valueOf(obj2).length());
        stringBuilder.append(obj);
        stringBuilder.append(" and ");
        stringBuilder.append(obj2);
        return stringBuilder.toString();
    }
}
