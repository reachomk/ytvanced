package com.google.android.apps.youtube.app.settings;

import android.app.Dialog;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.preference.EditTextPreference;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.apps.youtube.app.settings.SettingsActivity.SettingsActivityComponent;
import com.google.android.youtube.R;
import defpackage.aaas;
import defpackage.aajl;
import defpackage.aavm;
import defpackage.abmm;
import defpackage.adqf;
import defpackage.aebh;
import defpackage.afmt;
import defpackage.afnb;
import defpackage.anxa;
import defpackage.anxl;
import defpackage.ehh;
import defpackage.eud;
import defpackage.euf;
import defpackage.jad;
import defpackage.jae;
import defpackage.jaf;
import defpackage.jah;
import defpackage.jai;
import defpackage.jaj;
import defpackage.jak;
import defpackage.jal;
import defpackage.jam;
import defpackage.jan;
import defpackage.jap;
import defpackage.jaq;
import defpackage.jar;
import defpackage.jas;
import defpackage.jat;
import defpackage.jau;
import defpackage.nkt;
import defpackage.uys;
import defpackage.xfc;
import defpackage.xtl;
import defpackage.zgv;
import defpackage.zj;
import defpackage.zzp;
import java.text.Collator;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Executor;

public class DogfoodPrefsFragment extends PreferenceFragment implements eud {
    private static final String[] j = new String[]{"AS", "CY", "GU", "LI", "MP", "VE", "VI"};
    public Executor a;
    public aavm b;
    public Handler c;
    public String d;
    public SharedPreferences e;
    public aaas f;
    public adqf g;
    public ehh h;
    public uys i;

