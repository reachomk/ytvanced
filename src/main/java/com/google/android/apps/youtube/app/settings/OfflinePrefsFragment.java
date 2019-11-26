package com.google.android.apps.youtube.app.settings;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceFragment;
import android.preference.PreferenceScreen;
import android.preference.SwitchPreference;
import android.preference.TwoStatePreference;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import com.google.android.apps.youtube.app.settings.SettingsActivity.SettingsActivityComponent;
import com.google.android.libraries.youtube.player.background.service.BackgroundPlayerService;
import com.google.android.youtube.R;
import defpackage.aaey;
import defpackage.abij;
import defpackage.ablj;
import defpackage.ageo;
import defpackage.agvs;
import defpackage.agwc;
import defpackage.ahdl;
import defpackage.amul;
import defpackage.amuo;
import defpackage.avsi;
import defpackage.bapu;
import defpackage.dwz;
import defpackage.ebn;
import defpackage.ekf;
import defpackage.eud;
import defpackage.eue;
import defpackage.euf;
import defpackage.jbd;
import defpackage.jbe;
import defpackage.jbf;
import defpackage.jbg;
import defpackage.jbh;
import defpackage.jbj;
import defpackage.jbk;
import defpackage.jbl;
import defpackage.xfc;
import defpackage.xmc;
import defpackage.zyw;

public class OfflinePrefsFragment extends PreferenceFragment implements OnSharedPreferenceChangeListener, eud {
    public agwc a;
    public bapu b;
    public agvs c;
    public aaey d;
    public xmc e;
    public jbk f;
    public Handler g;
    public ablj h;
    public zyw i;
    public SharedPreferences j;
    public ekf k;
    public boolean l;
    private PreferenceScreen m;
    private AlertDialog n;
    private AlertDialog o;

    public final void onCreate(Bundle bundle) {
        ((SettingsActivityComponent) ((xfc) getActivity()).n()).inject(this);
        super.onCreate(bundle);
        getPreferenceManager().setSharedPreferencesName("youtube");
        this.n = new Builder(getActivity()).setMessage(R.string.clear_offline_confirmation).setPositiveButton(R.string.remove_offline_confirmed_button, new jbd(this)).setNegativeButton(17039360, null).create();
        Builder builder = new Builder(getActivity());
        View inflate = getActivity().getLayoutInflater().inflate(R.layout.cross_device_offline_dialog, null);
        this.o = builder.setView(inflate).setTitle(R.string.menu_cross_device_offline).setPositiveButton(R.string.save_cross_device_offline_menu, new jbf(this, inflate)).setNegativeButton(17039360, null).create();
        AlertDialog alertDialog = this.o;
        alertDialog.setOnShowListener(new jbh(this, inflate, alertDialog));
        ((EditText) inflate.findViewById(R.id.cross_device_offline_device_name)).addTextChangedListener(new jbl(alertDialog));
        ((Switch) inflate.findViewById(R.id.cross_device_offline_enabled)).setOnCheckedChangeListener(new jbg(this));
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ((eue) getActivity()).a((eud) this);
    }

