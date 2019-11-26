package defpackage;

/* renamed from: coa */
public final class coa {
    public final Object a;
    public final Object b;

    public coa(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 24) + valueOf2.length());
        stringBuilder.append("Diff{mPrevious=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", mNext=");
        stringBuilder.append(valueOf2);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
