package defpackage;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BadgeRenderers;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.DetailsHeaderRendererOuterClass;
import com.google.protos.youtube.api.innertube.OfflineabilityRendererOuterClass;

/* renamed from: iob */
class iob implements akot {
    public final View a = this.b.findViewById(R.id.metadata);
    public final ViewGroup b;
    public final TextView c = ((TextView) this.k.findViewById(R.id.trailer_button_label));
    private final TextView d = ((TextView) this.a.findViewById(R.id.title));
    private final TextView e = ((TextView) this.a.findViewById(R.id.description));
    private final View f = this.a.findViewById(R.id.metadata_line);
    private final TextView g = ((TextView) this.f.findViewById(R.id.metadata_text));
    private final ViewGroup h = ((ViewGroup) this.a.findViewById(R.id.buttons_container));
    private final View i = this.h.findViewById(R.id.play_resume_button_container);
    private final TextView j = ((TextView) this.h.findViewById(R.id.play_resume_button_label));
    private final View k = this.h.findViewById(R.id.trailer_button_container);
    private final TextView l = ((TextView) this.a.findViewById(R.id.description_header));
    private final View m = this.f.findViewById(R.id.red_badge);
    private final iou n;
    private final akyy o;
    private final OfflineArrowView p;
    private ipk q;
    private hjr r;
    private final /* synthetic */ ioc s;

    iob(ioc ioc, int i, Context context) {
        this.s = ioc;
        this.b = (ViewGroup) LayoutInflater.from(context).inflate(i, null, false);
        iow iow = ioc.g;
        this.n = new iou((aaas) iow.a((aaas) iow.a.get(), 1), (akvp) iow.a((akvp) iow.b.get(), 2), (zyw) iow.a((zyw) iow.c.get(), 3), (TextView) iow.a(this.j, 4), (View) iow.a(this.i, 5));
        this.o = ioc.f.a(this.c);
        this.p = (OfflineArrowView) this.b.findViewById(R.id.offline_button);
        this.k.setOnClickListener(new ioe(this));
        iou iou = this.n;
        iou.f = iou.a.getResources().getDimensionPixelOffset(R.dimen.text_button_icon_padding);
        this.o.a((int) R.dimen.text_button_icon_padding);
    }

    public /* bridge */ /* synthetic */ void a_(akor akor, Object obj) {
        throw null;
    }

    public final View K_() {
        return this.b;
    }

