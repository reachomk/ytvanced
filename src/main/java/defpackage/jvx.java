package defpackage;

/* renamed from: jvx */
final class jvx {
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;

    /* synthetic */ jvx(String str, int i, int i2, String str2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        String valueOf = String.valueOf(i);
        String valueOf2 = String.valueOf(i2);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder stringBuilder = new StringBuilder((((length + 3) + length2) + String.valueOf(valueOf2).length()) + String.valueOf(str2).length());
        stringBuilder.append(str);
        str = "|";
        stringBuilder.append(str);
        stringBuilder.append(valueOf);
        stringBuilder.append(str);
        stringBuilder.append(valueOf2);
        stringBuilder.append(str);
        stringBuilder.append(str2);
        this.e = stringBuilder.toString();
    }

    /* synthetic */ jvx(epe epe) {
        this.a = epe.a();
        this.b = epe.b();
        this.c = epe.c();
        StringBuilder stringBuilder = new StringBuilder();
        int i = 3;
        while (true) {
            String[] strArr = epe.b;
            if (i < strArr.length) {
                stringBuilder.append(strArr[i]);
                i++;
            } else {
                this.d = stringBuilder.toString();
                this.e = epe.a;
                return;
            }
        }
    }
}
