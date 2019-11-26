package defpackage;

import android.content.Context;
import android.support.design.textfield.TextInputLayout;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.ads.ui.EditTextWithHelpIcon;
import com.google.android.youtube.R;

/* renamed from: kph */
public final class kph implements kop {
    public final aaas a;
    public final arni b;
    private final Context c;
    private final View d;
    private final TextInputLayout e = ((TextInputLayout) this.d.findViewById(R.id.text_input_layout));
    private final EditTextWithHelpIcon f = ((EditTextWithHelpIcon) this.d.findViewById(R.id.edit_text));
    private arml g;

    public kph(Context context, aaas aaas, ViewGroup viewGroup, arni arni) {
        this.a = aaas;
        this.c = context;
        this.d = LayoutInflater.from(context).inflate(R.layout.formfill_text_input, viewGroup, false);
        this.b = arni;
    }

    public final View a() {
        arml arml;
        this.f.addTextChangedListener(new kpj(this));
        TextInputLayout textInputLayout = this.e;
        arni arni = this.b;
        if ((arni.a & 2) != 0) {
            arml = arni.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textInputLayout.a(ajqy.a(arml));
        textInputLayout = this.e;
        arni = this.b;
        if ((arni.a & 16) != 0) {
            arml = arni.f;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textInputLayout.b(ajqy.a(arml));
        this.f.setText(this.b.d);
        e();
        int a = arnk.a(this.b.b);
        if (a == 0) {
            a = 1;
        }
        a--;
        if (a == 1) {
            this.f.setInputType(33);
        } else if (a != 2) {
            return null;
        } else {
            this.f.setInputType(1);
        }
        if ((this.b.a & 32) != 0) {
            this.f.a(new kpg(this));
        }
        return this.d;
    }

    public final atsn a(atsn atsn) {
        int a;
        atsn atsn2;
        atsm atsm = (atsm) ((anxo) atsn.toBuilder());
        if (c()) {
            a = arnk.a(this.b.b);
            if (a != 0 && a == 2) {
                atsm.copyOnWrite();
                atsn2 = (atsn) atsm.instance;
                atsn2.a |= 1;
                atsn2.b = true;
            } else {
                a = arnk.a(this.b.b);
                if (a != 0 && a == 3) {
                    atsm.copyOnWrite();
                    atsn2 = (atsn) atsm.instance;
                    atsn2.a |= 2;
                    atsn2.c = true;
                }
            }
        }
        if (this.b.d.length() > 0) {
            a = arnk.a(this.b.b);
            if (a != 0 && a == 2) {
                atsm.copyOnWrite();
                atsn2 = (atsn) atsm.instance;
                atsn2.a |= 8;
                atsn2.e = true;
            } else {
                a = arnk.a(this.b.b);
                if (a != 0 && a == 3) {
                    atsm.copyOnWrite();
                    atsn2 = (atsn) atsm.instance;
                    atsn2.a |= 16;
                    atsn2.f = true;
                }
            }
        }
        return (atsn) ((anxl) atsm.build());
    }

    public final void e() {
        this.e.a(xwe.b(this.c, ((Editable) this.f.getText()).length() != 0 ? R.attr.adHintText : R.attr.adHintTextIncomplete));
    }

    public final String b() {
        return ((Editable) this.f.getText()).toString();
    }

    /* JADX WARNING: Missing block: B:15:0x0040, code skipped:
            if (((android.text.Editable) r4.f.getText()).length() <= 0) goto L_0x0055;
     */
    public final defpackage.koo a(boolean r5) {
        /*
        r4 = this;
        r0 = r4.b;
        r0 = r0.a;
        r0 = r0 & 64;
        if (r0 != 0) goto L_0x005a;
    L_0x0008:
        r0 = 0;
        r4.g = r0;
        r1 = 0;
        r2 = 1;
        if (r5 == 0) goto L_0x0020;
    L_0x000f:
        r5 = r4.f;
        r5 = r5.getText();
        r5 = (android.text.Editable) r5;
        r5 = r5.length();
        if (r5 == 0) goto L_0x001e;
    L_0x001d:
        goto L_0x0020;
    L_0x001e:
        r1 = 1;
        goto L_0x0055;
    L_0x0020:
        r5 = r4.b;
        r5 = r5.b;
        r5 = defpackage.arnk.a(r5);
        if (r5 == 0) goto L_0x002b;
    L_0x002a:
        goto L_0x002c;
    L_0x002b:
        r5 = 1;
    L_0x002c:
        r5 = r5 + -1;
        if (r5 == r2) goto L_0x0043;
    L_0x0030:
        r3 = 2;
        if (r5 == r3) goto L_0x0034;
    L_0x0033:
        goto L_0x0055;
    L_0x0034:
        r5 = r4.f;
        r5 = r5.getText();
        r5 = (android.text.Editable) r5;
        r5 = r5.length();
        if (r5 <= 0) goto L_0x0055;
    L_0x0042:
        goto L_0x001e;
    L_0x0043:
        r5 = android.util.Patterns.EMAIL_ADDRESS;
        r1 = r4.f;
        r1 = r1.getText();
        r1 = (android.text.Editable) r1;
        r5 = r5.matcher(r1);
        r1 = r5.matches();
    L_0x0055:
        r5 = defpackage.koo.a(r1, r0);
        return r5;
    L_0x005a:
        r5 = r4.b();
        r0 = r4.b;
        r0 = r0.h;
        if (r0 != 0) goto L_0x0066;
    L_0x0064:
        r0 = defpackage.aywl.f;
    L_0x0066:
        r5 = defpackage.kpi.a(r5, r0);
        r0 = r5.b();
        r4.g = r0;
        r0 = r5.a();
        r5 = r5.c();
        r5 = defpackage.koo.a(r0, r5);
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kph.a(boolean):koo");
    }

    public final void b(boolean z) {
        if (z) {
            arml arml = this.g;
            if (arml == null) {
                arml = this.b.e;
                if (arml == null) {
                    arml = arml.f;
                }
            }
            this.e.c(ajqy.a(arml));
            this.e.setBackgroundColor(xwe.a(this.c, R.attr.ytGeneralBackgroundB));
            return;
        }
        this.e.b(false);
        this.e.setBackgroundColor(0);
    }

    public final boolean c() {
        return this.b.d.contentEquals((Editable) this.f.getText()) ^ 1;
    }

    public final View d() {
        return this.d;
    }
}
