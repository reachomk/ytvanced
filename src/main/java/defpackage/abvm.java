package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.TextAppearanceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;

/* renamed from: abvm */
public abstract class abvm implements abri, abun, xsu {
    private static final long u = TimeUnit.SECONDS.toMillis(5);
    private ImageView A;
    private final Runnable B = new abvp(this);
    private final Handler C = new Handler();
    private boolean D;
    private boolean E;
    public final Context a;
    public final acvx b;
    public final aaas c;
    public final akvp d;
    public final abrq e;
    public final abrf f;
    public final boolean g;
    public final boolean h;
    public abrl i;
    public final abru j;
    public final alck k;
    public Spanned l;
    public int m;
    public int n;
    public abrk o;
    public boolean p;
    public boolean q;
    private final akti r;
    private final akpi s;
    private arec t;
    private final TextWatcher v;
    private final InputFilter w;
    private final abqz x;
    private int y;
    private ImageView z;

    public abvm(Context context, akvz akvz, akvp akvp, aaas aaas, acvx acvx, abrq abrq, abru abru, abrf abrf, akti akti, abqz abqz, akpi akpi, alck alck, boolean z, boolean z2) {
        this.a = (Context) amqw.a((Object) context);
        amqw.a((Object) akvz);
        this.d = (akvp) amqw.a((Object) akvp);
        this.c = (aaas) amqw.a((Object) aaas);
        this.b = (acvx) amqw.a((Object) acvx);
        this.e = abrq;
        this.j = abru;
        this.x = abqz;
        this.f = abrf;
        this.r = akti;
        this.g = z;
        this.h = z2;
        this.s = akpi;
        this.k = alck;
        this.v = new abvz(this);
        this.w = new abry();
    }

    public abstract View a(int i);

    public abstract View a(arwf arwf);

    public abstract void a(aygk aygk);

    public abstract void a(boolean z);

    /* Access modifiers changed, original: protected */
    public void b(int i) {
    }

    public abstract View d();

    public abstract EditText e();

    public abstract TextView g();

    public abstract View h();

    public abstract ImageView i();

    public abstract ViewGroup j();

    public abstract View k();

    public abstract void l();

    public abstract View m();

    public abstract ViewGroup n();

    public abstract int o();

    /* Access modifiers changed, original: protected */
    public boolean q() {
        return false;
    }

    /* Access modifiers changed, original: protected */
    public TextView r() {
        throw null;
    }

    public final void a() {
        if (!this.E) {
            EditText e = e();
            e.setRawInputType(1);
            e.setOnEditorActionListener(new abvy(this));
            e.addTextChangedListener(this.v);
            i().setOnClickListener(new abvo(this));
            this.y = h().getLayoutParams().height;
            c(false);
            this.f.a();
            this.E = true;
        }
    }

    public void a(abrl abrl) {
        this.i = abrl;
    }

    public final void a(abrk abrk) {
        this.o = abrk;
    }

    public void b() {
        ViewGroup j = j();
        if (j != null) {
            j.removeAllViews();
        }
        c(false);
        abvm.a(i(), false);
        if (g() != null) {
            g().setText(null);
        }
    }

    public final Editable p() {
        return e().getText();
    }

