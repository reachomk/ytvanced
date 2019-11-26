package defpackage;

/* renamed from: agyc */
public final class agyc extends RuntimeException {
    public final boolean a;
    public final agqf b;
    public final int c;

    private agyc(boolean z, String str, Exception exception, agqf agqf, int i) {
        super(str, exception);
        this.a = z;
        this.b = agqf;
        this.c = i;
    }

    public static agyc a(String str, Exception exception, agqf agqf, int i) {
        return new agyc(true, str, exception, agqf, i);
    }

    public static agyc b(String str, Exception exception, agqf agqf, int i) {
        return new agyc(false, str, exception, agqf, i);
    }
}