    public final void onCreate(Bundle bundle) {
        ((SettingsActivityComponent) ((xfc) getActivity()).n()).inject(this);
        super.onCreate(bundle);
        getPreferenceManager().setSharedPreferencesName("youtube");
        addPreferencesFromResource(R.xml.dogfood_prefs);
        euf.a((SettingsActivity) getActivity(), (CharSequence) "Dogfood");
        String str = "Media network";
        String str2 = "media_network_activation_type";
        a(str2, str);
        String str3 = "internal_geo";
        a(str3, "Internal geo");
        findPreference(str3).setSummary("Set the internal_geo field in InnerTube requests");
        str3 = "bypass_rate_limit";
        a(str3, "Bypass rate limit");
        findPreference(str3).setSummary("Turn off in-app messaging rate limits");
        euf.a(afmt.values(), afmt.a(), (ListPreference) findPreference("ApiaryHostSelection"), R.string.pref_developer_innertube_backend_summary, getResources());
        euf.a(afnb.values(), afnb.a(), (ListPreference) findPreference("InnerTubeApiSelection"), R.string.pref_developer_payment_environment_summary, getResources());
        euf.a(aebh.values(), aebh.e.ordinal(), (ListPreference) findPreference("MdxServerSelection"), R.string.pref_developer_mdx_host_summary, getResources());
        str3 = "enable_upload_video_editing";
        a(str3, "Video Editing");
        findPreference(str3).setSummary("Edit videos before uploading");
        String str4 = "enable_upload_audio_swap";
        a(str4, "Audio Swap in Video Editing");
        findPreference(str4).setDependency(str3);
        str4 = "enable_upload_filters";
        a(str4, "Filters in Video Editing");
        findPreference(str4).setDependency(str3);
        str3 = "camera_audio_source";
        a(str3, "Camera audio source");
        a(str2, str);
        a("dogfood_suggest_log_requests", "Log Suggest Requests");
        a("dogfood_suggest_log_responses", "Log Suggest Responses");
        a((EditTextPreference) findPreference("dogfood_suggest_client_name_override"), "Override Client Name", null);
        a((EditTextPreference) findPreference("dogfood_suggest_host_override"), "Override Suggest Host", "Example: https://suggestqueries.google.com");
        a((EditTextPreference) findPreference("dogfood_suggest_response_override"), "Override Suggest Response", null);
        str = "dogfood_suggest_sugexp_override";
        String str5 = "Override Sugexp";
        a((EditTextPreference) findPreference(str), str5, null);
        a(str, str5);
        a("dogfood_suggest_send_visitor_id_signed_out", "Send Visitor ID when signed out");
        findPreference("OnlineAd").setOnPreferenceClickListener(new jas(this));
        Preference findPreference = findPreference("experiments_token");
        findPreference.setTitle("Experiments");
        findPreference.setOnPreferenceClickListener(new jan(this));
        EditTextPreference editTextPreference = (EditTextPreference) findPreference("experiment_ids");
        editTextPreference.setTitle("Set experiment ids");
        editTextPreference.getEditText().setHint("111111,111112,...");
        editTextPreference.setSummary(a(getPreferenceManager().getSharedPreferences().getString(editTextPreference.getKey(), null)));
        editTextPreference.setOnPreferenceChangeListener(new jaq(this));
        editTextPreference = (EditTextPreference) findPreference("experiment_flags");
        editTextPreference.setTitle("Set experiment flags");
        editTextPreference.getEditText().setHint("experiment_flag=true,...");
        editTextPreference.setSummary(b(getPreferenceManager().getSharedPreferences().getString(editTextPreference.getKey(), null)));
        editTextPreference.setOnPreferenceChangeListener(new jap(this));
        editTextPreference = (EditTextPreference) findPreference("innertube_promo_id");
        editTextPreference.setTitle("Set promo id");
        editTextPreference.getEditText().setHint("ytu-ww-fullscreen etc");
        editTextPreference.setSummary(abmm.b(getPreferenceManager().getSharedPreferences().getString(editTextPreference.getKey(), null)));
        editTextPreference.setOnPreferenceChangeListener(new jar());
        editTextPreference = (EditTextPreference) findPreference("innertube_override_version");
        editTextPreference.setTitle("Override app version");
        editTextPreference.getEditText().setHint("Supported format: xx.yy or xx.yy.zz (example: 10.11 or 10.11.12)");
        editTextPreference.setSummary(c(getPreferenceManager().getSharedPreferences().getString(editTextPreference.getKey(), null)));
        String str6 = "WARNING!!! Changes to this variable might make the app completely unusable. Use it at your own risk.";
        editTextPreference.setDialogMessage(str6);
        editTextPreference.setOnPreferenceChangeListener(new jad(this));
        findPreference = findPreference("refresh_innertube_config");
        findPreference.setTitle("Refresh InnerTube config values");
        findPreference.setSummary("Retrieve new set of InnerTube Config values. Requires an application relaunch to apply");
        findPreference.setOnPreferenceClickListener(new jau(this));
        euf.a(aajl.values(), aajl.SERVER_EXPERIMENT.ordinal(), (ListPreference) findPreference(str2), R.string.pref_developer_media_network_summary, getResources());
        euf.a(zgv.values(), zgv.AUDIO_SOURCE_UNKNOWN.ordinal(), (ListPreference) findPreference(str3), R.string.pref_developer_camera_audio_source_summary, getResources());
        findPreference = findPreference("clear_visitor_id");
        findPreference.setTitle("Clear visitor data");
        str2 = String.valueOf(b());
        str5 = "Encrypted Visitor ID: ";
        findPreference.setSummary(str2.length() == 0 ? new String(str5) : str5.concat(str2));
        findPreference.setOnPreferenceClickListener(new jaf(this));
        findPreference = findPreference("copy_visitor_id");
        findPreference.setTitle("Copy visitor data");
        findPreference.setSummary("Copy Encrypted Visitor ID to Clipboard");
        findPreference.setOnPreferenceClickListener(new jai(this));
        findPreference = findPreference("sign_out_id");
        findPreference.setTitle("Sign Out");
        findPreference.setOnPreferenceClickListener(new jat(this));
        ((EditTextPreference) findPreference("MdxDebugCommand")).setOnPreferenceChangeListener(new jam(this));
        editTextPreference = (EditTextPreference) findPreference("system_language_override");
        editTextPreference.setTitle("Override the system language");
        editTextPreference.getEditText().setHint("Supported format: ISO code for the test language (e.g. ja for Japanese)");
        editTextPreference.setDialogMessage(str6);
        editTextPreference.setSummary(d(getPreferenceManager().getSharedPreferences().getString(editTextPreference.getKey(), null)));
        editTextPreference.setOnPreferenceChangeListener(new jal(this));
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ((SettingsActivity) getActivity()).a((eud) this);
    }

    private final Preference a(String str, String str2) {
        Preference findPreference = findPreference(str);
        findPreference.setTitle(str2);
        return findPreference;
    }

