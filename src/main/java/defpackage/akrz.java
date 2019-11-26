package defpackage;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.os.Bundle;
import android.support.design.textfield.TextInputLayout;
import android.support.v7.widget.Toolbar;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: akrz */
public final class akrz extends afe {
    public final atze a;
    public final aksd b;
    public ImageButton c;
    public TextInputLayout d;
    public EditText e;
    public Spinner f;
    public Spinner g;
    public EditText h;
    private final amqp i;

    public akrz(Context context, xwb xwb, atze atze, amqp amqp, aksd aksd) {
        super(context, xwb.a);
        this.a = atze;
        this.i = amqp;
        this.b = aksd;
        setContentView((int) R.layout.legal_report_form);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onCreate(Bundle bundle) {
        arml arml;
        TextView textView;
        atze atze;
        arml arml2;
        Spinner spinner;
        Context context;
        axak axak;
        super.onCreate(bundle);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.b(xoe.a(ra.a(getContext(), (int) R.drawable.quantum_ic_close_white_24), xwe.a(getContext(), R.attr.ytBrandIconInactive), Mode.SRC_IN));
        toolbar.a(new akry(this));
        atze atze2 = this.a;
        arml arml3 = null;
        if ((atze2.a & 1) != 0) {
            arml = atze2.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        toolbar.a(ajqy.a(arml));
        toolbar.c((int) R.string.cancel);
        this.c = (ImageButton) findViewById(R.id.send_report);
        this.c.setOnClickListener(new aksb(this));
        ImageButton imageButton = this.c;
        aphj aphj = this.a.o;
        if (aphj == null) {
            aphj = aphj.d;
        }
        aphg aphg = aphj.b;
        if (aphg == null) {
            aphg = aphg.s;
        }
        if ((aphg.a & 128) == 0) {
            arml = null;
        } else {
            aphj = this.a.o;
            if (aphj == null) {
                aphj = aphj.d;
            }
            aphg = aphj.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
            arml = aphg.g;
            if (arml == null) {
                arml = arml.f;
            }
        }
        imageButton.setContentDescription(ajqy.a(arml));
        if (this.i.a()) {
            textView = (TextView) findViewById(R.id.timestamp_label);
            atze = this.a;
            if ((atze.a & 2) != 0) {
                arml2 = atze.c;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
            } else {
                arml2 = null;
            }
            xpr.a(textView, ajqy.a(arml2));
            ((TextView) findViewById(R.id.timestamp)).setText(((aksj) this.i.b()).toString());
            findViewById(R.id.timestamp_container).setVisibility(0);
        }
        this.d = (TextInputLayout) findViewById(R.id.description_container);
        this.d.c();
        TextInputLayout textInputLayout = this.d;
        textInputLayout.l = true;
        textInputLayout.a((int) R.style.ValidatedTextAreaHint);
        textInputLayout = this.d;
        atze = this.a;
        if ((atze.a & 32) != 0) {
            arml2 = atze.g;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        } else {
            arml2 = null;
        }
        textInputLayout.a(ajqy.a(arml2));
        this.e = (EditText) findViewById(R.id.description);
        EditText editText = this.e;
        atze = this.a;
        if ((atze.a & 32) != 0) {
            arml3 = atze.g;
            if (arml3 == null) {
                arml3 = arml.f;
            }
        }
        editText.setContentDescription(ajqy.a(arml3));
        this.e.addTextChangedListener(new aksf(this));
        if (this.a.f > 0) {
            this.d.c(true);
            this.d.b(this.a.f);
            this.e.setFilters(new InputFilter[]{new LengthFilter(this.a.f)});
        }
        aksa aksa = new aksa(this);
        this.f = (Spinner) findViewById(R.id.issue_type);
        if ((this.a.a & 256) != 0) {
            spinner = this.f;
            context = getContext();
            axak = this.a.j;
            if (axak == null) {
                axak = axak.a;
            }
            spinner.setAdapter(new akrw(context, (aqyh) ajzv.a(ajzv.a(axak), aqyh.class)));
            this.f.setOnTouchListener(aksa);
            spinner = this.f;
            axak axak2 = this.a.j;
            if (axak2 == null) {
                axak2 = axak.a;
            }
            spinner.setOnItemSelectedListener(new aksc(this, spinner, ((aqyh) ajzv.a(ajzv.a(axak2), aqyh.class)).c));
            this.f.setVisibility(0);
        }
        this.g = (Spinner) findViewById(R.id.affiliation);
        if ((this.a.a & 512) != 0) {
            spinner = this.g;
            context = getContext();
            axak = this.a.k;
            if (axak == null) {
                axak = axak.a;
            }
            spinner.setAdapter(new akrw(context, (aqyh) ajzv.a(ajzv.a(axak), aqyh.class)));
            this.g.setOnTouchListener(aksa);
            Spinner spinner2 = this.g;
            axak axak3 = this.a.k;
            if (axak3 == null) {
                axak3 = axak.a;
            }
            spinner2.setOnItemSelectedListener(new aksc(this, spinner2, ((aqyh) ajzv.a(ajzv.a(axak3), aqyh.class)).c));
            this.g.setVisibility(0);
        }
        this.h = (EditText) findViewById(R.id.name);
        atze atze3 = this.a;
        if ((atze3.a & 2048) != 0) {
            EditText editText2 = this.h;
            arml arml4 = atze3.m;
            if (arml4 == null) {
                arml4 = arml.f;
            }
            editText2.setContentDescription(ajqy.a(arml4));
            textInputLayout = (TextInputLayout) findViewById(R.id.name_container);
            textInputLayout.c();
            textInputLayout.l = true;
            arml2 = this.a.m;
            if (arml2 == null) {
                arml2 = arml.f;
            }
            textInputLayout.a(ajqy.a(arml2));
            textInputLayout.setVisibility(0);
        }
        textView = (TextView) findViewById(R.id.name_subtext);
        arml = this.a.n;
        if (arml == null) {
            arml = arml.f;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = (TextView) findViewById(R.id.required);
        arml = this.a.i;
        if (arml == null) {
            arml = arml.f;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = (TextView) findViewById(R.id.footer);
        arml = this.a.h;
        if (arml == null) {
            arml = arml.f;
        }
        xpr.a(textView, ajqy.a(arml));
    }

    public final void b() {
        this.b.a(this, this.e.getText().toString(), (aqyf) this.f.getSelectedItem(), (aqyf) this.g.getSelectedItem());
    }
}
