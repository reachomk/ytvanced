package defpackage;

/* renamed from: uco */
public final class uco {
    public final String a;
    public final int b;
    public final /* synthetic */ ucl c;

    public /* synthetic */ uco(ucl ucl) {
        this.c = ucl;
        this.a = "";
        this.b = 0;
    }

    /* synthetic */ uco(ucl ucl, uco uco, String str) {
        this.c = ucl;
        if (uco.b != 0) {
            String str2 = uco.a;
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 1) + String.valueOf(str).length());
            stringBuilder.append(str2);
            stringBuilder.append('/');
            stringBuilder.append(str);
            str = stringBuilder.toString();
        }
        this.a = str;
        this.b = uco.b + 1;
    }
}
