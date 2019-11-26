package com.google.android.apps.youtube.app.settings;

import android.app.Dialog;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.SwitchPreference;
import defpackage.aaas;
import defpackage.acwa;
import defpackage.afng;
import defpackage.afxw;
import defpackage.ajqy;
import defpackage.amqp;
import defpackage.arml;
import defpackage.axgk;
import defpackage.bqa;
import defpackage.ebn;
import defpackage.eud;
import defpackage.eue;
import defpackage.fkg;
import defpackage.jaz;
import defpackage.jbk;
import defpackage.xhv;
import defpackage.zyw;
import defpackage.zzl;

public class GeneralPrefsFragment extends PreferenceFragment implements OnSharedPreferenceChangeListener, eud {
    public xhv a;
    public SharedPreferences b;
    public aaas c;
    public zyw d;
    public zzl e;
    public bqa f;
    public jbk g;
    public fkg h;
    public acwa i;
    public amqp j;

    /* JADX WARNING: Removed duplicated region for block: B:63:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Missing block: B:9:0x0043, code skipped:
            if (r6.bj != false) goto L_0x004b;
     */
    public final void onCreate(android.os.Bundle r6) {
        /*
        r5 = this;
        r0 = r5.getActivity();
        r0 = (defpackage.xfc) r0;
        r0 = r0.n();
        r0 = (com.google.android.apps.youtube.app.settings.SettingsActivity.SettingsActivityComponent) r0;
        r0.inject(r5);
        super.onCreate(r6);
        r6 = r5.getPreferenceManager();
        r0 = "youtube";
        r6.setSharedPreferencesName(r0);
        r6 = 2131296260; // 0x7f090004 float:1.8210432E38 double:1.053000263E-314;
        r5.addPreferencesFromResource(r6);
        r6 = r5.b;
        r6.registerOnSharedPreferenceChangeListener(r5);
        r6 = r5.d;
        r6 = defpackage.foh.C(r6);
        if (r6 != 0) goto L_0x0033;
    L_0x002e:
        r6 = "watch_break_frequency_picker_preference";
        r5.a(r6);
    L_0x0033:
        r6 = r5.d;
        r6 = r6.a();
        if (r6 == 0) goto L_0x0046;
    L_0x003b:
        r6 = r6.e;
        if (r6 != 0) goto L_0x0041;
    L_0x003f:
        r6 = defpackage.aulu.bw;
    L_0x0041:
        r6 = r6.bj;
        if (r6 == 0) goto L_0x0046;
    L_0x0045:
        goto L_0x004b;
    L_0x0046:
        r6 = "feed_filter_bar_on_home_setting";
        r5.a(r6);
    L_0x004b:
        r6 = "app_theme_dark";
        r6 = r5.findPreference(r6);
        if (r6 == 0) goto L_0x005b;
    L_0x0053:
        r0 = new jav;
        r0.<init>(r5);
        r6.setOnPreferenceChangeListener(r0);
    L_0x005b:
        r6 = new afib;
        r0 = r5.getResources();
        r1 = r5.b;
        r6.<init>(r0, r1);
        r0 = "limit_mobile_data_usage";
        r1 = r5.findPreference(r0);
        r1 = (android.preference.SwitchPreference) r1;
        r2 = "max_mobile_video_quality";
        r3 = r5.findPreference(r2);
        r3 = (android.preference.ListPreference) r3;
        r4 = new jax;
        r4.<init>(r3, r6);
        r1.setOnPreferenceChangeListener(r4);
        r6 = r5.getPreferenceScreen();
        r6.removePreference(r3);
        r6 = r5.a;
        r6 = r6.i();
        if (r6 != 0) goto L_0x0098;
    L_0x008d:
        r5.a(r0);
        r5.a(r2);
        r6 = "upload_policy";
        r5.a(r6);
    L_0x0098:
        r6 = "com.google.android.libraries.youtube.upload.pref.upload_quality";
        r6 = r5.findPreference(r6);
        r6 = (android.preference.ListPreference) r6;
        r0 = r5.e;
        r0 = r0.b();
        r1 = r5.d;
        r1 = r1.a();
        r2 = 1;
        if (r0 != 0) goto L_0x00b0;
    L_0x00af:
        goto L_0x00dc;
    L_0x00b0:
        r3 = r0.j;
        if (r3 != 0) goto L_0x00b6;
    L_0x00b4:
        r3 = defpackage.ayva.m;
    L_0x00b6:
        r3 = r3.b;
        if (r3 == 0) goto L_0x00dc;
    L_0x00ba:
        r1 = r6.getValue();
        if (r1 != 0) goto L_0x012b;
    L_0x00c0:
        r0 = r0.j;
        if (r0 != 0) goto L_0x00c6;
    L_0x00c4:
        r0 = defpackage.ayva.m;
    L_0x00c6:
        r0 = r0.c;
        r0 = defpackage.ayuy.a(r0);
        if (r0 == 0) goto L_0x00cf;
    L_0x00ce:
        goto L_0x00d0;
    L_0x00cf:
        r0 = 1;
    L_0x00d0:
        r0 = defpackage.amfp.a(r0);
        r0 = r5.getString(r0);
        r6.setValue(r0);
        goto L_0x012b;
    L_0x00dc:
        if (r1 != 0) goto L_0x00df;
    L_0x00de:
        goto L_0x0124;
    L_0x00df:
        r0 = r1.a;
        r3 = 33554432; // 0x2000000 float:9.403955E-38 double:1.6578092E-316;
        r0 = r0 & r3;
        if (r0 == 0) goto L_0x0124;
    L_0x00e6:
        r0 = r6.getValue();
        if (r0 != 0) goto L_0x012b;
    L_0x00ec:
        r0 = r1.p;
        if (r0 != 0) goto L_0x00f2;
    L_0x00f0:
        r0 = defpackage.ayuw.h;
    L_0x00f2:
        r0 = r0.d;
        r0 = defpackage.ayuu.a(r0);
        if (r0 == 0) goto L_0x00fb;
    L_0x00fa:
        goto L_0x00fc;
    L_0x00fb:
        r0 = 1;
    L_0x00fc:
        r0 = r0 + -1;
        if (r0 == r2) goto L_0x0119;
    L_0x0100:
        r1 = 2;
        if (r0 == r1) goto L_0x0115;
    L_0x0103:
        r1 = 3;
        if (r0 == r1) goto L_0x0111;
    L_0x0106:
        r1 = 4;
        if (r0 == r1) goto L_0x010d;
    L_0x0109:
        r0 = 2131953812; // 0x7f130894 float:1.9544106E38 double:1.053325137E-314;
        goto L_0x011c;
    L_0x010d:
        r0 = 2131953808; // 0x7f130890 float:1.9544097E38 double:1.053325135E-314;
        goto L_0x011c;
    L_0x0111:
        r0 = 2131953811; // 0x7f130893 float:1.9544104E38 double:1.0533251365E-314;
        goto L_0x011c;
    L_0x0115:
        r0 = 2131953810; // 0x7f130892 float:1.9544101E38 double:1.053325136E-314;
        goto L_0x011c;
    L_0x0119:
        r0 = 2131953809; // 0x7f130891 float:1.95441E38 double:1.0533251355E-314;
    L_0x011c:
        r0 = r5.getString(r0);
        r6.setValue(r0);
        goto L_0x012b;
    L_0x0124:
        r0 = r5.getPreferenceScreen();
        r0.removePreference(r6);
    L_0x012b:
        r6 = r5.j;
        r6 = r6.a();
        if (r6 == 0) goto L_0x0149;
    L_0x0133:
        r6 = r5.getPreferenceScreen();
        r0 = r5.j;
        r0 = r0.b();
        r0 = (defpackage.htm) r0;
        r5.getActivity();
        r0 = r0.a();
        r6.addPreference(r0);
    L_0x0149:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.settings.GeneralPrefsFragment.onCreate(android.os.Bundle):void");
    }

    public final void onStart() {
        super.onStart();
        axgk ay_ = ((eue) getActivity()).ay_();
        String str = afng.INNERTUBE_SAFETY_MODE_ENABLED;
        SwitchPreference switchPreference = (SwitchPreference) findPreference(str);
        if (ay_ != null) {
            arml arml;
            if ((ay_.a & 8) != 0) {
                arml = ay_.c;
                if (arml == null) {
                    arml = arml.f;
                }
                switchPreference.setTitle(ajqy.a(arml));
            }
            if ((ay_.a & 16) != 0) {
                arml = ay_.d;
                if (arml == null) {
                    arml = arml.f;
                }
                switchPreference.setSummary(ajqy.a(arml));
            }
        }
        switchPreference.setOnPreferenceChangeListener(new jaz(this));
        String str2 = "innertube_managed_restricted_mode";
        if (ay_ != null && ay_.f) {
            arml arml2;
            SwitchPreference switchPreference2 = (SwitchPreference) findPreference(str2);
            if ((ay_.a & 1024) != 0) {
                arml2 = ay_.j;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
            } else {
                arml2 = null;
            }
            switchPreference2.setSummary(ajqy.a(arml2));
            switchPreference2.setChecked(true);
            a(str);
        } else {
            a(str2);
        }
        boolean b = this.g.b();
        int a = this.h.a();
        String str3 = ebn.PIP_POLICY;
        if (a == 2 ? b : a == 3) {
            if (this.h.b() == 1) {
                SwitchPreference switchPreference3 = (SwitchPreference) findPreference(str3);
                switchPreference3.setEnabled(false);
                switchPreference3.setChecked(false);
            }
            return;
        }
        a(str3);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ((eue) getActivity()).a((eud) this);
    }

    private final void a(CharSequence charSequence) {
        Preference findPreference = findPreference(charSequence);
        if (findPreference != null) {
            getPreferenceScreen().removePreference(findPreference);
        }
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("video_notifications_enabled".equals(str)) {
            afxw.a(this.b);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        Dialog dialog = ((ListPreference) findPreference(ebn.COUNTRY)).getDialog();
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
        super.onSaveInstanceState(bundle);
    }

    public final void onDestroy() {
        this.b.unregisterOnSharedPreferenceChangeListener(this);
        super.onDestroy();
    }

    public final void a() {
        if (isAdded()) {
            ((eue) getActivity()).a((ListPreference) findPreference(ebn.COUNTRY));
        }
    }
}
