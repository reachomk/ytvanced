package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: kok */
public final class kok implements akot {
    private final LayoutInflater a;
    private final aaas b;
    private final akkq c;
    private final lud d;
    private final kor e;
    private armx f;
    private final View g = this.a.inflate(R.layout.formfill_form, null, false);
    private final ImageView h = ((ImageView) this.g.findViewById(R.id.title_image));
    private final TextView i = ((TextView) this.g.findViewById(R.id.title));
    private final TextView j = ((TextView) this.g.findViewById(R.id.description));
    private final TextView k = ((TextView) this.g.findViewById(R.id.intro_text));
    private final TextView l = ((TextView) this.g.findViewById(R.id.instructions));
    private final LinearLayout m = ((LinearLayout) this.g.findViewById(R.id.input_fields));
    private final TextView n = ((TextView) this.g.findViewById(R.id.disclaimer));
    private final Button o = ((Button) this.g.findViewById(R.id.close_button));
    private final Button p = ((Button) this.g.findViewById(R.id.submit_button));

    public kok(Context context, aaas aaas, akkq akkq, lud lud) {
        kor kor = new kor(context, aaas);
        this.a = LayoutInflater.from(context);
        this.b = aaas;
        this.c = akkq;
        this.d = lud;
        this.e = kor;
        this.o.setOnClickListener(new kon(this));
        this.p.setOnClickListener(new kom(this));
    }

    public final View K_() {
        return this.g;
    }

