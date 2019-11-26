package defpackage;

/* renamed from: pbi */
public final class pbi {
    public static final pbi a = new pbi(320, 50, "320x50_mb");
    public final int b;
    public final int c;
    public final String d;

    public pbi(int i, int i2) {
        Object obj;
        Object valueOf = i != -1 ? String.valueOf(i) : "FULL";
        if (i2 == -2) {
            obj = "AUTO";
        } else {
            obj = String.valueOf(i2);
        }
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 4) + String.valueOf(obj).length());
        stringBuilder.append(valueOf);
        stringBuilder.append("x");
        stringBuilder.append(obj);
        stringBuilder.append("_as");
        this(i, i2, stringBuilder.toString());
    }

    pbi(int i, int i2, String str) {
        StringBuilder stringBuilder;
        if (i < 0 && i != -1 && i != -3) {
            stringBuilder = new StringBuilder(37);
            stringBuilder.append("Invalid width for AdSize: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (i2 >= 0 || i2 == -2 || i2 == -4) {
            this.b = i;
            this.c = i2;
            this.d = str;
        } else {
            stringBuilder = new StringBuilder(38);
            stringBuilder.append("Invalid height for AdSize: ");
            stringBuilder.append(i2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pbi) {
            pbi pbi = (pbi) obj;
            return this.b == pbi.b && this.c == pbi.c && this.d.equals(pbi.d);
        }
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return this.d;
    }

    static {
        pbi pbi = new pbi(468, 60, "468x60_as");
        pbi = new pbi(320, 100, "320x100_as");
        pbi = new pbi(728, 90, "728x90_as");
        pbi = new pbi(300, 250, "300x250_as");
        pbi = new pbi(160, 600, "160x600_as");
        pbi = new pbi(-1, -2, "smart_banner");
        pbi = new pbi(-3, -4, "fluid");
        pbi = new pbi(50, 50, "50x50_mb");
        pbi = new pbi(-3, 0, "search_v2");
    }
}
