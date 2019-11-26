package defpackage;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Random;
import java.util.Set;

/* renamed from: mta */
public final class mta implements mub {
    public static final Set a = amuw.a("com.google.android.googlequicksearchbox", "com.google.android.apps.magazines", "com.google.android.apps.newsstand_exp", "com.google.android.apps.newsstanddev", "com.google.android.play.games");
    public final View b;
    public final mud c;
    public final Random d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final Handler i;
    public int j;
    public int k;
    public int l;
    public String m;
    public String n;
    public String o;
    public int p = 4;
    public arcm q = arcm.e;
    private final msh s;
    private final boolean t;
    private final boolean u;
    private final boolean v;
    private final Rect w;
    private final Rect x;
    private final Rect y;
    private final Rect z;

    public mta(View view, msh msh, mud mud) {
        Looper mainLooper = view.getContext().getMainLooper();
        Object random = new Random();
        this.b = (View) amqw.a((Object) view, (Object) "playerView cannot be null");
        this.s = (msh) amqw.a((Object) msh, (Object) "activityProxy cannot be null");
        this.c = (mud) amqw.a((Object) mud, (Object) "listener cannot be null");
        this.d = (Random) amqw.a(random, (Object) "random cannot be null");
        this.t = true;
        this.u = true;
        this.v = true;
        amqw.a(true, (Object) "normalMinimumPeriod must be >= 0");
        amqw.a(true, (Object) "normalMaximumPeriod must be >= 0");
        amqw.a(true, (Object) "recheckMinimumPeriod must be >= 0");
        amqw.a(true, (Object) "recheckMaximumPeriod must be >= 0");
        this.e = 1000;
        this.f = 3000;
        this.g = 300;
        this.h = 600;
        this.i = new Handler(mainLooper, new mtb(this));
        this.w = new Rect();
        this.x = new Rect();
        this.y = new Rect();
        this.z = new Rect();
        mty.a.b.f().a(bcut.a()).a(new msz(this));
    }

    public final void a() {
        this.i.removeMessages(0);
        this.i.sendEmptyMessage(0);
    }

    public final void b() {
        this.i.removeMessages(0);
    }

    public final String c() {
        if (!f()) {
            return this.m;
        }
        if (!d()) {
            return this.n;
        }
        if (e()) {
            return "";
        }
        return this.o;
    }

    public final boolean d() {
        float f = this.b.getResources().getDisplayMetrics().density;
        int width = (int) ((((float) this.b.getWidth()) / f) + 0.5f);
        int height = (int) ((((float) this.b.getHeight()) / f) + 0.5f);
        if (width >= 195 && height >= 105) {
            return true;
        }
        this.n = String.format("The YouTubePlayerView is %ddp wide (minimum is %ddp) and %ddp high (minimum is %ddp).", new Object[]{Integer.valueOf(width), Integer.valueOf(200), Integer.valueOf(height), Integer.valueOf(110)});
        return false;
    }

    public final boolean e() {
        View view = this.b;
        while (true) {
            int visibility = view.getVisibility();
            if (visibility != 0) {
                Object[] objArr = new Object[2];
                objArr[0] = view;
                String str = visibility != 0 ? visibility != 4 ? visibility != 8 ? "UNKNOWN" : "GONE" : "INVISIBLE" : "VISIBLE";
                objArr[1] = str;
                this.o = String.format("The view %s has visibility \"%s\".", objArr);
                return false;
            }
            view = view.getParent() instanceof View ? (View) view.getParent() : null;
            if (view == null) {
                return true;
            }
        }
    }

    public final boolean f() {
        Window c = this.s.c();
        if (!c.hasFeature(9)) {
            return a(null);
        }
        View findViewById = c.getDecorView().findViewById(16908290);
        if (findViewById == null) {
            return true;
        }
        return a(findViewById);
    }

