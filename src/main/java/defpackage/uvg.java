package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.PasswordAuthRendererOuterClass$PasswordAuthRenderer;

/* renamed from: uvg */
public final class uvg implements akot, uwa {
    public final Context a;
    public final Resources b;
    public final uuu c;
    public final TextView d = ((TextView) this.l.findViewById(R.id.password_title));
    public final TextView e = ((TextView) this.l.findViewById(R.id.password_field));
    public final TextView f = ((TextView) this.l.findViewById(R.id.error_message_field));
    public int g;
    private final ust h;
    private final akyy i;
    private final aaas j;
    private final Handler k;
    private final View l;
    private final TextView m = ((TextView) this.l.findViewById(R.id.title));
    private final TextView n = ((TextView) this.l.findViewById(R.id.description));
    private final TextView o = ((TextView) this.l.findViewById(R.id.other_methods_field));
    private final TextView p = ((TextView) this.l.findViewById(R.id.account_email_field));
    private final TextView q = ((TextView) this.l.findViewById(R.id.forgot_password_field));
    private final Spanned r;
    private final Spanned s;

    public uvg(Context context, uvy uvy, afpu afpu, Activity activity, akzb akzb, aaas aaas, Handler handler, uuu uuu, ViewGroup viewGroup) {
        this.a = context;
        this.b = activity.getResources();
        this.c = (uuu) amqw.a((Object) uuu);
        this.h = (ust) afpu.c();
        this.k = handler;
        this.l = LayoutInflater.from(context).inflate(R.layout.modal_password_auth_layout, viewGroup, false);
        this.l.findViewById(R.id.close_button).setOnClickListener(new uvf(uuu));
        this.i = akzb.a((TextView) this.l.findViewById(R.id.confirm_button));
        this.i.c = new uvi(this, uvy);
        this.e.setOnEditorActionListener(new uvh(this, uvy));
        this.j = aaas;
        this.r = a((int) R.string.other_methods_suffix);
        this.s = a((int) R.string.use_fingerprint_suffix);
    }

    public final void b() {
    }

    public final View K_() {
        return this.l;
    }

    private final void f() {
        this.d.setTextColor(xwe.a(this.a, R.attr.ytThemedBlue, 0));
        this.e.setText("");
        xpr.a(this.f, false);
    }

    public final void a(uvy uvy) {
        String charSequence = this.e.getText().toString();
        if (charSequence.length() > 0) {
            uvy.b.execute(new uvx(uvy, this, charSequence, this.h));
        }
    }

    public final void a(akpb akpb) {
        f();
        xpr.a(this.f, false);
        this.g = 0;
    }

    private final Spanned a(int i) {
        String string = this.b.getString(i);
        String string2 = this.b.getString(R.string.password_other_methods_prefix, new Object[]{string});
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(string2);
        spannableStringBuilder.setSpan(new uvj(this, i), spannableStringBuilder.length() - string.length(), spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final void c() {
        this.c.a(1);
    }

    public final void d() {
        this.k.post(new uvk(this));
    }

    public final void e() {
        this.c.a(2);
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        CharSequence charSequence;
        PasswordAuthRendererOuterClass$PasswordAuthRenderer passwordAuthRendererOuterClass$PasswordAuthRenderer = (PasswordAuthRendererOuterClass$PasswordAuthRenderer) obj;
        akor.a.a(passwordAuthRendererOuterClass$PasswordAuthRenderer.h.d(), null);
        TextView textView = this.m;
        if ((passwordAuthRendererOuterClass$PasswordAuthRenderer.a & 1) != 0) {
            arml = passwordAuthRendererOuterClass$PasswordAuthRenderer.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = this.n;
        anyd<arml> anyd = passwordAuthRendererOuterClass$PasswordAuthRenderer.c;
        if (anyd.isEmpty()) {
            charSequence = null;
        } else {
            charSequence = new SpannableStringBuilder();
            Object obj2 = 1;
            for (arml arml2 : anyd) {
                if (obj2 == null) {
                    charSequence.append(System.getProperty("line.separator"));
                }
                charSequence.append(aabb.a(arml2, this.j, true));
                obj2 = null;
            }
        }
        xpr.a(textView, charSequence);
        textView = this.q;
        if ((passwordAuthRendererOuterClass$PasswordAuthRenderer.a & 8) != 0) {
            arml = passwordAuthRendererOuterClass$PasswordAuthRenderer.f;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, aabb.a(arml, this.j, false));
        this.g = passwordAuthRendererOuterClass$PasswordAuthRenderer.d - 1;
        if (this.c.a()) {
            CharSequence charSequence2;
            textView = this.o;
            if (passwordAuthRendererOuterClass$PasswordAuthRenderer.e) {
                charSequence2 = this.r;
            } else {
                charSequence2 = this.s;
            }
            xpr.a(textView, charSequence2);
        } else {
            xpr.a(this.o, this.b.getString(R.string.use_password_only));
        }
        arml arml3 = passwordAuthRendererOuterClass$PasswordAuthRenderer.g;
        if (arml3 == null) {
            arml3 = arml.f;
        }
        aphf aphf = (aphf) aphg.s.createBuilder();
        aphf.a(arml3);
        aphf.a(3);
        this.i.a((aphg) ((anxl) aphf.build()), null);
        f();
        this.p.setText(this.h.b());
    }
}
