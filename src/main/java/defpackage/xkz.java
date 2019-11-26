package defpackage;

/* renamed from: xkz */
public final class xkz extends bckg {
    private final int a;

    xkz(int i) {
        StringBuilder stringBuilder = new StringBuilder("Connection timeout out");
        if (i == 6) {
            stringBuilder.append(": connection timeout");
        } else if (i == 4) {
            stringBuilder.append(": read timeout");
        }
        super(stringBuilder.toString());
        this.a = i;
    }

    public final int b() {
        return -1;
    }

    public final boolean c() {
        return true;
    }

    public final int a() {
        return this.a;
    }
}
