package defpackage;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: jzo */
public final class jzo extends akpl implements akmz, akok {
    public final SwipeLayout a;
    public final epv b;
    public final akyw c;
    public apmi d;
    private final TextView e = ((TextView) this.a.findViewById(R.id.channel_name));
    private final TextView f = ((TextView) this.a.findViewById(R.id.activity_count_live_status));
    private final ImageView g = ((ImageView) this.a.findViewById(R.id.channel_avatar));
    private final View h = this.a.findViewById(R.id.channel_status);
    private final akpk i;
    private final RecyclerView j = ((RecyclerView) this.a.findViewById(R.id.buttons));
    private final Context k;
    private final akkq l;
    private final akoj m;
    private final akmx n;
    private final OnLongClickListener o;
    private final akyw p;
    private akor q;

    public jzo(Context context, akkq akkq, bcaa bcaa, aaas aaas, akmx akmx, epv epv, klq klq, akpe akpe) {
        this.k = (Context) amqw.a((Object) context);
        this.l = (akkq) amqw.a((Object) akkq);
        this.b = (epv) amqw.a((Object) epv);
        this.n = (akmx) amqw.a((Object) akmx);
        this.a = (SwipeLayout) LayoutInflater.from(context).inflate(R.layout.channel_list_item, null);
        this.j.a(new ans(0, false));
        akph akph = new akph();
        apa a = akpe.a(akph);
        this.j.a(a);
        this.i = new akpk();
        a.a(this.i);
        akph.a(aphv.class, new akpa(bcaa));
        akph.a(aphg.class, new jzv(this));
        akph.a(axxl.class, (akox) klq);
        this.m = new akoj(aaas, this.a, (akok) this);
        this.o = new jzr(this);
        this.p = new jzq(this);
        this.c = new jzt(this);
    }

    public final View K_() {
        return this.a;
    }

    public final void a(akpb akpb) {
        this.m.a();
        this.n.a((akmz) this);
        this.d = null;
        xrh.a(this.a, Collections.emptyList());
    }

    public final boolean a(View view) {
        apmi apmi = this.d;
        if ((apmi.a & 8) == 0) {
            return true;
        }
        if (c(apmi) == 2) {
            a(this.d, 1);
        }
        return false;
    }

    public final void a(Uri uri, Uri uri2) {
        arml arml;
        aygk aygk;
        evk evk = (evk) this.n.a(uri);
        this.d = (apmi) evk.c;
        this.a.setAlpha(1.0f);
        apmi apmi = this.d;
        if ((apmi.a & 8) == 0) {
            this.m.a();
        } else {
            akoj akoj = this.m;
            acvx acvx = this.q.a;
            apxu apxu = apmi.g;
            if (apxu == null) {
                apxu = apxu.d;
            }
            akoj.a(acvx, apxu, this.q.b());
        }
        apmi = this.d;
        if ((apmi.a & 2) != 0) {
            arml = apmi.e;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        this.e.setText(ajqy.a(arml));
        apmi = this.d;
        if ((apmi.a & 4) != 0) {
            aygk = apmi.f;
            if (aygk == null) {
                aygk = aygk.f;
            }
        } else {
            aygk = null;
        }
        if (aklb.a(aygk)) {
            this.l.a(this.g, aygk);
        }
        apmi = this.d;
        int i = apmi.b;
        TextView textView;
        if (i == 4) {
            this.f.setVisibility(0);
            textView = this.f;
            if (apmi.b == 4) {
                arml = (arml) apmi.c;
            } else {
                arml = arml.f;
            }
            textView.setText(ajqy.a(arml));
            this.f.setTextColor(this.k.getResources().getColor(R.color.grey));
        } else if (i != 5) {
            this.f.setVisibility(8);
        } else {
            this.f.setVisibility(0);
            textView = this.f;
            if (apmi.b == 5) {
                arml = (arml) apmi.c;
            } else {
                arml = arml.f;
            }
            textView.setText(ajqy.a(arml));
            this.f.setTextColor(this.k.getResources().getColor(R.color.red));
        }
        apmi = this.d;
        this.i.clear();
        for (apmc apmc : apmi.k) {
            int i2 = apmc.a;
            akpk akpk;
            Object obj;
            if ((i2 & 1) != 0) {
                akpk = this.i;
                obj = apmc.b;
                if (obj == null) {
                    obj = aphv.s;
                }
                akpk.add(obj);
            } else if ((i2 & 2) != 0) {
                akpk = this.i;
                obj = apmc.c;
                if (obj == null) {
                    obj = aphg.s;
                }
                akpk.add(obj);
            } else if ((i2 & 4) != 0) {
                akpk = this.i;
                obj = apmc.d;
                if (obj == null) {
                    obj = axxl.k;
                }
                akpk.add(obj);
            }
        }
        this.i.a();
        this.j.setVisibility(!this.i.isEmpty() ? 0 : 8);
        apmi = this.d;
        ArrayList arrayList = new ArrayList();
        this.a.c();
        if (apmi.l.size() != 0) {
            for (apmo apmo : apmi.l) {
                if ((apmo.a & 1) != 0) {
                    eps a = this.b.a(this.p, a(apmi));
                    akor akor = this.q;
                    Object obj2 = apmo.b;
                    if (obj2 == null) {
                        obj2 = aphg.s;
                    }
                    a.a_(akor, obj2);
                    TextView textView2 = a.b;
                    if (textView2 instanceof TextView) {
                        textView2.setGravity(16);
                    }
                    arrayList.add(textView2);
                }
            }
            xrh.a(this.a, arrayList);
            this.a.setOnLongClickListener(this.o);
        } else {
            xrh.a(this.a, arrayList);
            this.a.setOnLongClickListener(null);
        }
        int i3 = evk.b;
        this.h.setVisibility(8);
        this.g.setAlpha(1.0f);
        this.e.setAlpha(1.0f);
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        } else if (i4 == 1) {
            this.h.setVisibility(0);
        } else if (i4 == 2) {
            this.g.setAlpha(0.5f);
            this.e.setAlpha(0.5f);
        } else if (i4 == 3) {
            this.a.setAlpha(0.5f);
            this.j.setVisibility(8);
            this.a.a(null);
            SwipeLayout swipeLayout = this.a;
            swipeLayout.f = false;
            swipeLayout.h = false;
            swipeLayout.setOnLongClickListener(null);
        }
    }

    public final Map a(apmi apmi) {
        HashMap hashMap = new HashMap();
        acvx acvx = this.q.a;
        if (acvx != null) {
            hashMap.put("com.google.android.libraries.youtube.logging.interaction_logger", acvx);
        }
        hashMap.putAll(acwi.a(new evg(false, new jzs(this, apmi, c(apmi)))));
        return hashMap;
    }

    public final evk b(apmi apmi) {
        return apmi != null ? (evk) this.n.a(evk.a(apmi)) : null;
    }

    public final void b() {
        a(this.d, 4);
    }

    private final int c(apmi apmi) {
        evk b = b(apmi);
        if (b == null) {
            return 1;
        }
        return b.b;
    }

    public final void a(apmi apmi, int i) {
        evk b = b(apmi);
        if (b != null) {
            this.n.a(b.a, new evk((apmi) b.c, i));
        }
    }
}