    public void a(akor akor, aqvl aqvl) {
        arml arml;
        arml arml2;
        CharSequence valueOf;
        aqvp aqvp;
        aphf aphf;
        TextView textView = this.d;
        boolean z = true;
        if ((aqvl.a & 1) != 0) {
            arml = aqvl.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = this.d;
        if ((aqvl.a & 1) != 0) {
            arml = aqvl.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setContentDescription(ajqy.b(arml));
        if ((aqvl.a & 16) != 0) {
            arml2 = aqvl.h;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        } else {
            arml2 = null;
        }
        xpr.a(this.e, aabb.a(arml2, this.s.e, false));
        textView = this.e;
        if ((aqvl.a & 16) != 0) {
            arml = aqvl.h;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setContentDescription(ajqy.b(arml));
        textView = this.l;
        if ((aqvl.a & 32) != 0) {
            arml = aqvl.i;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = this.l;
        if ((aqvl.a & 32) != 0) {
            arml = aqvl.i;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setContentDescription(ajqy.b(arml));
        this.m.setVisibility(8);
        for (axak axak : aqvl.f) {
            anxr access$000 = anxl.checkIsLite(BadgeRenderers.standaloneRedBadgeRenderer);
            axak.a(access$000);
            if (axak.h.a(access$000.d)) {
                if (this.q == null) {
                    this.q = ipn.a(this.m);
                }
                ipk ipk = this.q;
                anxr access$0002 = anxl.checkIsLite(BadgeRenderers.standaloneRedBadgeRenderer);
                axak.a(access$0002);
                Object b = axak.h.b(access$0002.d);
                if (b == null) {
                    b = access$0002.b;
                } else {
                    b = access$0002.a(b);
                }
                ipk.a((apeb) b);
            }
        }
        Spanned[] b2 = ajqy.b(aqvl.g);
        if (b2.length > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(b2[0]);
            for (int i = 1; i < b2.length; i++) {
                spannableStringBuilder.append("   ").append(b2[i]);
            }
            valueOf = SpannableString.valueOf(spannableStringBuilder);
        } else {
            valueOf = null;
        }
        xpr.a(this.g, valueOf);
        anxp anxp = aqvl.o;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$0003 = anxl.checkIsLite(DetailsHeaderRendererOuterClass.progressButtonRenderer);
        anxp.a(access$0003);
        if (anxp.h.a(access$0003.d)) {
            anxp = aqvl.o;
            if (anxp == null) {
                anxp = axak.a;
            }
            access$0003 = anxl.checkIsLite(DetailsHeaderRendererOuterClass.progressButtonRenderer);
            anxp.a(access$0003);
            Object b3 = anxp.h.b(access$0003.d);
            if (b3 == null) {
                b3 = access$0003.b;
            } else {
                b3 = access$0003.a(b3);
            }
            aqvp = (aqvp) b3;
        } else {
            aqvp = null;
        }
        iou iou = this.n;
        acvx acvx = akor.a;
        iou.g = aqvp;
        xpr.a(iou.b, iou.g != null);
        xpr.a(iou.a, iou.g != null);
        aqvp aqvp2 = iou.g;
        if (aqvp2 == null) {
            iou.a.setText(null);
            iou.a.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            iou.b.setContentDescription(null);
        } else {
            arml arml3;
            int a;
            arwh a2;
            TextView textView2 = iou.a;
            if ((aqvp2.a & 1) != 0) {
                arml3 = aqvp2.b;
                if (arml3 == null) {
                    arml3 = arml.f;
                }
            } else {
                arml3 = null;
            }
            textView2.setText(ajqy.a(arml3));
            aqvp2 = iou.g;
            if ((8 & aqvp2.a) != 0) {
                int a3;
                int a4;
                a = xwe.a(iou.a.getContext(), R.attr.ytOverlayBackgroundLight, 0);
                if (wvl.a(iou.d)) {
                    a3 = xwe.a(iou.a.getContext(), R.attr.ytFilledButtonText, 0);
                    a4 = xwe.a(iou.a.getContext(), R.attr.ytCallToAction, 0);
                } else {
                    a3 = xwe.a(iou.a.getContext(), R.attr.ytText1Inverse, 0);
                    a4 = xwe.a(iou.a.getContext(), R.attr.ytTextPrimary, 0);
                }
                Drawable iox = new iox((float) aqvp2.d, a4, a, (float) iou.e);
                iou.a.setTextColor(a3);
                xpr.a(iou.b, iox);
            }
            aqvp aqvp3 = iou.g;
            if ((aqvp3.a & 2) != 0) {
                arwf arwf = aqvp3.c;
                if (arwf == null) {
                    arwf = arwf.c;
                }
                a2 = arwh.a(arwf.b);
                if (a2 == null) {
                    a2 = arwh.UNKNOWN;
                }
            } else {
                a2 = arwh.UNKNOWN;
            }
            iou.a.setCompoundDrawablesWithIntrinsicBounds(iou.c.a(a2), 0, 0, 0);
            Drawable drawable = iou.a.getCompoundDrawables()[0];
            if (drawable != null) {
                xoe.a(drawable, iou.a.getCurrentTextColor(), Mode.SRC_IN);
            }
            if (iou.f != -1) {
                textView2 = iou.a;
                arml = aqvp3.b;
                if (arml == null) {
                    arml = arml.f;
                }
                a = (TextUtils.isEmpty(ajqy.a(arml)) || a2 == arwh.UNKNOWN) ? 0 : iou.f;
                textView2.setCompoundDrawablePadding(a);
            }
            if (acvx != null) {
                acvx.a(iou.g.h.d(), null);
            }
            aqvp3 = iou.g;
            aodx aodx = aqvp3.g;
            if (aodx == null) {
                aodx = aodx.c;
            }
            if ((aodx.a & 1) == 0) {
                iou.b.setContentDescription(null);
            } else {
                View view = iou.b;
                aodx aodx2 = aqvp3.g;
                if (aodx2 == null) {
                    aodx2 = aodx.c;
                }
                aodv aodv = aodx2.b;
                if (aodv == null) {
                    aodv = aodv.c;
                }
                view.setContentDescription(aodv.b);
            }
        }
        anxp anxp2 = aqvl.p;
        if (anxp2 == null) {
            anxp2 = axak.a;
        }
        access$0003 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
        anxp2.a(access$0003);
        if (anxp2.h.a(access$0003.d)) {
            anxp2 = aqvl.p;
            if (anxp2 == null) {
                anxp2 = axak.a;
            }
            access$0003 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
            anxp2.a(access$0003);
            Object b4 = anxp2.h.b(access$0003.d);
            if (b4 == null) {
                b4 = access$0003.b;
            } else {
                b4 = access$0003.a(b4);
            }
            aphf = (aphf) ((anxo) ((aphg) b4).toBuilder());
        } else {
            aphf = null;
        }
        if (aphf != null) {
            aphg aphg = (aphg) aphf.instance;
            if (aphg.b == 1) {
                int a5 = aphh.a(((Integer) aphg.c).intValue());
                if (a5 != 0 && a5 == 22 && wvl.a(this.s.j)) {
                    aphf.a(21);
                }
            }
        }
        this.o.a(aphf != null ? (aphg) ((anxl) aphf.build()) : null, akor.a);
        this.k.setVisibility(this.c.getVisibility());
        this.k.setFocusable(this.c.isFocusable());
        this.k.setClickable(this.c.isClickable());
        this.k.setEnabled(this.c.isEnabled());
        this.k.setContentDescription(this.c.getContentDescription());
        this.c.setClickable(false);
        this.c.setFocusable(false);
        this.c.setContentDescription(null);
        Drawable background = this.c.getBackground();
        this.c.setBackground(null);
        this.k.setBackground(background);
        Drawable[] compoundDrawables = this.c.getCompoundDrawables();
        if (!(aphf == null || compoundDrawables[0] == null)) {
            xoe.a(compoundDrawables[0], this.c.getCurrentTextColor(), Mode.SRC_IN);
        }
        View view2 = this.h;
        if (aqvp == null && aphf == null) {
            z = false;
        }
        xpr.a(view2, z);
        anxp anxp3 = aqvl.q;
        if (anxp3 == null) {
            anxp3 = axak.a;
        }
        anxr access$0004 = anxl.checkIsLite(OfflineabilityRendererOuterClass.offlineabilityRenderer);
        anxp3.a(access$0004);
        Object b5 = anxp3.h.b(access$0004.d);
        if (b5 == null) {
            b5 = access$0004.b;
        } else {
            b5 = access$0004.a(b5);
        }
        avsj avsj = (avsj) b5;
        if (hjr.b(hjr.a(aqvl.r, this.s.i), avsj)) {
            if (this.r == null) {
                this.r = this.s.h.a(this.p);
            }
            this.r.a(aqvl.r, avsj);
            return;
        }
        xpr.a(this.p, false);
    }

    public final void a(akpb akpb) {
        hjr hjr = this.r;
        if (hjr != null) {
            hjr.b();
        }
    }
}