    private static void a(EditTextPreference editTextPreference, String str, String str2) {
        editTextPreference.setTitle(str);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(Leave this blank to disable this override)");
        if (!TextUtils.isEmpty(str2)) {
            stringBuilder.append("\n\n");
            stringBuilder.append(str2);
        }
        editTextPreference.setDialogMessage(stringBuilder);
        editTextPreference.setSummary(editTextPreference.getText());
        editTextPreference.setOnPreferenceChangeListener(jae.a);
    }

    public static String a(String str) {
        Object str2;
        if (TextUtils.isEmpty(str2)) {
            str2 = "No experiments";
        }
        str2 = String.valueOf(str2);
        String str3 = "A comma separated list of experiments: ";
        return str2.length() == 0 ? new String(str3) : str3.concat(str2);
    }

    public static String b(String str) {
        Object str2;
        if (TextUtils.isEmpty(str2)) {
            str2 = "No experiment flags";
        }
        str2 = String.valueOf(str2);
        String str3 = "A comma separated list of experiment flags: ";
        return str2.length() == 0 ? new String(str3) : str3.concat(str2);
    }

    public static String c(String str) {
        Object str2;
        if (TextUtils.isEmpty(str2)) {
            str2 = "default";
        }
        str2 = String.valueOf(str2);
        String str3 = "App version: ";
        return str2.length() == 0 ? new String(str3) : str3.concat(str2);
    }

    public static String d(String str) {
        Object str2;
        if (TextUtils.isEmpty(str2)) {
            str2 = "default";
        }
        str2 = String.valueOf(str2);
        String str3 = "For testing unreleased Android System Languages: ";
        return str2.length() == 0 ? new String(str3) : str3.concat(str2);
    }

    public final String b() {
        nkt nkt;
        try {
            nkt = (nkt) anxl.parseFrom(nkt.c, Base64.decode(Uri.decode(getPreferenceManager().getSharedPreferences().getString("visitor_id", "")), 0), anxa.c());
        } catch (Exception e) {
            xtl.a("Failed to parse VisitorData", e);
            nkt = nkt.c;
        }
        return nkt.b;
    }

    public final void a() {
        if (isAdded()) {
            Object[] objArr;
            Object[] objArr2;
            String str = "internal_geo";
            ListPreference listPreference = (ListPreference) findPreference(str);
            str = this.e.getString(str, this.d);
            ((SettingsActivity) getActivity()).a(listPreference);
            HashSet<String> hashSet = new HashSet(Arrays.asList(j));
            if (!listPreference.isEnabled()) {
                hashSet.addAll(zzp.c);
            }
            int length = listPreference.getEntries() != null ? listPreference.getEntries().length : 0;
            int size = hashSet.size();
            int i = length + size;
            if (length == 0) {
                objArr = new CharSequence[i];
                objArr2 = new CharSequence[i];
            } else {
                objArr = (CharSequence[]) Arrays.copyOf(listPreference.getEntries(), i);
                objArr2 = (CharSequence[]) Arrays.copyOf(listPreference.getEntryValues(), i);
            }
            if (size != 0) {
                for (String locale : hashSet) {
                    Locale locale2 = new Locale("", locale);
                    objArr[length] = locale2.getDisplayCountry();
                    objArr2[length] = locale2.getCountry();
                    length++;
                }
            }
            zj zjVar = new zj(objArr.length);
            for (length = 0; length < objArr.length; length++) {
                zjVar.put(objArr2[length], objArr[length]);
            }
            jak jak = new jak(Collator.getInstance());
            Arrays.sort(objArr, jak);
            Arrays.sort(objArr2, new jaj(jak, zjVar));
            listPreference.setEntries(objArr);
            listPreference.setEntryValues(objArr2);
            size = -1;
            for (int i2 = 0; i2 < objArr2.length; i2++) {
                if (TextUtils.equals(objArr2[i2], str)) {
                    size = i2;
                }
            }
            if (size != -1) {
                listPreference.setValueIndex(size);
                listPreference.setSummary(listPreference.getEntry());
            }
            listPreference.setOnPreferenceChangeListener(new jah(zjVar));
            listPreference.setEnabled(true);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        Dialog dialog = ((ListPreference) findPreference("internal_geo")).getDialog();
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
        super.onSaveInstanceState(bundle);
    }
}
