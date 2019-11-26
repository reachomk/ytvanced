package defpackage;

/* renamed from: bcok */
public final class bcok extends bckn {
    private final int a;
    private final bcoj b;

    public bcok(String str, int i, int i2, int i3) {
        super(str);
        this.b = new bcoj(str, i, i2);
        this.a = i3;
    }

    public final String getMessage() {
        StringBuilder stringBuilder = new StringBuilder(this.b.getMessage());
        stringBuilder.append(", QuicDetailedErrorCode=");
        stringBuilder.append(this.a);
        return stringBuilder.toString();
    }

    public final int a() {
        return this.b.a;
    }

    public final int b() {
        return this.b.b;
    }

    public final boolean c() {
        return this.b.c();
    }

    public final int d() {
        return this.a;
    }
}
