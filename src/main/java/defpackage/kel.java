package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: kel */
public final class kel implements akot {
    private final ViewGroup a;
    private final ViewGroup b;
    private final ViewGroup c = ((ViewGroup) this.a.findViewById(R.id.sub_menu_container));
    private final ewb d;
    private final epv e;
    private final esh f;
    private ese g;

    public kel(Activity activity, epv epv, ewb ewb, esh esh) {
        this.e = epv;
        this.a = (ViewGroup) LayoutInflater.from(activity).inflate(R.layout.item_section_menu_header, null);
        this.d = ewb;
        this.f = esh;
        this.b = (ViewGroup) this.a.findViewById(R.id.buttons_view);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.a;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        axqm axqm;
        String obj2;
        atvt atvt = (atvt) obj;
        if ((atvt.a & 8) != 0) {
            atvx atvx = atvt.c;
            if (atvx == null) {
                atvx = atvx.c;
            }
            anxl anxl = atvx.b;
            if (anxl == null) {
                anxl = axqn.f;
            }
            axqm = (axqm) ((anxo) anxl.toBuilder());
        } else {
            axqm = null;
        }
        atvs atvs = (atvs) ((anxo) atvt.toBuilder());
        this.c.removeAllViews();
        if (axqm != null) {
            if (this.g == null) {
                this.g = this.f.c(this.a);
            }
            if (((axqn) axqm.instance).c.isEmpty() && !TextUtils.isEmpty(ajqy.a(atvs.a()))) {
                obj2 = ajqy.a(atvs.a()).toString();
                axqm.copyOnWrite();
                axqn axqn = (axqn) axqm.instance;
                if (obj2 != null) {
                    axqn.a |= 1;
                    axqn.c = obj2;
                    anxl anxl2 = ((atvt) atvs.instance).c;
                    if (anxl2 == null) {
                        anxl2 = atvx.c;
                    }
                    atvw atvw = (atvw) ((anxo) anxl2.toBuilder());
                    atvw.copyOnWrite();
                    atvx atvx2 = (atvx) atvw.instance;
                    atvx2.b = (axqn) ((anxl) axqm.build());
                    atvx2.a |= 1;
                    atvs.copyOnWrite();
                    atvt atvt2 = (atvt) atvs.instance;
                    atvt2.c = (atvx) ((anxl) atvw.build());
                    atvt2.a |= 8;
                } else {
                    throw new NullPointerException();
                }
            }
            this.g.a_(akor, (axqn) ((anxl) axqm.build()));
            this.c.addView(this.g.c);
        }
        List<aphj> unmodifiableList = Collections.unmodifiableList(((atvt) atvs.instance).d);
        if (unmodifiableList.isEmpty()) {
            this.b.setVisibility(8);
        } else {
            this.b.setVisibility(0);
            Map hashMap = new HashMap(1);
            obj2 = "sectionListController";
            hashMap.put(obj2, akor.a(obj2));
            this.b.removeAllViews();
            for (aphj aphj : unmodifiableList) {
                if ((aphj.a & 1) != 0) {
                    eps a = this.e.a(null, hashMap);
                    Object obj3 = aphj.b;
                    if (obj3 == null) {
                        obj3 = aphg.s;
                    }
                    a.a_(akor, obj3);
                    this.b.addView(a.b);
                }
            }
        }
        this.d.a((anxl) atvs.build(), this.a);
    }
}
