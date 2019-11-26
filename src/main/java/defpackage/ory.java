package defpackage;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ory */
final class ory {
    public static final int a = ory.a(2, 2, 2, 0);
    public static final int b = ory.a(0, 0, 0, 0);
    public static final int[] c = new int[]{0, 0, 0, 0, 0, 2, 0};
    public static final int[] d;
    public static final int[] e;
    private static final int v = ory.a(0, 0, 0, 3);
    private int A;
    private int B;
    public final List f = new ArrayList();
    public final SpannableStringBuilder g = new SpannableStringBuilder();
    public boolean h;
    public boolean i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    private int w;
    private int x;
    private int y;
    private int z;

    public ory() {
        b();
    }

    public final boolean a() {
        boolean z = true;
        if (this.h) {
            if (!this.f.isEmpty()) {
                z = false;
            } else if (this.g.length() == 0) {
                return z;
            } else {
                return false;
            }
        }
        return z;
    }

    public final void b() {
        c();
        this.h = false;
        this.i = false;
        this.j = 4;
        this.k = false;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = 15;
        this.p = true;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        int i = b;
        this.t = i;
        this.z = a;
        this.B = i;
    }

    public final void c() {
        this.f.clear();
        this.g.clear();
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.A = -1;
        this.u = 0;
    }

    public final void a(int i, int i2) {
        this.t = i;
        this.q = i2;
    }

    public final void a(boolean z, boolean z2) {
        if (this.w != -1) {
            if (!z) {
                this.g.setSpan(new StyleSpan(2), this.w, this.g.length(), 33);
                this.w = -1;
            }
        } else if (z) {
            this.w = this.g.length();
        }
        if (this.x != -1) {
            if (!z2) {
                this.g.setSpan(new UnderlineSpan(), this.x, this.g.length(), 33);
                this.x = -1;
            }
        } else if (z2) {
            this.x = this.g.length();
        }
    }

    public final void b(int i, int i2) {
        if (this.y != -1) {
            int i3 = this.z;
            if (i3 != i) {
                this.g.setSpan(new ForegroundColorSpan(i3), this.y, this.g.length(), 33);
            }
        }
        if (i != a) {
            this.y = this.g.length();
            this.z = i;
        }
        if (this.A != -1) {
            i = this.B;
            if (i != i2) {
                this.g.setSpan(new BackgroundColorSpan(i), this.A, this.g.length(), 33);
            }
        }
        if (i2 != b) {
            this.A = this.g.length();
            this.B = i2;
        }
    }

    public final void a(char c) {
        if (c == 10) {
            this.f.add(d());
            this.g.clear();
            if (this.w != -1) {
                this.w = 0;
            }
            if (this.x != -1) {
                this.x = 0;
            }
            if (this.y != -1) {
                this.y = 0;
            }
            if (this.A != -1) {
                this.A = 0;
            }
            while (true) {
                if ((this.p && this.f.size() >= this.o) || this.f.size() >= 15) {
                    this.f.remove(0);
                } else {
                    return;
                }
            }
        }
        this.g.append(c);
    }

    public final SpannableString d() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.g);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.w != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.w, length, 33);
            }
            if (this.x != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.x, length, 33);
            }
            if (this.y != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.z), this.y, length, 33);
            }
            if (this.A != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.B), this.A, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public static int a(int i, int i2, int i3) {
        return ory.a(i, i2, i3, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0030  */
    public static int a(int r4, int r5, int r6, int r7) {
        /*
        r0 = 4;
        defpackage.oxz.a(r4, r0);
        defpackage.oxz.a(r5, r0);
        defpackage.oxz.a(r6, r0);
        defpackage.oxz.a(r7, r0);
        r0 = 0;
        r1 = 1;
        r2 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        if (r7 == 0) goto L_0x001b;
    L_0x0013:
        if (r7 == r1) goto L_0x001b;
    L_0x0015:
        r3 = 2;
        if (r7 == r3) goto L_0x0020;
    L_0x0018:
        r3 = 3;
        if (r7 == r3) goto L_0x001e;
    L_0x001b:
        r7 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        goto L_0x0022;
    L_0x001e:
        r7 = 0;
        goto L_0x0022;
    L_0x0020:
        r7 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
    L_0x0022:
        if (r4 <= r1) goto L_0x0027;
    L_0x0024:
        r4 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        goto L_0x0028;
    L_0x0027:
        r4 = 0;
    L_0x0028:
        if (r5 <= r1) goto L_0x002d;
    L_0x002a:
        r5 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        goto L_0x002e;
    L_0x002d:
        r5 = 0;
    L_0x002e:
        if (r6 <= r1) goto L_0x0032;
    L_0x0030:
        r0 = 255; // 0xff float:3.57E-43 double:1.26E-321;
    L_0x0032:
        r4 = android.graphics.Color.argb(r7, r4, r5, r0);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ory.a(int, int, int, int):int");
    }

    static {
        r4 = new int[7];
        int i = b;
        r4[0] = i;
        int i2 = v;
        r4[1] = i2;
        r4[2] = i;
        r4[3] = i;
        r4[4] = i2;
        r4[5] = i;
        r4[6] = i;
        d = r4;
        e = new int[]{i, i, i, i, i, i2, i2};
    }
}
