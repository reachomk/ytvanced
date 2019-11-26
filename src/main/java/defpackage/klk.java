package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: klk */
public final class klk extends fan {
    public TextView a;
    public boolean b;
    private final Context c;
    private final aaas g;
    private final akvp h;
    private TextView i;

    public klk(ViewStub viewStub, Context context, aaas aaas, akvp akvp) {
        super(viewStub);
        this.c = context;
        this.g = (aaas) amqw.a((Object) aaas);
        this.h = akvp;
    }

    public final void a(apdz apdz) {
        a(apdz, null);
    }

    public final void a(apdz apdz, acvx acvx) {
        if (apdz == null) {
            this.d.setVisibility(8);
            return;
        }
        arml arml;
        if (acvx != null) {
            arml arml2 = apdz.c;
            if (arml2 == null) {
                arml2 = arml.f;
            }
            acxk.a(arml2, acvx);
        }
        this.f = b();
        this.i = (TextView) this.f.findViewById(R.id.collection_badge_icon);
        this.a = (TextView) this.f.findViewById(R.id.collection_badge_label);
        this.i.setIncludeFontPadding(false);
        this.a.setIncludeFontPadding(false);
        this.d.setVisibility(0);
        xpr.a(this.i, apdz.b);
        TextView textView = this.a;
        if ((apdz.a & 2) != 0) {
            arml = apdz.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, aabb.a(arml, this.g, false));
        if ((apdz.a & 32) != 0) {
            Resources resources = this.c.getResources();
            akvp akvp = this.h;
            arwf arwf = apdz.d;
            if (arwf == null) {
                arwf = arwf.c;
            }
            arwh a = arwh.a(arwf.b);
            if (a == null) {
                a = arwh.UNKNOWN;
            }
            Drawable drawable = resources.getDrawable(akvp.a(a));
            arml = apdz.c;
            if (arml == null) {
                arml = arml.f;
            }
            if (arml.b.size() > 0) {
                arml arml3 = apdz.c;
                if (arml3 == null) {
                    arml3 = arml.f;
                }
                if ((((armp) arml3.b.get(0)).a & 256) != 0) {
                    st.a(drawable, xwe.a(this.c, R.attr.ytCallToAction, 0));
                }
            }
            int lineHeight = this.a.getLineHeight();
            drawable.setBounds(0, 0, lineHeight, lineHeight);
            this.a.setCompoundDrawables(drawable, null, null, null);
            return;
        }
        this.a.setCompoundDrawables(null, null, null, null);
    }

    public final void a(int i, int i2, int i3, int i4) {
        TextView textView = this.a;
        if (textView != null) {
            textView.setPadding(i, i2, i3, i4);
        }
    }

    public final boolean a() {
        View view = this.f;
        boolean z = false;
        if (view != null && view.getVisibility() == 0) {
            TextView textView = this.a;
            if (textView != null && textView.getVisibility() == 0) {
                textView = this.i;
                if (textView == null) {
                    z = true;
                } else if (textView.getVisibility() != 8) {
                    return z;
                } else {
                    return true;
                }
            }
        }
        return z;
    }
}