    public final void a(akpb akpb) {
        kor kor = this.e;
        kor.a.clear();
        kor.b.removeAllViews();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        aphg aphg;
        Button button;
        obj = (armx) obj;
        amqw.a(obj);
        this.f = obj;
        acvx acvx = akor.a;
        arml arml2 = null;
        acvx.a(obj.k.d(), null);
        anxp anxp = this.f.i;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
        anxp.a(access$000);
        if (anxp.h.a(access$000.d)) {
            anxp = this.f.i;
            if (anxp == null) {
                anxp = axak.a;
            }
            access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
            anxp.a(access$000);
            obj = anxp.h.b(access$000.d);
            if (obj == null) {
                obj = access$000.b;
            } else {
                obj = access$000.a(obj);
            }
            acvx.a(((aphg) obj).r.d(), null);
        }
        anxp = this.f.j;
        if (anxp == null) {
            anxp = axak.a;
        }
        access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
        anxp.a(access$000);
        if (anxp.h.a(access$000.d)) {
            anxp = this.f.j;
            if (anxp == null) {
                anxp = axak.a;
            }
            access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
            anxp.a(access$000);
            obj = anxp.h.b(access$000.d);
            if (obj == null) {
                obj = access$000.b;
            } else {
                obj = access$000.a(obj);
            }
            acvx.a(((aphg) obj).r.d(), null);
        }
        akkq akkq = this.c;
        ImageView imageView = this.h;
        aygk aygk = this.f.b;
        if (aygk == null) {
            aygk = aygk.f;
        }
        akkq.a(imageView, aygk);
        TextView textView = this.i;
        armx armx = this.f;
        if ((armx.a & 2) != 0) {
            arml = armx.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        textView = this.k;
        armx = this.f;
        if ((armx.a & 8) != 0) {
            arml = armx.e;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = this.l;
        armx = this.f;
        if ((armx.a & 16) != 0) {
            arml = armx.f;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = this.j;
        armx = this.f;
        if ((armx.a & 4) != 0) {
            arml = armx.d;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        textView = this.n;
        armx = this.f;
        if ((armx.a & 32) != 0) {
            arml = armx.h;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, aabb.a(arml, this.b, false));
        anxp = this.f.i;
        if (anxp == null) {
            anxp = axak.a;
        }
        access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
        anxp.a(access$000);
        if (anxp.h.a(access$000.d)) {
            arml arml3;
            anxp = this.f.i;
            if (anxp == null) {
                anxp = axak.a;
            }
            access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
            anxp.a(access$000);
            obj = anxp.h.b(access$000.d);
            if (obj == null) {
                obj = access$000.b;
            } else {
                obj = access$000.a(obj);
            }
            aphg = (aphg) obj;
            this.o.setVisibility(0);
            button = this.o;
            if ((aphg.a & 128) != 0) {
                arml3 = aphg.g;
                if (arml3 == null) {
                    arml3 = arml.f;
                }
            } else {
                arml3 = null;
            }
            button.setText(ajqy.a(arml3));
        } else {
            this.o.setVisibility(8);
        }
        anxp = this.f.j;
        if (anxp == null) {
            anxp = axak.a;
        }
        access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
        anxp.a(access$000);
        if (anxp.h.a(access$000.d)) {
            anxp = this.f.j;
            if (anxp == null) {
                anxp = axak.a;
            }
            access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
            anxp.a(access$000);
            obj = anxp.h.b(access$000.d);
            if (obj == null) {
                obj = access$000.b;
            } else {
                obj = access$000.a(obj);
            }
            aphg = (aphg) obj;
            button = this.p;
            if ((aphg.a & 128) != 0) {
                arml2 = aphg.g;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
            }
            button.setText(ajqy.a(arml2));
        }
        this.e.a(this.m, this.f.g, acvx);
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void b() {
        anxp anxp = this.f.j;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
        anxp.a(access$000);
        if (anxp.h.a(access$000.d)) {
            anxp = this.f.j;
            if (anxp == null) {
                anxp = axak.a;
            }
            access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
            anxp.a(access$000);
            Object b = anxp.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            aphg aphg = (aphg) b;
            len g = this.d.a.g();
            RecyclerView recyclerView = (RecyclerView) g.a(g.b()).f().findViewById(R.id.results);
            kor kor = this.e;
            Collection arrayList = new ArrayList();
            View view = null;
            int i = 0;
            for (kos kos : kor.a) {
                kop a = kos.a();
                koo a2 = a.a(kos.b().d);
                a.b(a2.a() ^ 1);
                if (!a2.a()) {
                    if ((kos.b().a & 16) != 0) {
                        Object obj = kos.b().f;
                        if (obj == null) {
                            obj = apxu.d;
                        }
                        arrayList.add(obj);
                    }
                    apxu b2 = a2.b();
                    if (b2 != null) {
                        arrayList.add(b2);
                    }
                    if (view == null) {
                        view = a.d();
                    }
                    i = 1;
                }
            }
            if (view != null) {
                view.requestFocus();
                if (recyclerView != null) {
                    recyclerView.postDelayed(new koq(view, recyclerView), 100);
                }
            }
            koc koc = new koc(i ^ 1, amul.a(arrayList));
            if (koc.a) {
                Map a3;
                kor kor2;
                aaas aaas;
                g.c();
                if ((aphg.a & 2048) != 0) {
                    a3 = acwi.a(this.f, false);
                    kor2 = this.e;
                    ArrayList arrayList2 = new ArrayList();
                    for (kos kos2 : kor2.a) {
                        kop a4 = kos2.a();
                        arnb b3 = kos2.b();
                        if (!(a4 instanceof koi)) {
                            dhr dhr = (dhr) dho.f.createBuilder();
                            dhv dhv = (dhv) dhs.c.createBuilder();
                            String b4 = a4.b();
                            dhv.copyOnWrite();
                            dhs dhs = (dhs) dhv.instance;
                            if (b4 != null) {
                                dhs.a |= 1;
                                dhs.b = b4;
                                dhr.copyOnWrite();
                                dho dho = (dho) dhr.instance;
                                dho.c = (anxl) dhv.build();
                                dho.b = 4;
                                String str = b3.c;
                                dhr.copyOnWrite();
                                dho dho2 = (dho) dhr.instance;
                                if (str != null) {
                                    dho2.a |= 1;
                                    dho2.d = str;
                                    boolean c = a4.c();
                                    dhr.copyOnWrite();
                                    dho dho3 = (dho) dhr.instance;
                                    dho3.a |= 2;
                                    dho3.e = c;
                                    arrayList2.add((dho) ((anxl) dhr.build()));
                                } else {
                                    throw new NullPointerException();
                                }
                            }
                            throw new NullPointerException();
                        }
                    }
                    a3.put("FORM_RESULTS_ARG", arrayList2);
                    kor2 = this.e;
                    arrayList2 = new ArrayList();
                    for (kos kos22 : kor2.a) {
                        if (kos22.a().c() && (kos22.b().a & 8) != 0) {
                            Object obj2 = kos22.b().e;
                            if (obj2 == null) {
                                obj2 = apxu.d;
                            }
                            arrayList2.add(obj2);
                        }
                    }
                    a3.put("SUBMIT_COMMANDS_ARG", arrayList2);
                    aaas = this.b;
                    apxu apxu = aphg.l;
                    if (apxu == null) {
                        apxu = apxu.d;
                    }
                    aaas.a(apxu, a3);
                }
                if ((aphg.a & 4096) != 0) {
                    Object obj3 = this.f;
                    kor2 = this.e;
                    atss atss = (atss) atst.q.createBuilder();
                    atsn atsn = atsn.h;
                    for (kos a5 : kor2.a) {
                        atsn = a5.a().a(atsn);
                    }
                    atss.copyOnWrite();
                    atst atst = (atst) atss.instance;
                    if (atsn != null) {
                        atst.l = atsn;
                        atst.a |= 32768;
                        atst = (atst) ((anxl) atss.build());
                        a3 = acwi.a(obj3, true);
                        a3.put(acwi.c, atst);
                        aaas = this.b;
                        apxu apxu2 = aphg.m;
                        if (apxu2 == null) {
                            apxu2 = apxu.d;
                        }
                        aaas.a(apxu2, a3);
                    } else {
                        throw new NullPointerException();
                    }
                }
                return;
            }
            this.b.a(koc.b, null);
        }
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void c() {
        armx armx = this.f;
        if (armx != null) {
            anxp anxp = armx.i;
            if (anxp == null) {
                anxp = axak.a;
            }
            anxr access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
            anxp.a(access$000);
            if (anxp.h.a(access$000.d)) {
                anxp = this.f.i;
                if (anxp == null) {
                    anxp = axak.a;
                }
                access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
                anxp.a(access$000);
                Object b = anxp.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                aphg aphg = (aphg) b;
                if ((aphg.a & 8192) != 0) {
                    aaas aaas = this.b;
                    apxu apxu = aphg.n;
                    if (apxu == null) {
                        apxu = apxu.d;
                    }
                    aaas.a(apxu, null);
                }
            }
        }
    }
}
