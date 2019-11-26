package defpackage;

import android.widget.CompoundButton.OnCheckedChangeListener;

/* renamed from: hdp */
public final class hdp {
    public final OnCheckedChangeListener a;
    public hdr b;
    public aakj c;
    public hds d;
    public boolean e = true;
    public boolean f = true;
    public boolean g = false;

    public hdp(OnCheckedChangeListener onCheckedChangeListener) {
        this.a = onCheckedChangeListener;
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        this.g = z;
        hdr hdr = this.b;
        if (hdr != null) {
            hdr.a(z);
        }
    }

    /* Access modifiers changed, original: final */
    public final void b(boolean z) {
        this.f = z;
        hdr hdr = this.b;
        if (hdr != null) {
            hdr.b(!z ? 8 : 0);
        }
    }

    /* Access modifiers changed, original: final */
    public final void c(boolean z) {
        this.e = z;
        hdr hdr = this.b;
        if (hdr != null) {
            hdr.a(!z ? 8 : 0);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(aakj aakj, hds hds) {
        this.c = aakj;
        this.d = hds;
        hdr hdr = this.b;
        if (hdr != null && aakj != null && hds != null) {
            hdr.a(aakj, hds);
        }
    }
}
