package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: iuw */
public final class iuw extends jxw {
    private final akvo A;
    private final akoj B;
    private final akou C;
    private final View D;
    private final hmc E;
    private final ViewStub F;
    private ipp G;
    private final ivc H;
    private int I;
    private hlv J;
    private ayye K;
    public final LinearLayout a;
    public int b;
    public final ivc c;
    public final ivc d;
    public boolean e;
    private final Context z;

    public iuw(Context context, akkq akkq, akou akou, aaas aaas, akvo akvo, gal gal, hmc hmc, fas fas, ViewGroup viewGroup) {
        super(context, akkq, aaas, akou, gal, (int) R.layout.video_card_item, viewGroup, hmc, fas);
        this.z = (Context) amqw.a((Object) context);
        this.C = (akou) amqw.a((Object) akou);
        this.A = (akvo) amqw.a((Object) akvo);
        akou akou2 = akou;
        aaas aaas2 = aaas;
        this.B = new akoj(aaas, akou);
        this.E = hmc;
        View view = this.h;
        view.setLayoutDirection(context.getResources().getConfiguration().getLayoutDirection());
        this.a = (LinearLayout) view.findViewById(R.id.video_info_view);
        this.a.findViewById(R.id.thumbnail_layout);
        view.setTag(R.id.offset_adjuster_tag, new iuz(this));
        abe.a(view, new iuy());
        this.D = view.findViewById(R.id.details_overlay_stub);
        this.H = new ivc(R.id.watched_overlay_stub, view);
        this.c = new ivc(R.id.author, view);
        this.d = new ivc(R.id.details, view);
        this.F = (ViewStub) view.findViewById(R.id.offline_badge_beside_details);
    }

    public final View K_() {
        return this.C.a();
    }

