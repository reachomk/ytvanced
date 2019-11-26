package defpackage;

/* renamed from: bbuo */
public final class bbuo extends bbmi {
    private final Object[] a;

    public bbuo(Object[] objArr) {
        this.a = objArr;
    }

    public final void a(bbmo bbmo) {
        bbnc bbun = new bbun(bbmo, this.a);
        bbmo.a(bbun);
        if (!bbun.c) {
            Object[] objArr = bbun.b;
            int length = objArr.length;
            for (int i = 0; i < length && !bbun.d; i++) {
                Object obj = objArr[i];
                if (obj == null) {
                    bbmo = bbun.a;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("The ");
                    stringBuilder.append(i);
                    stringBuilder.append("th element is null");
                    bbmo.a(new NullPointerException(stringBuilder.toString()));
                    return;
                }
                bbun.a.b_(obj);
            }
            if (!bbun.d) {
                bbun.a.a();
            }
        }
    }
}
