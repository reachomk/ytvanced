package defpackage;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.res.TypedArray;
import android.util.Pair;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ahas */
public final class ahas implements ahcc, xcp {
    private static final int[] a = new int[]{R.attr.backgroundSecondaryInverse, R.attr.colorPrimaryAlternate, R.attr.selectableItemBackground, R.attr.textAppearanceBody1, R.attr.textAppearanceButton, R.attr.textAppearanceTitle, R.attr.textAppearanceSubhead};
    private final Activity b;
    private final aaas c;
    private final akkl d;
    private final akvp e;
    private ahaw f;
    private ahau g;
    private ahax h;

    public ahas(Activity activity, akvp akvp, aaas aaas, akkl akkl) {
        this.b = (Activity) amqw.a((Object) activity);
        this.e = (akvp) amqw.a((Object) akvp);
        this.c = (aaas) amqw.a((Object) aaas);
        this.d = (akkl) amqw.a((Object) akkl);
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(a);
        for (int i = 0; i < a.length; i++) {
            if (obtainStyledAttributes.getResourceId(i, -1) == -1) {
                String valueOf = String.valueOf(activity.getResources().getResourceEntryName(a[i]));
                String str = "Resource attribute required but not provided ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str);
                } else {
                    valueOf = str.concat(valueOf);
                }
                throw new IllegalStateException(valueOf);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final void a(Object obj, acvx acvx, Pair pair, ahcr ahcr) {
        if (obj != null) {
            aphj aphj;
            aphg aphg;
            if (obj instanceof ayvi) {
                ayvi ayvi = (ayvi) obj;
                if (ayvi.k) {
                    akle akle;
                    aygk aygk;
                    arml arml;
                    arml arml2;
                    if (this.h == null) {
                        this.h = new ahax(this.b, a(), this.c, this.d);
                    }
                    ahax ahax = this.h;
                    ahax.e = LayoutInflater.from(ahax.a).inflate(R.layout.upsell_dialog_with_header_images, null);
                    ahax.f = (ImageView) ahax.e.findViewById(R.id.background_image);
                    ahax.g = (ImageView) ahax.e.findViewById(R.id.logo);
                    ahax.h = new akle(ahax.d, ahax.f);
                    ahax.i = new akle(ahax.d, ahax.g);
                    ahax.j = (TextView) ahax.e.findViewById(R.id.dialog_title);
                    ahax.k = (TextView) ahax.e.findViewById(R.id.dialog_message);
                    ahax.m = (TextView) ahax.e.findViewById(R.id.action_button);
                    ahax.n = (TextView) ahax.e.findViewById(R.id.dismiss_button);
                    ahax.l = ahax.b.setView(ahax.e).create();
                    ahax.l.setOnCancelListener(new ahba(ahax));
                    ahax.q = acvx;
                    if ((ayvi.a & 2) == 0) {
                        ahax.f.setVisibility(8);
                        ahax.h.b();
                    } else {
                        ahax.f.setVisibility(0);
                        akle = ahax.h;
                        aygk = ayvi.c;
                        if (aygk == null) {
                            aygk = aygk.f;
                        }
                        akle.a(aygk);
                    }
                    if ((ayvi.a & 1) == 0) {
                        ahax.g.setVisibility(8);
                        ahax.i.b();
                    } else {
                        ahax.g.setVisibility(0);
                        akle = ahax.i;
                        aygk = ayvi.b;
                        if (aygk == null) {
                            aygk = aygk.f;
                        }
                        akle.a(aygk);
                    }
                    TextView textView = ahax.j;
                    if ((ayvi.a & 4) != 0) {
                        arml = ayvi.d;
                        if (arml == null) {
                            arml = arml.f;
                        }
                    } else {
                        arml = null;
                    }
                    xpr.a(textView, ajqy.a(arml));
                    textView = ahax.k;
                    if ((8 & ayvi.a) != 0) {
                        arml2 = ayvi.e;
                        if (arml2 == null) {
                            arml2 = arml.f;
                        }
                    } else {
                        arml2 = null;
                    }
                    xpr.a(textView, ajqy.a(arml2));
                    ahaz ahaz = new ahaz(ahax, ahcr);
                    aphj = ayvi.g;
                    if (aphj == null) {
                        aphj = aphj.d;
                    }
                    if ((aphj.a & 1) == 0) {
                        aphg = null;
                    } else {
                        aphj = ayvi.g;
                        if (aphj == null) {
                            aphj = aphj.d;
                        }
                        aphg = aphj.b;
                        if (aphg == null) {
                            aphg = aphg.s;
                        }
                    }
                    ahax.p = aphg;
                    aphj = ayvi.f;
                    if (aphj == null) {
                        aphj = aphj.d;
                    }
                    if ((aphj.a & 1) == 0) {
                        aphg = null;
                    } else {
                        aphj = ayvi.f;
                        if (aphj == null) {
                            aphj = aphj.d;
                        }
                        aphg = aphj.b;
                        if (aphg == null) {
                            aphg = aphg.s;
                        }
                    }
                    ahax.o = aphg;
                    if (ahax.p == null && ahax.o == null) {
                        xpr.a(ahax.n, ahax.a.getResources().getText(R.string.cancel));
                        xpr.a(ahax.m, false);
                    } else {
                        ahax.a(ahax.o, ahax.m, ahaz);
                        ahax.a(ahax.p, ahax.n, ahaz);
                    }
                    ahax.l.show();
                    ahax.a(ahax.c, ayvi);
                } else {
                    ahax.a(this.c, ayvi);
                }
                if (acvx != null) {
                    acvx.a(ayvi.h.d(), null);
                }
            } else if (obj instanceof aqwx) {
                int a;
                if (this.f == null) {
                    this.f = new ahaw(this.b, a());
                }
                ahaw ahaw = this.f;
                aqwx aqwx = (aqwx) obj;
                akvp akvp = this.e;
                if (pair != null) {
                    ahav ahav = new ahav(ahaw, ahcr, pair);
                    ahaw.b.setButton(-1, (CharSequence) pair.first, ahav);
                    ahaw.b.setButton(-2, ahaw.a.getResources().getText(R.string.cancel), ahav);
                } else {
                    ahaw.b.setButton(-2, ahaw.a.getResources().getText(R.string.cancel), new ahay(ahaw, ahcr));
                }
                ahaw.d.setText(aqwx.d);
                if ((aqwx.a & 1) != 0) {
                    arwf arwf = aqwx.b;
                    if (arwf == null) {
                        arwf = arwf.c;
                    }
                    arwh a2 = arwh.a(arwf.b);
                    if (a2 == null) {
                        a2 = arwh.UNKNOWN;
                    }
                    a = akvp.a(a2);
                } else {
                    a = 0;
                }
                if (aqwx.c.isEmpty() && a == 0) {
                    ahaw.g.setVisibility(8);
                    ahaw.f.setVisibility(8);
                } else {
                    ahaw.g.setVisibility(0);
                    ahaw.f.setVisibility(0);
                    xpr.a(ahaw.c, aqwx.c);
                    if (a == 0) {
                        ahaw.e.setVisibility(8);
                    } else {
                        ahaw.e.setImageResource(a);
                        ahaw.e.setVisibility(0);
                    }
                }
                ahaw.b.show();
                ahaw.b.getWindow().setLayout((int) ahaw.a.getResources().getDimension(R.dimen.upsell_dialog_width), -2);
                if (acvx != null) {
                    acvx.a(aqwx.f.d(), null);
                }
            } else if (obj instanceof aqhy) {
                arml arml3;
                aphg aphg2;
                Button button;
                aphg aphg3;
                if (this.g == null) {
                    this.g = new ahau(this.b, a(), this.c);
                }
                aqhy aqhy = (aqhy) obj;
                if (acvx != null) {
                    acvx.a(aqhy.j.d(), null);
                }
                ahau ahau = this.g;
                ahau.f = acvx;
                ahat ahat = new ahat(ahau, ahcr);
                ahau.c.setButton(-1, ahau.a.getResources().getText(R.string.ok), ahat);
                ahau.c.setButton(-2, ahau.a.getResources().getText(R.string.cancel), ahat);
                TextView textView2 = ahau.d;
                if ((aqhy.a & 1) != 0) {
                    arml3 = aqhy.b;
                    if (arml3 == null) {
                        arml3 = arml.f;
                    }
                } else {
                    arml3 = null;
                }
                xpr.a(textView2, ajqy.a(arml3));
                textView2 = ahau.e;
                if ((aqhy.a & 524288) != 0) {
                    arml3 = aqhy.p;
                    if (arml3 == null) {
                        arml3 = arml.f;
                    }
                } else {
                    arml3 = null;
                }
                xpr.a(textView2, ajqy.a(arml3));
                ahau.c.show();
                aphj = aqhy.g;
                if (aphj == null) {
                    aphj = aphj.d;
                }
                if ((aphj.a & 1) == 0) {
                    aphg = null;
                } else {
                    aphj = aqhy.g;
                    if (aphj == null) {
                        aphj = aphj.d;
                    }
                    aphg = aphj.b;
                    if (aphg == null) {
                        aphg = aphg.s;
                    }
                }
                ahau.h = aphg;
                aphj = aqhy.f;
                if (aphj == null) {
                    aphj = aphj.d;
                }
                if ((aphj.a & 1) == 0) {
                    aphg2 = null;
                } else {
                    aphj aphj2 = aqhy.f;
                    if (aphj2 == null) {
                        aphj2 = aphj.d;
                    }
                    aphg2 = aphj2.b;
                    if (aphg2 == null) {
                        aphg2 = aphg.s;
                    }
                }
                ahau.g = aphg2;
                if (ahau.h != null) {
                    button = ahau.c.getButton(-2);
                    aphg3 = ahau.h;
                    if ((aphg3.a & 128) != 0) {
                        arml3 = aphg3.g;
                        if (arml3 == null) {
                            arml3 = arml.f;
                        }
                    } else {
                        arml3 = null;
                    }
                    button.setText(ajqy.a(arml3));
                    ahau.c.getButton(-2).setTextColor(ahau.a.getResources().getColor(R.color.color_brand_primary_alternate));
                    acvx.a(ahau.h.r.d(), null);
                } else if (ahau.g != null) {
                    ahau.c.getButton(-2).setVisibility(8);
                }
                if (ahau.g != null) {
                    button = ahau.c.getButton(-1);
                    aphg3 = ahau.g;
                    if ((aphg3.a & 128) != 0) {
                        arml3 = aphg3.g;
                        if (arml3 == null) {
                            arml3 = arml.f;
                        }
                    } else {
                        arml3 = null;
                    }
                    button.setText(ajqy.a(arml3));
                    ahau.c.getButton(-1).setTextColor(ahau.a.getResources().getColor(R.color.color_brand_primary_alternate));
                    acvx.a(ahau.g.r.d(), null);
                    return;
                }
                ahau.c.getButton(-1).setVisibility(8);
            }
        }
    }

    private final Builder a() {
        return new Builder(this.b);
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{afqh.class};
        } else if (i == 0) {
            ahax ahax = this.h;
            if (ahax != null && ahax.l.isShowing()) {
                ahax.l.cancel();
            }
            ahaw ahaw = this.f;
            if (ahaw != null) {
                ahaw.a();
                return null;
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
