package defpackage;

/* renamed from: eix */
public class eix extends afjv {
    private static final afjs b = new afjs(640, 360);
    public afjs a = afjs.a;

    public final void a(int i, int i2) {
        if (i > 0 && i2 > 0) {
            afjs afjs = this.a;
            if (afjs.b != i || afjs.c != i2) {
                this.a = new afjs(i, i2);
                notifyObservers();
            }
        }
    }

    public final /* synthetic */ Object get() {
        afjs afjs = this.a;
        if (afjs.b > 0 && afjs.c > 0) {
            return afjs;
        }
        xtl.d("Suppressed bad viewport dimensions. Video quality may suffer!");
        return b;
    }
}
