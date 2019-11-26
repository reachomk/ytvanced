package defpackage;

import android.util.SparseArray;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: ltx */
public final class ltx implements lue {
    private static final int[] b = new int[]{1, 2, 4, 8};
    public int a = 1;
    private final xqc c;
    private final SparseArray d = new SparseArray(b.length);
    private final xqf e;
    private final int f;

    public ltx(View view, View view2, View view3, View view4, View view5, len len) {
        xnz xnz = new xnz(view, 0, 8);
        xnz xnz2 = new xnz(view2, 0, 8);
        xqc a = ltx.a(view3, lfp.a);
        xqc a2 = ltx.a(view4, lfp.b);
        xnz xnz3 = new xnz(view5, (byte) 0);
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.watch_panel_playlist_header_height);
        this.c = xnz3;
        this.e = new lua(this, a2, len);
        this.f = dimensionPixelSize;
        this.d.put(1, xnz);
        this.d.put(2, xnz2);
        this.d.put(4, a);
        this.d.put(8, a2);
    }

    private static int a(int i, int i2, boolean z) {
        return !z ? i & (i2 ^ -1) : i | i2;
    }

    private static boolean a(int i, int i2) {
        return (i & i2) != 0;
    }

    public final void a(boolean z) {
        if (z) {
            b(4);
        } else {
            c(4);
        }
    }

    public final boolean a(int i) {
        return ltx.a(this.a, i);
    }

    public final void a() {
        a(this.a & 7, false, null);
    }

    public final void b(int i) {
        a(i, null);
    }

    public final void a(int i, xqa xqa) {
        a(ltx.a(this.a, i, true), true, xqa);
    }

    public final void c(int i) {
        b(i, null);
    }

    public final void b(int i, xqa xqa) {
        a(ltx.a(this.a, i, false), true, xqa);
    }

    public final void a(int i, boolean z, xqa xqa) {
        for (int i2 : b) {
            ((xqc) this.d.get(i2)).b(this.e);
        }
        int d = ltx.d(this.a);
        int d2 = ltx.d(i);
        int i3 = d ^ d2;
        if ((i3 & -4) == 0) {
            z = false;
        }
        this.a = i;
        if (z) {
            boolean z2 = false;
            int i4 = 0;
            for (int i5 : b) {
                if (ltx.a(3, i5)) {
                    ((xqc) this.d.get(i5)).a(ltx.a(d | d2, i5), false);
                } else if (ltx.a(i3, i5)) {
                    if (i5 == 8) {
                        xqc xqc = (xqc) this.d.get(8);
                        if (xqa == null) {
                            xqc.a(lfp.b);
                        } else {
                            xqc.a(xqa);
                        }
                    }
                    ((xqc) this.d.get(i5)).a(ltx.a(d2, i5), true);
                    ((xqc) this.d.get(i5)).a(this.e);
                    z2 = ltx.a(d2, i5);
                    i4 = ltx.a(d2, i5) ^ 1;
                } else {
                    ((xqc) this.d.get(i5)).a(ltx.a(d2, i5), false);
                }
            }
            if (z2) {
                this.c.a(false, false);
                this.c.a(true, true);
            } else if (i4 != 0) {
                this.c.a(true, false);
                this.c.a(false, true);
            } else {
                this.c.a(false, false);
            }
        } else {
            for (int i32 : b) {
                ((xqc) this.d.get(i32)).a(ltx.a(d2, i32), false);
            }
            this.c.a(false, false);
        }
        ((xqc) this.d.get(1)).d().setPadding(0, ltx.a(this.a, 2) ? this.f : 0, 0, 0);
    }

    private static int d(int i) {
        if (ltx.a(i, 8)) {
            return 8;
        }
        return (ltx.a(i, 4) && ltx.a(i, 2)) ? 6 : i & 3;
    }

    private static xqc a(View view, xqa xqa) {
        xnz xnz = new xnz(view, (byte) 0);
        xnz.a(xqa);
        return xnz;
    }
}
