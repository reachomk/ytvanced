package defpackage;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.res.Resources;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.List;
import java.util.Map;

/* renamed from: zsq */
public final class zsq extends akcn {
    public aphg a;
    public aphg b;
    public Map c;
    private final aaas g;
    private final acvx h;
    private final akkq i;
    private final akvp j;

    public zsq(aaas aaas, acvx acvx, akvp akvp, akkq akkq) {
        super(aaas, null);
        this.g = (aaas) amqw.a((Object) aaas);
        this.h = (acvx) amqw.a((Object) acvx);
        this.j = akvp;
        this.i = akkq;
    }

    public final void a(Context context, int i, Spanned spanned, List list, aygk aygk, aygk aygk2, aygk aygk3, arwf arwf, boolean z) {
        Context context2 = context;
        aygk aygk4 = aygk;
        aygk aygk5 = aygk2;
        aygk aygk6 = aygk3;
        CharSequence charSequence = null;
        int i2 = i;
        View inflate = LayoutInflater.from(context).inflate(i, null);
        Builder builder = new Builder(context);
        builder.setView(inflate);
        xoe xoe = new xoe(context);
        int a = xwe.a(context, R.attr.ytCallToAction, 0);
        if (aygk4 != null && aygk4.b.size() > 0) {
            this.i.a((ImageView) inflate.findViewById(R.id.header), aygk4);
            View findViewById = inflate.findViewById(R.id.link_icon_background);
            if (aygk5 == null || aygk6 == null) {
                findViewById.setVisibility(8);
            } else {
                a(context.getResources(), (ImageView) inflate.findViewById(R.id.user_avatar), aygk6);
                a(context.getResources(), (ImageView) inflate.findViewById(R.id.third_party_avatar), aygk5);
                ImageView imageView = (ImageView) inflate.findViewById(R.id.link_icon);
                akvp akvp = this.j;
                arwh a2 = arwh.a(arwf.b);
                if (a2 == null) {
                    a2 = arwh.UNKNOWN;
                }
                imageView.setImageResource(akvp.a(a2));
                xoe.a(findViewById.getBackground(), a);
            }
        } else {
            inflate.findViewById(R.id.header_container).setVisibility(8);
        }
        if (z) {
            inflate.findViewById(R.id.close_button).setOnClickListener(new zst(this));
            inflate.findViewById(R.id.link_button_container).setOnClickListener(new zss(this));
            TextView textView = (TextView) inflate.findViewById(R.id.link_button);
            xoe.a(textView.getBackground(), a);
            textView.setTextColor(xwe.a(context, R.attr.ytFilledButtonText, 0));
            textView.setText(zsq.a(this.a));
            builder.setNegativeButton(null, this);
            builder.setPositiveButton(null, this);
        } else {
            builder.setNegativeButton(zsq.a(this.b), this);
            builder.setPositiveButton(zsq.a(this.a), this);
        }
        xpr.a((TextView) inflate.findViewById(R.id.title), (CharSequence) spanned);
        TextView textView2 = (TextView) inflate.findViewById(R.id.message);
        aaas aaas = this.g;
        if (!list.isEmpty()) {
            r4 = new CharSequence[2];
            String str = "line.separator";
            r4[0] = System.getProperty(str);
            r4[1] = System.getProperty(str);
            CharSequence concat = TextUtils.concat(r4);
            for (arml a3 : list) {
                Spanned a4 = aabb.a(a3, aaas, false);
                if (charSequence != null) {
                    charSequence = TextUtils.concat(new CharSequence[]{charSequence, concat, a4});
                } else {
                    charSequence = a4;
                }
            }
        }
        textView2.setText(charSequence);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        a(builder.create());
        d();
        aphg aphg = this.b;
        if (aphg != null && (aphg.a & 262144) != 0) {
            this.h.a(new acvs(aphg.r));
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        aphg aphg = this.a;
        if (aphg != null) {
            if ((aphg.a & 262144) != 0) {
                this.h.a(3, new acvs(aphg.r), null);
            }
            aphg = this.a;
            if ((aphg.a & 8192) != 0) {
                aaas aaas = this.d;
                apxu apxu = aphg.n;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, c());
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        aphg aphg = this.b;
        if (aphg != null) {
            if ((aphg.a & 262144) != 0) {
                this.h.a(3, new acvs(aphg.r), null);
            }
            aphg = this.b;
            int i = aphg.a;
            aaas aaas;
            apxu apxu;
            if ((i & 4096) != 0) {
                aaas = this.d;
                apxu = aphg.m;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, c());
            } else if ((i & 8192) != 0) {
                aaas = this.d;
                apxu = aphg.n;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, c());
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final Map c() {
        Map c = super.c();
        Map map = this.c;
        if (map != null) {
            c.putAll(map);
        }
        return c;
    }

    private static CharSequence a(aphg aphg) {
        arml arml = null;
        if (aphg == null) {
            return null;
        }
        if ((aphg.a & 128) != 0) {
            arml = aphg.g;
            if (arml == null) {
                arml = arml.f;
            }
        }
        return ajqy.a(arml);
    }

    private final void a(Resources resources, ImageView imageView, aygk aygk) {
        this.i.b(aklb.e(aygk), new zsv(resources, imageView));
    }
}
