package com.google.android.apps.youtube.app.settings;

import android.app.FragmentBreadCrumbs;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.preference.ListPreference;
import android.preference.PreferenceActivity.Header;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.app.livechat.settings.LiveChatFragment;
import com.google.android.libraries.youtube.mdx.smartpairing.PairWithTvActivity;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
import defpackage.aavm;
import defpackage.abif;
import defpackage.abim;
import defpackage.acvs;
import defpackage.acvx;
import defpackage.acwa;
import defpackage.afpu;
import defpackage.afqf;
import defpackage.afqh;
import defpackage.ahhq;
import defpackage.ajqy;
import defpackage.ajxl;
import defpackage.akaf;
import defpackage.akag;
import defpackage.alcs;
import defpackage.aldg;
import defpackage.anvf;
import defpackage.anxl;
import defpackage.anxo;
import defpackage.anxr;
import defpackage.apvu;
import defpackage.apvv;
import defpackage.apvw;
import defpackage.apvy;
import defpackage.apxu;
import defpackage.arml;
import defpackage.avkh;
import defpackage.avls;
import defpackage.axgk;
import defpackage.axha;
import defpackage.ayvl;
import defpackage.bcaa;
import defpackage.eav;
import defpackage.eud;
import defpackage.eue;
import defpackage.exu;
import defpackage.fmv;
import defpackage.fpt;
import defpackage.hci;
import defpackage.jbk;
import defpackage.jbw;
import defpackage.jcb;
import defpackage.job;
import defpackage.mkx;
import defpackage.uux;
import defpackage.xan;
import defpackage.xci;
import defpackage.xcp;
import defpackage.xfc;
import defpackage.xhv;
import defpackage.xpr;
import defpackage.xtl;
import defpackage.xwe;
import defpackage.xy;
import defpackage.zta;
import defpackage.zye;
import defpackage.zzl;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

public class SettingsActivity extends jcb implements acwa, eue, xcp, xfc {
    private static Set z;
    public xci a;
    public xhv b;
    public exu c;
    public abim d;
    public eav e;
    public bcaa f;
    public jbk g;
    public ahhq h;
    public zzl i;
    public Executor j;
    public Executor k;
    public aavm l;
    public Handler m;
    public alcs n;
    public String o;
    public SharedPreferences p;
    public afpu q;
    public fpt r;
    public zta s;
    public aldg t;
    public abif u;
    public acvx v;
    private eud w;
    private List x;
    private int y;

    class FragmentBreadCrumbsColorizer implements OnLayoutChangeListener {
        FragmentBreadCrumbsColorizer() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (view instanceof ViewGroup) {
                findFragmentBreadCrumbs((ViewGroup) view);
            }
        }

