package defpackage;

/* renamed from: epe */
public final class epe {
    public final String a;
    public final String[] b;

    public epe(String str) {
        this.a = (String) amqw.a((Object) str);
        this.b = str.split("\\|");
    }

    public final String a() {
        try {
            return this.b[0];
        } catch (IndexOutOfBoundsException unused) {
            return "";
        }
    }

    public final int b() {
        try {
            return Integer.parseInt(this.b[1]);
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return -1;
        }
    }

    public final int c() {
        try {
            return Integer.parseInt(this.b[2]);
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return -1;
        }
    }
}
