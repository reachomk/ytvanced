package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.widget.DurationBadgeView;
import com.google.android.apps.youtube.app.common.widget.WrappingTextView;
import com.google.android.youtube.R;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: jxw */
public abstract class jxw implements akon, akot {
    private fap A;
    private final View B;
    private final ViewStub C;
    private gaf D;
    private fnk E;
    private hlv F;
    private klp G;
    private final gal a;
    private final hmc b;
    private final fas c;
    private final TextView d;
    private final List e;
    public final Context f;
    public final akkq g;
    public final View h;
    public final TextView i;
    public final TextView j;
    public final TextView k;
    public final TextView l;
    public TextView m;
    public esw n;
    public etn o;
    public epu p;
    public ipk q;
    public klk r;
    public klk s;
    public khp t;
    public final ImageView u;
    public final View v;
    public int w;
    public aygk x;
    public etg y;
    private far z;

    public jxw(Context context, akkq akkq, aaas aaas, gal gal, akou akou, int i, hmc hmc) {
        this(context, akkq, aaas, akou, gal, i, null, hmc, null);
    }

    public jxw(Context context, akkq akkq, aaas aaas, akou akou, gal gal, int i, ViewGroup viewGroup, hmc hmc, fas fas) {
        this(context, akkq, akou, LayoutInflater.from(context).inflate(i, viewGroup, false), aaas, gal, null, hmc, fas);
    }

    public jxw(Context context, akkq akkq, View view, aaas aaas, gal gal, hmc hmc, fas fas) {
        this(context, akkq, new akpn(), view, aaas, gal, hmc, fas);
    }

    public jxw(Context context, akkq akkq, akou akou, View view, aaas aaas, gal gal, hmc hmc, fas fas) {
        this(context, akkq, akou, view, aaas, gal, null, hmc, fas);
    }

