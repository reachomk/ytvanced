package defpackage;

import java.util.List;
import java.util.Set;

/* renamed from: abnx */
public final class abnx {
    public static final int[] q;
    public static final int r;
    public static final int s;
    public long a;
    public int b;
    public int c;
    public Set d;
    public int e;
    public boolean f;
    public String g;
    public List h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int[] m;
    public boolean n;
    public int o;
    public final xsc p;
    public int t = 1;

    public abnx(xsc xsc) {
        this.p = xsc;
    }

    public final void a() {
        this.t = 16;
        this.d.add(athc.SPEECH);
    }

    public final void b() {
        int b = (int) (this.p.b() - this.a);
        if (this.b == -1) {
            this.b = b;
        }
        this.c = b;
    }

    public final int a(int i) {
        List list = this.h;
        return (i < -1 || i > (list != null ? list.size() - 1 : -1)) ? -1 : i;
    }

    static {
        int[] iArr = new int[]{0, 1, 2, 3, 4, 5, 5, 6, 6, 6, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8};
        q = iArr;
        int[] iArr2 = q;
        r = iArr[iArr2.length - 1] + 1;
        s = (iArr2.length * 100) - 1;
    }
}