    private final boolean a(View view) {
        mta.a(this.b, this.w);
        View view2 = this.b;
        while (view2 != view && (view2.getParent() instanceof ViewGroup)) {
            View view3 = (ViewGroup) view2.getParent();
            mta.a(view2, view3, this.w);
            if (this.t) {
                Rect rect = this.x;
                rect.set(0, 0, view3.getWidth(), view3.getHeight());
                if ((VERSION.SDK_INT < 21 && this.u) || (VERSION.SDK_INT >= 21 && view3.getClipToPadding())) {
                    rect.left += view3.getPaddingLeft();
                    rect.top += view3.getPaddingTop();
                    rect.right -= view3.getPaddingRight();
                    rect.bottom -= view3.getPaddingBottom();
                }
                rect.offset((int) view3.getTranslationX(), (int) view3.getTranslationY());
                if (!this.x.contains(this.w)) {
                    this.m = String.format("The YouTubePlayerView is not contained inside its ancestor %s. The distances between the ancestor's edges and that of the YouTubePlayerView is: %s (these should all be positive).", new Object[]{view3, mta.a(this.x, this.w)});
                    return false;
                }
            }
            int childCount = view3.getChildCount();
            for (int indexOfChild = view3.indexOfChild(view2) + 1; indexOfChild < childCount; indexOfChild++) {
                View childAt = view3.getChildAt(indexOfChild);
                if (childAt.getVisibility() == 0) {
                    if (!a(childAt, view3, this.w.left, this.w.top, this.w.right, this.w.bottom)) {
                        return false;
                    }
                }
            }
            view2 = view3;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0140  */
    private final boolean a(android.view.View r18, android.view.ViewGroup r19, int r20, int r21, int r22, int r23) {
        /*
        r17 = this;
        r7 = r17;
        r0 = r18;
        r1 = r20;
        r2 = r21;
        r3 = r22;
        r4 = r23;
        r5 = r7.y;
        r5.setEmpty();
        r5 = r7.y;
        r6 = r19;
        defpackage.mta.a(r0, r6, r5);
        r5 = r7.z;
        defpackage.mta.a(r0, r5);
        r5 = r7.z;
        r6 = r7.y;
        r6 = r6.left;
        r8 = r7.y;
        r8 = r8.top;
        r5.offset(r6, r8);
        r5 = r7.z;
        r5 = r5.intersects(r1, r2, r3, r4);
        r8 = 1;
        r9 = 0;
        if (r5 == 0) goto L_0x017e;
    L_0x0034:
        r5 = r7.y;
        r5.set(r1, r2, r3, r4);
        r1 = 2;
        r1 = new java.lang.Object[r1];
        r1[r9] = r0;
        r0 = r7.y;
        r2 = r7.z;
        r3 = r2.contains(r0);
        r4 = ".";
        if (r3 == 0) goto L_0x006e;
    L_0x004a:
        r0 = defpackage.mta.a(r2, r0);
        r2 = java.lang.String.valueOf(r0);
        r2 = r2.length();
        r3 = new java.lang.StringBuilder;
        r2 = r2 + 139;
        r3.<init>(r2);
        r2 = "YouTubePlayerView is completely covered, with the distance in px between each edge of the obscuring view and the YouTubePlayerView being: ";
        r3.append(r2);
        r3.append(r0);
        r3.append(r4);
        r0 = r3.toString();
        goto L_0x0173;
    L_0x006e:
        r3 = r0.contains(r2);
        if (r3 == 0) goto L_0x0098;
    L_0x0074:
        r0 = defpackage.mta.a(r0, r2);
        r2 = java.lang.String.valueOf(r0);
        r2 = r2.length();
        r3 = new java.lang.StringBuilder;
        r2 = r2 + 140;
        r3.<init>(r2);
        r2 = "The view is inside the YouTubePlayerView, with the distance in px between each edge of the obscuring view and the YouTubePlayerView being: ";
        r3.append(r2);
        r3.append(r0);
        r3.append(r4);
        r0 = r3.toString();
        goto L_0x0173;
    L_0x0098:
        r3 = "";
        r4 = r0.left;
        r5 = r2.left;
        if (r4 >= r5) goto L_0x00cf;
    L_0x00a0:
        r4 = r2.left;
        r5 = r0.right;
        if (r4 >= r5) goto L_0x00cf;
    L_0x00a6:
        r4 = new java.lang.Object[r8];
        r5 = r0.right;
        r6 = r2.left;
        r5 = r5 - r6;
        r5 = java.lang.Integer.valueOf(r5);
        r4[r9] = r5;
        r5 = "Left edge %d px left of YouTubePlayerView's right edge. ";
        r4 = java.lang.String.format(r5, r4);
        r4 = java.lang.String.valueOf(r4);
        r5 = r4.length();
        if (r5 != 0) goto L_0x00ca;
    L_0x00c3:
        r4 = new java.lang.String;
        r4.<init>(r3);
    L_0x00c8:
        r3 = r4;
        goto L_0x0102;
    L_0x00ca:
        r3 = r3.concat(r4);
        goto L_0x0102;
    L_0x00cf:
        r4 = r0.left;
        r5 = r2.right;
        if (r4 >= r5) goto L_0x0102;
    L_0x00d5:
        r4 = r2.right;
        r5 = r0.right;
        if (r4 >= r5) goto L_0x0102;
    L_0x00db:
        r4 = new java.lang.Object[r8];
        r5 = r2.right;
        r6 = r0.left;
        r5 = r5 - r6;
        r5 = java.lang.Integer.valueOf(r5);
        r4[r9] = r5;
        r5 = "Right edge %d px right of YouTubePlayerView's left edge. ";
        r4 = java.lang.String.format(r5, r4);
        r4 = java.lang.String.valueOf(r4);
        r5 = r4.length();
        if (r5 != 0) goto L_0x00fe;
    L_0x00f8:
        r4 = new java.lang.String;
        r4.<init>(r3);
        goto L_0x00c8;
    L_0x00fe:
        r3 = r3.concat(r4);
    L_0x0102:
        r4 = r0.top;
        r5 = r2.top;
        if (r4 >= r5) goto L_0x013a;
    L_0x0108:
        r4 = r2.top;
        r5 = r0.bottom;
        if (r4 >= r5) goto L_0x013a;
    L_0x010e:
        r3 = java.lang.String.valueOf(r3);
        r4 = new java.lang.Object[r8];
        r0 = r0.bottom;
        r2 = r2.top;
        r0 = r0 - r2;
        r0 = java.lang.Integer.valueOf(r0);
        r4[r9] = r0;
        r0 = "Top edge %d px above YouTubePlayerView's bottom edge. ";
        r0 = java.lang.String.format(r0, r4);
        r0 = java.lang.String.valueOf(r0);
        r2 = r0.length();
        if (r2 != 0) goto L_0x0135;
    L_0x012f:
        r0 = new java.lang.String;
        r0.<init>(r3);
        goto L_0x0173;
    L_0x0135:
        r0 = r3.concat(r0);
        goto L_0x0173;
    L_0x013a:
        r4 = r0.top;
        r5 = r2.bottom;
        if (r4 >= r5) goto L_0x0172;
    L_0x0140:
        r4 = r2.bottom;
        r5 = r0.bottom;
        if (r4 >= r5) goto L_0x0172;
    L_0x0146:
        r3 = java.lang.String.valueOf(r3);
        r4 = new java.lang.Object[r8];
        r2 = r2.bottom;
        r0 = r0.top;
        r2 = r2 - r0;
        r0 = java.lang.Integer.valueOf(r2);
        r4[r9] = r0;
        r0 = "Bottom edge %d px below YouTubePlayerView's top edge. ";
        r0 = java.lang.String.format(r0, r4);
        r0 = java.lang.String.valueOf(r0);
        r2 = r0.length();
        if (r2 != 0) goto L_0x016d;
    L_0x0167:
        r0 = new java.lang.String;
        r0.<init>(r3);
        goto L_0x0173;
    L_0x016d:
        r0 = r3.concat(r0);
        goto L_0x0173;
    L_0x0172:
        r0 = r3;
    L_0x0173:
        r1[r8] = r0;
        r0 = "The YouTubePlayerView is obscured by %s. %s.";
        r0 = java.lang.String.format(r0, r1);
        r7.m = r0;
        return r9;
    L_0x017e:
        r5 = r7.v;
        if (r5 != 0) goto L_0x01bf;
    L_0x0182:
        r5 = r0 instanceof android.view.ViewGroup;
        if (r5 == 0) goto L_0x01bf;
    L_0x0186:
        r10 = r0;
        r10 = (android.view.ViewGroup) r10;
        r0 = r7.y;
        r0 = r0.left;
        r11 = r1 - r0;
        r0 = r7.y;
        r0 = r0.top;
        r12 = r2 - r0;
        r0 = r7.y;
        r0 = r0.left;
        r13 = r3 - r0;
        r0 = r7.y;
        r0 = r0.top;
        r14 = r4 - r0;
        r15 = r10.getChildCount();
        r6 = 0;
    L_0x01a6:
        if (r6 >= r15) goto L_0x01bf;
    L_0x01a8:
        r1 = r10.getChildAt(r6);
        r0 = r17;
        r2 = r10;
        r3 = r11;
        r4 = r12;
        r5 = r13;
        r16 = r6;
        r6 = r14;
        r0 = r0.a(r1, r2, r3, r4, r5, r6);
        if (r0 == 0) goto L_0x01be;
    L_0x01bb:
        r6 = r16 + 1;
        goto L_0x01a6;
    L_0x01be:
        return r9;
    L_0x01bf:
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mta.a(android.view.View, android.view.ViewGroup, int, int, int, int):boolean");
    }

    private static String a(Rect rect, Rect rect2) {
        return String.format("left: %d, top: %d, right: %d, bottom: %d", new Object[]{Integer.valueOf(rect2.left - rect.left), Integer.valueOf(rect2.top - rect.top), Integer.valueOf(rect.right - rect2.right), Integer.valueOf(rect.bottom - rect2.bottom)});
    }

    private static void a(View view, ViewGroup viewGroup, Rect rect) {
        rect.offset(view.getLeft(), view.getTop());
        rect.offset(-viewGroup.getScrollX(), -viewGroup.getScrollY());
        rect.offset((int) viewGroup.getTranslationX(), (int) viewGroup.getTranslationY());
    }

    private static void a(View view, Rect rect) {
        rect.left = 0;
        rect.top = 0;
        rect.right = view.getWidth();
        rect.bottom = view.getHeight();
        rect.offset((int) view.getTranslationX(), (int) view.getTranslationY());
    }
}
