package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* renamed from: kjz */
public final class kjz implements akot {
    private final Context a;
    private final aaas b;
    private final akvo c;
    private final akkq d;
    private final FrameLayout e;
    private final akoj f;
    private kjy g;
    private kjy h;
    private kjy i;

    public kjz(Context context, akkq akkq, aaas aaas, akvo akvo) {
        this.b = aaas;
        this.a = (Context) amqw.a((Object) context);
        this.c = (akvo) amqw.a((Object) akvo);
        this.d = (akkq) amqw.a((Object) akkq);
        this.e = new FrameLayout(context);
        this.e.setBackground(new eza(context.getResources().getColor(R.color.line_separator_color), context.getResources().getDimensionPixelSize(R.dimen.line_separator_height)));
        this.f = new akoj(aaas, this.e);
    }

    public final View K_() {
        return this.e;
    }

    public final void a(akpb akpb) {
        this.f.a();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        aygk aygk;
        auvn auvn;
        arml arml;
        arml arml2;
        apeb apeb;
        obj = (han) obj;
        akoj akoj = this.f;
        acvx acvx = akor.a;
        apxu apxu = obj.a().f;
        if (apxu == null) {
            apxu = apxu.d;
        }
        akoj.a(acvx, apxu, akor.b());
        this.e.removeAllViews();
        if (this.a.getResources().getConfiguration().orientation == 2) {
            if (this.h == null) {
                this.h = new kjy(this.a, this.d, this.b, this.c);
            }
            this.i = this.h;
        } else {
            if (this.g == null) {
                this.g = new kjy(this.a, this.d, this.b, this.c);
            }
            this.i = this.g;
        }
        kjy kjy = this.i;
        axmk axmk = (axmk) amqw.a(((han) amqw.a(obj)).a());
        aygk aygk2 = null;
        if (!axmk.equals(kjy.n)) {
            kjy.o = null;
        }
        kjy.n = axmk;
        akor.a.a(kjy.n.k.d(), null);
        aabd.a(kjy.b, obj.a.g, kjy.n);
        kjy.e.a(kjy.c);
        akkq akkq = kjy.e;
        ImageView imageView = kjy.c;
        axmx axmx = kjy.n.c;
        if (axmx == null) {
            axmx = axmx.c;
        }
        if ((axmx.a & 1) != 0) {
            axmx = kjy.n.c;
            if (axmx == null) {
                axmx = axmx.c;
            }
            axmv axmv = axmx.b;
            if (axmv == null) {
                axmv = axmv.c;
            }
            aygk = axmv.b;
            if (aygk == null) {
                aygk = aygk.f;
            }
        } else {
            aygk = null;
        }
        akkq.a(imageView, aygk);
        View view = kjy.i;
        if (view != null) {
            if (kjy.p == null) {
                kjy.p = new esv((ViewStub) view);
            }
            esv esv = kjy.p;
            if (kjy.o == null) {
                ArrayList arrayList = new ArrayList();
                for (ayfu ayfu : kjy.n.d) {
                    ayfe ayfe = ayfu.c;
                    if (ayfe == null) {
                        ayfe = ayfe.c;
                    }
                    if ((ayfe.a & 1) != 0) {
                        ayfe ayfe2 = ayfu.c;
                        if (ayfe2 == null) {
                            ayfe2 = ayfe.c;
                        }
                        arml arml3 = ayfe2.b;
                        if (arml3 == null) {
                            arml3 = arml.f;
                        }
                        arrayList.add(ajqy.a(arml3));
                    }
                }
                kjy.o = TextUtils.join(System.getProperty("line.separator"), arrayList);
            }
            CharSequence charSequence = kjy.o;
            if (TextUtils.isEmpty(charSequence)) {
                esv.a.setVisibility(8);
            } else {
                if (!esv.b) {
                    esv.c = (TextView) esv.a.inflate();
                    esv.b = true;
                }
                esv.c.setText(charSequence);
                esv.a.setVisibility(0);
                esv.c.setVisibility(0);
            }
        }
        view = kjy.h;
        if (view != null) {
            if (kjy.q == null) {
                kjy.q = new fnk((ViewStub) view);
            }
            kjy.q.a(ipo.a(kjy.n.d));
        }
        acvx acvx2 = akor.a;
        akvo akvo = kjy.f;
        View view2 = kjy.a;
        View view3 = kjy.g;
        auvr auvr = kjy.n.j;
        if (auvr == null) {
            auvr = auvr.c;
        }
        if ((auvr.a & 1) == 0) {
            auvn = null;
        } else {
            auvr = kjy.n.j;
            if (auvr == null) {
                auvr = auvr.c;
            }
            auvn auvn2 = auvr.b;
            if (auvn2 == null) {
                auvn2 = auvn.l;
            }
            auvn = auvn2;
        }
        akvo.a(view2, view3, auvn, kjy.n, acvx2);
        TextView textView = kjy.j;
        axmk axmk2 = kjy.n;
        if ((axmk2.a & 1) != 0) {
            arml = axmk2.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        axmk axmk3 = kjy.n;
        if ((axmk3.a & 16) != 0) {
            arml2 = axmk3.g;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        } else {
            arml2 = null;
        }
        CharSequence a = aabb.a(arml2, kjy.b, false);
        if (TextUtils.isEmpty(a)) {
            textView = kjy.l;
            axmk2 = kjy.n;
            if ((axmk2.a & 32) != 0) {
                arml = axmk2.h;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            xpr.a(textView, aabb.a(arml, kjy.b, false));
            kjy.k.setVisibility(8);
        } else {
            xpr.a(kjy.k, a);
            kjy.l.setVisibility(8);
        }
        ipk ipk = kjy.m;
        apdx apdx = kjy.n.i;
        if (apdx == null) {
            apdx = apdx.g;
        }
        if ((apdx.a & 2) == 0) {
            apeb = null;
        } else {
            apdx = kjy.n.i;
            if (apdx == null) {
                apdx = apdx.g;
            }
            apeb = apdx.c;
            if (apeb == null) {
                apeb = apeb.e;
            }
        }
        ipk.a(apeb);
        kjy.e.a(kjy.d);
        akkq akkq2 = kjy.e;
        ImageView imageView2 = kjy.d;
        appu appu = kjy.n.e;
        if (appu == null) {
            appu = appu.c;
        }
        appw appw = appu.b;
        if (appw == null) {
            appw = appw.f;
        }
        if ((appw.a & 1) != 0) {
            appu appu2 = kjy.n.e;
            if (appu2 == null) {
                appu2 = appu.c;
            }
            appw appw2 = appu2.b;
            if (appw2 == null) {
                appw2 = appw.f;
            }
            aygk2 = appw2.b;
            if (aygk2 == null) {
                aygk2 = aygk.f;
            }
        }
        akkq2.a(imageView2, aygk2);
        this.e.addView(this.i.a);
    }
}
