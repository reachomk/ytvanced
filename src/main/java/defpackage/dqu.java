package defpackage;

import android.app.Activity;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: dqu */
public final class dqu implements akot {
    public final Activity a;
    public final ImageView b = ((ImageView) this.i.findViewById(R.id.account_banner));
    public final xhv c;
    public final xpa d;
    public apxu e;
    public afpu f;
    public xbg g;
    private final akkq h;
    private final View i;
    private final View j = this.i.findViewById(R.id.separator);
    private final TextView k = ((TextView) this.i.findViewById(R.id.account_name));
    private final TextView l = ((TextView) this.i.findViewById(R.id.email));
    private final TextView m = ((TextView) this.i.findViewById(R.id.manage_account));
    private final TextView n = ((TextView) this.i.findViewById(R.id.status_text));
    private final ImageView o = ((ImageView) this.i.findViewById(R.id.account_thumbnail));
    private final akko p;
    private final akko q;

    public dqu(Activity activity, afqe afqe, akkq akkq, aaas aaas, xhv xhv, xpa xpa) {
        amqw.a((Object) aaas);
        amqw.a((Object) afqe);
        this.a = (Activity) amqw.a((Object) activity);
        this.h = (akkq) amqw.a((Object) akkq);
        this.c = (xhv) amqw.a((Object) xhv);
        this.d = (xpa) amqw.a((Object) xpa);
        this.i = LayoutInflater.from(activity).inflate(R.layout.active_account_header, null);
        this.q = akkq.a().g().a(new dqy(this)).a();
        this.p = akkq.a().g().a((int) R.drawable.missing_avatar).a();
        this.o.setOnClickListener(new dqx(this, aaas));
        this.k.setOnClickListener(new dqw(this, afqe, activity));
        this.m.setOnClickListener(new dqz(this));
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.i;
    }

    public final void b() {
        this.b.setImageDrawable(null);
        this.b.setBackgroundResource(R.drawable.ic_default_channel_placeholder);
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        akkq akkq;
        ImageView imageView;
        aygk aygk;
        aofj aofj = (aofj) obj;
        int i = 1;
        apxu apxu = null;
        if ((aofj.a & 1) != 0) {
            arml = aofj.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        this.k.setText(ajqy.a(arml));
        this.k.setContentDescription(this.a.getString(R.string.account_switcher_accessibility_label, new Object[]{r7}));
        if ((aofj.a & 2) != 0) {
            arml = aofj.c;
            if (arml == null) {
                arml = arml.f;
            }
            this.l.setText(ajqy.a(arml));
            this.l.setVisibility(0);
        } else {
            this.l.setVisibility(8);
        }
        int i2 = aofj.a & 16;
        if (i2 == 0) {
            i = 0;
        }
        if (i2 != 0) {
            arml arml2;
            if (i2 == 0) {
                arml2 = null;
            } else {
                arml2 = aofj.f;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
            }
            this.m.setText(ajqy.a(arml2));
            this.m.setVisibility(0);
        } else {
            this.m.setVisibility(8);
        }
        if (i2 == 0) {
            this.k.setTextColor(xwe.a(this.a, R.attr.ytOverlayTextPrimary));
            this.l.setTextColor(xwe.a(this.a, R.attr.ytOverlayTextPrimary));
        } else {
            this.k.setTextColor(xwe.a(this.a, R.attr.ytTextPrimary));
            this.l.setTextColor(xwe.a(this.a, R.attr.ytTextPrimary));
        }
        Drawable drawable = this.a.getResources().getDrawable(R.drawable.ic_account_switcher_caret_down);
        xoe.a(drawable, this.k.getTextColors(), Mode.SRC_IN);
        this.k.setCompoundDrawablesRelativeWithIntrinsicBounds(null, null, drawable, null);
        if (i != 0) {
            this.b.setVisibility(8);
        } else if ((aofj.a & 8) == 0) {
            b();
        } else {
            akkq = this.h;
            imageView = this.b;
            aygk = aofj.e;
            if (aygk == null) {
                aygk = aygk.f;
            }
            akkq.a(imageView, aygk, this.q);
        }
        akkq = this.h;
        imageView = this.o;
        aygk = aofj.d;
        if (aygk == null) {
            aygk = aygk.f;
        }
        akkq.a(imageView, aygk, this.p);
        CharSequence a = aofj.l.size() > 0 ? ajqy.a((arml) aofj.l.get(0)) : null;
        xpr.a(this.n, a);
        this.n.setContentDescription(a);
        if (!TextUtils.isEmpty(a)) {
            this.j.setVisibility(8);
        }
        if ((aofj.a & 64) != 0) {
            apxu = aofj.h;
            if (apxu == null) {
                apxu = apxu.d;
            }
        }
        this.e = apxu;
    }
}