    public void a(ajwv ajwv) {
        z();
        y();
        this.C.removeCallbacks(this.B);
        aufd aufd = ajwv.b;
        if (aufd == null) {
            ajxc ajxc = ajwv.c;
            if (ajxc != null) {
                a(ajxc);
            } else {
                auwl auwl = ajwv.a;
                if (auwl != null) {
                    a(auwl);
                }
            }
        } else {
            EditText e = e();
            A();
            d(false);
            b(true);
            aygk aygk = aufd.c;
            if (aygk == null) {
                aygk = aygk.f;
            }
            a(aygk);
            if ((aufd.a & 4) != 0) {
                auff auff = aufd.d;
                if (auff == null) {
                    auff = auff.c;
                }
                augt augt = auff.a == 121291266 ? (augt) auff.b : augt.h;
                arml arml = augt.b;
                if (arml == null) {
                    arml = arml.f;
                }
                this.l = ajqy.a(arml);
                e.getText().clear();
                abvm.a(i(), false);
                e.setEnabled(true);
                e.setHint(s());
                this.m = augt.c;
                this.n = augt.g;
                e.setFilters(new InputFilter[]{this.w});
            }
            ViewGroup j = j();
            if (j != null) {
                j.removeAllViews();
                if (aufd.f.size() != 0 && this.g) {
                    for (auez auez : aufd.f) {
                        int i = auez.a;
                        if (i == 132562777) {
                            abrc abrc;
                            audg audg = (audg) auez.b;
                            aufb[] aufbArr = (aufb[]) aufd.e.toArray(new aufb[0]);
                            int length = aufbArr.length;
                            int i2 = 0;
                            while (true) {
                                abrc = null;
                                if (i2 >= length) {
                                    break;
                                }
                                aufb aufb = aufbArr[i2];
                                if (aufb != null) {
                                    int i3 = aufb.a;
                                    if (i3 == 129042058) {
                                        abrc = new abqx((auck) aufb.b);
                                    } else if (i3 == 189846535) {
                                        abrc = new abra((aufl) aufb.b);
                                    }
                                }
                                if (abrc != null && (audg.a & 1) != 0 && audg.b.equals(abrc.a()) && abrc.b()) {
                                    break;
                                }
                                i2++;
                            }
                            a(j, audg, abrc);
                        } else if (i == 65153809) {
                            aphg aphg = (aphg) auez.b;
                            if ((aphg.a & 16) != 0) {
                                arwf arwf = aphg.e;
                                if (arwf == null) {
                                    arwf = arwf.c;
                                }
                                View a = a(arwf);
                                aodx aodx = aphg.q;
                                if (aodx == null) {
                                    aodx = aodx.c;
                                }
                                if ((aodx.a & 1) != 0) {
                                    aodx = aphg.q;
                                    if (aodx == null) {
                                        aodx = aodx.c;
                                    }
                                    aodv aodv = aodx.b;
                                    if (aodv == null) {
                                        aodv = aodv.c;
                                    }
                                    a.setContentDescription(aodv.b);
                                }
                                a.setOnClickListener(new abvv(this, aphg));
                                j.addView(a);
                            }
                        }
                        abvm.a(j, true);
                    }
                }
            }
        }
        aufd aufd2 = ajwv.b;
        if (aufd2 != null) {
            for (aufb aufb2 : aufd2.e) {
                if (aufb2.a == 126326492) {
                    this.t = (arec) aufb2.b;
                    break;
                }
            }
        }
        e(true);
        if (this.r.a()) {
            TextWatcher a2 = this.f.a(e());
            e().removeTextChangedListener(a2);
            e().addTextChangedListener(a2);
        }
    }

    public final void f() {
        this.f.a();
        e().requestFocus();
        xpr.b(e());
        e(false);
    }

    public final void c() {
        EditText e = e();
        e.setOnEditorActionListener(null);
        e.removeTextChangedListener(this.v);
        e.removeTextChangedListener(this.f.a(e));
        e.setFilters(null);
        i().setOnClickListener(null);
        y();
        z();
    }

    /* Access modifiers changed, original: protected */
    public Spanned s() {
        return this.l;
    }

