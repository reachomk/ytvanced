package defpackage;

import android.content.Context;
import android.support.design.textfield.TextInputLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.youtube.R;

/* renamed from: wmt */
public final class wmt implements akot {
    public final wmw a;
    public final View b;
    public final EditText c = ((EditText) this.b.findViewById(R.id.coupon_edit));
    public boolean d;
    private final TextInputLayout e = ((TextInputLayout) this.b.findViewById(R.id.coupon_edit_wrapper));
    private final int f = xss.a(this.e.getResources().getDisplayMetrics(), 8);

    public wmt(Context context, wmw wmw, ViewGroup viewGroup) {
        this.a = wmw;
        this.b = LayoutInflater.from(context).inflate(R.layout.coupon_layout, viewGroup, false);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.b;
    }

    public final void a(ayje ayje) {
        arml arml;
        this.c.addTextChangedListener(new wmx(this));
        this.c.setOnTouchListener(new wms(this));
        this.c.setOnEditorActionListener(new wmv(this));
        this.c.setOnFocusChangeListener(new wmu(this));
        this.e.l = ((ayje.a & 2) != 0 ? 1 : 0) ^ 1;
        this.c.setText(ayje.c);
        TextInputLayout textInputLayout = this.e;
        if ((ayje.a & 1) != 0) {
            arml = ayje.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textInputLayout.a(ajqy.a(arml));
        if ((ayje.a & 4) == 0) {
            if (!ayje.c.isEmpty()) {
                this.c.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.quantum_ic_check_googgreen_18, 0);
                this.d = false;
            }
            c();
            this.c.clearFocus();
            return;
        }
        textInputLayout = this.e;
        arml arml2 = ayje.d;
        if (arml2 == null) {
            arml2 = arml.f;
        }
        textInputLayout.c(ajqy.a(arml2));
        EditText editText = this.c;
        editText.setSelection(editText.getText().length());
    }

    public final void b() {
        if (this.c.hasFocus() || this.c.getText().length() > 0) {
            this.e.setPadding(0, this.f, 0, 0);
        } else {
            this.e.setPadding(0, 0, 0, 0);
        }
    }

    public final void c() {
        this.e.b(false);
        this.e.c(null);
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        a((ayje) obj);
    }
}
