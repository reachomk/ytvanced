package defpackage;

/* renamed from: akno */
public final class akno {
    private static final akno b = new akno(0, 1);
    public final int a;

    public static final akno a(akor akor) {
        Object a = akor.a("rowData");
        if (a instanceof akno) {
            return (akno) a;
        }
        return b;
    }

    public akno(int i, int i2) {
        boolean z = true;
        amqw.a(i >= 0);
        if (i2 <= i) {
            z = false;
        }
        amqw.a(z);
        this.a = i2;
    }

    public final boolean a() {
        return this.a == 1;
    }
}
