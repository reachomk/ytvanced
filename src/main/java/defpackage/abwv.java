package defpackage;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

/* renamed from: abwv */
public final class abwv extends abwi implements abws {
    public final abwt s;
    public ajwv t;
    public Editable u;
    private final View v;
    private final EditText w;
    private final boolean x;

    public abwv(Context context, akkq akkq, akvz akvz, akvp akvp, aaas aaas, acwa acwa, abrq abrq, abru abru, abrj abrj, abrf abrf, xwb xwb, akti akti, abqz abqz, abwt abwt, akpi akpi, alck alck, View view, boolean z) {
        int i = z ^ 1;
        super(context, akkq, akvz, akvp, aaas, acwa, abrq, abru, abrf, akti, abqz, xwb, akpi, alck, view, true, i);
        this.s = abwt;
        boolean z2 = z;
        this.x = z2;
        abwt abwt2 = this.s;
        if (!abwt2.c.contains(this)) {
            abwt2.c.add(this);
        }
        this.w = (EditText) amqw.a(e());
        this.v = (View) amqw.a(h());
        this.w.setOnClickListener(new abwu(this, z2));
        this.w.setFocusable(false);
        this.v.setVisibility(0);
    }

    public final void a(abrl abrl) {
        this.i = abrl;
        abrl abrl2 = this.s;
        abrl2.d = abrl;
        abwi abwi = abrl2.a;
        if (abwi != null) {
            abwi.a(abrl2);
        }
    }

    public final void v() {
        super.v();
        this.u = null;
    }

    public final void a(ajwv ajwv) {
        super.a(ajwv);
        this.t = ajwv;
    }

    public final void b() {
        super.b();
        this.s.b.setText(null);
        this.u = null;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(ajxc ajxc) {
        if (this.x) {
            c(false);
        } else {
            super.a(ajxc);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(auwl auwl) {
        if (this.x) {
            b(false);
        } else {
            super.a(auwl);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean q() {
        return this.x;
    }

    /* Access modifiers changed, original: protected|final */
    public final Spanned s() {
        if (TextUtils.isEmpty(this.u)) {
            return this.l;
        }
        return this.u;
    }

    public final void a(Editable editable) {
        if (this.s != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(editable);
            this.v.setVisibility(0);
            this.u = spannableStringBuilder;
            if (this.x) {
                this.w.setHint(s());
            } else {
                this.w.setText(editable);
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void t() {
        abwt abwt = this.s;
        if (abwt != null) {
            abwt.a(this.t, this.u, true, this.x);
            h().setVisibility(8);
        }
    }
}
