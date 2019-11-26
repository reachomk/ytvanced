package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.widget.ContentLoadingProgressBar;
import android.text.Editable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: vbg */
public final class vbg extends nf implements TextWatcher, OnItemSelectedListener, OnCheckedChangeListener, uzs {
    public avxo Z;
    public Button a;
    public String aa;
    public String ab;
    public atfx ac = atfx.CODE_DELIVERY_METHOD_UNKNOWN;
    public String ad;
    public vbm ae;
    public aaas af;
    public xwb ag;
    private TextView ah;
    private TextView ai;
    private ImageButton aj;
    private Spinner ak;
    private TextView al;
    private View am;
    private LinearLayout an;
    private ArrayList ao;
    private List ap;
    private Map aq;
    private Map ar;
    public ContentLoadingProgressBar b;
    public EditText c;

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((vbn) xse.a(this.y)).a(this);
        byte[] byteArray = this.j.getByteArray("ARG_RENDERER");
        if (byteArray != null) {
            try {
                this.Z = (avxo) anxl.parseFrom(avxo.i, byteArray, anxa.c());
            } catch (anyg e) {
                String name = avxo.class.getName();
                String str = "Failed to parse a known parcelable proto ";
                throw new RuntimeException(name.length() == 0 ? new String(str) : str.concat(name), e);
            }
        }
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(layoutInflater.getContext(), this.ag.a);
        layoutInflater = layoutInflater.cloneInContext(contextThemeWrapper);
        ViewGroup frameLayout = new FrameLayout(contextThemeWrapper);
        avxo avxo = this.Z;
        if (!(avxo == null || (avxo.a & 1) == 0)) {
            avxm avxm = avxo.f;
            if (avxm == null) {
                avxm = avxm.c;
            }
            aphg aphg = avxm.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
            if ((aphg.a & 128) != 0) {
                avxm = avxo.f;
                if (avxm == null) {
                    avxm = avxm.c;
                }
                aphg = avxm.b;
                if (aphg == null) {
                    aphg = aphg.s;
                }
                if ((aphg.a & 2048) != 0) {
                    avxs avxs = avxo.d;
                    if (avxs == null) {
                        avxs = avxs.c;
                    }
                    atre atre = avxs.b;
                    if (atre == null) {
                        atre = atre.g;
                    }
                    if ((atre.a & 2) != 0) {
                        avxq avxq = avxo.e;
                        if (avxq == null) {
                            avxq = avxq.c;
                        }
                        atqy atqy = avxq.b;
                        if (atqy == null) {
                            atqy = atqy.e;
                        }
                        if (atqy.c.size() > 0) {
                            avxq avxq2 = avxo.c;
                            if (avxq2 == null) {
                                avxq2 = avxq.c;
                            }
                            atqy atqy2 = avxq2.b;
                            if (atqy2 == null) {
                                atqy2 = atqy.e;
                            }
                            if (atqy2.c.size() > 0) {
                                frameLayout.addView(a(frameLayout, bundle, layoutInflater));
                                return frameLayout;
                            }
                        }
                    }
                }
            }
        }
        xtl.d("PhoneVerificationContactNumberInputScreenRenderer invalid.");
        vbm vbm = this.ae;
        if (vbm != null) {
            vbm.Y();
        }
        return frameLayout;
    }

    private final View a(ViewGroup viewGroup, Bundle bundle, LayoutInflater layoutInflater) {
        String str;
        CharSequence charSequence;
        String str2;
        atfx atfx;
        arml arml;
        arml arml2;
        arml arml3;
        arml arml4;
        atra atra;
        Bundle bundle2 = bundle;
        LayoutInflater layoutInflater2 = layoutInflater;
        if (bundle2 == null) {
            str = null;
            charSequence = null;
            str2 = null;
            atfx = null;
        } else {
            charSequence = bundle2.getString("SAVED_COUNTRY_CODE");
            str2 = bundle2.getString("SAVED_PHONE_NUMBER");
            atfx = atfx.a(bundle2.getInt("SAVED_CODE_DELIVERY_METHOD"));
            if (atfx == null) {
                atfx = atfx.CODE_DELIVERY_METHOD_UNKNOWN;
            }
            str = bundle2.getString("SAVED_ERROR_MESSAGE");
        }
        boolean z = false;
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater2.inflate(R.layout.verification_phone_entry_fragment, viewGroup, false);
        this.b = (ContentLoadingProgressBar) viewGroup2.findViewById(R.id.progress_bar);
        this.ah = (TextView) viewGroup2.findViewById(R.id.title);
        this.aj = (ImageButton) viewGroup2.findViewById(R.id.back_arrow_button);
        this.ak = (Spinner) viewGroup2.findViewById(R.id.countries);
        this.a = (Button) viewGroup2.findViewById(R.id.send_code_button);
        this.c = (EditText) viewGroup2.findViewById(R.id.phone_number_field);
        this.al = (TextView) viewGroup2.findViewById(R.id.phone_number_label);
        this.am = viewGroup2.findViewById(R.id.phone_number_underline);
        this.ai = (TextView) viewGroup2.findViewById(R.id.error_message);
        this.an = (LinearLayout) viewGroup2.findViewById(R.id.code_delivery_radio_group);
        avxo avxo = this.Z;
        if ((avxo.a & 1) != 0) {
            arml = avxo.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        Spanned a = ajqy.a(arml);
        avxm avxm = this.Z.f;
        if (avxm == null) {
            avxm = avxm.c;
        }
        aphg aphg = avxm.b;
        if (aphg == null) {
            aphg = aphg.s;
        }
        if ((aphg.a & 128) == 0) {
            arml2 = null;
        } else {
            avxm = this.Z.f;
            if (avxm == null) {
                avxm = avxm.c;
            }
            aphg = avxm.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
            arml2 = aphg.g;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        }
        Spanned a2 = ajqy.a(arml2);
        avxo avxo2 = this.Z;
        if ((avxo2.a & 32) != 0) {
            arml3 = avxo2.g;
            if (arml3 == null) {
                arml3 = arml.f;
            }
        } else {
            arml3 = null;
        }
        Spanned a3 = ajqy.a(arml3);
        avxs avxs = this.Z.d;
        if (avxs == null) {
            avxs = avxs.c;
        }
        atre atre = avxs.b;
        if (atre == null) {
            atre = atre.g;
        }
        arml arml5 = atre.b;
        if (arml5 == null) {
            arml5 = arml.f;
        }
        Spanned a4 = ajqy.a(arml5);
        this.ao = new ArrayList();
        avxq avxq = this.Z.e;
        if (avxq == null) {
            avxq = avxq.c;
        }
        atqy atqy = avxq.b;
        if (atqy == null) {
            atqy = atqy.e;
        }
        int size = atqy.c.size();
        this.an.setWeightSum((float) size);
        int i = 0;
        while (i < size) {
            avxq avxq2 = this.Z.e;
            if (avxq2 == null) {
                avxq2 = avxq.c;
            }
            atqy atqy2 = avxq2.b;
            if (atqy2 == null) {
                atqy2 = atqy.e;
            }
            atra atra2 = (atra) atqy2.c.get(i);
            int i2 = size;
            ViewGroup viewGroup3 = (ViewGroup) layoutInflater2.inflate(R.layout.verification_phone_entry_radio_button, this.an, z);
            RadioButton radioButton = (RadioButton) viewGroup3.findViewById(R.id.radio_button);
            if ((atra2.a & 1) != 0) {
                arml4 = atra2.d;
                if (arml4 == null) {
                    arml4 = arml.f;
                }
            } else {
                arml4 = null;
            }
            radioButton.setText(ajqy.a(arml4));
            this.ao.add(i, new zz(radioButton, atra2));
            this.an.addView(viewGroup3, i);
            i++;
            size = i2;
            layoutInflater2 = layoutInflater;
            z = false;
        }
        if (atfx != null) {
            for (i = 0; i < this.ao.size(); i++) {
                atra atra3 = (atra) ((zz) this.ao.get(i)).b;
                z = (atra3.b == 3 ? ((Integer) atra3.c).intValue() : 0) == atfx.c;
                ((RadioButton) ((zz) this.ao.get(i)).a).setChecked(z);
                if (z) {
                    this.ac = atfx;
                }
            }
        } else {
            for (i = 0; i < this.ao.size(); i++) {
                boolean z2 = ((atra) ((zz) this.ao.get(i)).b).g;
                ((RadioButton) ((zz) this.ao.get(i)).a).setChecked(z2);
                if (z2) {
                    atra = (atra) ((zz) this.ao.get(i)).b;
                    this.ac = atfx.a(atra.b == 3 ? ((Integer) atra.c).intValue() : 0);
                }
            }
        }
        if (str2 != null) {
            this.aa = str2;
            this.c.setText(str2);
        }
        this.ah.setText(a);
        this.a.setText(a2.toString().toUpperCase(Locale.getDefault()));
        this.al.setText(a4);
        this.aj.setOnClickListener(new vbj(this));
        this.a.setOnClickListener(new vbk(this));
        this.ap = new ArrayList();
        this.aq = new HashMap();
        this.ar = new HashMap();
        ArrayAdapter arrayAdapter = new ArrayAdapter(p(), R.layout.country_spinner_item);
        avxq avxq3 = this.Z.c;
        if (avxq3 == null) {
            avxq3 = avxq.c;
        }
        atqy atqy3 = avxq3.b;
        if (atqy3 == null) {
            atqy3 = atqy.e;
        }
        Object obj = null;
        for (atra atra4 : atqy3.c) {
            if ((atra4.a & 1) != 0) {
                arml4 = atra4.d;
                if (arml4 == null) {
                    arml4 = arml.f;
                }
            } else {
                arml4 = null;
            }
            Spanned a5 = ajqy.a(arml4);
            if ((atra4.a & 2) != 0) {
                arml2 = atra4.e;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
            } else {
                arml2 = null;
            }
            a2 = ajqy.a(arml2);
            CharSequence charSequence2 = atra4.b == 2 ? (String) atra4.c : "";
            if (TextUtils.equals(charSequence, charSequence2)) {
                this.ab = charSequence2;
            } else {
                if (TextUtils.isEmpty(charSequence) && atra4.g) {
                    this.ab = charSequence2;
                }
                this.ap.add(a5);
                this.aq.put(a5, a2);
                this.ar.put(a5, charSequence2);
            }
            obj = a5;
            this.ap.add(a5);
            this.aq.put(a5, a2);
            this.ar.put(a5, charSequence2);
        }
        List list = this.ap;
        Collections.sort(list, vbl.a);
        arrayAdapter.addAll(list);
        arrayAdapter.setDropDownViewResource(R.layout.country_spinner_dropdown_item);
        this.ak.setAdapter(arrayAdapter);
        this.ak.setSelection(this.ap.indexOf(obj));
        this.c.setHint((CharSequence) this.aq.get(obj));
        aa();
        if (str != null) {
            b(str);
        } else if (!TextUtils.isEmpty(a3)) {
            b(a3.toString());
        }
        this.c.post(new vbi(this));
        return viewGroup2;
    }

    public final void B() {
        super.B();
        Z();
    }

    public final void j_(boolean z) {
        if (!z) {
            this.c.requestFocus();
            X();
        }
    }

    public final void ad_() {
        super.ad_();
        Y();
    }

    private final void Y() {
        EditText editText = this.c;
        if (editText != null) {
            editText.removeTextChangedListener(this);
        }
        Spinner spinner = this.ak;
        if (spinner != null) {
            spinner.setOnItemSelectedListener(null);
        }
        if (this.ao != null) {
            for (int i = 0; i < this.ao.size(); i++) {
                ((RadioButton) ((zz) this.ao.get(i)).a).setOnCheckedChangeListener(null);
            }
        }
    }

    private final void Z() {
        EditText editText = this.c;
        if (editText != null) {
            editText.addTextChangedListener(this);
        }
        Spinner spinner = this.ak;
        if (spinner != null) {
            spinner.setOnItemSelectedListener(this);
        }
        if (this.ao != null) {
            for (int i = 0; i < this.ao.size(); i++) {
                ((RadioButton) ((zz) this.ao.get(i)).a).setOnCheckedChangeListener(this);
            }
        }
    }

    private final void aa() {
        Button button = this.a;
        boolean z = false;
        if (!(TextUtils.isEmpty(this.ab) || TextUtils.isEmpty(this.aa) || this.ac.c <= 0)) {
            z = true;
        }
        button.setEnabled(z);
        f();
    }

    public final void b(String str) {
        nn p = p();
        if (p != null && !TextUtils.isEmpty(str)) {
            this.an.setVisibility(8);
            this.ai.setVisibility(0);
            this.ai.setText(str);
            this.am.setBackgroundColor(ra.c(p, R.color.av_error_text));
        }
    }

    public final void f() {
        nn p = p();
        if (p != null) {
            this.an.setVisibility(0);
            this.ai.setVisibility(8);
            this.ai.setText("");
            this.am.setBackgroundColor(ra.c(p, R.color.av_enabled_blue));
        }
    }

    public final void W() {
        nn p = p();
        if (p != null) {
            ((InputMethodManager) p.getSystemService("input_method")).hideSoftInputFromWindow(this.c.getWindowToken(), 0);
        }
    }

    public final void X() {
        Context M_ = M_();
        if (M_ != null) {
            ((InputMethodManager) M_.getSystemService("input_method")).showSoftInput(this.c, 0);
        }
    }

    public final void e(Bundle bundle) {
        bundle.putInt("SAVED_CODE_DELIVERY_METHOD", this.ac.c);
        bundle.putString("SAVED_COUNTRY_CODE", this.ab);
        bundle.putString("SAVED_PHONE_NUMBER", this.aa);
        bundle.putString("SAVED_ERROR_MESSAGE", this.ai.getText().toString());
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Context M_ = M_();
        View view = this.K;
        if (M_ != null && view != null && (view instanceof ViewGroup)) {
            Y();
            Bundle bundle = new Bundle();
            LayoutInflater from = LayoutInflater.from(new ContextThemeWrapper(M_, this.ag.a));
            e(bundle);
            ViewGroup viewGroup = (ViewGroup) view;
            View a = a(viewGroup, bundle, from);
            viewGroup.removeAllViews();
            viewGroup.addView(a);
            Z();
        }
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        String str = (String) this.ar.get(this.ap.get(i));
        if (!TextUtils.equals(str, this.ab)) {
            this.c.setHint((CharSequence) this.aq.get(this.ap.get(i)));
            this.ab = str;
            aa();
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        f();
        this.aa = this.c.getText().toString();
        aa();
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z) {
            for (int i = 0; i < this.ao.size(); i++) {
                if (((zz) this.ao.get(i)).a == compoundButton) {
                    atra atra = (atra) ((zz) this.ao.get(i)).b;
                    this.ac = atfx.a(atra.b == 3 ? ((Integer) atra.c).intValue() : 0);
                } else {
                    ((RadioButton) ((zz) this.ao.get(i)).a).setChecked(false);
                }
            }
            aa();
        }
    }

    public final void a(avxf avxf, long j) {
        this.a.setEnabled(true);
        this.b.a();
        W();
        vbm vbm = this.ae;
        if (vbm != null) {
            vbm.a(avxf, j);
        }
    }

    public final void a(avxo avxo) {
        this.a.setEnabled(true);
        this.b.a();
        W();
        vbm vbm = this.ae;
        if (vbm != null) {
            vbm.b(avxo);
        }
    }

    public final void b() {
        this.a.setEnabled(true);
        this.b.a();
        W();
        vbm vbm = this.ae;
        if (vbm != null) {
            vbm.Y();
        }
    }
}
