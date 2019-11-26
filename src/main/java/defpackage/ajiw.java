package defpackage;

import java.util.Locale;

/* renamed from: ajiw */
public final class ajiw {
    public final int a;
    public final ajje b;
    public final ajja c;

    public final String toString() {
        return String.format(Locale.getDefault(), "id: %d text: %s settings: %s", new Object[]{Integer.valueOf(this.a), this.b.toString(), this.c.toString()});
    }

    /* synthetic */ ajiw(int i, ajje ajje, ajja ajja) {
        this.a = i;
        this.b = ajje;
        this.c = ajja;
    }
}
