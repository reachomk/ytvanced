package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.youtube.R;
import defpackage.bdx;
import defpackage.bdy;
import defpackage.bed;
import defpackage.sd;

public class Preference implements Comparable {
    private int a;
    private CharSequence b;
    private boolean c;
    private boolean d;
    public Context e;
    public CharSequence f;
    public String g;
    public String h;
    public boolean i;
    public bdy j;
    private boolean k;

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this.a = Integer.MAX_VALUE;
        this.c = true;
        this.d = true;
        this.k = true;
        this.i = true;
        bdx bdx = new bdx(this);
        this.e = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bed.F, i, 0);
        sd.a(obtainStyledAttributes, bed.aj, bed.S, 0);
        this.g = sd.b(obtainStyledAttributes, bed.am, bed.U);
        this.f = sd.c(obtainStyledAttributes, bed.au, bed.ac);
        this.b = sd.c(obtainStyledAttributes, bed.at, bed.ab);
        this.a = sd.a(obtainStyledAttributes, bed.ao, bed.W);
        this.h = sd.b(obtainStyledAttributes, bed.ai, bed.R);
        sd.a(obtainStyledAttributes, bed.an, bed.V, (int) R.layout.preference);
        sd.a(obtainStyledAttributes, bed.av, bed.ad, 0);
        this.c = sd.a(obtainStyledAttributes, bed.ah, bed.Q, true);
        this.d = sd.a(obtainStyledAttributes, bed.aq, bed.Y, true);
        sd.a(obtainStyledAttributes, bed.ap, bed.X, true);
        sd.b(obtainStyledAttributes, bed.af, bed.P);
        sd.a(obtainStyledAttributes, bed.M, bed.M, this.d);
        sd.a(obtainStyledAttributes, bed.N, bed.N, this.d);
        if (obtainStyledAttributes.hasValue(bed.ae)) {
            a(obtainStyledAttributes, bed.ae);
        } else if (obtainStyledAttributes.hasValue(bed.O)) {
            a(obtainStyledAttributes, bed.O);
        }
        sd.a(obtainStyledAttributes, bed.ar, bed.Z, true);
        if (obtainStyledAttributes.hasValue(bed.as)) {
            sd.a(obtainStyledAttributes, bed.as, bed.aa, true);
        }
        sd.a(obtainStyledAttributes, bed.ak, bed.T, false);
        sd.a(obtainStyledAttributes, bed.al, bed.al, true);
        sd.a(obtainStyledAttributes, bed.ag, bed.ag, false);
        obtainStyledAttributes.recycle();
    }

    /* Access modifiers changed, original: protected */
    public Object a(TypedArray typedArray, int i) {
        return null;
    }

    /* Access modifiers changed, original: protected */
    public void a() {
    }

    public void a(boolean z) {
    }

    public void b() {
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, sd.a(context, (int) R.attr.preferenceStyle, 16842894));
    }

    public CharSequence d() {
        bdy bdy = this.j;
        if (bdy == null) {
            return this.b;
        }
        return bdy.a(this);
    }

    public boolean f() {
        return this.c && this.k && this.i;
    }

    public final void a(bdy bdy) {
        this.j = bdy;
        b();
    }

    public void a(View view) {
        g();
    }

    public final void g() {
        if (f() && this.d) {
            a();
        }
    }

    public boolean c() {
        return f() ^ 1;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        CharSequence charSequence = this.f;
        if (!TextUtils.isEmpty(charSequence)) {
            stringBuilder.append(charSequence);
            stringBuilder.append(' ');
        }
        charSequence = d();
        if (!TextUtils.isEmpty(charSequence)) {
            stringBuilder.append(charSequence);
            stringBuilder.append(' ');
        }
        if (stringBuilder.length() > 0) {
            stringBuilder.setLength(stringBuilder.length() - 1);
        }
        return stringBuilder.toString();
    }

    public final /* synthetic */ int compareTo(Object obj) {
        int i;
        Preference preference = (Preference) obj;
        int i2 = this.a;
        int i3 = preference.a;
        if (i2 == i3) {
            CharSequence charSequence = this.f;
            CharSequence charSequence2 = preference.f;
            if (charSequence == charSequence2) {
                i = 0;
            } else if (charSequence == null) {
                i = 1;
            } else if (charSequence2 != null) {
                return charSequence.toString().compareToIgnoreCase(preference.f.toString());
            } else {
                i = -1;
            }
        } else {
            i = i2 - i3;
        }
        return i;
    }
}
