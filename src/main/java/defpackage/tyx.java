package defpackage;

/* renamed from: tyx */
public final class tyx {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public tyx() {
        this(false, false, false);
    }

    private tyx(boolean z, boolean z2, boolean z3) {
        boolean z4 = true;
        if (!(z || z2)) {
            z4 = false;
        }
        this.a = z4;
        this.b = z2;
        this.c = z3;
    }

    public /* synthetic */ tyx(boolean z, boolean z2, boolean z3, byte b) {
        this(z, z2, z3);
    }
}
