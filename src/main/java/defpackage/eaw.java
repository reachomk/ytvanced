package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.DownloadsPageEndpointOuterClass;
import com.google.protos.youtube.api.innertube.RefreshCommandOuterClass$RefreshCommand;

/* renamed from: eaw */
public final class eaw {
    private final Context a;
    private final eki b;

    public eaw(Context context, eki eki) {
        this.a = context;
        this.b = eki;
    }

    public static ajrr a(ajrr ajrr) {
        amqw.a((Object) ajrr);
        ajru ajru = ajrr.a;
        if (ajru != null) {
            akaq akaq = ajru.b;
            if (!(akaq == null || akaq.a == null)) {
                ajrr = (ajrr) aocf.cloneUsingSerialization(ajrr);
                if (ajrr != null) {
                    int length;
                    akaz akaz = new akaz();
                    akaz.a = new akab();
                    ajrt[] ajrtArr = ajrr.a.b.a;
                    int i = 0;
                    while (true) {
                        length = ajrtArr.length;
                        if (i >= length) {
                            break;
                        }
                        akbc akbc = ajrtArr[i].b;
                        akbc.c = false;
                        akaz akaz2 = akbc.d;
                        if (akaz2 != null) {
                            akab akab = akaz2.a;
                            if (akab != null) {
                                akad[] akadArr = akab.b;
                                if (akadArr != null) {
                                    for (akad akad : akadArr) {
                                        if (akad.n != null) {
                                            break;
                                        }
                                        apwm apwm = akad.u;
                                        if (apwm != null) {
                                            apwa apwa = apwm.b;
                                            if (apwa == null) {
                                                apwa = apwa.c;
                                            }
                                            int a = apwc.a(apwa.b);
                                            if (a != 0 && a == 2) {
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        akbc.d = akaz;
                        i++;
                    }
                    if (length > 0) {
                        ajrtArr[0].b.c = true;
                    }
                }
                return ajrr;
            }
        }
        return null;
    }

    public final ajrr b(ajrr ajrr) {
        amqw.a((Object) ajrr);
        ajru ajru = ajrr.a;
        if (ajru != null) {
            akaq akaq = ajru.b;
            if (!(akaq == null || akaq.a == null)) {
                ajrr = (ajrr) aocf.cloneUsingSerialization(ajrr);
                if (ajrr != null) {
                    arwh arwh;
                    apxu apxu;
                    ajwt ajwt = new ajwt();
                    ajww[] ajwwArr = new ajww[1];
                    boolean b = this.b.b();
                    boolean z = ajrr.j;
                    ejt ejt = new ejt(this.a);
                    ejt.c(2);
                    if (z || b) {
                        arwh = arwh.OFFLINE_NO_CONTENT;
                    } else {
                        arwh = arwh.OFFLINE_NO_CONTENT_UPSIDE_DOWN;
                    }
                    ejt.a(arwh);
                    if (b) {
                        ejt.a((int) R.string.offline_no_content_title_offline_eligible_and_has_content);
                        apxx apxx = (apxx) apxu.d.createBuilder();
                        apxx.a(DownloadsPageEndpointOuterClass.downloadsPageEndpoint, aqxw.c);
                        apxu = (apxu) ((anxl) apxx.build());
                        if (this.b.g()) {
                            ejt.a((int) R.string.offline_no_content_title_has_download_recommendations);
                            ejt.b(R.string.offline_no_content_body_text_has_download_recommendations);
                            ejt.a(3, 4, R.string.offline_no_content_button_text_has_download_recommendations, apxu);
                        } else if (this.b.f()) {
                            ejt.b(R.string.offline_no_content_body_text_has_both_downloads_and_recommendations);
                            ejt.a(3, 4, R.string.offline_no_content_button_text_has_download_recommendations, apxu);
                        } else {
                            ejt.b(R.string.offline_no_content_body_text_offline_eligible_and_has_only_singletons);
                            ejt.a(3, 4, R.string.offline_no_content_downloads_button_text, apxu);
                        }
                    } else if (z) {
                        ejt.a((int) R.string.offline_no_content_title_offline_eligible_and_no_content);
                        ejt.b(R.string.offline_no_content_body_text_offline_eligible_and_no_content);
                    } else {
                        ejt.a((int) R.string.offline_no_content_title_not_offline_eligible);
                        ejt.b(R.string.offline_no_content_body_text_not_offline_eligible);
                    }
                    awzh awzh = (awzh) RefreshCommandOuterClass$RefreshCommand.c.createBuilder();
                    awzh.copyOnWrite();
                    RefreshCommandOuterClass$RefreshCommand refreshCommandOuterClass$RefreshCommand = (RefreshCommandOuterClass$RefreshCommand) awzh.instance;
                    refreshCommandOuterClass$RefreshCommand.a |= 1;
                    refreshCommandOuterClass$RefreshCommand.b = 1;
                    apxx apxx2 = (apxx) apxu.d.createBuilder();
                    apxx2.a(RefreshCommandOuterClass$RefreshCommand.refreshCommand, (RefreshCommandOuterClass$RefreshCommand) ((anxl) awzh.build()));
                    apxu = (apxu) ((anxl) apxx2.build());
                    aphf aphf = (aphf) aphg.s.createBuilder();
                    aphf.a(14);
                    aphf.b(4);
                    aphf.a(ajqy.a(ejt.a.getString(R.string.offline_retry)));
                    if (apxu != null) {
                        aphf.c(apxu);
                    }
                    apag apag = (apag) apah.c.createBuilder();
                    apag.a(aphf);
                    ejt.b = (apah) ((anxl) apag.build());
                    apaj a = ejt.a();
                    ajww ajww = new ajww();
                    ajww.aa = a;
                    ajwwArr[0] = ajww;
                    ajwt.b = ajwwArr;
                    akab akab = new akab();
                    new akad().c = ajwt;
                    akab.b = new akad[]{r4};
                    akaz akaz = new akaz();
                    akaz.a = akab;
                    akaq akaq2 = ajrr.a.b;
                    try {
                        akbc akbc = akaq2.a[0].b;
                        akbc.d = (akaz) aocf.mergeFrom(new akaz(), aocf.toByteArray(akaz));
                        akbc.c = true;
                        akbc.b = this.a.getString(R.string.offline_application_name);
                        new ajrt().b = akbc;
                        akaq2.a = new ajrt[]{r0};
                        return ajrr;
                    } catch (aocg unused) {
                    }
                }
            }
        }
        return null;
    }

    public final ajrr a() {
        ajwt ajwt;
        String str = "PPSV";
        if (this.b.b()) {
            arwm arwm = (arwm) arwj.c.createBuilder();
            arwe arwe = (arwe) arwf.c.createBuilder();
            arwe.a(arwh.OFFLINE_DOWNLOAD);
            arwm.a(arwe);
            arwj arwj = (arwj) ((anxl) arwm.build());
            aqex aqex = (aqex) aqey.n.createBuilder();
            aqex.a(ajqy.a(this.a.getString(R.string.fallback_downloads_top_link_title)));
            aqez aqez = (aqez) aqfa.f.createBuilder();
            aqez.a(arwj);
            aqex.copyOnWrite();
            aqey aqey = (aqey) aqex.instance;
            aqey.j = (aqfa) ((anxl) aqez.build());
            aqey.a |= 32;
            awhg awhg = (awhg) awhh.c.createBuilder();
            awhg.a(str);
            aqer aqer = (aqer) aqes.c.createBuilder();
            aqer.a((awhh) ((anxl) awhg.build()));
            aqex.a(aqer);
            aqex.a(ekc.a);
            ajwt = new ajwt();
            new ajww().b = (aqey) ((anxl) aqex.build());
            ajwt.b = new ajww[]{r5};
        } else {
            ajwt = null;
        }
        apwh apwh = (apwh) apwi.f.createBuilder();
        arml a = ajqy.a(this.a.getString(R.string.fallback_client_sorting_section_renderer_header));
        apwh.copyOnWrite();
        apwi apwi = (apwi) apwh.instance;
        if (a != null) {
            apwi.b = a;
            apwi.a |= 1;
            apwd apwd = (apwd) apwe.g.createBuilder();
            apwd.copyOnWrite();
            apwe apwe = (apwe) apwd.instance;
            apwe.a |= 8;
            apwe.e = false;
            apwd.a(true);
            apwn apwn = (apwn) apwo.c.createBuilder();
            apwn.copyOnWrite();
            apwo apwo = (apwo) apwn.instance;
            apwo.a |= 1;
            apwo.b = 1;
            apwd.copyOnWrite();
            apwe apwe2 = (apwe) apwd.instance;
            apwe2.d = (apwo) ((anxl) apwn.build());
            apwe2.a |= 4;
            apwh.copyOnWrite();
            apwi = (apwi) apwh.instance;
            if (!apwi.c.a()) {
                apwi.c = anxl.mutableCopy(apwi.c);
            }
            apwi.c.add((apwe) ((anxl) apwd.build()));
            apwi apwi2 = (apwi) ((anxl) apwh.build());
            apwl apwl = (apwl) apwm.h.createBuilder();
            apwj apwj = (apwj) apwk.c.createBuilder();
            apwj.copyOnWrite();
            apwk apwk = (apwk) apwj.instance;
            if (apwi2 != null) {
                apwk.b = apwi2;
                apwk.a = 140080728;
                apwl.copyOnWrite();
                apwm apwm = (apwm) apwl.instance;
                apwm.c = (apwk) ((anxl) apwj.build());
                apwm.a |= 2;
                apvz apvz = (apvz) apwa.c.createBuilder();
                apvz.copyOnWrite();
                apwa apwa = (apwa) apvz.instance;
                apwa.a |= 1;
                apwa.b = 1;
                apwl.copyOnWrite();
                apwm apwm2 = (apwm) apwl.instance;
                apwm2.b = (apwa) ((anxl) apvz.build());
                apwm2.a |= 1;
                apwl.copyOnWrite();
                apwm = (apwm) apwl.instance;
                if (!apwm.f.a()) {
                    apwm.f = anxl.mutableCopy(apwm.f);
                }
                apwm.f.add(str);
                new akad().u = (apwm) ((anxl) apwl.build());
                if (ajwt != null) {
                    new akad().c = ajwt;
                    return a(r1, r4);
                }
                return a(r4);
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }

    private final ajrr a(akad... akadArr) {
        akab akab = new akab();
        akab.b = akadArr;
        akbc akbc = new akbc();
        akbc.c = true;
        akaz akaz = new akaz();
        akaz.a = akab;
        akbc.d = akaz;
        akbc.j = "FElibrary";
        akaq akaq = new akaq();
        new ajrt().b = akbc;
        akaq.a = new ajrt[]{r2};
        akaq.b = true;
        akaq.c = true;
        arjj arjj = (arjj) arjg.c.createBuilder();
        arml a = ajqy.a(this.a.getString(R.string.offline_application_name));
        arjj.copyOnWrite();
        arjg arjg = (arjg) arjj.instance;
        if (a != null) {
            arjg.b = a;
            arjg.a = 1 | arjg.a;
            arjg arjg2 = (arjg) ((anxl) arjj.build());
            ajrr ajrr = new ajrr();
            ajru ajru = new ajru();
            ajru.b = akaq;
            ajrr.a = ajru;
            ajrp ajrp = new ajrp();
            ajrp.b = arjg2;
            ajrr.c = ajrp;
            akcm.a(ajrr, asic.k);
            return ajrr;
        }
        throw new NullPointerException();
    }
}
