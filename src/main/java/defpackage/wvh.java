package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.CircularImageView;
import com.google.android.youtube.R;
import java.text.NumberFormat;
import java.text.ParseException;

/* renamed from: wvh */
public final class wvh {
    public final Context a;
    public final View b = this.r.findViewById(R.id.decrement);
    public final View c = this.r.findViewById(R.id.increment);
    public final TextView d = ((TextView) this.r.findViewById(R.id.header));
    public final TextView e = ((TextView) this.r.findViewById(R.id.amount));
    public final TextView f = ((TextView) this.r.findViewById(R.id.additional_info));
    public final EditText g = ((EditText) this.r.findViewById(R.id.amount_input));
    public final ImageView h = ((ImageView) this.r.findViewById(R.id.channel_banner));
    public final akle i;
    public final akle j;
    public final akle k;
    public final CircularImageView l;
    public final akvp m;
    public final NumberFormat n = NumberFormat.getCurrencyInstance();
    public azpi o;
    public boolean p;
    public final wve q;
    private final View r;
    private final View s = this.r.findViewById(R.id.amount_underline);
    private final InputMethodManager t;
    private final NumberFormat u = NumberFormat.getInstance();
    private boolean v;

    public wvh(Context context, akkl akkl, akvp akvp, InputMethodManager inputMethodManager, View view) {
        this.a = context;
        this.r = (View) amqw.a((Object) view);
        this.m = (akvp) amqw.a((Object) akvp);
        this.t = inputMethodManager;
        this.i = new akle(akkl, this.h, true);
        this.j = new akle(akkl, (ImageView) this.r.findViewById(R.id.channel_thumbnail), true);
        this.k = new akle(akkl, (ImageView) this.r.findViewById(R.id.viewer_thumbnail), true);
        this.l = (CircularImageView) this.r.findViewById(R.id.tip_icon);
        wvg wvg = new wvg(this);
        this.c.setOnClickListener(wvg);
        this.b.setOnClickListener(wvg);
        wvj wvj = new wvj(this);
        this.e.setOnFocusChangeListener(wvj);
        this.e.setOnTouchListener(wvj);
        this.g.setOnEditorActionListener(wvj);
        this.r.setOnTouchListener(wvj);
        this.q = new wve(this.r);
    }

    public final azpf a() {
        c();
        wve wve = this.q;
        String obj = wve.c.getText().toString();
        if (wve.d == null || TextUtils.isEmpty(obj)) {
            wve.d.c(azph.d);
        } else {
            wve.d.a(azph.d, obj.toString());
        }
        return (azpf) ((anxl) this.o.build());
    }

    public final void b() {
        if (!this.v) {
            this.v = true;
            this.e.setVisibility(4);
            this.s.setVisibility(4);
            this.g.setVisibility(0);
            EditText editText = this.g;
            editText.setSelection(editText.getText().length());
            this.g.requestFocusFromTouch();
            InputMethodManager inputMethodManager = this.t;
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(this.g, 0);
            }
        }
    }

    public final void c() {
        if (this.o != null && this.v) {
            double doubleValue;
            this.v = false;
            try {
                doubleValue = this.u.parse(this.g.getText().toString()).doubleValue();
            } catch (ParseException unused) {
                xtl.c("Failed to parse viewer's tip currency input.");
                doubleValue = wvi.d((azpf) ((anxl) this.o.build()));
            }
            a(doubleValue);
            this.g.setVisibility(8);
            this.e.setVisibility(0);
            this.s.setVisibility(0);
            InputMethodManager inputMethodManager = this.t;
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(this.g.getWindowToken(), 0);
            }
            d();
        }
    }

    public final void d() {
        azpi azpi = this.o;
        if (azpi != null) {
            double d = wvi.d((azpf) ((anxl) azpi.build()));
            this.e.setText(this.n.format(d));
            this.g.setText(this.u.format(d));
        }
    }

    public final void a(double d) {
        azpi azpi = this.o;
        if (azpi != null && !this.p) {
            wvi.a(azpi, Double.valueOf(d * 1000000.0d).longValue());
        }
    }
}
