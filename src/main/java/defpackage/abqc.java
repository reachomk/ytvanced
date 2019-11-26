package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.text.style.TextAppearanceSpan;
import android.widget.TextView;

/* renamed from: abqc */
public final class abqc implements abpt, akng {
    public abxg a;
    private abpo b;

    public final void bF_() {
    }

    public final void d_(int i, int i2) {
    }

    public final void f_(int i, int i2) {
    }

    public final void g_(int i, int i2) {
    }

    public final void a(abpo abpo) {
        if (abpo != null) {
            this.b = abpo;
            abpo.a((abpt) this);
        }
    }

    public final void a(auwl auwl) {
        if (auwl != null && this.b != null) {
            arml arml;
            abxg abxg = this.a;
            int i = 0;
            abxg.b = false;
            Context context = abxg.c.getContext();
            arml arml2 = null;
            if ((auwl.a & 1) != 0) {
                arml = auwl.d;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ajqy.a(arml));
            StyleSpan[] styleSpanArr = (StyleSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), StyleSpan.class);
            int length = styleSpanArr.length;
            while (i < length) {
                StyleSpan styleSpan = styleSpanArr[i];
                if (styleSpan.getStyle() == 1) {
                    spannableStringBuilder.setSpan(new TextAppearanceSpan(context, abxg.a.a(8)), spannableStringBuilder.getSpanStart(styleSpan), spannableStringBuilder.getSpanEnd(styleSpan), 33);
                }
                i++;
            }
            abxg.d.setText(spannableStringBuilder);
            auwt auwt = auwl.e;
            if (auwt == null) {
                auwt = auwt.c;
            }
            if ((auwt.a & 1) != 0) {
                abxg.b = true;
                TextView textView = abxg.e;
                auwt = auwl.e;
                if (auwt == null) {
                    auwt = auwt.c;
                }
                auwr auwr = auwt.b;
                if (auwr == null) {
                    auwr = auwr.c;
                }
                if ((auwr.a & 1) != 0) {
                    auwt auwt2 = auwl.e;
                    if (auwt2 == null) {
                        auwt2 = auwt.c;
                    }
                    auwr auwr2 = auwt2.b;
                    if (auwr2 == null) {
                        auwr2 = auwr.c;
                    }
                    arml2 = auwr2.b;
                    if (arml2 == null) {
                        arml2 = arml.f;
                    }
                }
                textView.setText(ajqy.a(arml2));
            }
            this.a.a(this.b.a.isEmpty());
        }
    }

    public final void b() {
        abxg abxg = this.a;
        if (abxg != null) {
            abxg.a(false);
        }
    }

    public final void e_(int i, int i2) {
        b();
    }
}
