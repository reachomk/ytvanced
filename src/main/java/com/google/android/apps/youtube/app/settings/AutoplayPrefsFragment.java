package com.google.android.apps.youtube.app.settings;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.preference.SwitchPreference;
import com.google.android.apps.youtube.app.settings.SettingsActivity.SettingsActivityComponent;
import defpackage.acvs;
import defpackage.acvx;
import defpackage.acwa;
import defpackage.acwc;
import defpackage.alcs;
import defpackage.ebn;
import defpackage.eud;
import defpackage.eue;
import defpackage.hwl;
import defpackage.xse;
import defpackage.zzl;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class AutoplayPrefsFragment extends PreferenceFragment implements OnSharedPreferenceChangeListener, eud {
    private static final Map f;
    public SharedPreferences a;
    public hwl b;
    public acwa c;
    public alcs d;
    public zzl e;

    public final void onCreate(Bundle bundle) {
        ((SettingsActivityComponent) xse.a(getActivity())).inject(this);
        super.onCreate(bundle);
        getPreferenceManager().setSharedPreferencesName("youtube");
        this.a.registerOnSharedPreferenceChangeListener(this);
    }

    public final void onStart() {
        super.onStart();
        SwitchPreference switchPreference = (SwitchPreference) findPreference(ebn.AUTONAV_SETTINGS_ACTIVITY_KEY);
        if (switchPreference != null) {
            switchPreference.setChecked(this.b.a());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:72:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0159 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0159 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0159 A:{SYNTHETIC} */
    /* JADX WARNING: Missing block: B:26:0x0059, code skipped:
            if (r7 != null) goto L_0x005b;
     */
    public final void a() {
        /*
        r15 = this;
        r0 = r15.isAdded();
        if (r0 == 0) goto L_0x0160;
    L_0x0006:
        r0 = r15.getActivity();
        r0 = (defpackage.eue) r0;
        r1 = 10058; // 0x274a float:1.4094E-41 double:4.9693E-320;
        r1 = r0.a(r1);
        if (r1 == 0) goto L_0x0160;
    L_0x0014:
        r2 = r1.a;
        r2 = defpackage.ajqy.a(r2);
        defpackage.euf.a(r0, r2);
        r0 = r15.getPreferenceManager();
        r2 = r15.getActivity();
        r0 = r0.createPreferenceScreen(r2);
        r1 = r1.b;
        r2 = r1.length;
        r3 = 0;
        r4 = 0;
    L_0x002e:
        if (r4 >= r2) goto L_0x015d;
    L_0x0030:
        r5 = r1[r4];
        r6 = 0;
        if (r5 != 0) goto L_0x0037;
    L_0x0035:
        r7 = r6;
        goto L_0x005b;
    L_0x0037:
        r7 = r5.c;
        if (r7 != 0) goto L_0x005b;
    L_0x003b:
        r7 = r5.b;
        if (r7 != 0) goto L_0x005b;
    L_0x003f:
        r7 = r5.d;
        if (r7 != 0) goto L_0x005b;
    L_0x0043:
        r7 = r5.e;
        if (r7 != 0) goto L_0x005b;
    L_0x0047:
        r7 = r5.a;
        if (r7 != 0) goto L_0x005b;
    L_0x004b:
        r7 = r5.i;
        if (r7 != 0) goto L_0x005b;
    L_0x004f:
        r7 = r5.f;
        if (r7 != 0) goto L_0x005b;
    L_0x0053:
        r7 = r5.g;
        if (r7 != 0) goto L_0x005b;
    L_0x0057:
        r7 = r5.h;
        if (r7 == 0) goto L_0x0035;
    L_0x005b:
        r8 = defpackage.alcs.a(r7);
        r9 = 30;
        if (r8 == r9) goto L_0x010d;
    L_0x0063:
        r9 = 98;
        if (r8 == r9) goto L_0x0071;
    L_0x0067:
        r6 = r15.d;
        r7 = "";
        r6 = r6.a(r5, r7);
        goto L_0x0153;
    L_0x0071:
        r5 = r7 instanceof defpackage.axha;
        if (r5 == 0) goto L_0x0153;
    L_0x0075:
        r7 = (defpackage.axha) r7;
        r5 = new jay;
        r8 = r15.getActivity();
        r5.<init>(r8);
        r8 = "inline_global_play_pause";
        r5.setKey(r8);
        r8 = r7.a;
        r8 = r8 & 2;
        if (r8 == 0) goto L_0x0092;
    L_0x008b:
        r8 = r7.c;
        if (r8 != 0) goto L_0x0093;
    L_0x008f:
        r8 = defpackage.arml.f;
        goto L_0x0093;
    L_0x0092:
        r8 = r6;
    L_0x0093:
        r8 = defpackage.ajqy.a(r8);
        r5.setTitle(r8);
        r5.setDialogTitle(r8);
        r8 = r7.a;
        r8 = r8 & 4;
        if (r8 == 0) goto L_0x00a9;
    L_0x00a3:
        r6 = r7.d;
        if (r6 != 0) goto L_0x00a9;
    L_0x00a7:
        r6 = defpackage.arml.f;
    L_0x00a9:
        r6 = defpackage.ajqy.a(r6);
        r5.setSummary(r6);
        r6 = r7.e;
        r8 = r6.size();
        r9 = new java.lang.CharSequence[r8];
        r10 = new java.lang.CharSequence[r8];
        r11 = new java.util.HashMap;
        r11.<init>();
        r6 = 0;
    L_0x00c0:
        if (r6 < r8) goto L_0x00d9;
    L_0x00c2:
        r5.setEntries(r9);
        r5.setEntryValues(r10);
        r5.a = r11;
        r6 = r15.e;
        r6 = defpackage.ffw.a(r6);
        r6 = java.lang.String.valueOf(r6);
        r5.setDefaultValue(r6);
        goto L_0x0152;
    L_0x00d9:
        r12 = r7.e;
        r12 = r12.get(r6);
        r12 = (defpackage.axgw) r12;
        r13 = r12.a;
        r14 = 64166933; // 0x3d31c15 float:1.2407913E-36 double:3.1702677E-316;
        if (r13 != r14) goto L_0x00ed;
    L_0x00e8:
        r12 = r12.b;
        r12 = (defpackage.axgu) r12;
        goto L_0x00ef;
    L_0x00ed:
        r12 = defpackage.axgu.g;
    L_0x00ef:
        r13 = r12.b;
        r9[r6] = r13;
        r13 = f;
        r14 = r12.d;
        r13 = r13.get(r14);
        r13 = (java.lang.CharSequence) r13;
        r10[r6] = r13;
        r14 = r12.a;
        r14 = r14 & 2;
        if (r14 == 0) goto L_0x010a;
    L_0x0105:
        r12 = r12.c;
        r11.put(r13, r12);
    L_0x010a:
        r6 = r6 + 1;
        goto L_0x00c0;
    L_0x010d:
        r5 = r7 instanceof defpackage.axgk;
        if (r5 == 0) goto L_0x0153;
    L_0x0111:
        r7 = (defpackage.axgk) r7;
        r5 = new android.preference.SwitchPreference;
        r8 = r15.getActivity();
        r5.<init>(r8);
        r8 = "autonav_settings_activity_key";
        r5.setKey(r8);
        r8 = r7.a;
        r8 = r8 & 8;
        if (r8 == 0) goto L_0x012e;
    L_0x0127:
        r8 = r7.c;
        if (r8 != 0) goto L_0x012f;
    L_0x012b:
        r8 = defpackage.arml.f;
        goto L_0x012f;
    L_0x012e:
        r8 = r6;
    L_0x012f:
        r8 = defpackage.ajqy.a(r8);
        r5.setTitle(r8);
        r8 = r7.a;
        r8 = r8 & 16;
        if (r8 == 0) goto L_0x0142;
    L_0x013c:
        r6 = r7.d;
        if (r6 != 0) goto L_0x0142;
    L_0x0140:
        r6 = defpackage.arml.f;
    L_0x0142:
        r6 = defpackage.ajqy.a(r6);
        r5.setSummary(r6);
        r6 = r15.b;
        r6 = r6.a();
        r5.setChecked(r6);
    L_0x0152:
        r6 = r5;
    L_0x0153:
        if (r6 != 0) goto L_0x0156;
    L_0x0155:
        goto L_0x0159;
    L_0x0156:
        r0.addPreference(r6);
    L_0x0159:
        r4 = r4 + 1;
        goto L_0x002e;
    L_0x015d:
        r15.setPreferenceScreen(r0);
    L_0x0160:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.settings.AutoplayPrefsFragment.a():void");
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ((eue) getActivity()).a((eud) this);
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        String str2 = ebn.AUTONAV_SETTINGS_ACTIVITY_KEY;
        if (str2.equals(str)) {
            SwitchPreference switchPreference = (SwitchPreference) findPreference(str2);
            hwl hwl = this.b;
            boolean z = false;
            if (switchPreference != null && switchPreference.isChecked()) {
                z = true;
            }
            hwl.a(z);
        } else {
            str2 = "inline_global_play_pause";
            if (str2.equals(str)) {
                acvx t = this.c.t();
                int i = this.a.getInt(str2, -1);
                t.a(new acvs(acwc.INLINE_DIALOG_SETTINGS_ON));
                t.a(new acvs(acwc.INLINE_DIALOG_SETTINGS_ONLY_WIFI));
                t.a(new acvs(acwc.INLINE_DIALOG_SETTINGS_OFF));
                if (i == 0) {
                    t.a(3, new acvs(acwc.INLINE_DIALOG_SETTINGS_OFF), null);
                } else if (i == 2) {
                    t.a(3, new acvs(acwc.INLINE_DIALOG_SETTINGS_ON), null);
                } else if (i == 1) {
                    t.a(3, new acvs(acwc.INLINE_DIALOG_SETTINGS_ONLY_WIFI), null);
                }
            }
        }
    }

    public final void onDestroy() {
        this.a.unregisterOnSharedPreferenceChangeListener(this);
        super.onDestroy();
    }

    static {
        HashMap hashMap = new HashMap();
        String str = "1";
        String str2 = "2";
        hashMap.put(str, str2);
        hashMap.put(str2, str);
        hashMap.put("3", "0");
        f = Collections.unmodifiableMap(hashMap);
    }
}
