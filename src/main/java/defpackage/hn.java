package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.TypedValue;

/* renamed from: hn */
public final class hn {
    public final float a;
    public final ColorStateList b;
    public final int c;
    public final ColorStateList d;
    public final float e;
    public final float f;
    public final float g;
    public Typeface h;
    private final int i;
    private final String j;
    private final int k;
    private boolean l = false;

    public hn(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, hk.a);
        this.a = obtainStyledAttributes.getDimension(hk.i, 0.0f);
        this.b = hl.a(context, obtainStyledAttributes, hk.f);
        hl.a(context, obtainStyledAttributes, hk.g);
        hl.a(context, obtainStyledAttributes, hk.h);
        this.c = obtainStyledAttributes.getInt(hk.j, 0);
        this.i = obtainStyledAttributes.getInt(hk.k, 1);
        int i2 = hk.l;
        if (!obtainStyledAttributes.hasValue(14)) {
            i2 = 10;
        }
        this.k = obtainStyledAttributes.getResourceId(i2, 0);
        this.j = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(hk.m, false);
        this.d = hl.a(context, obtainStyledAttributes, hk.b);
        this.e = obtainStyledAttributes.getFloat(hk.c, 0.0f);
        this.f = obtainStyledAttributes.getFloat(hk.d, 0.0f);
        this.g = obtainStyledAttributes.getFloat(hk.e, 0.0f);
        obtainStyledAttributes.recycle();
    }

    public final void a(Context context, hp hpVar) {
        b();
        int i = this.k;
        if (i == 0) {
            this.l = true;
        }
        if (this.l) {
            ((hg) hpVar).b(this.h);
            return;
        }
        try {
            Object hmVar = new hm(this, hpVar);
            aad.a(hmVar);
            if (context.isRestricted()) {
                hmVar.a(-4);
                return;
            }
            rz.a(context, i, new TypedValue(), 0, hmVar, false);
        } catch (NotFoundException unused) {
            this.l = true;
            hpVar.a();
        } catch (Exception unused2) {
            String valueOf = String.valueOf(this.j);
            String str = "Error loading font ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                str.concat(valueOf);
            }
            this.l = true;
            hpVar.a();
        }
    }

    public final Typeface a() {
        b();
        return this.h;
    }

    private final void b() {
        if (this.h == null) {
            String str = this.j;
            if (str != null) {
                this.h = Typeface.create(str, this.c);
            }
        }
        if (this.h == null) {
            int i = this.i;
            if (i == 1) {
                this.h = Typeface.SANS_SERIF;
            } else if (i == 2) {
                this.h = Typeface.SERIF;
            } else if (i != 3) {
                this.h = Typeface.DEFAULT;
            } else {
                this.h = Typeface.MONOSPACE;
            }
            this.h = Typeface.create(this.h, this.c);
        }
    }
}
