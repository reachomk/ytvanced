package com.google.android.apps.youtube.app.settings;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Bundle;
import android.os.Handler;
import android.preference.EditTextPreference;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceScreen;
import android.text.TextUtils;
import com.google.android.apps.youtube.app.settings.SettingsActivity.SettingsActivityComponent;
import com.google.android.youtube.R;
import defpackage.aapn;
import defpackage.aaxz;
import defpackage.afnc;
import defpackage.afpd;
import defpackage.afpu;
import defpackage.afuk;
import defpackage.afyj;
import defpackage.agvs;
import defpackage.agwc;
import defpackage.akme;
import defpackage.akmh;
import defpackage.akmi;
import defpackage.alvf;
import defpackage.bapu;
import defpackage.bcaa;
import defpackage.eav;
import defpackage.egg;
import defpackage.euh;
import defpackage.iza;
import defpackage.izb;
import defpackage.izc;
import defpackage.izd;
import defpackage.ize;
import defpackage.izf;
import defpackage.izi;
import defpackage.izj;
import defpackage.izk;
import defpackage.izl;
import defpackage.izm;
import defpackage.izn;
import defpackage.izo;
import defpackage.izq;
import defpackage.izs;
import defpackage.izt;
import defpackage.izu;
import defpackage.izv;
import defpackage.izw;
import defpackage.izx;
import defpackage.izy;
import defpackage.xak;
import defpackage.xfc;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Executor;

public class DeveloperPrefsFragment extends PreferenceFragment implements OnSharedPreferenceChangeListener {
    private static final List p;
    public SharedPreferences a;
    public bapu b;
    public Executor c;
    public aapn d;
    public aaxz e;
    public eav f;
    public Handler g;
    public afyj h;
    public afpu i;
    public bcaa j;
    public bcaa k;
    public egg l;
    public afuk m;
    public euh n;
    public akmi o;

    public final void onCreate(Bundle bundle) {
        ((SettingsActivityComponent) ((xfc) getActivity()).n()).inject(this);
        super.onCreate(bundle);
        getPreferenceManager().setSharedPreferencesName("youtube");
        addPreferencesFromResource(R.xml.developer_prefs);
        this.a.registerOnSharedPreferenceChangeListener(this);
        SharedPreferences sharedPreferences = this.a;
        String str = "com.google.android.libraries.youtube.net.constant.netc.pref.vix_snapshot_key";
        EditTextPreference editTextPreference = (EditTextPreference) findPreference(str);
        Handler handler = this.g;
        Activity activity = getActivity();
        editTextPreference.setDialogTitle("Vix session key");
        editTextPreference.setDialogMessage("Session key should be in format: [ldap].[session identifier]");
        CharSequence string = sharedPreferences.getString(str, "");
        if (TextUtils.isEmpty(string)) {
            string = "None";
        }
        editTextPreference.setSummary(string);
        editTextPreference.setOnPreferenceChangeListener(new afnc(handler, activity));
        sharedPreferences = this.a;
        str = "ImageCacheSizeInMB";
        editTextPreference = (EditTextPreference) findPreference(str);
        Handler handler2 = this.g;
        Activity activity2 = getActivity();
        String concat = String.valueOf(new DecimalFormat("#.##").format((double) (((float) this.o.b()) / 1048576.0f))).concat("MB");
        editTextPreference.setDialogTitle("Custom Image Cache Size");
        editTextPreference.setDialogMessage(String.format("Set custom image cache size in MB. Valid from 0 to %s MB. Setting 0 will use default size (%s)", new Object[]{Integer.valueOf(1024), concat}));
        float parseFloat = Float.parseFloat(sharedPreferences.getString(str, "0"));
        editTextPreference.setSummary(akme.a(parseFloat, concat));
        editTextPreference.setOnPreferenceChangeListener(new akmh(handler2, activity2, concat, editTextPreference, parseFloat));
        findPreference("net_detour_header").setOnPreferenceClickListener(new izj(this));
        findPreference("ShowOfflineHttpQueue").setOnPreferenceClickListener(new izq(this));
        findPreference("DebugOffline").setOnPreferenceClickListener(new izt(this));
        findPreference("DebugUpload").setOnPreferenceClickListener(new izs(this));
        findPreference("OnlineAd").setOnPreferenceClickListener(new izv(this));
        findPreference("ForceInnertubeCapabilities").setOnPreferenceClickListener(new izu(this));
        findPreference("SC").setOnPreferenceClickListener(new izx(this));
        findPreference("OfflineBrowseResponseSync").setOnPreferenceClickListener(new izw(this));
        findPreference("TriggerAO").setOnPreferenceClickListener(new izy(this));
        findPreference("NextAOTime").setOnPreferenceClickListener(new izb(this));
        findPreference("SimulateRemoteVideoOffline").setOnPreferenceChangeListener(new izi(this));
        findPreference("ResetOfflineSnackbarCaps").setOnPreferenceClickListener(new iza(this));
        findPreference("MobileDataPlanDebugInfo").setOnPreferenceClickListener(new izl(this));
        findPreference("hsv").setOnPreferenceChangeListener(new izk(this));
        findPreference("MdxAutoCastCancelCoolDown").setOnPreferenceClickListener(new izn(this));
        findPreference("MdxAutoCastCancelCount").setOnPreferenceClickListener(new izm(this));
        findPreference("RequestGuide").setOnPreferenceClickListener(new izd(this));
        findPreference("RemoveGuide").setOnPreferenceClickListener(new izc(this));
        izf izf = new izf(this);
        for (String findPreference : p) {
            findPreference(findPreference).setOnPreferenceChangeListener(izf);
        }
        PreferenceScreen preferenceScreen = (PreferenceScreen) findPreference("SystemHealth");
        alvf.a(preferenceScreen);
        xak.a();
        Preference preference = new Preference(preferenceScreen.getContext());
        preference.setKey("CrashAppPreference");
        preference.setTitle(R.string.pref_developer_crash_app_title);
        preference.setOnPreferenceClickListener(new ize(this));
        preferenceScreen.addPreference(preference);
        euh euh = this.n;
        getActivity();
        euh.a();
    }

    public final void onResume() {
        super.onResume();
        a();
    }

    public final void a() {
        if (this.i.a()) {
            Preference findPreference = findPreference("NextAOTime");
            long c = ((agvs) this.k.get()).c(((agwc) this.j.get()).c());
            if (c == 0) {
                findPreference.setSummary(R.string.pref_developer_next_auto_offline_time_default);
            } else {
                findPreference.setSummary(DateFormat.getInstance().format(new Date(c)));
            }
        }
    }

    public final void a(int i, int i2) {
        this.g.post(new izo(this, i, i2));
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("ApiaryHostSelection".equals(str)) {
            ((afpd) this.b.get()).b();
        } else if ("leak_detector".equals(str)) {
            getActivity();
        }
    }

    public final void onDestroy() {
        this.a.unregisterOnSharedPreferenceChangeListener(this);
        super.onDestroy();
    }

    static {
        ArrayList arrayList = new ArrayList();
        p = arrayList;
        arrayList.add("MdxDialLaunchAdditionalParams");
        p.add("MdxReceiverAppVersion");
        p.add("DisableDialDeviceCacheLimit");
        p.add("MdxEnableSmartRemoteHack");
        p.add("EnableSsdpResponseLogging");
        p.add("EnableMediaRouteDescriptionInDialog");
        p.add("MdxEnableFirstNetworkInterface");
    }
}
