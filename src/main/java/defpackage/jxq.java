package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: jxq */
final class jxq extends jxw {
    private final ImageView A;
    private final TextView B;
    private final TextView C;
    private final View D;
    private final View E;
    public final View a;
    private final akkq b;
    private final eid c;
    private final elv d;
    private final akou e;
    private final akoj z;

    public jxq(Context context, akkq akkq, eid eid, akou akou, View view, aaas aaas, gal gal, elv elv) {
        akou akou2 = akou;
        View view2 = view;
        super(context, akkq, akou, view, aaas, gal, null, null);
        this.c = eid;
        this.e = akou2;
        this.d = elv;
        this.b = akkq;
        this.z = new akoj(aaas, akou2);
        View findViewById = this.h.findViewById(R.id.thumbnail_container);
        if (findViewById == null) {
            findViewById = this.u;
        }
        this.a = findViewById;
        this.A = (ImageView) view2.findViewById(R.id.channel_thumbnail);
        this.E = view2.findViewById(R.id.play);
        this.D = view2.findViewById(R.id.insets_container);
        this.B = (TextView) view2.findViewById(R.id.mdx_queue_button);
        this.C = (TextView) view2.findViewById(R.id.mdx_play_hint);
    }

    public final View K_() {
        return this.e.a();
    }

    /* renamed from: a */
    public final void a_(akor akor, aryi aryi) {
        apxu apxu;
        arml arml;
        akoj akoj = this.z;
        acvx acvx = akor.a;
        aygk aygk = null;
        if ((aryi.a & 64) != 0) {
            apxu = aryi.h;
            if (apxu == null) {
                apxu = apxu.d;
            }
        } else {
            apxu = null;
        }
        akoj.a(acvx, apxu, akor.b(), this);
        akor.a.a(aryi.g.d(), null);
        aryg aryg = aryi.f;
        if (aryg == null) {
            aryg = aryg.c;
        }
        arye arye = aryg.b;
        if (arye == null) {
            arye = arye.u;
        }
        if ((arye.a & 1) != 0) {
            arml = arye.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        a(ajqy.a(arml));
        if ((arye.a & 2) != 0) {
            arml = arye.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        b(ajqy.a(arml));
        if ((arye.a & 4) != 0) {
            arml = arye.d;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        CharSequence a = ajqy.a(arml);
        arml arml2 = arye.k;
        if (arml2 == null) {
            arml2 = arml.f;
        }
        if (!TextUtils.isEmpty(ajqy.a(arml2))) {
            if (a != null) {
                yx a2 = yx.a();
                a = TextUtils.concat(new CharSequence[]{a2.a(a.toString()), " · ", a2.a(r5.toString())});
            } else {
                a = null;
            }
        }
        a(a, null, false);
        TextView textView = this.j;
        if ((1 ^ ((aryi.a & 4) != 0 ? 1 : 0)) == 0) {
            adl.a(textView, 0, 0);
            if ((aryi.a & 4) != 0) {
                arml = aryi.e;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            a(ajqy.a(arml), null);
        } else {
            adl.a(textView, R.drawable.player_live_dot, 0);
            textView.setText(R.string.live_label);
        }
        a(aryi);
        akkq akkq = this.b;
        ImageView imageView = this.A;
        if ((arye.a & 8) != 0) {
            aygk = arye.e;
            if (aygk == null) {
                aygk = aygk.f;
            }
        }
        akkq.a(imageView, aygk);
        if (this.D != null) {
            Rect a3 = this.c.a();
            this.D.setPadding(a3.left, a3.top, a3.right, a3.bottom);
        }
        this.e.a(akor);
    }

    public final void a(aryi aryi) {
        aygk aygk;
        akkq akkq = this.b;
        elv elv = this.d;
        ImageView imageView = this.u;
        int i = aryi.a;
        aygk aygk2 = null;
        String str = (i & 256) != 0 ? aryi.j : null;
        if ((i & 1) != 0) {
            aygk aygk3 = aryi.b;
            if (aygk3 == null) {
                aygk3 = aygk.f;
            }
            aygk = aygk3;
        } else {
            aygk = null;
        }
        elq.a(akkq, elv, imageView, str, aygk, null);
        if ((aryi.a & 1) != 0) {
            aygk2 = aryi.b;
            if (aygk2 == null) {
                aygk2 = aygk.f;
            }
        }
        this.x = aygk2;
    }

    public final void a(boolean z, hdd hdd) {
        View view = this.B;
        if (view != null) {
            xpr.a(view, hdd.a());
        }
        view = this.C;
        if (view != null) {
            xpr.a(view, z);
            CharSequence charSequence = null;
            if (!z) {
                this.C.setText(null);
            } else if (hdd.a()) {
                CharSequence string;
                adqe c = hdd.a.c();
                if (!(c == null || c.h() == null)) {
                    charSequence = c.h().bv_();
                }
                TextView textView = this.C;
                if (charSequence != null) {
                    string = this.f.getString(R.string.inline_mdx_play_hint, new Object[]{charSequence});
                } else {
                    string = this.f.getString(R.string.play_on_screen);
                }
                textView.setText(string);
            } else {
                this.C.setText(this.f.getString(R.string.connecting));
            }
        }
    }

    public final void a(boolean z) {
        this.E.setVisibility(!z ? 8 : 0);
    }

    public final void a(akpb akpb) {
        super.a(akpb);
        this.z.a();
    }
}
