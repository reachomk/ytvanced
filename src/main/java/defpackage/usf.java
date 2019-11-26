package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.text.DateFormat;
import java.util.GregorianCalendar;

/* renamed from: usf */
public final class usf implements urb {
    private static final CharSequence o;
    public final urs a;
    public final GregorianCalendar b = new GregorianCalendar();
    public final View c;
    public final TextView d;
    public final EditText e;
    public final EditText f;
    public final EditText g;
    public DateFormat h;
    public final usc i;
    public boolean j;
    public boolean k;
    public CharSequence l;
    public CharSequence m;
    public CharSequence n;
    private final aaas p;
    private final TextView q;

    public usf(Context context, aaas aaas, urs urs, View view, TextView textView, TextView textView2) {
        this.a = urs;
        this.p = aaas;
        amqw.a((Object) view);
        this.q = (TextView) amqw.a((Object) textView);
        this.d = (TextView) amqw.a((Object) textView2);
        this.c = (View) amqw.a(view.findViewById(R.id.no_gplus_content));
        this.e = (EditText) amqw.a((EditText) view.findViewById(R.id.given_name));
        this.f = (EditText) amqw.a((EditText) view.findViewById(R.id.family_name));
        this.g = (EditText) amqw.a((EditText) view.findViewById(R.id.birthday));
        this.g.setOnFocusChangeListener(new usi(this));
        usj usj = new usj(this);
        this.e.addTextChangedListener(usj);
        this.f.addTextChangedListener(usj);
        this.g.addTextChangedListener(usj);
        this.i = new usc(context, (EditText) view.findViewById(R.id.gender_text), (Spinner) view.findViewById(R.id.gender_spinner));
        this.b.setTimeInMillis(0);
    }

    /* Access modifiers changed, original: final */
    public final void a(aaqc aaqc, Bundle bundle) {
        amqw.a((Object) aaqc);
        this.k = true;
        this.e.setHint(aaqc.b());
        this.f.setHint(aaqc.e());
        if (bundle == null) {
            this.e.setText(aaqc.a());
            this.f.setText(aaqc.d());
        }
        CharSequence charSequence = null;
        for (CharSequence charSequence2 : aaqc.a(this.p)) {
            if (charSequence == null) {
                charSequence = charSequence2;
            } else {
                charSequence = TextUtils.concat(new CharSequence[]{charSequence, o, charSequence2});
            }
        }
        if (!aaqc.c()) {
            this.e.setInputType(0);
        }
        if (!aaqc.f()) {
            this.f.setInputType(0);
        }
        this.q.setText(charSequence);
        this.l = aaqc.a(3);
        this.m = aaqc.a(1);
        this.n = aaqc.a(2);
    }

    public final boolean a() {
        return (TextUtils.isEmpty(this.e.getText()) || TextUtils.isEmpty(this.f.getText())) ? false : true;
    }

    public final boolean b() {
        return TextUtils.isEmpty(this.g.getText()) ^ 1;
    }

    public final void a(int i, int i2, int i3) {
        this.b.set(i, i2, i3);
        c();
    }

    public final void c() {
        this.g.setText(this.h.format(Long.valueOf(this.b.getTimeInMillis())));
    }

    static {
        r0 = new CharSequence[2];
        String str = "line.separator";
        r0[0] = System.getProperty(str);
        r0[1] = System.getProperty(str);
        o = TextUtils.concat(r0);
    }
}