        private static void findFragmentBreadCrumbs(ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof FragmentBreadCrumbs) {
                    colorizeFragmentBreadCrumbs((ViewGroup) childAt);
                } else if (childAt instanceof ViewGroup) {
                    findFragmentBreadCrumbs((ViewGroup) childAt);
                }
            }
        }

        private static void colorizeFragmentBreadCrumbs(ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof ViewGroup) {
                    colorizeFragmentBreadCrumbs((ViewGroup) childAt);
                } else if (childAt instanceof TextView) {
                    ((TextView) childAt).setTextColor(xwe.a(childAt.getContext(), R.attr.ytTextPrimary, 0));
                }
            }
        }
    }

    public interface SettingsActivityComponent extends hci, job, mkx, uux {
        void inject(AboutPrefsFragment aboutPrefsFragment);

        void inject(AutoplayPrefsFragment autoplayPrefsFragment);

        void inject(BillingsAndPaymentsPrefsFragment billingsAndPaymentsPrefsFragment);

        void inject(DeveloperPrefsFragment developerPrefsFragment);

        void inject(DogfoodPrefsFragment dogfoodPrefsFragment);

        void inject(GeneralPrefsFragment generalPrefsFragment);

        void inject(NotificationPrefsFragment notificationPrefsFragment);

        void inject(OfflinePrefsFragment offlinePrefsFragment);

        void inject(PrivacyPrefsFragment privacyPrefsFragment);

        void inject(ThirdPartyPrefsFragment thirdPartyPrefsFragment);
    }

    public final boolean onSearchRequested() {
        return false;
    }

    private final void h() {
        if (this.u == null) {
            try {
                this.u = (abif) this.e.c().a();
            } catch (IOException e) {
                xtl.b("Failed to load settings response", e);
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onActivityResult(int i, int i2, Intent intent) {
        zta.a(i);
    }

    public final void onNewIntent(Intent intent) {
        if (zta.a(intent)) {
            this.s.b(intent);
        }
    }

    private final boolean i() {
        if (getIntent().getBooleanExtra("show_offline_items", false) || !this.b.c()) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        return this.u != null;
    }

    public final List d() {
        if (i()) {
            return this.u.b();
        }
        return this.u.a();
    }

    private final void j() {
        abim abim = this.d;
        xan.a(abim.a(abim.a(null)), this.k, SettingsActivity$$Lambda$0.$instance, new SettingsActivity$$Lambda$1(this));
    }

    public final void a(eud eud) {
        this.w = eud;
        e();
    }

    public final void e() {
        h();
        eud eud = this.w;
        if (eud != null) {
            eud.a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:88:0x01f3  */
    /* JADX WARNING: Missing block: B:31:0x010a, code skipped:
            if (r0.g != false) goto L_0x0113;
     */
    public final void onBuildHeaders(java.util.List r10) {
        /*
        r9 = this;
        r9.x = r10;
        r9.h();
        r0 = 2131296266; // 0x7f09000a float:1.8210444E38 double:1.053000266E-314;
        r9.loadHeadersFromResource(r0, r10);
        r0 = r9.b;
        r0 = r0.c();
        r1 = 1;
        r2 = 2131758825; // 0x7f100ee9 float:1.9148625E38 double:1.0532288007E-314;
        r3 = 2131758826; // 0x7f100eea float:1.9148627E38 double:1.053228801E-314;
        if (r0 != 0) goto L_0x001b;
    L_0x001a:
        goto L_0x0081;
    L_0x001b:
        r0 = r9.u;
        if (r0 == 0) goto L_0x0081;
    L_0x001f:
        r0 = r9.d();
        r4 = defpackage.apvw.class;
        r0 = defpackage.euf.a(r0, r4);
        if (r0 == 0) goto L_0x0081;
    L_0x002b:
        r0 = r9.u;
        if (r0 == 0) goto L_0x005a;
    L_0x002f:
        r0 = r9.d();
        r0 = r0.iterator();
    L_0x0037:
        r4 = r0.hasNext();
        if (r4 == 0) goto L_0x005a;
    L_0x003d:
        r4 = r0.next();
        r5 = r4 instanceof defpackage.apvw;
        if (r5 == 0) goto L_0x0037;
    L_0x0045:
        r4 = (defpackage.apvw) r4;
        r0 = r4.d;
        if (r0 != 0) goto L_0x004c;
    L_0x004b:
        goto L_0x005a;
    L_0x004c:
        a(r3, r10);
        r0 = r9.k();
        a(r2, r10, r0);
        r9.l();
        goto L_0x0087;
    L_0x005a:
        a(r2, r10);
        r0 = r9.k();
        a(r3, r10, r0);
        r9.l();
        r0 = b(r3, r10);
        r4 = 2131758827; // 0x7f100eeb float:1.914863E38 double:1.0532288016E-314;
        r4 = b(r4, r10);
        if (r0 < 0) goto L_0x0087;
    L_0x0074:
        if (r4 < 0) goto L_0x0087;
    L_0x0076:
        r0 = r0 + r1;
        r4 = r10.remove(r4);
        r4 = (android.preference.PreferenceActivity.Header) r4;
        r10.add(r0, r4);
        goto L_0x0087;
    L_0x0081:
        a(r2, r10);
        a(r3, r10);
    L_0x0087:
        r0 = 10058; // 0x274a float:1.4094E-41 double:4.9693E-320;
        r0 = r9.b(r0);
        r4 = com.google.android.apps.youtube.app.settings.AutoplayPrefsFragment.class;
        r9.a(r0, r4, r10);
        r0 = r9.g;
        r0 = r0.a();
        r4 = com.google.android.apps.youtube.app.settings.OfflinePrefsFragment.class;
        r9.a(r0, r4, r10);
        r0 = r9.g();
        r4 = com.google.android.apps.youtube.app.settings.NotificationPrefsFragment.class;
        r9.a(r0, r4, r10);
        r0 = 10029; // 0x272d float:1.4054E-41 double:4.955E-320;
        r0 = r9.b(r0);
        r4 = com.google.android.apps.youtube.app.settings.PrivacyPrefsFragment.class;
        r9.a(r0, r4, r10);
        r0 = 10034; // 0x2732 float:1.406E-41 double:4.9575E-320;
        r0 = r9.b(r0);
        r4 = com.google.android.apps.youtube.app.livechat.settings.LiveChatFragment.class;
        r9.a(r0, r4, r10);
        r0 = 10048; // 0x2740 float:1.408E-41 double:4.9644E-320;
        r0 = r9.b(r0);
        r4 = com.google.android.apps.youtube.app.settings.BillingsAndPaymentsPrefsFragment.class;
        r9.a(r0, r4, r10);
        r0 = 10039; // 0x2737 float:1.4068E-41 double:4.96E-320;
        r0 = r9.b(r0);
        r4 = com.google.android.apps.youtube.app.settings.ThirdPartyPrefsFragment.class;
        r9.a(r0, r4, r10);
        r0 = com.google.android.apps.youtube.app.settings.DogfoodPrefsFragment.class;
        r0 = r0.getName();
        a(r0, r10);
        r0 = com.google.android.apps.youtube.app.settings.DeveloperPrefsFragment.class;
        r0 = r0.getName();
        a(r0, r10);
        r0 = r9.h;
        r0 = r0.j();
        if (r0 == 0) goto L_0x00f3;
    L_0x00ec:
        r0 = 2131758830; // 0x7f100eee float:1.9148635E38 double:1.053228803E-314;
        a(r0, r10);
        goto L_0x00f9;
    L_0x00f3:
        r0 = 2131758831; // 0x7f100eef float:1.9148637E38 double:1.0532288036E-314;
        a(r0, r10);
    L_0x00f9:
        r0 = r9.i;
        r0 = r0.b();
        if (r0 != 0) goto L_0x0102;
    L_0x0101:
        goto L_0x010d;
    L_0x0102:
        r0 = r0.e;
        if (r0 != 0) goto L_0x0108;
    L_0x0106:
        r0 = defpackage.aume.af;
    L_0x0108:
        r0 = r0.g;
        if (r0 == 0) goto L_0x010d;
    L_0x010c:
        goto L_0x0113;
    L_0x010d:
        r0 = 2131758832; // 0x7f100ef0 float:1.914864E38 double:1.053228804E-314;
        a(r0, r10);
    L_0x0113:
        r0 = "";
        r4 = r9.u;
        r5 = 0;
        if (r4 == 0) goto L_0x0143;
    L_0x011a:
        r4 = r9.d();
        r4 = r4.iterator();
        r6 = 0;
    L_0x0123:
        r7 = r4.hasNext();
        if (r7 == 0) goto L_0x0144;
    L_0x0129:
        r7 = r4.next();
        r8 = r7 instanceof defpackage.apvy;
        if (r8 == 0) goto L_0x0123;
    L_0x0131:
        r7 = (defpackage.apvy) r7;
        r0 = r7.c;
        if (r0 != 0) goto L_0x0139;
    L_0x0137:
        r0 = defpackage.arml.f;
    L_0x0139:
        r0 = defpackage.ajqy.a(r0);
        r0 = r0.toString();
        r6 = 1;
        goto L_0x0123;
    L_0x0143:
        r6 = 0;
    L_0x0144:
        r1 = 2131758824; // 0x7f100ee8 float:1.9148623E38 double:1.0532288E-314;
        r4 = 0;
        if (r6 == 0) goto L_0x0194;
    L_0x014a:
        r2 = b(r2, r10);
        r6 = -1;
        if (r2 != r6) goto L_0x0155;
    L_0x0151:
        r2 = b(r3, r10);
    L_0x0155:
        if (r2 <= 0) goto L_0x0161;
    L_0x0157:
        r2 = r2 + r6;
        r3 = r10.remove(r5);
        r3 = (android.preference.PreferenceActivity.Header) r3;
        r10.add(r2, r3);
    L_0x0161:
        a(r1, r10, r0);
        r0 = r9.u;
        if (r0 == 0) goto L_0x0197;
    L_0x0168:
        r0 = r9.d();
        r0 = r0.iterator();
    L_0x0170:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x0197;
    L_0x0176:
        r1 = r0.next();
        r2 = r1 instanceof defpackage.apvy;
        if (r2 == 0) goto L_0x0170;
    L_0x017e:
        r0 = r9.v;
        r1 = (defpackage.apvy) r1;
        r2 = r1.a;
        r2 = r2 & 8;
        if (r2 == 0) goto L_0x018f;
    L_0x0188:
        r1 = r1.d;
        r1 = r1.d();
        goto L_0x0190;
    L_0x018f:
        r1 = r4;
    L_0x0190:
        r0.a(r1, r4);
        goto L_0x0197;
    L_0x0194:
        a(r1, r10);
    L_0x0197:
        r0 = r9.b;
        r0 = r0.c();
        r1 = 2131758829; // 0x7f100eed float:1.9148633E38 double:1.0532288026E-314;
        if (r0 != 0) goto L_0x01a3;
    L_0x01a2:
        goto L_0x01b4;
    L_0x01a3:
        r0 = r9.u;
        if (r0 == 0) goto L_0x0217;
    L_0x01a7:
        r0 = r9.d();
        r2 = defpackage.apvu.class;
        r0 = defpackage.euf.a(r0, r2);
        if (r0 != 0) goto L_0x01b4;
    L_0x01b3:
        goto L_0x0217;
    L_0x01b4:
        r0 = r9.u;
        if (r0 == 0) goto L_0x01eb;
    L_0x01b8:
        r0 = r9.d();
        r0 = r0.iterator();
    L_0x01c0:
        r2 = r0.hasNext();
        if (r2 == 0) goto L_0x01eb;
    L_0x01c6:
        r2 = r0.next();
        r3 = defpackage.apvu.class;
        r3 = r3.isInstance(r2);
        if (r3 == 0) goto L_0x01c0;
    L_0x01d2:
        r2 = (defpackage.apvu) r2;
        r0 = r2.a;
        r0 = r0 & 2;
        if (r0 == 0) goto L_0x01e1;
    L_0x01da:
        r0 = r2.c;
        if (r0 != 0) goto L_0x01e2;
    L_0x01de:
        r0 = defpackage.arml.f;
        goto L_0x01e2;
    L_0x01e1:
        r0 = r4;
    L_0x01e2:
        r0 = defpackage.ajqy.a(r0);
        r0 = r0.toString();
        goto L_0x01ec;
    L_0x01eb:
        r0 = r4;
    L_0x01ec:
        a(r1, r10, r0);
        r10 = r9.u;
        if (r10 == 0) goto L_0x0216;
    L_0x01f3:
        r10 = r9.d();
        r10 = r10.iterator();
    L_0x01fb:
        r0 = r10.hasNext();
        if (r0 == 0) goto L_0x0216;
    L_0x0201:
        r0 = r10.next();
        r1 = r0 instanceof defpackage.apvu;
        if (r1 == 0) goto L_0x01fb;
    L_0x0209:
        r10 = r9.v;
        r0 = (defpackage.apvu) r0;
        r0 = r0.e;
        r0 = r0.d();
        r10.a(r0, r4);
    L_0x0216:
        return;
    L_0x0217:
        a(r1, r10);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.settings.SettingsActivity.onBuildHeaders(java.util.List):void");
    }

    public final Header onGetInitialHeader() {
        if (this.x != null) {
            for (int i = 0; i < this.x.size(); i++) {
                Header header = (Header) this.x.get(i);
                if (header.fragment != null) {
                    return header;
                }
            }
        }
        return super.onGetInitialHeader();
    }

    private final String k() {
        arml arml = null;
        if (this.u != null) {
            for (Object next : d()) {
                if (next instanceof apvw) {
                    apvw apvw = (apvw) next;
                    if ((apvw.a & 2) != 0) {
                        arml = apvw.c;
                        if (arml == null) {
                            arml = arml.f;
                        }
                    }
                    return ajqy.a(arml).toString();
                }
            }
        }
        return null;
    }

    private final void l() {
        if (this.u != null) {
            for (Object next : d()) {
                if (next instanceof apvw) {
                    this.v.a(((apvw) next).e.d(), null);
                    return;
                }
            }
        }
    }

    public final ajxl f() {
        if (this.u != null) {
            for (Object next : d()) {
                if (next instanceof ajxl) {
                    return (ajxl) next;
                }
            }
        }
        return null;
    }

    /* Access modifiers changed, original: final */
    public final String g() {
        ajxl f = f();
        return f != null ? ajqy.a(f.a).toString() : null;
    }

    public final axgk ay_() {
        if (this.u == null) {
            return null;
        }
        for (Object next : d()) {
            if (next instanceof akag) {
                for (akaf akaf : ((akag) next).b) {
                    axgk axgk = akaf.b;
                    if (axgk != null && alcs.a((Object) axgk) == 9) {
                        return axgk;
                    }
                }
                continue;
            }
        }
        return null;
    }

    public final void onHeaderClick(Header header, int i) {
        if (header.fragmentArguments == null) {
            header.fragmentArguments = new Bundle();
        }
        header.fragmentArguments.putString("ORIGIN", getClass().getName());
        String str = "navigation_endpoint";
        int i2 = 0;
        Intent a;
        Object obj;
        if (header.id == 2131758825 || header.id == 2131758826) {
            a = this.r.a();
            if (this.u != null) {
                while (i2 < this.u.a().size()) {
                    obj = this.u.a().get(i2);
                    if (apvw.class.isInstance(obj)) {
                        apvw apvw = (apvw) obj;
                        if ((apvw.a & 1) != 0) {
                            apvv apvv = (apvv) ((anxo) apvw.toBuilder());
                            acvx acvx = this.v;
                            apxu apxu = apvw.b;
                            if (apxu == null) {
                                apxu = apxu.d;
                            }
                            apxu = acvx.a(apxu);
                            apvv.copyOnWrite();
                            apvw apvw2 = (apvw) apvv.instance;
                            if (apxu != null) {
                                apvw2.b = apxu;
                                apvw2.a |= 1;
                                apvw = (apvw) ((anxl) apvv.build());
                                anvf anvf = apvw.b;
                                if (anvf == null) {
                                    anvf = apxu.d;
                                }
                                a.putExtra(str, anvf.toByteArray());
                                this.u.a().set(i2, apvw);
                            } else {
                                throw new NullPointerException();
                            }
                        }
                    }
                    i2++;
                }
            }
            startActivity(a);
        } else if (header.id == 2131758828) {
            boolean z;
            a = new Intent(this, PairWithTvActivity.class);
            if (fmv.a(this.p) == 2) {
                z = true;
            }
            a.putExtra("com.google.android.libraries.youtube.mdx.smartpairing.darkTheme", z);
            startActivity(a);
        } else {
            Intent intent = null;
            if (header.id == 2131758824) {
                abif abif = this.u;
                if (abif != null) {
                    for (Object obj2 : abif.a()) {
                        if (apvy.class.isInstance(obj2)) {
                            apxu apxu2 = ((apvy) obj2).b;
                            if (apxu2 == null) {
                                apxu2 = apxu.d;
                            }
                            this.v.a(3, new acvs(apxu2.b), null);
                            anxr access$000 = anxl.checkIsLite(UrlEndpointOuterClass.urlEndpoint);
                            apxu2.a(access$000);
                            Object b = apxu2.h.b(access$000.d);
                            if (b == null) {
                                b = access$000.b;
                            } else {
                                b = access$000.a(b);
                            }
                            intent = new Intent("android.intent.action.VIEW", Uri.parse(((ayvl) b).b));
                        }
                    }
                }
                if (intent != null) {
                    startActivity(intent);
                }
            } else if (header.id == 2131758831) {
                startActivity(new Intent("android.settings.CAPTIONING_SETTINGS"));
            } else if (header.id == 2131758832) {
                new jbw(this, this.j, this.l, this.m).a("Refreshing...", "Success. Please restart your app.");
            } else if (header.id == 2131758829) {
                a = this.r.a();
                abif abif2 = this.u;
                if (abif2 != null) {
                    for (Object next : abif2.a()) {
                        if (apvu.class.isInstance(next)) {
                            apxu apxu3;
                            apvu apvu = (apvu) next;
                            if ((apvu.a & 1) != 0) {
                                apxu3 = apvu.b;
                                if (apxu3 == null) {
                                    apxu3 = apxu.d;
                                }
                            }
                            a.putExtra(str, this.v.a(apxu3).toByteArray());
                        }
                    }
                }
                startActivity(a);
            }
        }
        super.onHeaderClick(header, i);
    }

    public final acvx t() {
        return this.v;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean isValidFragment(String str) {
        if (z == null) {
            HashSet hashSet = new HashSet();
            z = hashSet;
            hashSet.add(AboutPrefsFragment.class.getName());
            z.add(GeneralPrefsFragment.class.getName());
            z.add(PrivacyPrefsFragment.class.getName());
            z.add(SubtitlesLegacyPrefsFragment.class.getName());
            z.add(OfflinePrefsFragment.class.getName());
            z.add(NotificationPrefsFragment.class.getName());
            z.add(LiveChatFragment.class.getName());
            z.add(BillingsAndPaymentsPrefsFragment.class.getName());
            z.add(AutoplayPrefsFragment.class.getName());
            z.add(ThirdPartyPrefsFragment.class.getName());
        }
        return z.contains(str);
    }

    private final void a(String str, Class cls, List list) {
        if (this.q.g() && cls.equals(PrivacyPrefsFragment.class)) {
            a(cls.getName(), list);
        } else if (str != null) {
            String name = cls.getName();
            for (Header header : list) {
                if (header.fragment != null && header.fragment.equals(name)) {
                    header.title = str;
                    break;
                }
            }
        } else {
            a(cls.getName(), list);
        }
    }

    private static void a(String str, List list) {
        for (Header header : list) {
            if (header.fragment != null && header.fragment.equals(str)) {
                list.remove(header);
                return;
            }
        }
    }

    private static void a(int i, List list) {
        for (Header header : list) {
            if (header.id == ((long) i)) {
                list.remove(header);
                return;
            }
        }
    }

    private static void a(int i, List list, String str) {
        if (str == null) {
            a(i, list);
        }
        for (Header header : list) {
            if (header.id == ((long) i)) {
                header.title = str;
                return;
            }
        }
    }

    private static int b(int i, List list) {
        for (Header header : list) {
            if (header.id == ((long) i)) {
                return list.indexOf(header);
            }
        }
        return -1;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onRestart() {
        super.onRestart();
        if (this.y != fmv.a(this.p)) {
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new SettingsActivity$$Lambda$2(this));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x00cd  */
    public final void onCreate(android.os.Bundle r9) {
        /*
        r8 = this;
        r0 = r8.getApplication();
        r1 = 1;
        r8.y = r1;
        r2 = r0 instanceof defpackage.wwz;
        if (r2 == 0) goto L_0x0025;
    L_0x000b:
        r0 = (defpackage.wwz) r0;
        r0 = r0.i();
        r0 = r0.ox();
        r0 = defpackage.fmv.a(r0);
        r8.y = r0;
        r2 = 2;
        if (r0 != r2) goto L_0x0025;
    L_0x001e:
        r0 = 2132018051; // 0x7f140383 float:1.9674398E38 double:1.0533568753E-314;
        r8.setTheme(r0);
        goto L_0x002e;
    L_0x0025:
        r0 = 2132018050; // 0x7f140382 float:1.9674396E38 double:1.053356875E-314;
        r8.setTheme(r0);
        defpackage.fmu.a(r8);
    L_0x002e:
        super.onCreate(r9);
        r9 = new fjn;
        r9.<init>(r8);
        r9.a(r8);
        r9 = r8.getIntent();
        r0 = r9.getAction();
        if (r0 == 0) goto L_0x005f;
    L_0x0043:
        r0 = r9.getAction();
        r2 = "android.intent.action.MANAGE_NETWORK_USAGE";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x005f;
    L_0x004f:
        r0 = ":android:no_headers";
        r9.putExtra(r0, r1);
        r0 = com.google.android.apps.youtube.app.settings.GeneralPrefsFragment.class;
        r0 = r0.getName();
        r2 = ":android:show_fragment";
        r9.putExtra(r2, r0);
    L_0x005f:
        r0 = r8.v;
        r2 = defpackage.acwl.an;
        r3 = 0;
        r0.a(r2, r3, r3);
        r0 = 16908298; // 0x102000a float:2.3877257E-38 double:8.353809E-317;
        r0 = r8.findViewById(r0);
        r0 = r0.getParent();
        r0 = r0.getParent();
        r0 = r0.getParent();
        r0 = (android.view.ViewGroup) r0;
        r2 = android.view.LayoutInflater.from(r8);
        r3 = 2131035327; // 0x7f0504bf float:1.7681197E38 double:1.052871345E-314;
        r4 = 0;
        r2 = r2.inflate(r3, r0, r4);
        r3 = 2131755541; // 0x7f100215 float:1.9141964E38 double:1.053227178E-314;
        r3 = r2.findViewById(r3);
        r3 = (android.support.v7.widget.Toolbar) r3;
        r5 = r8.getResources();
        r6 = 2130838933; // 0x7f020595 float:1.7282862E38 double:1.0527743136E-314;
        r5 = r5.getDrawable(r6);
        r5 = r5.mutate();
        r6 = 2130772283; // 0x7f01013b float:1.714768E38 double:1.052741384E-314;
        r6 = defpackage.xwe.a(r8, r6, r4);
        r7 = android.graphics.PorterDuff.Mode.SRC_IN;
        r5 = defpackage.xoe.a(r5, r6, r7);
        r3.b(r5);
        r0.addView(r2, r4);
        r0 = r8.a();
        r0.a(r3);
        r0 = r8.a();
        r0 = r0.d();
        r0.b(r1);
        r0 = "background_settings";
        r9 = r9.getBooleanExtra(r0, r4);
        if (r9 == 0) goto L_0x00d8;
    L_0x00cd:
        r9 = r8.f;
        r9 = r9.get();
        r9 = (defpackage.dwz) r9;
        r9.e();
    L_0x00d8:
        r9 = r8.c;
        r9.a();
        r9 = 16908290; // 0x1020002 float:2.3877235E-38 double:8.353805E-317;
        r9 = r8.findViewById(r9);
        r0 = new com.google.android.apps.youtube.app.settings.SettingsActivity$FragmentBreadCrumbsColorizer;
        r0.<init>();
        r9.addOnLayoutChangeListener(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.settings.SettingsActivity.onCreate(android.os.Bundle):void");
    }

    /* Access modifiers changed, original: protected|final */
    public final void onStart() {
        super.onStart();
        this.a.a((Object) this);
        if (!zta.b()) {
            invalidateHeaders();
            e();
            if (!i()) {
                String name = getClass().getName();
                CharSequence charSequence = null;
                if (getIntent() != null) {
                    String str = ":android:show_fragment_args";
                    if (getIntent().hasExtra(str)) {
                        Bundle bundleExtra = getIntent().getBundleExtra(str);
                        if (bundleExtra != null) {
                            charSequence = bundleExtra.getString("ORIGIN");
                        }
                    }
                }
                if (!TextUtils.equals(name, charSequence)) {
                    j();
                }
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onResume() {
        super.onResume();
        this.c.b();
        if (zta.b() && !zta.a()) {
            this.s.c();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onPause() {
        super.onPause();
        this.c.c();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onStop() {
        super.onStop();
        this.a.b(this);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        if (xy.b()) {
            onBackPressed();
        } else {
            finish();
        }
        return true;
    }

    public final void a(ListPreference listPreference) {
        akag a = a(10005);
        if (a != null) {
            axha axha;
            for (akaf akaf : a.b) {
                axha = akaf.a;
                if (axha != null && alcs.a((Object) axha) == 10) {
                    break;
                }
            }
            axha = null;
            if (axha != null) {
                CharSequence title = listPreference.getTitle();
                this.n.a(listPreference, axha, this.o);
                listPreference.setTitle(title);
                listPreference.setEnabled(true);
            }
        }
    }

    public final /* synthetic */ Object n() {
        return (SettingsActivityComponent) b();
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{zye.class, afqf.class, afqh.class};
        } else if (i == 0) {
            zye zye = (zye) obj;
            avls avls = zye.a;
            avkh avkh = zye.b;
            arml arml;
            if (avls != null && (avls.a & 1) != 0) {
                arml = avls.b;
                if (arml == null) {
                    arml = arml.f;
                }
                xpr.a((Context) this, ajqy.a(arml), 0);
                return null;
            } else if (avkh == null) {
                return null;
            } else {
                if ((avkh.a & 1) != 0) {
                    arml = avkh.b;
                    if (arml == null) {
                        arml = arml.f;
                    }
                } else {
                    arml = null;
                }
                if (TextUtils.isEmpty(ajqy.a(arml))) {
                    return null;
                }
                if ((avkh.a & 1) != 0) {
                    arml = avkh.b;
                    if (arml == null) {
                        arml = arml.f;
                    }
                } else {
                    arml = null;
                }
                xpr.a((Context) this, ajqy.a(arml), 0);
                return null;
            }
        } else if (i == 1) {
            j();
            return null;
        } else if (i == 2) {
            j();
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public final akag a(int i) {
        if (this.u != null) {
            for (Object next : d()) {
                if (next instanceof akag) {
                    akag akag = (akag) next;
                    if (akag.d == i) {
                        return akag;
                    }
                }
            }
        }
        return null;
    }

    private final String b(int i) {
        akag a = a(i);
        return a != null ? ajqy.a(a.a).toString() : null;
    }
}
