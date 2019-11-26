package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* renamed from: koi */
public final class koi implements kop {
    public final acvx a;
    public final armw b;
    private final Context c;
    private final View d;
    private final View e = this.d.findViewById(R.id.background);
    private final TextView f = ((TextView) this.d.findViewById(R.id.helper_text));
    private final CheckBox g = ((CheckBox) this.d.findViewById(R.id.checkbox));
    private final YouTubeTextView h = ((YouTubeTextView) this.d.findViewById(R.id.label));
    private final aaas i;

    public koi(Context context, aaas aaas, acvx acvx, ViewGroup viewGroup, armw armw) {
        this.i = aaas;
        this.a = acvx;
        this.c = context;
        this.d = LayoutInflater.from(context).inflate(R.layout.formfill_checkbox_input, viewGroup, false);
        this.b = armw;
    }

    public final atsn a(atsn atsn) {
        return atsn;
    }

    public final View a() {
        TextView textView = this.f;
        arml arml = this.b.e;
        if (arml == null) {
            arml = arml.f;
        }
        xpr.a(textView, ajqy.a(arml));
        YouTubeTextView youTubeTextView = this.h;
        arml = this.b.d;
        if (arml == null) {
            arml = arml.f;
        }
        youTubeTextView.setText(aabb.a(arml, this.i, false));
        this.g.setChecked(this.b.b);
        this.a.a(this.b.h.d(), null);
        this.g.setOnCheckedChangeListener(new kol(this));
        return this.d;
    }

    public final String b() {
        return !this.g.isChecked() ? "" : "checked";
    }

    public final koo a(boolean z) {
        if (!this.b.c || this.g.isChecked()) {
            return koo.a(true, null);
        }
        apxu apxu = this.b.g;
        if (apxu == null) {
            apxu = apxu.d;
        }
        return koo.a(false, apxu);
    }

    public final void b(boolean z) {
        if (z) {
            armw armw = this.b;
            if ((armw.a & 16) != 0) {
                TextView textView = this.f;
                arml arml = armw.f;
                if (arml == null) {
                    arml = arml.f;
                }
                xpr.a(textView, ajqy.a(arml));
            }
            this.e.setBackgroundColor(xwe.a(this.c, R.attr.ytGeneralBackgroundB));
            return;
        }
        TextView textView2 = this.f;
        arml arml2 = this.b.e;
        if (arml2 == null) {
            arml2 = arml.f;
        }
        xpr.a(textView2, ajqy.a(arml2));
        this.e.setBackgroundColor(0);
    }

    public final boolean c() {
        armw armw = this.b;
        boolean z = (armw.a & 1) != 0 && armw.b;
        return this.g.isChecked() != z;
    }

    public final View d() {
        return this.d;
    }
}