    private final void y() {
        this.f.a();
        x().setAlpha(0.0f);
        x().setVisibility(4);
        w().setAlpha(1.0f);
        w().setVisibility(0);
        w().bringToFront();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(boolean z) {
        int dimensionPixelOffset = this.a.getResources().getDimensionPixelOffset(R.dimen.live_chat_text_field_height);
        View m = m();
        int i = 8;
        m.setVisibility(!z ? 8 : 0);
        m.setMinimumHeight(dimensionPixelOffset);
        ViewGroup n = n();
        if (!z) {
            i = 0;
        }
        n.setVisibility(i);
        n.setMinimumHeight(dimensionPixelOffset);
    }

    private final void d(boolean z) {
        if (g() != null) {
            int i = 8;
            e().setVisibility(!z ? 0 : 8);
            TextView g = g();
            if (z) {
                i = 0;
            }
            g.setVisibility(i);
            x().setBackground(!z ? xpr.a(this.a, 0) : null);
            this.D = z;
        }
    }

    /* Access modifiers changed, original: protected */
    public void a(ajxc ajxc) {
        TextView g = g();
        if (g != null) {
            aphg aphg;
            d(true);
            Spanned a = ajqy.a(ajxc.a);
            SpannableStringBuilder append = new SpannableStringBuilder().append(a);
            ajzw ajzw = ajxc.e;
            if (ajzw != null) {
                aphg = (aphg) ajzv.a(ajzw, aphg.class);
                if (aphg != null) {
                    arml arml = aphg.g;
                    if (arml == null) {
                        arml = arml.f;
                    }
                    if (arml.b.size() > 0) {
                        arml = aphg.g;
                        if (arml == null) {
                            arml = arml.f;
                        }
                        String replace = ((armp) arml.b.get(0)).b.replace(" ", " ");
                        Spanned a2 = ajqy.a(ajqy.a(replace));
                        apxu apxu = aphg.n;
                        if (apxu == null) {
                            apxu = apxu.d;
                        }
                        amur a3 = amur.a("engagement_panel_id_key", "live-chat-item-section");
                        append.append("  •  ").append(a2).setSpan(new aaaw(this.c, a3, apxu, false), append.length() - a2.length(), append.length(), 33);
                        append.setSpan(new TextAppearanceSpan(this.a, R.style.live_chat_members_only_upsell_button_style), append.length() - a2.length(), append.length(), 33);
                        g().setMovementMethod(LinkMovementMethod.getInstance());
                        abe.a(g(), new abvx(this, apxu, a3));
                    }
                }
            }
            g.setText(append);
            arwf arwf = ajxc.d;
            if (!(arwf == null || (arwf.a & 1) == 0)) {
                Context context = this.a;
                akvp akvp = this.d;
                arwh a4 = arwh.a(arwf.b);
                if (a4 == null) {
                    a4 = arwh.UNKNOWN;
                }
                Drawable d = st.d(agb.b(context, akvp.a(a4)));
                st.a(d, xwe.a(this.a, R.attr.ytIconDisabled));
                x().setImageDrawable(d);
                A();
                x().setContentDescription(a);
                u();
            }
            b(true);
            abvm.a(i(), false);
            augf[] augfArr = ajxc.b;
            ViewGroup j = j();
            for (augf augf : augfArr) {
                if (augf != null) {
                    int i = augf.a;
                    arwf arwf2;
                    arwh a5;
                    if (i == 65153809) {
                        aphg = (aphg) augf.b;
                        arwf2 = aphg.e;
                        if (arwf2 == null) {
                            arwf2 = arwf.c;
                        }
                        a5 = arwh.a(arwf2.b);
                        if (a5 == null) {
                            a5 = arwh.UNKNOWN;
                        }
                        if (a5 != arwh.UNKNOWN) {
                            View a6;
                            aodv aodv;
                            arwf2 = aphg.e;
                            if (arwf2 == null) {
                                arwf2 = arwf.c;
                            }
                            a5 = arwh.a(arwf2.b);
                            if (a5 == null) {
                                a5 = arwh.UNKNOWN;
                            }
                            if (a5 == arwh.INFO) {
                                a6 = a(this.j.a(16));
                            } else {
                                arwf2 = aphg.e;
                                if (arwf2 == null) {
                                    arwf2 = arwf.c;
                                }
                                a6 = a(arwf2);
                            }
                            if ((aphg.a & 32768) != 0) {
                                aodx aodx = aphg.q;
                                if (aodx == null) {
                                    aodx = aodx.c;
                                }
                                aodv = aodx.b;
                                if (aodv == null) {
                                    aodv = aodv.c;
                                }
                            } else {
                                aodv = aphg.p;
                                if (aodv == null) {
                                    aodv = aodv.c;
                                }
                            }
                            if (aodv != null) {
                                a6.setContentDescription(aodv.b);
                            }
                            if ((aphg.a & 256) != 0) {
                                a6.setOnClickListener(new abvr(this, aphg));
                            }
                            j.addView(a6);
                        }
                    } else if (i == 132562777 && this.g) {
                        audg audg = (audg) augf.b;
                        if ((audg.a & 2) != 0) {
                            arwf2 = audg.c;
                            if (arwf2 == null) {
                                arwf2 = arwf.c;
                            }
                            a5 = arwh.a(arwf2.b);
                            if (a5 == null) {
                                a5 = arwh.UNKNOWN;
                            }
                            if (a5 != arwh.UNKNOWN) {
                                abrc abrc;
                                augj[] augjArr = ajxc.c;
                                int length = augjArr.length;
                                int i2 = 0;
                                while (true) {
                                    abrc = null;
                                    if (i2 >= length) {
                                        break;
                                    }
                                    augj augj = augjArr[i2];
                                    if (augj != null) {
                                        int i3 = augj.a;
                                        if (i3 == 129042058) {
                                            abrc = new abqx((auck) augj.b);
                                        } else if (i3 == 189846535) {
                                            abrc = new abra((aufl) augj.b);
                                        }
                                    }
                                    if (abrc != null && (audg.a & 1) != 0 && audg.b.equals(abrc.a()) && abrc.b()) {
                                        break;
                                    }
                                    i2++;
                                }
                                a(j, audg, abrc);
                                abvm.a(j, true);
                            }
                        }
                    }
                }
            }
        }
    }

    private final void z() {
        c(true);
        n().removeAllViews();
        ViewGroup j = j();
        if (j != null) {
            int childCount = j.getChildCount();
            for (int i = 0; i < childCount; i++) {
                j.getChildAt(i).setOnClickListener(null);
            }
            j.removeAllViews();
        }
        this.t = null;
        k().setOnClickListener(null);
    }

    /* Access modifiers changed, original: protected|final */
    public final void c(boolean z) {
        LayoutParams layoutParams = h().getLayoutParams();
        layoutParams.height = z ? this.y : 0;
        h().setLayoutParams(layoutParams);
    }

    /* Access modifiers changed, original: protected */
    public void a(auwl auwl) {
        b(false);
        d(false);
        aphj aphj = auwl.g;
        if (aphj == null) {
            aphj = aphj.d;
        }
        if ((aphj.a & 1) != 0) {
            arml arml;
            LayoutInflater from = LayoutInflater.from(this.a);
            ViewGroup n = n();
            Button button = (Button) from.inflate(R.layout.live_chat_action_button_grey_dark, n, false);
            aphj aphj2 = auwl.g;
            if (aphj2 == null) {
                aphj2 = aphj.d;
            }
            aphg aphg = aphj2.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
            if ((aphg.a & 4096) != 0) {
                apxu apxu = aphg.m;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                button.setOnClickListener(new abvq(this, apxu));
            }
            if ((aphg.a & 128) != 0) {
                arml = aphg.g;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            button.setText(ajqy.a(arml));
            n.addView(button, -1, this.a.getResources().getDimensionPixelOffset(R.dimen.live_chat_button_height));
            auwt auwt = auwl.e;
            if (auwt == null) {
                auwt = auwt.c;
            }
            auwr auwr = auwt.b;
            if (auwr == null) {
                auwr = auwr.c;
            }
            if ((auwr.a & 1) != 0) {
                auwt auwt2 = auwl.e;
                if (auwt2 == null) {
                    auwt2 = auwt.c;
                }
                auwr auwr2 = auwt2.b;
                if (auwr2 == null) {
                    auwr2 = auwr.c;
                }
                arml arml2 = auwr2.b;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
                TextView textView = (TextView) from.inflate(o(), n, false);
                textView.setText(ajqy.a(arml2));
                n.addView(textView);
            }
        }
    }

    private final void a(ViewGroup viewGroup, audg audg, abrc abrc) {
        if ((audg.a & 2) != 0) {
            arwf arwf = audg.c;
            if (arwf == null) {
                arwf = arwf.c;
            }
            View a = a(arwf);
            aodx aodx = audg.e;
            if (aodx == null) {
                aodx = aodx.c;
            }
            if ((aodx.a & 1) != 0) {
                aodx = audg.e;
                if (aodx == null) {
                    aodx = aodx.c;
                }
                aodv aodv = aodx.b;
                if (aodv == null) {
                    aodv = aodv.c;
                }
                a.setContentDescription(aodv.b);
            }
            acxf acvs = new acvs(audg.g);
            this.b.b(acvs);
            if (audg.f) {
                a.setOnClickListener(new abvt(this, audg));
            } else if (abrc != null) {
                a.setOnClickListener(new abvs(this, abrc, acvs));
            }
            viewGroup.addView(a);
            akpi akpi = this.s;
            if (akpi != null) {
                akpi.a(audg, a);
            }
        }
    }

    private final void e(boolean z) {
        if (this.t != null) {
            a(false);
            k().setOnClickListener(new abvu(this));
            if (!this.q && z) {
                this.C.postDelayed(this.B, u);
                return;
            }
            u();
        } else if (!this.D) {
            y();
        }
    }

    /* Access modifiers changed, original: protected */
    public void t() {
        abrf abrf = this.f;
        if (abrf.d) {
            abrf.a();
            a(this.f.d);
            return;
        }
        abrf.a((ViewGroup) d(), this.t, e(), this);
        a(this.f.d);
        u();
    }

    public final void u() {
        if (x().getVisibility() != 0) {
            w().setVisibility(0);
            x().setVisibility(0);
            x().animate().alpha(1.0f).setListener(null);
            w().animate().alpha(0.0f).setListener(new abvw(this)).start();
        }
    }

    /* Access modifiers changed, original: protected */
    public void v() {
        Editable p = p();
        if (this.i != null && !TextUtils.isEmpty(p)) {
            if (this.r.a()) {
                this.i.a(this.f.a(p));
            } else {
                this.i.a(p.toString().trim());
            }
            this.x.a(!q() ? 2 : 3, 2);
            xrn.a(this.a, i(), this.a.getResources().getString(R.string.live_chat_message_sent_accessibility_string));
            l();
            this.f.a();
            a(false);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final ImageView w() {
        if (this.z == null) {
            this.z = (ImageView) d().findViewById(R.id.user_thumbnail);
        }
        return this.z;
    }

    /* Access modifiers changed, original: protected|final */
    public final ImageView x() {
        if (this.A == null) {
            this.A = (ImageView) d().findViewById(R.id.emoji_picker_icon);
        }
        return this.A;
    }

    public static void a(View view, boolean z) {
        if (view != null) {
            view.setVisibility(!z ? 8 : 0);
        }
    }

    private final void A() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) e().getLayoutParams();
        abvm.a(k(), true);
        layoutParams.setMarginStart(0);
        e().setLayoutParams(layoutParams);
    }
}
