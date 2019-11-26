package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* renamed from: akz */
final class akz {
    public ColorStateList a = null;
    private final CompoundButton b;
    private Mode c = null;
    private boolean d = false;
    private boolean e = false;
    private boolean f;

    akz(CompoundButton compoundButton) {
        this.b = compoundButton;
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e A:{Catch:{ all -> 0x007b }} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0028 */
    /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|(2:4|(2:6|7))|8|9|(2:11|(1:13))|14|(1:16)|17|(2:19|(1:21)(2:22|(1:24)))|25|26) */
    public final void a(android.util.AttributeSet r4, int r5) {
        /*
        r3 = this;
        r0 = r3.b;
        r0 = r0.getContext();
        r1 = defpackage.afy.aG;
        r2 = 0;
        r4 = r0.obtainStyledAttributes(r4, r1, r5, r2);
        r5 = 1;
        r0 = r4.hasValue(r5);	 Catch:{ all -> 0x007b }
        if (r0 == 0) goto L_0x0028;
    L_0x0014:
        r5 = r4.getResourceId(r5, r2);	 Catch:{ all -> 0x007b }
        if (r5 == 0) goto L_0x0028;
    L_0x001a:
        r0 = r3.b;	 Catch:{ NotFoundException -> 0x0028 }
        r1 = r0.getContext();	 Catch:{ NotFoundException -> 0x0028 }
        r5 = defpackage.agb.b(r1, r5);	 Catch:{ NotFoundException -> 0x0028 }
        r0.setButtonDrawable(r5);	 Catch:{ NotFoundException -> 0x0028 }
        goto L_0x0041;
    L_0x0028:
        r5 = r4.hasValue(r2);	 Catch:{ all -> 0x007b }
        if (r5 == 0) goto L_0x0041;
    L_0x002e:
        r5 = r4.getResourceId(r2, r2);	 Catch:{ all -> 0x007b }
        if (r5 == 0) goto L_0x0041;
    L_0x0034:
        r0 = r3.b;	 Catch:{ all -> 0x007b }
        r1 = r0.getContext();	 Catch:{ all -> 0x007b }
        r5 = defpackage.agb.b(r1, r5);	 Catch:{ all -> 0x007b }
        r0.setButtonDrawable(r5);	 Catch:{ all -> 0x007b }
    L_0x0041:
        r5 = 2;
        r0 = r4.hasValue(r5);	 Catch:{ all -> 0x007b }
        if (r0 == 0) goto L_0x0051;
    L_0x0048:
        r0 = r3.b;	 Catch:{ all -> 0x007b }
        r5 = r4.getColorStateList(r5);	 Catch:{ all -> 0x007b }
        defpackage.acu.a(r0, r5);	 Catch:{ all -> 0x007b }
    L_0x0051:
        r5 = 3;
        r0 = r4.hasValue(r5);	 Catch:{ all -> 0x007b }
        if (r0 == 0) goto L_0x0077;
    L_0x0058:
        r0 = r3.b;	 Catch:{ all -> 0x007b }
        r1 = -1;
        r5 = r4.getInt(r5, r1);	 Catch:{ all -> 0x007b }
        r1 = 0;
        r5 = defpackage.amu.a(r5, r1);	 Catch:{ all -> 0x007b }
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x007b }
        r2 = 21;
        if (r1 < r2) goto L_0x006e;
    L_0x006a:
        r0.setButtonTintMode(r5);	 Catch:{ all -> 0x007b }
        goto L_0x0077;
    L_0x006e:
        r1 = r0 instanceof defpackage.adn;	 Catch:{ all -> 0x007b }
        if (r1 == 0) goto L_0x0077;
    L_0x0072:
        r0 = (defpackage.adn) r0;	 Catch:{ all -> 0x007b }
        r0.a(r5);	 Catch:{ all -> 0x007b }
    L_0x0077:
        r4.recycle();
        return;
    L_0x007b:
        r5 = move-exception;
        r4.recycle();
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akz.a(android.util.AttributeSet, int):void");
    }

    /* Access modifiers changed, original: final */
    public final void a(ColorStateList colorStateList) {
        this.a = colorStateList;
        this.d = true;
        b();
    }

    /* Access modifiers changed, original: final */
    public final void a(Mode mode) {
        this.c = mode;
        this.e = true;
        b();
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        if (this.f) {
            this.f = false;
            return;
        }
        this.f = true;
        b();
    }

    private final void b() {
        Drawable b = acu.b(this.b);
        if (b == null) {
            return;
        }
        if (this.d || this.e) {
            b = st.d(b).mutate();
            if (this.d) {
                st.a(b, this.a);
            }
            if (this.e) {
                st.a(b, this.c);
            }
            if (b.isStateful()) {
                b.setState(this.b.getDrawableState());
            }
            this.b.setButtonDrawable(b);
        }
    }
}
