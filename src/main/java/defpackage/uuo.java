package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.FingerprintAuthRendererOuterClass$FingerprintAuthRenderer;

/* renamed from: uuo */
public final class uuo implements akot, uvs {
    public final uuu a;
    private final Resources b;
    private final View c;
    private final TextView d = ((TextView) this.c.findViewById(R.id.title));
    private final TextView e;
    private final TextView f;
    private final ImageView g;
    private final TextView h;
    private final TextView i;
    private final uvp j;
    private final aaas k;
    private int l;
    private final Spanned m;
    private final Spanned n;

    public uuo(Context context, uvp uvp, aaas aaas, uuu uuu, ViewGroup viewGroup) {
        this.b = context.getResources();
        this.a = (uuu) amqw.a((Object) uuu);
        this.j = uvp;
        this.k = aaas;
        this.c = LayoutInflater.from(context).inflate(R.layout.modal_fingerprint_auth_layout, viewGroup, false);
        this.c.findViewById(R.id.close_button).setOnClickListener(new uun(uuu));
        this.e = (TextView) this.c.findViewById(R.id.description);
        this.f = (TextView) this.c.findViewById(R.id.other_methods_field);
        this.g = (ImageView) this.c.findViewById(R.id.fingerprint_icon);
        this.h = (TextView) this.c.findViewById(R.id.error_message_field);
        this.i = (TextView) this.c.findViewById(R.id.use_password_field);
        this.i.setOnClickListener(new uuq(uuu));
        this.m = a((int) R.string.other_methods_suffix);
        this.n = a((int) R.string.use_password_suffix);
    }

    private final Spanned a(int i) {
        String string = this.b.getString(i);
        String string2 = this.b.getString(R.string.fingerprint_other_methods_prefix, new Object[]{string});
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(string2);
        spannableStringBuilder.setSpan(new uus(this, i), spannableStringBuilder.length() - string.length(), spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final View K_() {
        return this.c;
    }

    public final void a(akpb akpb) {
        f();
        this.l = 0;
        this.g.setImageResource(R.drawable.quantum_ic_fingerprint_grey600_48);
        this.j.b();
    }

    public final void b() {
        e();
    }

    public final void c() {
        if (this.l > 0) {
            xpr.a(this.h, this.b.getString(R.string.retry_fingerprint));
            this.l--;
            return;
        }
        e();
    }

    public final void d() {
        this.g.setImageResource(R.drawable.quantum_ic_fingerprint_googblue_48);
        f();
        this.g.postDelayed(new uup(this), 500);
    }

    private final void f() {
        xpr.a(this.h, false);
        xpr.a(this.i, false);
    }

    public final void e() {
        this.j.b();
        this.h.setText(this.b.getString(R.string.fingerprint_failed));
        xpr.a(this.h, true);
        xpr.a(this.i, true);
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        FingerprintAuthRendererOuterClass$FingerprintAuthRenderer fingerprintAuthRendererOuterClass$FingerprintAuthRenderer = (FingerprintAuthRendererOuterClass$FingerprintAuthRenderer) obj;
        CharSequence charSequence = null;
        akor.a.a(fingerprintAuthRendererOuterClass$FingerprintAuthRenderer.f.d(), null);
        TextView textView = this.d;
        arml arml = fingerprintAuthRendererOuterClass$FingerprintAuthRenderer.b;
        if (arml == null) {
            arml = arml.f;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = this.e;
        if (fingerprintAuthRendererOuterClass$FingerprintAuthRenderer.c.size() != 0) {
            charSequence = new SpannableStringBuilder();
            Object obj2 = 1;
            for (arml arml2 : fingerprintAuthRendererOuterClass$FingerprintAuthRenderer.c) {
                if (obj2 == null) {
                    charSequence.append(System.getProperty("line.separator"));
                }
                charSequence.append(aabb.a(arml2, this.k, true));
                obj2 = null;
            }
        }
        xpr.a(textView, charSequence);
        this.l = fingerprintAuthRendererOuterClass$FingerprintAuthRenderer.d;
        if (fingerprintAuthRendererOuterClass$FingerprintAuthRenderer.e) {
            this.f.setText(this.m);
        } else {
            this.f.setText(this.n);
        }
        f();
        this.j.a(this);
    }
}