    /* renamed from: a */
    public final void a_(akor akor, ayye ayye) {
        apxu apxu;
        arml arml;
        arml arml2;
        auvn auvn;
        apdx apdx;
        aped aped;
        apeb apeb;
        auxa auxa;
        apdz apdz;
        akor akor2 = akor;
        ayye ayye2 = ayye;
        this.K = ayye2;
        akoj akoj = this.B;
        acvx acvx = akor2.a;
        if ((ayye2.a & 64) != 0) {
            apxu = ayye2.g;
            if (apxu == null) {
                apxu = apxu.d;
            }
        } else {
            apxu = null;
        }
        akoj.a(acvx, apxu, akor.b(), this);
        akor2.a.a(ayye2.r.d(), null);
        akor akor3 = new akor(akor2);
        akor3.b = ayye2.r.d();
        if ((ayye2.a & 4) == 0) {
            arml = null;
        } else {
            arml = ayye2.c;
            if (arml == null) {
                arml = arml.f;
            }
        }
        a(ajqy.a(arml));
        arml = ayye2.d;
        if (arml == null) {
            arml = arml.f;
        }
        Spanned a = ajqy.a(arml);
        if (TextUtils.isEmpty(a)) {
            this.e = false;
            this.c.a();
        } else {
            this.e = true;
            this.c.a(a, R.id.author);
        }
        arml = ayye2.e;
        if (arml == null) {
            arml = arml.f;
        }
        a = ajqy.a(arml);
        apdx apdx2 = ayye2.k;
        if (apdx2 == null) {
            apdx2 = apdx.g;
        }
        int i = apdx2.a & 2;
        ayyi ayyi = ayye2.p;
        if (ayyi == null) {
            ayyi = ayyi.c;
        }
        if (i == 0 && !TextUtils.isEmpty(a)) {
            if (ayyi != null) {
                i = ayyk.a(ayyi.b);
                if (i != 0 && i == 3) {
                    TextView textView = (TextView) K_().findViewById(R.id.title);
                    textView.getViewTreeObserver().addOnPreDrawListener(new iva(this, textView));
                }
            }
            this.d.a(a, R.id.details);
        } else {
            this.d.a();
        }
        arml = ayye2.f;
        if (arml == null) {
            arml = arml.f;
        }
        CharSequence a2 = ajqy.a(arml);
        if ((ayye2.a & 32) != 0) {
            arml2 = ayye2.f;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        } else {
            arml2 = null;
        }
        CharSequence b = ajqy.b(arml2);
        List list = ayye2.n;
        ayri ayri = ayye2.l;
        if (ayri == null) {
            ayri = ayri.d;
        }
        a(a2, b, list, ayri);
        aygk aygk = ayye2.b;
        if (aygk == null) {
            aygk = aygk.f;
        }
        a(aygk);
        Object[] objArr = (ayfu[]) ayye2.n.toArray(new ayfu[0]);
        ayfq ayfq = (ayfq) ipo.a(objArr, ips.a);
        ayfc ayfc = (ayfc) ipo.a(objArr, ipx.a);
        CharSequence charSequence = null;
        for (ayfu ayfu : objArr) {
            if ((ayfu.a & 4) != 0) {
                ayfw ayfw = ayfu.d;
                if (ayfw == null) {
                    ayfw = ayfw.c;
                }
                charSequence = ayfw.b;
            }
        }
        View view = this.D;
        if (view != null) {
            if (ayfc != null && ayfc.a == 1) {
                if (this.G == null) {
                    this.G = new ipp((ViewStub) view);
                }
                ipp ipp = this.G;
                Spanned a3 = ajqy.a(ayfc.a == 1 ? (arml) ayfc.b : arml.f);
                if (TextUtils.isEmpty(a3)) {
                    ipp.a.setVisibility(8);
                } else {
                    if (!ipp.b) {
                        ipp.c = (TextView) ipp.a.inflate().findViewById(R.id.text);
                        ipp.b = true;
                    }
                    ipp.c.setText(a3);
                    ipp.a.setVisibility(0);
                    ipp.c.setVisibility(0);
                }
            } else {
                view.setVisibility(8);
            }
        }
        a(ayfq);
        if (charSequence != null) {
            this.H.a(charSequence, R.id.watched);
        } else {
            this.H.a();
        }
        acvx acvx2 = akor3.a;
        akvo akvo = this.A;
        View a4 = this.C.a();
        View view2 = this.v;
        auvr auvr = ayye2.o;
        if (auvr == null) {
            auvr = auvr.c;
        }
        if ((auvr.a & 1) == 0) {
            auvn = null;
        } else {
            auvr = ayye2.o;
            if (auvr == null) {
                auvr = auvr.c;
            }
            auvn = auvr.b;
            if (auvn == null) {
                auvn = auvn.l;
            }
        }
        akvo.a(a4, view2, auvn, ayye, acvx2);
        if ((ayye2.a & 256) != 0) {
            apdx = ayye2.j;
            if (apdx == null) {
                apdx = apdx.g;
            }
            aped = apdx.b;
            if (aped == null) {
                aped = aped.g;
            }
        } else {
            aped = null;
        }
        a(aped);
        if ((ayye2.a & 512) != 0) {
            apdx = ayye2.k;
            if (apdx == null) {
                apdx = apdx.g;
            }
            apeb = apdx.c;
            if (apeb == null) {
                apeb = apeb.e;
            }
        } else {
            apeb = null;
        }
        a(apeb);
        if ((ayye2.a & 512) != 0) {
            apdx = ayye2.k;
            if (apdx == null) {
                apdx = apdx.g;
            }
            auxa = apdx.e;
            if (auxa == null) {
                auxa = auxa.f;
            }
        } else {
            auxa = null;
        }
        a(auxa);
        if ((ayye2.a & 128) != 0) {
            apdx = ayye2.i;
            if (apdx == null) {
                apdx = apdx.g;
            }
            apdz = apdx.d;
            if (apdz == null) {
                apdz = apdz.e;
            }
        } else {
            apdz = null;
        }
        a(apdz);
        ayym ayym = ayye2.q;
        if (ayym == null) {
            ayym = ayym.c;
        }
        if ((ayym.a & 1) != 0) {
            ayym = ayye2.q;
            if (ayym == null) {
                ayym = ayym.c;
            }
            jxw.a(akor2, ayym);
            ViewStub viewStub = this.F;
            if (viewStub != null) {
                if ((this.K.a & 8) != 0) {
                    super.a(akor2, null);
                } else {
                    if (this.J == null) {
                        this.J = this.E.a(viewStub, null);
                    }
                    this.J.a(akor2);
                }
            }
        }
        ayyi ayyi2 = ayye2.p;
        if (ayyi2 == null) {
            ayyi2 = ayyi.c;
        }
        int a5 = ayyk.a(ayyi2.b);
        if (a5 != 0 && a5 == 3) {
            this.I = this.z.getResources().getDimensionPixelSize(R.dimen.preview_card_video_card_width);
            this.w = this.z.getResources().getInteger(R.integer.preview_card_video_card_title_max_lines);
            this.b = this.z.getResources().getInteger(R.integer.preview_card_video_description_row_number);
            ((MarginLayoutParams) this.v.getLayoutParams()).setMarginStart(this.z.getResources().getDimensionPixelSize(R.dimen.preview_card_video_card_menu_start_margin));
            this.i.setMaxLines(this.w);
            ((MarginLayoutParams) this.i.getLayoutParams()).setMarginEnd(this.z.getResources().getDimensionPixelSize(R.dimen.preview_card_video_card_margin));
            this.h.getViewTreeObserver().addOnGlobalLayoutListener(new ivb(this, ayye2));
        } else {
            this.I = this.z.getResources().getDimensionPixelSize(R.dimen.video_card_width);
            a5 = this.z.getResources().getInteger(R.integer.video_card_title_max_lines);
            this.w = a5;
            this.i.setMaxLines(a5);
        }
        this.I += this.h.getPaddingLeft() + this.h.getPaddingRight();
        LayoutParams layoutParams = K_().getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = this.I;
            K_().setLayoutParams(layoutParams);
        }
        this.C.a(akor3);
    }

    public final void a(akpb akpb) {
        super.a(akpb);
        this.K = null;
        hlv hlv = this.J;
        if (hlv != null) {
            hlv.a();
        }
        this.B.a();
    }
}
