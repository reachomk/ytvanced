package defpackage;

/* renamed from: bbog */
final class bbog implements bbnv {
    private final bbnr a;

    bbog(bbnr bbnr) {
        this.a = bbnr;
    }

    public final /* synthetic */ Object a(Object obj) {
        Object[] objArr = (Object[]) obj;
        int length = objArr.length;
        if (length == 2) {
            return this.a.a(objArr[0], objArr[1]);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Array of size 2 expected but got ");
        stringBuilder.append(length);
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
