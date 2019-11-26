package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

/* renamed from: acqf */
public final class acqf extends nf implements TextWatcher, OnClickListener {
    public acqk Z;
    public acvx a;
    public TextView aa;
    public Button ab;
    private ImageButton ac;
    private TextView ad;
    private WebView ae;
    private TextView af;
    private TextView ag;
    private TextView ah;
    private EditText ai;
    private EditText aj;
    private EditText ak;
    private axzb al;
    public aclh b;
    public abbj c;

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((acqh) xse.a(this.y)).a(this);
        bundle = this.j;
        if (bundle != null) {
            String str = "ARG_CONTRACT_RENDERER";
            if (bundle.containsKey(str)) {
                try {
                    this.al = (axzb) aobp.a(bundle, str, axzb.k, anxa.c());
                } catch (anyg e) {
                    xtl.a("Failed to process bundle key: ARG_CONTRACT_RENDERER", e);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:89:0x0255  */
    public final android.view.View a(android.view.LayoutInflater r12, android.view.ViewGroup r13, android.os.Bundle r14) {
        /*
        r11 = this;
        r0 = r11.a;
        r1 = defpackage.acwl.as;
        r2 = 0;
        r0.a(r1, r2, r2);
        r0 = 0;
        r1 = 2131034773; // 0x7f050295 float:1.7680073E38 double:1.0528710714E-314;
        r12 = r12.inflate(r1, r13, r0);
        r13 = 2131757246; // 0x7f1008be float:1.9145422E38 double:1.0532280205E-314;
        r13 = r12.findViewById(r13);
        r13 = (android.widget.ImageButton) r13;
        r11.ac = r13;
        r13 = 2131757247; // 0x7f1008bf float:1.9145424E38 double:1.053228021E-314;
        r13 = r12.findViewById(r13);
        r13 = (android.widget.TextView) r13;
        r11.ad = r13;
        r13 = 2131757249; // 0x7f1008c1 float:1.9145428E38 double:1.053228022E-314;
        r13 = r12.findViewById(r13);
        r13 = (android.webkit.WebView) r13;
        r11.ae = r13;
        r13 = 2131757257; // 0x7f1008c9 float:1.9145445E38 double:1.053228026E-314;
        r13 = r12.findViewById(r13);
        r13 = (android.widget.Button) r13;
        r11.ab = r13;
        r13 = 2131757250; // 0x7f1008c2 float:1.914543E38 double:1.0532280225E-314;
        r13 = r12.findViewById(r13);
        r13 = (android.widget.TextView) r13;
        r11.af = r13;
        r13 = 2131757252; // 0x7f1008c4 float:1.9145435E38 double:1.0532280235E-314;
        r13 = r12.findViewById(r13);
        r13 = (android.widget.TextView) r13;
        r11.ag = r13;
        r13 = 2131757254; // 0x7f1008c6 float:1.9145439E38 double:1.0532280245E-314;
        r13 = r12.findViewById(r13);
        r13 = (android.widget.TextView) r13;
        r11.ah = r13;
        r13 = 2131757251; // 0x7f1008c3 float:1.9145432E38 double:1.053228023E-314;
        r13 = r12.findViewById(r13);
        r13 = (android.widget.EditText) r13;
        r11.ai = r13;
        r13 = 2131757253; // 0x7f1008c5 float:1.9145437E38 double:1.053228024E-314;
        r13 = r12.findViewById(r13);
        r13 = (android.widget.EditText) r13;
        r11.aj = r13;
        r13 = 2131757255; // 0x7f1008c7 float:1.914544E38 double:1.053228025E-314;
        r13 = r12.findViewById(r13);
        r13 = (android.widget.EditText) r13;
        r11.ak = r13;
        r13 = 2131757256; // 0x7f1008c8 float:1.9145443E38 double:1.0532280255E-314;
        r13 = r12.findViewById(r13);
        r13 = (android.widget.TextView) r13;
        r11.aa = r13;
        r13 = r11.ab;
        r13.setEnabled(r0);
        r13 = r11.ac;
        r13.setOnClickListener(r11);
        r13 = r11.ab;
        r13.setOnClickListener(r11);
        r13 = r11.ai;
        r13.addTextChangedListener(r11);
        r13 = r11.aj;
        r13.addTextChangedListener(r11);
        r13 = r11.ak;
        r13.addTextChangedListener(r11);
        r13 = r11.al;
        r1 = 2131952561; // 0x7f1303b1 float:1.9541568E38 double:1.053324519E-314;
        if (r13 != 0) goto L_0x00b0;
    L_0x00ae:
        goto L_0x0236;
    L_0x00b0:
        r3 = r13.a;
        r4 = 1;
        r3 = r3 & r4;
        if (r3 == 0) goto L_0x0236;
    L_0x00b6:
        r13 = r13.b;
        if (r13 != 0) goto L_0x00bc;
    L_0x00ba:
        r13 = defpackage.axak.a;
    L_0x00bc:
        r13 = defpackage.ajzv.a(r13);
        r3 = defpackage.aphg.class;
        r13 = defpackage.ajzv.a(r13, r3);
        r13 = (defpackage.aphg) r13;
        r3 = 2130838931; // 0x7f020593 float:1.7282858E38 double:1.0527743126E-314;
        if (r13 != 0) goto L_0x00ce;
    L_0x00cd:
        goto L_0x0100;
    L_0x00ce:
        r5 = r13.a;
        r5 = r5 & 16;
        if (r5 == 0) goto L_0x00ed;
    L_0x00d4:
        r5 = r11.b;
        r6 = r13.e;
        if (r6 != 0) goto L_0x00dc;
    L_0x00da:
        r6 = defpackage.arwf.c;
    L_0x00dc:
        r6 = r6.b;
        r6 = defpackage.arwh.a(r6);
        if (r6 != 0) goto L_0x00e6;
    L_0x00e4:
        r6 = defpackage.arwh.UNKNOWN;
    L_0x00e6:
        r5 = r5.a(r6);
        if (r5 == 0) goto L_0x00ed;
    L_0x00ec:
        r3 = r5;
    L_0x00ed:
        r5 = r13.a;
        r5 = r5 & 16384;
        if (r5 == 0) goto L_0x0100;
    L_0x00f3:
        r5 = r11.ac;
        r13 = r13.p;
        if (r13 != 0) goto L_0x00fb;
    L_0x00f9:
        r13 = defpackage.aodv.c;
    L_0x00fb:
        r13 = r13.b;
        r5.setContentDescription(r13);
    L_0x0100:
        r13 = r11.ac;
        r5 = r11.M_();
        r3 = defpackage.ra.a(r5, r3);
        r13.setImageDrawable(r3);
        r13 = r11.ad;
        r3 = r11.al;
        r5 = r3.a;
        r5 = r5 & 2;
        if (r5 == 0) goto L_0x011e;
    L_0x0117:
        r3 = r3.c;
        if (r3 != 0) goto L_0x011f;
    L_0x011b:
        r3 = defpackage.arml.f;
        goto L_0x011f;
    L_0x011e:
        r3 = r2;
    L_0x011f:
        r3 = defpackage.ajqy.a(r3);
        r13.setText(r3);
        r13 = r11.al;
        r13 = r13.e;
        r13 = android.text.TextUtils.isEmpty(r13);
        if (r13 != 0) goto L_0x014a;
    L_0x0130:
        r13 = r11.ae;
        r13 = r13.getSettings();
        r0 = 60;
        r13.setTextZoom(r0);
        r5 = r11.ae;
        r6 = 0;
        r13 = r11.al;
        r7 = r13.e;
        r9 = 0;
        r10 = 0;
        r8 = "text/html";
        r5.loadDataWithBaseURL(r6, r7, r8, r9, r10);
        goto L_0x018f;
    L_0x014a:
        r13 = r11.al;
        r13 = r13.d;
        if (r13 != 0) goto L_0x0152;
    L_0x0150:
        r13 = defpackage.arml.f;
    L_0x0152:
        r13 = defpackage.ajqy.a(r13);
        r13 = r13.length();
        if (r13 != 0) goto L_0x017a;
    L_0x015c:
        r13 = "No contract text was set, exiting contract flow";
        defpackage.xtl.c(r13);
        r13 = r11.Z;
        r13.a(r0);
        r13 = r11.q();
        r13 = r13.getString(r1);
        r1 = r11.p();
        r13 = android.widget.Toast.makeText(r1, r13, r0);
        r13.show();
        goto L_0x018f;
    L_0x017a:
        r13 = r11.ae;
        r0 = r11.al;
        r0 = r0.d;
        if (r0 != 0) goto L_0x0184;
    L_0x0182:
        r0 = defpackage.arml.f;
    L_0x0184:
        r0 = defpackage.ajqy.a(r0);
        r0 = r0.toString();
        r13.loadData(r0, r2, r2);
    L_0x018f:
        r13 = r11.al;
        r0 = r13.a;
        r0 = r0 & 16;
        if (r0 == 0) goto L_0x019e;
    L_0x0197:
        r13 = r13.f;
        if (r13 != 0) goto L_0x019f;
    L_0x019b:
        r13 = defpackage.axak.a;
        goto L_0x019f;
    L_0x019e:
        r13 = r2;
    L_0x019f:
        r0 = r11.af;
        r1 = r11.ai;
        defpackage.acqf.a(r13, r0, r1);
        r13 = r11.al;
        r0 = r13.a;
        r0 = r0 & 32;
        if (r0 == 0) goto L_0x01b5;
    L_0x01ae:
        r13 = r13.g;
        if (r13 != 0) goto L_0x01b6;
    L_0x01b2:
        r13 = defpackage.axak.a;
        goto L_0x01b6;
    L_0x01b5:
        r13 = r2;
    L_0x01b6:
        r0 = r11.ag;
        r1 = r11.aj;
        defpackage.acqf.a(r13, r0, r1);
        r13 = r11.al;
        r0 = r13.a;
        r0 = r0 & 64;
        if (r0 == 0) goto L_0x01cc;
    L_0x01c5:
        r13 = r13.h;
        if (r13 != 0) goto L_0x01cd;
    L_0x01c9:
        r13 = defpackage.axak.a;
        goto L_0x01cd;
    L_0x01cc:
        r13 = r2;
    L_0x01cd:
        r0 = r11.ah;
        r1 = r11.ak;
        defpackage.acqf.a(r13, r0, r1);
        r13 = r11.al;
        r0 = r13.a;
        r0 = r0 & 256;
        if (r0 == 0) goto L_0x0253;
    L_0x01dc:
        r13 = r13.j;
        if (r13 != 0) goto L_0x01e2;
    L_0x01e0:
        r13 = defpackage.axak.a;
    L_0x01e2:
        r13 = defpackage.ajzv.a(r13);
        r0 = defpackage.aphg.class;
        r13 = defpackage.ajzv.a(r13, r0);
        r13 = (defpackage.aphg) r13;
        if (r13 == 0) goto L_0x0253;
    L_0x01f0:
        r0 = r11.ab;
        r1 = r13.a;
        r1 = r1 & 128;
        if (r1 == 0) goto L_0x01fe;
    L_0x01f8:
        r2 = r13.g;
        if (r2 != 0) goto L_0x01fe;
    L_0x01fc:
        r2 = defpackage.arml.f;
    L_0x01fe:
        r1 = defpackage.ajqy.a(r2);
        r0.setText(r1);
        r0 = r13.a;
        r0 = r0 & 16384;
        if (r0 != 0) goto L_0x020c;
    L_0x020b:
        goto L_0x0219;
    L_0x020c:
        r0 = r11.ab;
        r1 = r13.p;
        if (r1 != 0) goto L_0x0214;
    L_0x0212:
        r1 = defpackage.aodv.c;
    L_0x0214:
        r1 = r1.b;
        r0.setContentDescription(r1);
    L_0x0219:
        r0 = r11.M_();
        r1 = r11.ab;
        r2 = r13.b;
        if (r2 != r4) goto L_0x0232;
    L_0x0223:
        r13 = r13.c;
        r13 = (java.lang.Integer) r13;
        r13 = r13.intValue();
        r13 = defpackage.aphh.a(r13);
        if (r13 == 0) goto L_0x0232;
    L_0x0231:
        r4 = r13;
    L_0x0232:
        defpackage.acra.a(r0, r1, r4);
        goto L_0x0253;
    L_0x0236:
        r13 = "Contract fragment received a bad renderer, exiting flow";
        defpackage.xtl.c(r13);
        r13 = r11.Z;
        r13.a(r0);
        r13 = r11.q();
        r13 = r13.getString(r1);
        r1 = r11.p();
        r13 = android.widget.Toast.makeText(r1, r13, r0);
        r13.show();
    L_0x0253:
        if (r14 == 0) goto L_0x0287;
    L_0x0255:
        r13 = "BUNDLE_STATE_NAME";
        r13 = r14.getString(r13);
        if (r13 != 0) goto L_0x025e;
    L_0x025d:
        goto L_0x0263;
    L_0x025e:
        r0 = r11.ai;
        r0.setText(r13);
    L_0x0263:
        r13 = "BUNDLE_STATE_TITLE";
        r13 = r14.getString(r13);
        if (r13 != 0) goto L_0x026c;
    L_0x026b:
        goto L_0x0271;
    L_0x026c:
        r0 = r11.aj;
        r0.setText(r13);
    L_0x0271:
        r13 = "BUNDLE_STATE_COMPANY";
        r13 = r14.getString(r13);
        if (r13 == 0) goto L_0x027e;
    L_0x0279:
        r14 = r11.ak;
        r14.setText(r13);
    L_0x027e:
        r13 = r11.ab;
        r14 = r11.f();
        r13.setEnabled(r14);
    L_0x0287:
        return r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acqf.a(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    private static void a(axak axak, TextView textView, EditText editText) {
        atre atre = (atre) ajzv.a(ajzv.a(axak), atre.class);
        if (atre != null) {
            aodx aodx = atre.e;
            if (aodx == null) {
                aodx = aodx.c;
            }
            if ((aodx.a & 1) != 0) {
                aodx = atre.e;
                if (aodx == null) {
                    aodx = aodx.c;
                }
                aodv aodv = aodx.b;
                if (aodv == null) {
                    aodv = aodv.c;
                }
                textView.setContentDescription(aodv.b);
            }
            arml arml = atre.b;
            if (arml == null) {
                arml = arml.f;
            }
            textView.setText(ajqy.a(arml));
            if (atre.f != 0) {
                editText.setFilters(new InputFilter[]{new LengthFilter(atre.f)});
            }
        }
    }

    public final void onClick(View view) {
        if (view == this.ac) {
            this.Z.a(true);
        } else if (view == this.ab && f()) {
            this.aa.setVisibility(8);
            abbj abbj = this.c;
            aaml abaw = new abaw(abbj.c, abbj.d.c());
            abaw.a = this.ai.getText().toString();
            abaw.b = this.aj.getText().toString();
            abaw.c = this.ak.getText().toString();
            this.ab.setEnabled(false);
            abbj = this.c;
            afsw acqi = new acqi(this);
            abaw.g();
            ((aang) abbj.k.get()).a(abaw, acqi);
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.ab.setEnabled(f());
    }

    /* Access modifiers changed, original: final */
    public final boolean f() {
        return this.ai.getText().length() > 0 && this.aj.getText().length() > 0 && this.ak.getText().length() > 0;
    }

    public final void e(Bundle bundle) {
        bundle.putString("BUNDLE_STATE_NAME", this.ai.getText().toString());
        bundle.putString("BUNDLE_STATE_TITLE", this.aj.getText().toString());
        bundle.putString("BUNDLE_STATE_COMPANY", this.ak.getText().toString());
    }
}
