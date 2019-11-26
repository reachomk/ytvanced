package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: knc */
public final class knc extends jxw {
    private final View A = this.z.findViewById(R.id.text_layout);
    private final LinearLayout B;
    private View C;
    private final akoj a;
    private final xsc b;
    private final int c;
    private final int d;
    private final int e;
    private final View z = this.h;

    public knc(Context context, akkq akkq, aaas aaas, xsc xsc, flu flu, gal gal, hmc hmc) {
        super(context, akkq, flu, LayoutInflater.from(context).inflate(R.layout.video_item_layout, null, false), aaas, gal, hmc, null);
        Resources resources = context.getResources();
        this.b = xsc;
        aaas aaas2 = aaas;
        this.a = new akoj(aaas, (akou) flu);
        this.c = resources.getDimensionPixelSize(R.dimen.compact_video_padding_start_postv2);
        this.d = resources.getDimensionPixelSize(R.dimen.compact_video_padding_end_postv2);
        this.e = resources.getDimensionPixelSize(R.dimen.compact_video_padding_bottom_postv2);
        this.B = (LinearLayout) this.z.findViewById(R.id.video_info_view);
    }

    public final View K_() {
        return this.h;
    }

    private static apeb a(azdt azdt) {
        apdx apdx = azdt.u;
        if (apdx == null) {
            apdx = apdx.g;
        }
        if ((apdx.a & 2) == 0) {
            return null;
        }
        apdx apdx2 = azdt.u;
        if (apdx2 == null) {
            apdx2 = apdx.g;
        }
        apeb apeb = apdx2.c;
        if (apeb == null) {
            apeb = apeb.e;
        }
        return apeb;
    }

    private static CharSequence b(azdt azdt) {
        arml arml;
        CharSequence charSequence;
        if ((azdt.a & 8192) != 0) {
            arml = azdt.p;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        Spanned a = ajqy.a(arml);
        if (TextUtils.isEmpty(a)) {
            charSequence = null;
        } else {
            arml arml2;
            if ((azdt.a & 1024) != 0) {
                arml2 = azdt.m;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
            } else {
                arml2 = null;
            }
            if (TextUtils.isEmpty(ajqy.a(arml2))) {
                charSequence = a;
            } else {
                charSequence = TextUtils.concat(new CharSequence[]{a, " • ", ajqy.a(arml2)});
            }
        }
        if (charSequence != null) {
            return fpi.a(charSequence);
        }
        return null;
    }

    private static CharSequence c(azdt azdt) {
        arml arml;
        if ((azdt.a & 512) != 0) {
            arml = azdt.l;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        Spanned a = ajqy.a(arml);
        if (a != null) {
            return fpi.a(a);
        }
        return null;
    }

    public final void a(akpb akpb) {
        super.a(akpb);
        this.a.a();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        apxu apxu;
        arml arml;
        arml arml2;
        ayri ayri;
        aygk aygk;
        azdt azdt = (azdt) obj;
        apdz apdz = null;
        akor.a.a(azdt.J.d(), null);
        boolean z = knc.a(azdt) != null;
        akoj akoj = this.a;
        acvx acvx = akor.a;
        if ((azdt.a & 16384) != 0) {
            apxu = azdt.q;
            if (apxu == null) {
                apxu = apxu.d;
            }
        } else {
            apxu = null;
        }
        akoj.a(acvx, apxu, akor.b(), this);
        if ((azdt.a & 2048) != 0) {
            arml = azdt.n;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        CharSequence a = ajqy.a(arml);
        if ((azdt.a & 2048) != 0) {
            arml2 = azdt.n;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        } else {
            arml2 = null;
        }
        CharSequence b = ajqy.b(arml2);
        List list = azdt.B;
        if ((azdt.a & 1048576) != 0) {
            ayri = azdt.x;
            if (ayri == null) {
                ayri = ayri.d;
            }
        } else {
            ayri = null;
        }
        a(a, b, list, ayri);
        if ((azdt.a & 2) != 0) {
            aygk = azdt.f;
            if (aygk == null) {
                aygk = aygk.f;
            }
        } else {
            aygk = null;
        }
        a(aygk);
        if (azdt.A) {
            if (this.C == null) {
                this.C = ((ViewStub) this.h.findViewById(R.id.watched_overlay_stub)).inflate();
            }
            this.C.setVisibility(0);
        } else {
            View view = this.C;
            if (view != null) {
                view.setVisibility(8);
            }
        }
        a(ipo.a(azdt.B));
        azdx azdx = azdt.D;
        if (azdx == null) {
            azdx = azdx.c;
        }
        int a2 = azdz.a(azdx.b);
        if ((a2 != 0 && a2 == 3) || akor.a("postsV2FullThumbnailStyle", false)) {
            ayri ayri2;
            aped aped;
            LinearLayout linearLayout = this.B;
            int i = this.c;
            linearLayout.setPadding(i, i, this.d, this.e);
            this.A.setVisibility(0);
            if ((azdt.a & 4) != 0) {
                arml = azdt.g;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            a(ajqy.a(arml));
            Context context = this.f;
            xsc xsc = this.b;
            if ((1048576 & azdt.a) != 0) {
                ayri2 = azdt.x;
                if (ayri2 == null) {
                    ayri2 = ayri.d;
                }
            } else {
                ayri2 = null;
            }
            a = joc.a(context, xsc, ayri2);
            CharSequence c;
            if (akor.a("postsV2NewMetadataStyle", false)) {
                c = knc.c(azdt);
                if (TextUtils.isEmpty(a)) {
                    a = knc.b(azdt);
                }
                a(c, a, z);
            } else {
                if (TextUtils.isEmpty(a)) {
                    a = knc.c(azdt);
                    c = knc.b(azdt);
                    if (!TextUtils.isEmpty(c) && !TextUtils.isEmpty(a)) {
                        a = TextUtils.concat(new CharSequence[]{a, " • ", c});
                    } else if (!TextUtils.isEmpty(c)) {
                        a = c;
                    }
                }
                a(null, a, z);
            }
            apdx apdx = azdt.t;
            if (apdx == null) {
                apdx = apdx.g;
            }
            if ((apdx.a & 1) == 0) {
                aped = null;
            } else {
                apdx = azdt.t;
                if (apdx == null) {
                    apdx = apdx.g;
                }
                aped = apdx.b;
                if (aped == null) {
                    aped = aped.g;
                }
            }
            a(aped);
            apdx = azdt.s;
            if (apdx == null) {
                apdx = apdx.g;
            }
            if ((apdx.a & 4) != 0) {
                apdx = azdt.s;
                if (apdx == null) {
                    apdx = apdx.g;
                }
                apdz = apdx.d;
                if (apdz == null) {
                    apdz = apdz.e;
                }
            }
            a(apdz);
            a(knc.a(azdt));
            return;
        }
        this.B.setPadding(0, 0, 0, 0);
        this.A.setVisibility(8);
    }
}
