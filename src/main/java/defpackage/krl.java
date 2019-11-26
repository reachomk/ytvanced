package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: krl */
public abstract class krl extends kqv {
    public final Context d;
    public final vmn e;
    public final wby f;
    public final View g;
    public final View h;
    public final View i;
    public long j;
    private final vod k;
    private final View l;

    public krl(Context context, aaas aaas, vod vod, vmn vmn, tpu tpu, dwk dwk, View view, View view2, View view3, View view4, View view5) {
        super(aaas, tpu, dwk, view4);
        this.d = (Context) amqw.a((Object) context);
        this.k = (vod) amqw.a((Object) vod);
        this.e = (vmn) amqw.a((Object) vmn);
        this.g = (View) amqw.a((Object) view);
        this.h = (View) amqw.a((Object) view2);
        this.i = (View) amqw.a((Object) view3);
        this.l = view5;
        this.f = new wby(view2, new krk(this), new krn(this));
        this.f.a(view3);
        if (view5 != null) {
            this.f.a(view5);
        }
        view.addOnLayoutChangeListener(new krm(this));
    }

    public abstract void a(View view, View view2);

    public abstract void b(View view, MotionEvent motionEvent, List list);

    public abstract void c(View view, MotionEvent motionEvent, List list);

    @Deprecated
    public abstract ajyn d();

    public abstract boolean e();

    public final void a(acvx acvx, Object obj, String str, apxu[] apxuArr, ajyl ajyl, long j, aojc aojc, byte[] bArr) {
        this.j = j;
        super.a(acvx, obj, str, apxuArr, ajyl, aojc, bArr);
        if (this.a.a()) {
            kro c = c();
            if (c.b == 0) {
                c.b = System.currentTimeMillis();
                return;
            }
            return;
        }
        d().d();
    }

    public static eza a(Context context) {
        Resources resources = context.getResources();
        int a = xwe.a(context, R.attr.adSeparator1, 0);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.line_separator_height);
        TypedValue typedValue = new TypedValue();
        return new eza(context.getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true) ? ra.a(context, typedValue.resourceId) : null, a, dimensionPixelSize);
    }

    /* Access modifiers changed, original: protected */
    public boolean a(View view, MotionEvent motionEvent, List list) {
        view = this.l;
        if (view == null || !list.contains(view)) {
            return false;
        }
        if (this.l.getVisibility() == 0) {
            this.l.performClick();
        }
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Missing block: B:7:0x001d, code skipped:
            if (d().c() != false) goto L_0x0038;
     */
    public final void b(defpackage.apxu r7) {
        /*
        r6 = this;
        r0 = r6.b;
        if (r0 == 0) goto L_0x003b;
    L_0x0004:
        r1 = r6.k;
        r0 = r1.a(r0);
        if (r0 == 0) goto L_0x000d;
    L_0x000c:
        goto L_0x003b;
    L_0x000d:
        r0 = r6.a;
        r0 = r0.a();
        if (r0 != 0) goto L_0x0020;
    L_0x0015:
        r0 = r6.d();
        r0 = r0.c();
        if (r0 == 0) goto L_0x003b;
    L_0x001f:
        goto L_0x0038;
    L_0x0020:
        r0 = r6.c();
        r1 = r0.b;
        r3 = 0;
        r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r5 <= 0) goto L_0x003b;
    L_0x002c:
        r3 = r0.a;
        r1 = r1 + r3;
        r3 = java.lang.System.currentTimeMillis();
        r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r0 <= 0) goto L_0x0038;
    L_0x0037:
        return;
    L_0x0038:
        r6.a(r7);
    L_0x003b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.krl.b(apxu):void");
    }

    /* Access modifiers changed, original: protected|final */
    public final kro c() {
        return (kro) this.a.a(this.c, kro.class, "PSPState", new krp(this), this.b);
    }
}
