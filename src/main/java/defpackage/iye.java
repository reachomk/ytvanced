package defpackage;

/* renamed from: iye */
public final class iye {
    public final bcaa a;
    public final bcaa b;
    public final bcaa c;
    public final bcaa d;
    public final bcaa e;
    public final bcaa f;
    public final bcaa g;
    public final bcaa h;

    public iye(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8) {
        this.a = (bcaa) iye.a(bcaa, 1);
        this.b = (bcaa) iye.a(bcaa2, 2);
        this.c = (bcaa) iye.a(bcaa3, 3);
        this.d = (bcaa) iye.a(bcaa4, 4);
        this.e = (bcaa) iye.a(bcaa5, 5);
        this.f = (bcaa) iye.a(bcaa6, 6);
        this.g = (bcaa) iye.a(bcaa7, 7);
        this.h = (bcaa) iye.a(bcaa8, 8);
    }

    public static Object a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }
}
