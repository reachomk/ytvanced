package defpackage;

/* renamed from: bcoj */
public class bcoj extends bckg {
    public final int a;
    public final int b;

    public bcoj(String str, int i, int i2) {
        super(str);
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public boolean c() {
        int i = this.a;
        return i == 3 || i == 4 || i == 5 || i == 6 || i == 8;
    }

    public final String getMessage() {
        StringBuilder stringBuilder = new StringBuilder(super.getMessage());
        stringBuilder.append(", ErrorCode=");
        stringBuilder.append(this.a);
        if (this.b != 0) {
            stringBuilder.append(", InternalErrorCode=");
            stringBuilder.append(this.b);
        }
        stringBuilder.append(", Retryable=");
        stringBuilder.append(c());
        return stringBuilder.toString();
    }
}
