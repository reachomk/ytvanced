package defpackage;

/* renamed from: cd */
final class cd extends by {
    public static final long serialVersionUID = 1405488568664762222L;

    cd(bx bxVar, bx bxVar2) {
        super(bxVar, bxVar2);
    }

    public final boolean a(bz bzVar) {
        return this.a.a(bzVar) || this.b.a(bzVar);
    }

    public final String toString() {
        String obj = this.a.toString();
        String obj2 = this.b.toString();
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(obj).length() + 4) + String.valueOf(obj2).length());
        stringBuilder.append(obj);
        stringBuilder.append(" or ");
        stringBuilder.append(obj2);
        return stringBuilder.toString();
    }
}
