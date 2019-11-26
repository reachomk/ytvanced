package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.design.textfield.TextInputLayout;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.youtube.ads.ui.EditTextWithHelpIcon;
import com.google.android.youtube.R;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;

/* renamed from: kov */
public final class kov implements kop {
    private static final ueq g = ueq.b();
    public final Context a;
    public final TextView b = ((TextView) this.h.findViewById(R.id.region_text));
    public final aaas c;
    public final arnc d;
    public String e;
    public aeh f;
    private final View h;
    private final TextView i = ((TextView) this.h.findViewById(R.id.region_text_label));
    private final View j = this.h.findViewById(R.id.region_text_background);
    private final TextInputLayout k = ((TextInputLayout) this.h.findViewById(R.id.text_input_layout));
    private final EditTextWithHelpIcon l = ((EditTextWithHelpIcon) this.h.findViewById(R.id.edit_text));
    private TextWatcher m;
    private arml n;

    public kov(Context context, aaas aaas, ViewGroup viewGroup, arnc arnc) {
        this.c = aaas;
        this.a = context;
        this.h = LayoutInflater.from(context).inflate(R.layout.formfill_phone_number_input, viewGroup, false);
        this.d = arnc;
        this.e = kov.a(arnc);
    }

    public final View a() {
        arml arml;
        this.l.addTextChangedListener(new koz(this));
        TextInputLayout textInputLayout = this.k;
        arnc arnc = this.d;
        arml arml2 = null;
        if ((arnc.a & 4) != 0) {
            arml = arnc.d;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textInputLayout.a(ajqy.a(arml));
        textInputLayout = this.k;
        arnc = this.d;
        if ((arnc.a & 64) != 0) {
            arml = arnc.h;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textInputLayout.b(ajqy.a(arml));
        TextView textView = this.i;
        arnc = this.d;
        if ((arnc.a & 1) != 0) {
            arml2 = arnc.b;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        }
        textView.setText(ajqy.a(arml2));
        this.l.setText(kov.a(this.e, this.d.e, 3));
        e();
        if ((this.d.a & 32) != 0) {
            this.l.a(new kou(this));
        }
        f();
        int a = g.a(this.e);
        this.b.setText(this.a.getResources().getString(R.string.region_with_calling_code, new Object[]{this.e, Integer.valueOf(a)}));
        kox kox = new kox(this);
        this.b.setOnClickListener(kox);
        this.j.setOnClickListener(kox);
        return this.h;
    }

    private static String a(arnc arnc) {
        String str = arnc.c;
        if (amqu.a(str)) {
            str = Locale.getDefault().getCountry();
            try {
                str = g.c(g.a(arnc.e, str));
            } catch (uer unused) {
            }
        }
        Set a = g.a();
        if (a.contains(str)) {
            return str;
        }
        return !a.isEmpty() ? (String) a.iterator().next() : "";
    }

    public final void e() {
        this.k.a(xwe.b(this.a, ((Editable) this.l.getText()).length() != 0 ? R.attr.adHintText : R.attr.adHintTextIncomplete));
    }

    public final String b() {
        return kov.a(this.e, ((Editable) this.l.getText()).toString(), 1);
    }

    /* JADX WARNING: Missing block: B:9:0x003a, code skipped:
            if (g.b(g.a(((android.text.Editable) r5.l.getText()).toString(), r5.e)) == false) goto L_0x003c;
     */
    public final defpackage.koo a(boolean r6) {
        /*
        r5 = this;
        r0 = r5.d;
        r0 = r0.a;
        r0 = r0 & 128;
        if (r0 != 0) goto L_0x0041;
    L_0x0008:
        r0 = 0;
        r5.n = r0;
        r1 = 0;
        r2 = 1;
        if (r6 == 0) goto L_0x0020;
    L_0x000f:
        r6 = r5.l;
        r6 = r6.getText();
        r6 = (android.text.Editable) r6;
        r6 = r6.length();
        if (r6 == 0) goto L_0x001e;
    L_0x001d:
        goto L_0x0020;
    L_0x001e:
        r1 = 1;
        goto L_0x003c;
    L_0x0020:
        r6 = g;	 Catch:{ uer -> 0x003c }
        r3 = r5.l;	 Catch:{ uer -> 0x003c }
        r3 = r3.getText();	 Catch:{ uer -> 0x003c }
        r3 = (android.text.Editable) r3;	 Catch:{ uer -> 0x003c }
        r3 = r3.toString();	 Catch:{ uer -> 0x003c }
        r4 = r5.e;	 Catch:{ uer -> 0x003c }
        r6 = r6.a(r3, r4);	 Catch:{ uer -> 0x003c }
        r3 = g;	 Catch:{ uer -> 0x003c }
        r6 = r3.b(r6);	 Catch:{ uer -> 0x003c }
        if (r6 != 0) goto L_0x001e;
    L_0x003c:
        r6 = defpackage.koo.a(r1, r0);
        return r6;
    L_0x0041:
        r6 = r5.b();
        r0 = r5.d;
        r0 = r0.i;
        if (r0 != 0) goto L_0x004d;
    L_0x004b:
        r0 = defpackage.aywl.f;
    L_0x004d:
        r6 = defpackage.kpi.a(r6, r0);
        r0 = r6.b();
        r5.n = r0;
        r0 = r6.a();
        r6 = r6.c();
        r6 = defpackage.koo.a(r0, r6);
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kov.a(boolean):koo");
    }

    public final void b(boolean z) {
        if (z) {
            arml arml = this.n;
            if (arml == null) {
                arml = this.d.f;
                if (arml == null) {
                    arml = arml.f;
                }
            }
            this.k.c(ajqy.a(arml));
            this.k.setBackgroundColor(xwe.a(this.a, R.attr.ytGeneralBackgroundB));
            return;
        }
        this.k.b(false);
        this.k.setBackgroundColor(0);
    }

    public final atsn a(atsn atsn) {
        atsn atsn2;
        atsm atsm = (atsm) ((anxo) atsn.toBuilder());
        if (c()) {
            atsm.copyOnWrite();
            atsn2 = (atsn) atsm.instance;
            atsn2.a |= 4;
            atsn2.d = true;
        }
        if (this.d.e.length() > 0) {
            atsm.copyOnWrite();
            atsn2 = (atsn) atsm.instance;
            atsn2.a |= 32;
            atsn2.g = true;
        }
        return (atsn) ((anxl) atsm.build());
    }

    public final boolean c() {
        return kov.a(this.e, ((Editable) this.l.getText()).toString(), 1).equals(kov.a(kov.a(this.d), this.d.e, 1)) ^ 1;
    }

    public final void f() {
        if (VERSION.SDK_INT >= 21) {
            this.l.removeTextChangedListener(this.m);
            this.m = new PhoneNumberFormattingTextWatcher(this.e);
            this.l.addTextChangedListener(this.m);
            String normalizeNumber = PhoneNumberUtils.normalizeNumber(this.l.getEditableText().toString());
            this.l.getEditableText().clear();
            this.l.setText(normalizeNumber);
        }
    }

    public final View d() {
        return this.h;
    }

    private static String a(String str, String str2, int i) {
        try {
            uex a = g.a((CharSequence) str2, str);
            ueq ueq = g;
            StringBuilder stringBuilder = new StringBuilder(20);
            stringBuilder.setLength(0);
            int i2 = a.a;
            String a2 = ueq.a(a);
            if (i == 1) {
                stringBuilder.append(a2);
                ueq.a(i2, 1, stringBuilder);
            } else if (ueq.b.containsKey(Integer.valueOf(i2))) {
                ues a3 = ueq.a(i2, ueq.a(i2));
                List list;
                if (a3.t.size() == 0 || i == 3) {
                    list = a3.s;
                } else {
                    list = a3.t;
                }
                for (uet uet : list) {
                    int a4 = uet.a();
                    if (a4 != 0) {
                        if (!ueq.c.a((String) uet.c.get(a4 - 1)).matcher(a2).lookingAt()) {
                            continue;
                        }
                    }
                    if (ueq.c.a(uet.a).matcher(a2).matches()) {
                        break;
                    }
                }
                uet uet2 = null;
                if (uet2 != null) {
                    String str3 = uet2.b;
                    Matcher matcher = ueq.c.a(uet2.a).matcher(a2);
                    a2 = uet2.d;
                    if (i == 3) {
                        if (a2 != null && a2.length() > 0) {
                            a2 = matcher.replaceAll(ueq.a.matcher(str3).replaceFirst(a2));
                        }
                    }
                    a2 = matcher.replaceAll(str3);
                }
                stringBuilder.append(a2);
                if (a.c) {
                    if (a.d.length() > 0) {
                        if (a3.n) {
                            stringBuilder.append(a3.o);
                            stringBuilder.append(a.d);
                        } else {
                            stringBuilder.append(" ext. ");
                            stringBuilder.append(a.d);
                        }
                    }
                }
                ueq.a(i2, i, stringBuilder);
            } else {
                stringBuilder.append(a2);
            }
            return stringBuilder.toString();
        } catch (uer unused) {
            return str2;
        }
    }
}
