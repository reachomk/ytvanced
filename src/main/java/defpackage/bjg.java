package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatImageView;
import android.text.TextUtils;
import android.view.View;
import java.util.HashSet;
import java.util.Set;

/* renamed from: bjg */
public final class bjg extends AppCompatImageView {
    public final bju a = new bju();
    public final Set b;
    public bjj c;
    private final bkb d = new bjf(this);
    private final bkb e = new bji();
    private String f;
    private int g;
    private boolean h;
    private boolean i;
    private boolean j;
    private bki k;
    private int l;

    public bjg(Context context) {
        boolean hasValue;
        super(context);
        boolean z = false;
        this.h = false;
        this.i = false;
        this.j = false;
        this.l = 1;
        this.b = new HashSet();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, bkl.a);
        if (!isInEditMode()) {
            hasValue = obtainStyledAttributes.hasValue(bkl.h);
            boolean hasValue2 = obtainStyledAttributes.hasValue(bkl.e);
            boolean hasValue3 = obtainStyledAttributes.hasValue(bkl.m);
            String string;
            if (hasValue && hasValue2) {
                throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
            } else if (hasValue) {
                int resourceId = obtainStyledAttributes.getResourceId(bkl.h, 0);
                if (resourceId != 0) {
                    a(resourceId);
                }
            } else if (hasValue2) {
                string = obtainStyledAttributes.getString(bkl.e);
                if (string != null) {
                    a(string);
                }
            } else if (hasValue3) {
                string = obtainStyledAttributes.getString(bkl.m);
                if (string != null) {
                    a(bjm.a(getContext(), string));
                }
            }
        }
        if (obtainStyledAttributes.getBoolean(bkl.b, false)) {
            this.i = true;
            this.j = true;
        }
        if (obtainStyledAttributes.getBoolean(bkl.f, false)) {
            this.a.b(-1);
        }
        if (obtainStyledAttributes.hasValue(bkl.j)) {
            b(obtainStyledAttributes.getInt(bkl.j, 1));
        }
        if (obtainStyledAttributes.hasValue(bkl.i)) {
            c(obtainStyledAttributes.getInt(bkl.i, -1));
        }
        if (obtainStyledAttributes.hasValue(bkl.l)) {
            a(obtainStyledAttributes.getFloat(bkl.l, 1.0f));
        }
        this.a.g = obtainStyledAttributes.getString(7);
        b(obtainStyledAttributes.getFloat(bkl.g, 0.0f));
        hasValue = obtainStyledAttributes.getBoolean(bkl.d, false);
        bju bju = this.a;
        if (bju.k != hasValue) {
            bju.k = hasValue;
            if (bju.a != null) {
                bju.a();
            }
        }
        if (obtainStyledAttributes.hasValue(bkl.c)) {
            bko bko = new bko(obtainStyledAttributes.getColor(bkl.c, 0));
            bmi bmi = new bmi("**");
            bph bph = new bph(bko);
            this.a.a(bmi, bkg.B, bph);
        }
        if (obtainStyledAttributes.hasValue(bkl.k)) {
            this.a.b(obtainStyledAttributes.getFloat(bkl.k, 1.0f));
        }
        obtainStyledAttributes.recycle();
        bju bju2 = this.a;
        if (bpg.a(getContext()) != 0.0f) {
            z = true;
        }
        bju2.d = Boolean.valueOf(z).booleanValue();
        e();
    }

    public final void setImageResource(int i) {
        f();
        super.setImageResource(i);
    }

    public final void setImageDrawable(Drawable drawable) {
        f();
        super.setImageDrawable(drawable);
    }

    public final void setImageBitmap(Bitmap bitmap) {
        f();
        super.setImageBitmap(bitmap);
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        Drawable drawable3 = this.a;
        if (drawable2 == drawable3) {
            super.invalidateDrawable(drawable3);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final Parcelable onSaveInstanceState() {
        bjh bjh = new bjh(super.onSaveInstanceState());
        bjh.a = this.f;
        bjh.b = this.g;
        bjh.c = this.a.i();
        bjh.d = this.a.f();
        bju bju = this.a;
        bjh.e = bju.g;
        bjh.f = bju.b.getRepeatMode();
        bjh.g = this.a.e();
        return bjh;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof bjh) {
            bjh bjh = (bjh) parcelable;
            super.onRestoreInstanceState(bjh.getSuperState());
            this.f = bjh.a;
            if (!TextUtils.isEmpty(this.f)) {
                a(this.f);
            }
            int i = bjh.b;
            this.g = i;
            if (i != 0) {
                a(i);
            }
            b(bjh.c);
            if (bjh.d) {
                c();
            }
            this.a.g = bjh.e;
            b(bjh.f);
            c(bjh.g);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onVisibilityChanged(View view, int i) {
        if (this.a == null) {
            return;
        }
        if (isShown()) {
            if (this.h) {
                if (isShown()) {
                    this.a.d();
                    e();
                } else {
                    this.h = true;
                }
                this.h = false;
            }
        } else if (g()) {
            d();
            this.h = true;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.j && this.i) {
            c();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        if (g()) {
            this.h = false;
            bju bju = this.a;
            bju.e.clear();
            bju.b.cancel();
            e();
            this.i = true;
        }
        super.onDetachedFromWindow();
    }

    private final void a(int i) {
        this.g = i;
        this.f = null;
        a(bjm.a(getContext(), i));
    }

    private final void a(String str) {
        this.f = str;
        this.g = 0;
        a(bjm.b(getContext(), str));
    }

    public final void a(bki bki) {
        this.c = null;
        this.a.b();
        f();
        bki.a(this.d);
        bki.c(this.e);
        this.k = bki;
    }

    private final void f() {
        bki bki = this.k;
        if (bki != null) {
            bki.b(this.d);
            this.k.d(this.e);
        }
    }

    public final void c() {
        if (isShown()) {
            this.a.c();
            e();
            return;
        }
        this.h = true;
    }

    public final void a(float f) {
        this.a.b.b = f;
    }

    private final void b(int i) {
        this.a.b.setRepeatMode(i);
    }

    private final void c(int i) {
        this.a.b(i);
    }

    private final boolean g() {
        return this.a.f();
    }

    public final void d() {
        this.i = false;
        this.h = false;
        bju bju = this.a;
        bju.e.clear();
        bju.b.g();
        e();
    }

    public final void b(float f) {
        this.a.a(f);
    }

    public final void buildDrawingCache(boolean z) {
        super.buildDrawingCache(z);
        if (getLayerType() == 1 && getDrawingCache(z) == null) {
            this.l = 2;
            e();
        }
    }

    /* JADX WARNING: Missing block: B:19:0x002f, code skipped:
            if (r1.m > 4) goto L_0x0031;
     */
    public final void e() {
        /*
        r5 = this;
        r0 = r5.l;
        r1 = r0 + -1;
        r2 = 0;
        if (r0 == 0) goto L_0x0036;
    L_0x0007:
        r0 = 2;
        r3 = 1;
        if (r1 == 0) goto L_0x0018;
    L_0x000b:
        if (r1 == r3) goto L_0x0014;
    L_0x000d:
        if (r1 == r0) goto L_0x0010;
    L_0x000f:
        goto L_0x0035;
    L_0x0010:
        r5.setLayerType(r3, r2);
        return;
    L_0x0014:
        r5.setLayerType(r0, r2);
        return;
    L_0x0018:
        r1 = r5.c;
        if (r1 != 0) goto L_0x001d;
    L_0x001c:
        goto L_0x0028;
    L_0x001d:
        r1 = r1.l;
        if (r1 == 0) goto L_0x0028;
    L_0x0021:
        r1 = android.os.Build.VERSION.SDK_INT;
        r4 = 28;
        if (r1 >= r4) goto L_0x0028;
    L_0x0027:
        goto L_0x0031;
    L_0x0028:
        r1 = r5.c;
        if (r1 == 0) goto L_0x0032;
    L_0x002c:
        r1 = r1.m;
        r4 = 4;
        if (r1 <= r4) goto L_0x0032;
    L_0x0031:
        r0 = 1;
    L_0x0032:
        r5.setLayerType(r0, r2);
    L_0x0035:
        return;
    L_0x0036:
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bjg.e():void");
    }

    static {
        bjg.class.getSimpleName();
    }
}
