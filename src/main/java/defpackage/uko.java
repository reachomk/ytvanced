package defpackage;

/* renamed from: uko */
final class uko implements Comparable {
    public final int a;
    public final ukl b;
    public boolean c = false;

    public uko(int i, ukl ukl) {
        this.a = i;
        this.b = ukl;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        uko uko = (uko) obj;
        int i = this.a;
        int i2 = uko.a;
        if (i < i2) {
            i2 = -1;
        } else if (i == i2) {
            return 0;
        } else {
            i2 = 1;
        }
        return i2;
    }
}