    public final void a() {
        if (isAdded()) {
            SharedPreferences sharedPreferences = getPreferenceManager().getSharedPreferences();
            eue eue = (eue) getActivity();
            PreferenceScreen preferenceScreen = this.m;
            if (preferenceScreen != null) {
                preferenceScreen.removeAll();
            }
            addPreferencesFromResource(R.xml.offline_prefs);
            this.m = getPreferenceScreen();
            preferenceScreen = this.m;
            sharedPreferences.registerOnSharedPreferenceChangeListener(this);
            euf.a(eue, this.f.a());
            PreferenceCategory preferenceCategory = (PreferenceCategory) findPreference(ageo.CATEGORY_BACKGROUND);
            if (this.f.b()) {
                ListPreference listPreference = (ListPreference) findPreference(ebn.BACKGROUND_AUDIO_POLICY);
                listPreference.setSummary(listPreference.getEntry());
            } else {
                preferenceScreen.removePreference(preferenceCategory);
            }
            boolean c = this.f.c();
            String str = ageo.CATEGORY;
            String str2 = ageo.CATEGORY_SDCARD_STORAGE;
            PreferenceCategory preferenceCategory2;
            if (c) {
                xmc xmc = this.e;
                TwoStatePreference twoStatePreference = (TwoStatePreference) findPreference("offline_use_sd_card");
                twoStatePreference.setOnPreferenceChangeListener(new jbe(this));
                twoStatePreference.setChecked(this.c.k());
                Preference findPreference = findPreference("offline_insert_sd_card");
                findPreference.setEnabled(false);
                findPreference.setSelectable(false);
                PreferenceCategory preferenceCategory3 = (PreferenceCategory) findPreference(str);
                preferenceCategory2 = (PreferenceCategory) findPreference(str2);
                if (!xmc.a()) {
                    preferenceCategory3.removePreference(twoStatePreference);
                    preferenceCategory3.removePreference(findPreference);
                    preferenceScreen.removePreference(preferenceCategory2);
                } else if (xmc.c()) {
                    preferenceCategory3.removePreference(findPreference);
                } else {
                    preferenceCategory3.removePreference(twoStatePreference);
                    preferenceScreen.removePreference(preferenceCategory2);
                }
            } else {
                preferenceCategory2 = (PreferenceCategory) findPreference(str2);
                preferenceScreen.removePreference((PreferenceCategory) findPreference(ageo.CATEGORY_PRIMARY_STORAGE));
                preferenceScreen.removePreference(preferenceCategory2);
            }
            preferenceCategory = (PreferenceCategory) findPreference(str);
            ListPreference listPreference2 = (ListPreference) findPreference(ageo.QUALITY);
            if (this.f.d()) {
                if (this.c.f()) {
                    int i;
                    amul c2 = this.c.c();
                    abij e = this.f.e();
                    if (e != null && e.b) {
                        amuo j = amul.j();
                        j.c(avsi.HD_1080);
                        j.b(c2);
                        c2 = j.a();
                    }
                    Resources resources = getResources();
                    String[] strArr = new String[(c2.size() + 1)];
                    strArr[0] = resources.getString(R.string.offline_video_quality_always_ask);
                    for (i = 0; i < c2.size(); i++) {
                        avsi avsi = (avsi) c2.get(i);
                        int intValue = ahdl.b.containsKey(avsi) ? ((Integer) ahdl.b.get(avsi)).intValue() : -1;
                        if (intValue != -1) {
                            strArr[i + 1] = resources.getString(intValue);
                        } else {
                            strArr[i + 1] = "";
                        }
                    }
                    listPreference2.setEntries(strArr);
                    String[] strArr2 = new String[(c2.size() + 1)];
                    strArr2[0] = "-1";
                    int i2 = 0;
                    while (i2 < c2.size()) {
                        i = i2 + 1;
                        strArr2[i] = String.valueOf(ahdl.a((avsi) c2.get(i2), -1));
                        i2 = i;
                    }
                    listPreference2.setEntryValues(strArr2);
                    if (listPreference2.getEntry() == null) {
                        listPreference2.setValueIndex(0);
                    }
                    listPreference2.setSummary(listPreference2.getEntry());
                } else {
                    preferenceCategory.removePreference(listPreference2);
                }
                ((SwitchPreference) findPreference(ageo.WIFI_POLICY)).setChecked(this.c.j());
                if (!this.k.d()) {
                    preferenceCategory.removePreference(findPreference("offline_recs_enabled"));
                }
                abij e2 = this.f.e();
                if (e2 == null || !e2.a) {
                    preferenceCategory.removePreference(findPreference("cross_device_offline"));
                }
                return;
            }
            preferenceScreen.removePreference(preferenceCategory);
        }
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        String.valueOf(sharedPreferences).length();
        String.valueOf(str).length();
        ListPreference listPreference;
        if (ageo.QUALITY.equals(str)) {
            listPreference = (ListPreference) findPreference(str);
            listPreference.setSummary(listPreference.getEntry());
        } else if (ageo.WIFI_POLICY.equals(str)) {
            boolean j = this.c.j();
            String str2 = ageo.WIFI_POLICY_STRING;
            if (j) {
                sharedPreferences.edit().putString(str2, getString(R.string.wifi)).apply();
            } else {
                sharedPreferences.edit().putString(str2, getString(R.string.any)).apply();
            }
        } else if (ebn.BACKGROUND_AUDIO_POLICY.equals(str)) {
            listPreference = (ListPreference) findPreference(str);
            listPreference.setSummary(listPreference.getEntry());
            if (this.f.b()) {
                dwz dwz = (dwz) this.b.get();
                if (!dwz.c()) {
                    dwz.a.stopService(new Intent(dwz.a, BackgroundPlayerService.class));
                }
                dwz.e();
            }
        }
    }

    public final boolean onPreferenceTreeClick(PreferenceScreen preferenceScreen, Preference preference) {
        Activity activity = getActivity();
        String key = preference.getKey();
        if ("offline_help".equals(key)) {
            this.d.a(activity, "yt_android_offline");
        } else if ("clear_offline".equals(key)) {
            this.n.show();
        } else if ("cross_device_offline".equals(key)) {
            this.o.show();
        }
        return super.onPreferenceTreeClick(preferenceScreen, preference);
    }

    public final void onDestroy() {
        getPreferenceManager().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this);
        super.onDestroy();
    }

    public final void a(int i) {
        this.g.post(new jbj(this, i));
    }
}
