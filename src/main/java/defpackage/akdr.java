package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: akdr */
public final class akdr implements swd {
    public final aaas a;

    public akdr(aaas aaas, aket aket) {
        int i;
        this.a = aaas;
        akev a = aket.a();
        cpl cpl = new cpl();
        float d = a.d();
        float d2 = a.d();
        cpl.a = (double) d;
        cpl.b = (double) d2;
        if (cum.a != -2) {
            i = cum.a;
        } else {
            try {
                i = cum.a("/sys/devices/system/cpu/possible");
                if (i == -1) {
                    i = cum.a("/sys/devices/system/cpu/present");
                }
                if (i == -1) {
                    i = new File("/sys/devices/system/cpu/").listFiles(cum.b).length;
                }
            } catch (NullPointerException | SecurityException unused) {
                i = -1;
            }
            cum.a = i;
        }
        if (i == -1 || i == 0) {
            i = 1;
        }
        double d3 = (double) i;
        double d4 = cpl.a;
        Double.isNaN(d3);
        i = (int) Math.ceil((d4 * d3) + 0.0d);
        d4 = cpl.b;
        Double.isNaN(d3);
        int ceil = (int) Math.ceil((d3 * d4) + 0.0d);
        if (i == 0) {
            i = 1;
        }
        if (ceil < i) {
            ceil = i;
        }
        cuj.h = new cpm(i, ceil, cpl.c);
        if (a.e()) {
            cuj.o = cuj.h;
        }
    }

    private static View a(View view) {
        if (!(view.getTag(R.id.elements_image) instanceof bdhi)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    View a = akdr.a(viewGroup.getChildAt(i));
                    if (a != null) {
                        return a;
                    }
                }
            }
            view = null;
        }
        return view;
    }

    public final anwy a() {
        return asfc.a;
    }

    public final /* synthetic */ bblt a(Object obj, swg swg) {
        apxu apxu = (apxu) obj;
        View view = (View) swg.a().c();
        HashMap hashMap = new HashMap();
        if (swg.d().a() && (swg.d().b() instanceof akeb)) {
            akeb akeb = (akeb) swg.d().b();
            if (akeb.a() != null) {
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", akeb.a());
            }
            if (akeb.b() != null) {
                hashMap.put("MacrosConverters.CustomConvertersKey", akeb.b().toArray());
            }
        }
        hashMap.put("com.google.android.libraries.youtube.rendering.elements.sender_view", view);
        try {
            apxx apxx = (apxx) ((anvi) ((apxx) apxu.d.createBuilder()).mergeFrom(apxu.toByteArray(), anxa.c()));
            apxu apxu2 = (apxu) ((anxl) apxx.build());
            if (view != null) {
                anxr access$000 = anxl.checkIsLite(WatchEndpointOuterClass.watchEndpoint);
                apxu2.a(access$000);
                if (apxu2.h.a(access$000.d)) {
                    View a = akdr.a(view);
                    if (a != null) {
                        hashMap.put("VideoPresenterConstants.VIDEO_THUMBNAIL_VIEW_KEY", a);
                        Object tag = a.getTag(R.id.elements_image);
                        if (tag instanceof bdhi) {
                            aygj aygj = (aygj) aygk.f.createBuilder();
                            for (bdhk bdhk : ((bdhi) tag).a) {
                                aygl aygl = (aygl) aygm.e.createBuilder();
                                String str = !bdhk.a().startsWith("//") ? "" : "https:";
                                String valueOf = String.valueOf(bdhk.a());
                                if (valueOf.length() == 0) {
                                    valueOf = new String(str);
                                } else {
                                    valueOf = str.concat(valueOf);
                                }
                                aygl.a(valueOf);
                                aygl.a(bdhk.b);
                                aygl.b(bdhk.c);
                                aygj.a(aygl);
                            }
                            tag = (aygk) ((anxl) aygj.build());
                        } else {
                            tag = null;
                        }
                        hashMap.put("VideoPresenterConstants.VIDEO_THUMBNAIL_DETAILS_KEY", tag);
                    }
                }
            }
            if (view != null) {
                for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                    Map map = (Map) ((View) parent).getTag(R.id.elements_navigation_args);
                    if (map != null) {
                        hashMap.putAll(map);
                        break;
                    }
                }
            }
            swn swn = (swn) swg.f().c();
            if (swn instanceof akeg) {
                axfq axfq = (axfq) axfr.c.createBuilder();
                axfq.a(((akeg) swn).a.d());
                apxx.a(axft.b, (axfr) ((anxl) axfq.build()));
            }
            swn swn2 = (swn) swg.f().c();
            if (swn2 instanceof akeg) {
                hashMap.put("com.google.android.libraries.youtube.logging.interaction_logger", ((akeg) swn2).a);
            }
            Object akdu = new akdu(this, hashMap, apxx);
            bbow.a(akdu, "source is null");
            return new bbpy(akdu);
        } catch (anyg e) {
            return bblt.a(e);
        }
    }
}