    public jxw(Context context, akkq akkq, akou akou, View view, aaas aaas, gal gal, akvp akvp, hmc hmc, fas fas) {
        this.f = (Context) amqw.a((Object) context);
        this.g = (akkq) amqw.a((Object) akkq);
        this.a = (gal) amqw.a((Object) gal);
        this.b = hmc;
        this.c = fas;
        amqw.a((Object) akou);
        akou.a(view);
        this.h = (View) amqw.a((Object) view);
        this.i = (TextView) view.findViewById(R.id.title);
        this.d = (TextView) view.findViewById(R.id.description);
        this.j = (TextView) view.findViewById(R.id.duration);
        this.k = (TextView) fpl.a(view, (int) R.id.author, TextView.class);
        this.l = (TextView) fpl.a(view, (int) R.id.details, TextView.class);
        this.u = (ImageView) view.findViewById(R.id.thumbnail);
        this.v = view.findViewById(R.id.contextual_menu_anchor);
        TextView textView = this.i;
        this.w = textView != null ? textView.getMaxLines() : 0;
        this.B = view.findViewById(R.id.resume_playback_overlay);
        this.C = (ViewStub) view.findViewById(R.id.offline_badge);
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.standalone_ypc_badge);
        fap fap = null;
        this.z = viewStub != null ? new far(viewStub, 1) : null;
        viewStub = (ViewStub) view.findViewById(R.id.standalone_red_badge);
        this.q = viewStub != null ? new ipk(viewStub) : null;
        viewStub = (ViewStub) view.findViewById(R.id.standalone_collection_bottom_badge);
        this.s = viewStub != null ? new klk(viewStub, this.f, aaas, akvp) : null;
        viewStub = (ViewStub) view.findViewById(R.id.text_badge);
        this.p = viewStub != null ? new epu(viewStub) : null;
        viewStub = (ViewStub) view.findViewById(R.id.tap_to_watch_overlay);
        this.n = viewStub != null ? new esw(viewStub, this.f, akvp) : null;
        viewStub = (ViewStub) view.findViewById(R.id.view_count_overlay);
        this.o = viewStub != null ? new etn(viewStub, this.f) : null;
        viewStub = (ViewStub) view.findViewById(R.id.standalone_collection_badge);
        this.r = viewStub != null ? new klk(viewStub, this.f, aaas, akvp) : null;
        viewStub = (ViewStub) view.findViewById(R.id.privacy_badge);
        this.t = viewStub != null ? new khp(viewStub, this.f) : null;
        viewStub = (ViewStub) view.findViewById(R.id.trending_position_overlay);
        this.y = viewStub != null ? new etg(viewStub, aaas) : null;
        viewStub = (ViewStub) view.findViewById(R.id.metadata_badge);
        if (viewStub != null) {
            fas fas2 = this.c;
            if (fas2 != null) {
                fap = fas2.a(this.f, viewStub);
            }
        }
        this.A = fap;
        this.e = amvj.a();
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(CharSequence charSequence) {
        TextView textView = this.i;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(CharSequence charSequence) {
        exx.a(this.d, charSequence);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        a(charSequence, Arrays.asList(new CharSequence[]{charSequence2}), z);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(CharSequence charSequence, List list, boolean z) {
        TextView textView = this.k;
        if (textView != null) {
            exx.a(textView, charSequence);
        }
        boolean z2 = false;
        if (z) {
            xpr.a(this.l, false);
            return;
        }
        if (this.k == null && !TextUtils.isEmpty(charSequence)) {
            this.e.add(0, charSequence);
        }
        this.e.addAll(list);
        if (!this.e.isEmpty()) {
            TextView textView2 = this.l;
            if (textView2 instanceof WrappingTextView) {
                ((WrappingTextView) textView2).a(this.e);
                for (CharSequence isEmpty : this.e) {
                    if (!TextUtils.isEmpty(isEmpty)) {
                        z2 = true;
                        break;
                    }
                }
                xpr.a(this.l, z2);
            } else if (!list.isEmpty()) {
                exx.a(this.l, (CharSequence) list.get(0));
            }
        }
        this.e.clear();
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(aped aped) {
        far far = this.z;
        if (far != null) {
            far.a(aped);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(apeb apeb) {
        ipk ipk = this.q;
        if (ipk != null) {
            ipk.a(apeb);
            if (apeb != null) {
                TextView textView = this.l;
                if (textView != null) {
                    textView.setVisibility(8);
                }
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(auxa auxa) {
        fap fap = this.A;
        if (fap != null) {
            fap.a(auxa);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(ayfk ayfk, int i) {
        esw esw = this.n;
        if (esw != null) {
            if (esw.b.getResources().getConfiguration().orientation == 2 || ayfk == null) {
                esw.d.setVisibility(8);
            } else {
                int a;
                ImageView imageView = (ImageView) esw.b();
                arwf arwf = ayfk.c;
                if (arwf == null) {
                    arwf = arwf.c;
                }
                if ((ayfk.a & 2) != 0) {
                    akvp akvp = esw.a;
                    arwh a2 = arwh.a(arwf.b);
                    if (a2 == null) {
                        a2 = arwh.UNKNOWN;
                    }
                    a = akvp.a(a2);
                } else {
                    a = 0;
                }
                if (a != 0) {
                    imageView.setImageResource(a);
                } else {
                    imageView.setImageDrawable(null);
                }
                imageView.setVisibility(i);
                esw.c = true;
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(ayfq ayfq) {
        View view = this.B;
        if (view != null) {
            if (this.E == null) {
                this.E = new fnk((ViewStub) view);
            }
            this.E.a(ayfq);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(apdz apdz) {
        klk klk = this.r;
        if (klk != null) {
            klk.a(apdz);
            TextView textView = this.i;
            if (textView != null) {
                textView.setMaxLines(apdz != null ? this.w - 1 : this.w);
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(CharSequence charSequence, CharSequence charSequence2) {
        exx.a(this.j, charSequence);
        if (this.j != null && !TextUtils.isEmpty(charSequence)) {
            this.j.setContentDescription(charSequence2);
            TextView textView = this.j;
            if (textView instanceof DurationBadgeView) {
                ((DurationBadgeView) textView).b();
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(CharSequence charSequence, CharSequence charSequence2, ayfu[] ayfuArr, ayri ayri) {
        exx.a(this.j, charSequence, charSequence2, ayfuArr != null ? Arrays.asList(ayfuArr) : null, ayri);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(CharSequence charSequence, CharSequence charSequence2, List list, ayri ayri) {
        exx.a(this.j, charSequence, charSequence2, list, ayri);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(aygk aygk, akko akko) {
        this.g.a(this.u, aygk, akko);
        this.x = aygk;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(aygk aygk) {
        this.g.a(this.u, aygk);
        this.x = aygk;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(ajzw ajzw, akor akor, klo klo, akoa akoa) {
        axwx axwx = (axwx) ajzv.a(ajzw, axwx.class);
        if (axwx != null && this.G == null) {
            View findViewById = this.h.findViewById(R.id.subscribe_section);
            if (findViewById instanceof ViewStub) {
                findViewById = (ViewGroup) ((ViewStub) findViewById).inflate();
            }
            if (findViewById instanceof ViewGroup) {
                this.G = new klp((Context) klo.a((Context) klo.a.get(), 1), (est) klo.a((est) klo.b.get(), 2), (eur) klo.a((eur) klo.c.get(), 3), (ViewGroup) klo.a((ViewGroup) findViewById, 4));
            }
        }
        esu esu = this.G;
        if (esu != null) {
            acvx acvx = akor.a;
            if (axwx == null) {
                esu.c.setVisibility(8);
            } else {
                axak axak;
                arml arml = null;
                if ((1 & axwx.a) != 0) {
                    axak = axwx.b;
                    if (axak == null) {
                        axak = axak.a;
                    }
                } else {
                    axak = null;
                }
                axwa axwa = (axwa) ajzv.a(ajzv.a(axak), axwa.class);
                if (axwa == null) {
                    esu.c.setVisibility(8);
                } else {
                    arml arml2;
                    arml arml3;
                    esu.c.setVisibility(0);
                    acvx.a(axwx.f.d(), null);
                    if ((2 & axwx.a) != 0) {
                        arml2 = axwx.c;
                        if (arml2 == null) {
                            arml2 = arml.f;
                        }
                    } else {
                        arml2 = null;
                    }
                    esu.d = ajqy.a(arml2, esu.a);
                    if ((4 & axwx.a) != 0) {
                        arml3 = axwx.d;
                        if (arml3 == null) {
                            arml3 = arml.f;
                        }
                    } else {
                        arml3 = null;
                    }
                    esu.e = ajqy.a(arml3, esu.a);
                    if ((axwx.a & 8) != 0) {
                        arml = axwx.e;
                        if (arml == null) {
                            arml = arml.f;
                        }
                    }
                    esu.f = ajqy.a(arml, esu.a);
                    boolean z = axwa.o;
                    esu.a(z, z, false);
                    esu.b.a(esu);
                    esu.b.a(axwa, acvx);
                }
            }
        }
        aqqg aqqg = (aqqg) ajzv.a(ajzw, aqqg.class);
        if (aqqg != null) {
            akoa.a_(akor, aqqg);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(akor akor, hnf hnf) {
        ViewStub viewStub = this.C;
        if (viewStub != null) {
            if (this.F == null) {
                this.F = this.b.a(viewStub, hnf);
            }
            this.F.a(akor);
        }
    }

    protected static void a(akor akor, ayym ayym) {
        akor.a("VideoPresenterConstants.VIDEO_ID", ayym.b);
    }

    public final gaf h() {
        if (this.D == null) {
            ViewStub viewStub = (ViewStub) this.h.findViewById(R.id.moving_thumbnail_stub);
            if (viewStub != null) {
                viewStub.inflate();
            }
        }
        this.D = this.a.a((ImageView) this.h.findViewById(R.id.moving_thumbnail), (ImageView) this.h.findViewById(R.id.lozenge));
        return this.D;
    }

    public void a(Map map) {
        ImageView imageView = this.u;
        if (imageView != null) {
            map.put("VideoPresenterConstants.VIDEO_THUMBNAIL_VIEW_KEY", imageView);
            map.put("VideoPresenterConstants.VIDEO_THUMBNAIL_DETAILS_KEY", this.x);
        }
    }

    public void a(akpb akpb) {
        hlv hlv = this.F;
        if (hlv != null) {
            hlv.a();
        }
        epu epu = this.p;
        if (epu != null) {
            View view = epu.f;
            if (view != null) {
                view.animate().cancel();
            }
        }
        klp klp = this.G;
        if (klp != null) {
            klp.b.a();
        }
    }
}
