package com.google.android.apps.youtube.app.settings;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.res.Resources;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceFragment;
import android.preference.PreferenceScreen;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.ui.SubtitlesColorListPreference;
import com.google.android.libraries.youtube.player.subtitles.ui.SubtitleWindowView;
import com.google.android.youtube.R;
import defpackage.ajiy;
import defpackage.ajjc;
import defpackage.ajji;
import defpackage.ajjl;
import defpackage.ajjm;
import defpackage.ajjn;
import defpackage.ajjp;
import defpackage.ajjq;
import defpackage.ajjw;
import defpackage.ajjx;
import defpackage.ajjy;
import defpackage.jcd;
import defpackage.jce;
import defpackage.xay;
import java.util.ArrayList;

public class SubtitlesLegacyPrefsFragment extends PreferenceFragment implements OnSharedPreferenceChangeListener {
    public SubtitleWindowView a;
    private SharedPreferences b;
    private PreferenceCategory c;
    private boolean d;
    private Resources e;
    private View f;

    public final void onCreate(Bundle bundle) {
        ajjx[] values;
        int i;
        ListPreference listPreference;
        int i2;
        int i3;
        super.onCreate(bundle);
        getPreferenceManager().setSharedPreferencesName("youtube");
        addPreferencesFromResource(R.xml.subtitles_prefs);
        this.b = getPreferenceManager().getSharedPreferences();
        this.b.registerOnSharedPreferenceChangeListener(this);
        this.e = getResources();
        ListPreference listPreference2 = (ListPreference) findPreference(xay.SUBTITLES_SCALE);
        ListPreference listPreference3 = (ListPreference) findPreference(xay.SUBTITLES_STYLE);
        ListPreference listPreference4 = (ListPreference) findPreference(xay.SUBTITLES_FONT);
        SubtitlesColorListPreference subtitlesColorListPreference = (SubtitlesColorListPreference) findPreference(xay.SUBTITLES_TEXT_COLOR);
        ListPreference listPreference5 = (ListPreference) findPreference(xay.SUBTITLES_TEXT_OPACITY);
        ListPreference listPreference6 = (ListPreference) findPreference(xay.SUBTITLES_EDGE_TYPE);
        SubtitlesColorListPreference subtitlesColorListPreference2 = (SubtitlesColorListPreference) findPreference(xay.SUBTITLES_EDGE_COLOR);
        SubtitlesColorListPreference subtitlesColorListPreference3 = (SubtitlesColorListPreference) findPreference(xay.SUBTITLES_BACKGROUND_COLOR);
        ListPreference listPreference7 = (ListPreference) findPreference(xay.SUBTITLES_BACKGROUND_OPACITY);
        SubtitlesColorListPreference subtitlesColorListPreference4 = (SubtitlesColorListPreference) findPreference(xay.SUBTITLES_WINDOW_COLOR);
        ListPreference listPreference8 = (ListPreference) findPreference(xay.SUBTITLES_WINDOW_OPACITY);
        Resources resources = this.e;
        if (ajjx.c == null) {
            values = ajjx.values();
            ajjx.c = new String[values.length];
            for (int i4 = 0; i4 < values.length; i4++) {
                ajjx.c[i4] = resources.getString(values[i4].a);
            }
        }
        String[] strArr = ajjx.c;
        if (ajjx.d == null) {
            values = ajjx.values();
            ajjx.d = new String[values.length];
            i = 0;
            while (i < values.length) {
                listPreference = listPreference8;
                ajjx.d[i] = Float.toString(values[i].b);
                i++;
                listPreference8 = listPreference;
            }
        }
        listPreference = listPreference8;
        jce.a(listPreference2, strArr, ajjx.d, 2);
        if (ajjy.h == null) {
            ajjy[] values2 = ajjy.values();
            ajjy.h = new String[values2.length];
            for (i2 = 0; i2 < values2.length; i2++) {
                ajjy.h[i2] = resources.getString(values2[i2].f);
            }
        }
        strArr = ajjy.h;
        if (ajjy.i == null) {
            ajjy[] values3 = ajjy.values();
            ajjy.i = new String[values3.length];
            for (i3 = 0; i3 < values3.length; i3++) {
                ajjy.i[i3] = Integer.toString(values3[i3].g);
            }
        }
        jce.a(listPreference3, strArr, ajjy.i, 0);
        if (ajjp.c == null) {
            ajjp[] values4 = ajjp.values();
            ArrayList arrayList = new ArrayList();
            for (ajjp ajjp : values4) {
                i = ajjp.a;
                if (i != 0) {
                    arrayList.add(resources.getString(i));
                }
            }
            ajjp.c = (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        strArr = ajjp.c;
        if (ajjp.d == null) {
            ajjp[] values5 = ajjp.values();
            ArrayList arrayList2 = new ArrayList();
            for (ajjp ajjp2 : values5) {
                if (ajjp2.a != 0) {
                    arrayList2.add(Integer.toString(ajjp2.b));
                }
            }
            ajjp.d = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
        }
        jce.a(listPreference4, strArr, ajjp.d, 3);
        jce.a(subtitlesColorListPreference, ajjn.b(resources), ajjn.e(), 0);
        subtitlesColorListPreference.b = ajjn.f();
        jce.a(listPreference5, ajjw.a(resources), ajjw.a(), 3);
        if (ajjq.c == null) {
            ajjq[] values6 = ajjq.values();
            ajjq.c = new String[values6.length];
            for (i2 = 0; i2 < values6.length; i2++) {
                ajjq.c[i2] = resources.getString(values6[i2].a);
            }
        }
        strArr = ajjq.c;
        if (ajjq.d == null) {
            ajjq[] values7 = ajjq.values();
            ajjq.d = new String[values7.length];
            for (int i5 = 0; i5 < values7.length; i5++) {
                ajjq.d[i5] = Integer.toString(values7[i5].b);
            }
        }
        jce.a(listPreference6, strArr, ajjq.d, 0);
        jce.a(subtitlesColorListPreference2, ajjn.b(resources), ajjn.e(), 1);
        subtitlesColorListPreference2.b = ajjn.f();
        jce.a(subtitlesColorListPreference3, ajjn.a(resources), ajjn.a(), 2);
        subtitlesColorListPreference3.b = ajjn.b();
        jce.a(listPreference7, ajjw.a(resources), ajjw.a(), 3);
        jce.a(subtitlesColorListPreference4, ajjn.a(resources), ajjn.a(), 0);
        subtitlesColorListPreference4.b = ajjn.b();
        jce.a(listPreference, ajjw.a(resources), ajjw.a(), 3);
        this.d = true;
        this.c = (PreferenceCategory) findPreference(xay.SUBTITLES_CUSTOM_OPTIONS);
        b();
        c();
        d();
        e();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.pref_subtitles_legacy_preference, null);
        String string = getString(R.string.pref_subtitles_preview);
        ajjc ajjc = new ajjc(0, 0, string, string, new ajiy(34, 50, 95, true, false));
        this.a = (SubtitleWindowView) inflate.findViewById(R.id.preview_text);
        this.a.a(ajjc);
        SubtitleWindowView subtitleWindowView = this.a;
        subtitleWindowView.c = true;
        subtitleWindowView.b.a();
        for (ajjm a : subtitleWindowView.a) {
            a.a();
        }
        this.a.setVisibility(4);
        this.f = inflate.findViewById(R.id.header_container);
        return inflate;
    }

    public final void onResume() {
        super.onResume();
        this.f.post(new jcd(this));
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (this.d) {
            ListPreference listPreference;
            if (xay.SUBTITLES_STYLE.equals(str)) {
                listPreference = (ListPreference) findPreference(str);
                listPreference.setSummary(listPreference.getEntry());
                e();
            } else if (xay.SUBTITLES_EDGE_TYPE.equals(str)) {
                listPreference = (ListPreference) findPreference(str);
                listPreference.setSummary(listPreference.getEntry());
                b();
            } else if (xay.SUBTITLES_BACKGROUND_COLOR.equals(str)) {
                listPreference = (ListPreference) findPreference(str);
                listPreference.setSummary(listPreference.getEntry());
                c();
            } else if (xay.SUBTITLES_WINDOW_COLOR.equals(str)) {
                listPreference = (ListPreference) findPreference(str);
                listPreference.setSummary(listPreference.getEntry());
                d();
            } else if (xay.SUBTITLES_TEXT_OPACITY.equals(str) || xay.SUBTITLES_WINDOW_OPACITY.equals(str) || xay.SUBTITLES_BACKGROUND_OPACITY.equals(str) || xay.SUBTITLES_FONT.equals(str) || xay.SUBTITLES_TEXT_COLOR.equals(str) || xay.SUBTITLES_EDGE_COLOR.equals(str)) {
                listPreference = (ListPreference) findPreference(str);
                listPreference.setSummary(null);
                listPreference.setSummary("%s");
            }
            a();
        }
    }

    public final void onDestroy() {
        this.b.unregisterOnSharedPreferenceChangeListener(this);
        super.onDestroy();
    }

    private final void b() {
        String string = this.b.getString(xay.SUBTITLES_EDGE_TYPE, null);
        boolean z = false;
        if (string != null) {
            int parseInt = Integer.parseInt(string);
            if (parseInt == 1 || parseInt == 2) {
                z = true;
            }
        }
        findPreference(xay.SUBTITLES_EDGE_COLOR).setEnabled(z);
    }

    private final void c() {
        String string = this.b.getString(xay.SUBTITLES_BACKGROUND_COLOR, null);
        boolean z = false;
        if (!(string == null || ajjn.NONE.ordinal() == Integer.parseInt(string))) {
            z = true;
        }
        findPreference(xay.SUBTITLES_BACKGROUND_OPACITY).setEnabled(z);
    }

    private final void d() {
        String string = this.b.getString(xay.SUBTITLES_WINDOW_COLOR, null);
        boolean z = false;
        if (!(string == null || ajjn.NONE.ordinal() == Integer.parseInt(string))) {
            z = true;
        }
        findPreference(xay.SUBTITLES_WINDOW_OPACITY).setEnabled(z);
    }

    private final void e() {
        Preference findPreference = findPreference(xay.SUBTITLES_CUSTOM_OPTIONS);
        String string = this.b.getString(xay.SUBTITLES_STYLE, null);
        String str = xay.SUBTITLES_SETTINGS;
        if (string != null && ajjy.values()[4].g == Integer.parseInt(string)) {
            if (findPreference == null) {
                ((PreferenceScreen) findPreference(str)).addPreference(this.c);
            }
        } else if (findPreference != null) {
            ((PreferenceScreen) findPreference(str)).removePreference(this.c);
        }
    }

    public final void a() {
        ajji a = ajjl.a(this.b);
        this.a.d(a.a);
        this.a.setBackgroundColor(a.b);
        this.a.b(a.c);
        this.a.c(a.d);
        this.a.a(a.e);
        this.a.a(ajjp.a(a.f, getActivity()));
        this.a.a(ajjl.a(getActivity(), ajjl.b(this.b), this.f.getWidth(), this.f.getHeight()));
    }
}
