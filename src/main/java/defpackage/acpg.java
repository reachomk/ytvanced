package defpackage;

import android.view.View;
import com.google.android.youtube.R;

/* renamed from: acpg */
final /* synthetic */ class acpg implements xsd {
    private final acpe a;

    acpg(acpe acpe) {
        this.a = acpe;
    }

    public final void a(Object obj) {
        acpe acpe = this.a;
        View view = (View) obj;
        if (acpe.aa == null) {
            auyi a = acpe.a(acpe.al);
            if (a != null) {
                acqz acqz;
                acpe.aa = new acqy(acpe.p(), view, a, acpe.as, acpe.ap, acpe.aB, acpe);
                acqy acqy = acpe.aa;
                Boolean bool = acpe.ah;
                if (bool != null) {
                    acqz = acqy.e;
                    if (!(acqz == null || acqz.a() == bool.booleanValue())) {
                        acqy.e.b();
                    }
                }
                acqy = acpe.aa;
                bool = acpe.ai;
                if (bool != null) {
                    acqz = acqy.j;
                    if (!(acqz == null || acqz.a() == bool.booleanValue())) {
                        acqy.j.b();
                    }
                }
                acqy = acpe.aa;
                bool = acpe.aj;
                if (bool != null) {
                    acqz = acqy.d;
                    if (!(acqz == null || acqz.a() == bool.booleanValue())) {
                        acqy.d.b();
                    }
                }
                acqy = acpe.aa;
                asjd asjd = acpe.ak;
                if (asjd != null) {
                    acqz = acqy.f;
                    if (!(acqz == null || acqz.a() == asjd.b)) {
                        acqy.f.b();
                    }
                    acqz = acqy.g;
                    if (!(acqz == null || acqz.a() == asjd.c)) {
                        acqy.g.b();
                    }
                    acqz = acqy.h;
                    if (!(acqz == null || acqz.a() == asjd.d)) {
                        acqy.h.b();
                    }
                    String str = "";
                    if (!asjd.e.isEmpty()) {
                        for (int i = 0; i < acqy.b.getCount(); i++) {
                            atra atra = (atra) acqy.b.getItemAtPosition(i);
                            if (asjd.e.equals(atra.b == 2 ? (String) atra.c : str)) {
                                acqy.b.setSelection(i);
                                break;
                            }
                        }
                    }
                    acqz = acqy.i;
                    if (!(acqz == null || acqz.a() == asjd.f)) {
                        acqy.i.b();
                    }
                    if (!asjd.g.isEmpty()) {
                        for (int i2 = 0; i2 < acqy.c.getCount(); i2++) {
                            atra atra2 = (atra) acqy.c.getItemAtPosition(i2);
                            if (asjd.g.equals(atra2.b == 2 ? (String) atra2.c : str)) {
                                acqy.c.setSelection(i2);
                                break;
                            }
                        }
                    }
                }
            } else {
                return;
            }
        }
        acpe.aa.a.a(acwl.L, null, null);
        acpe.aa();
        acpe.c = R.id.pre_stream_advanced_settings;
    }
}
